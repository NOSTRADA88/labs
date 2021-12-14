import re
import time
t_start = time.time()
for n in range(10):
    pattern_1 = r':'
    pattern_2 = r'"'
    a = open("test.yaml", "r", encoding="UTF-8")
    final = open("test2.json", "w", encoding="UTF-8")
    final.write("{ \n")
    count = 0
    count_Open = 0
    count_Close = 0
    count_Openbr = 0
    count_Closebr = 0
    for b in a:
        for c in b:
            if (c == ":") and (len(b) - len(b.lstrip())) == 0:
                b = b.replace(b[0], "\"" + b[0], 1)
                b = b.replace(":", "\"" + ":", 1)
                b = b.replace(":", ": {", 1)
        if (len(b) - len(b.lstrip())) == 2:  # главнвый (папа) класс
            b = b.replace(b[2], "\"" + b[2], 1)
            b = b.replace(pattern_1, "\"" + ": [", 1)
        for minus in b:  # ищу подкласс ну а чё
            if (minus == "-") and (len(b) - len(b.lstrip())) == 4:
                b = b.replace("-", "{", 1)
                for lines in minus:
                    b = b.replace(pattern_1, pattern_2 + ": \"", 1)  # закрывающие кавычки для подкласса
                    b = b.replace(b[6], pattern_2 + b[6], 1)  # открывающе кавычки для подкласса
                    for ending_lines in lines:
                        b = b.replace(pattern_2 + " ", "\"", 1)
        if (len(b) - len(b.lstrip())) == 4:
            b = b.replace(b[-1], "\"," + b[-1], 1)
        if (len(b) - len(b.lstrip())) == 6:
            b = b.replace(pattern_1, pattern_2 + ": \"", 1)
            b = b.replace(b[-1], "\"," + b[-1], 1)
            b = b.replace(b[6], pattern_2 + b[6], 1)
            for much_lines in b:
                b = b.replace(pattern_2 + " ", "\"", 1)
            count += 1
            if count == 5:
                l = len(b)
                b = b[:l-2] + "}, \n"
            if count == 10:             #костылииии
                l = len(b)
                b = b[:l-2] + "}"
        for zxc in b:
            if zxc == "{":
                count_Open += 1
            if zxc == "}":
                count_Close += 1
            if zxc == "[":
                count_Openbr += 1
            if zxc == "]":
                count_Closebr += 1
        final.write(b)
    while count_Closebr != count_Openbr:
        count_Closebr += 1
        final.write("]")
    while count_Close != count_Open:
        count_Close += 1
        final.write("\n}")
    final.write("\n}")
    final.close()
    a.close()
print(time.time() - t_start)
