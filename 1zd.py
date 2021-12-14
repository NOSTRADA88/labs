import time

def kek():
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
        if (len(b) - len(b.lstrip())) == 2:  # глаанвый (папа) класс
            b = b.replace(b[2], "\"" + b[2], 1)
            b = b.replace(":", "\"" + ": [", 1)
        if (len(b) - len(b.lstrip())) == 4:
            b = b.replace(":", ": {", 1)
            b = b.replace(b[4], '"' + b[4], 1)
            b = b.replace(':', '"' + ':', 1)
        if (len(b) - len(b.lstrip())) == 8:  # под под калсс ??? 0,o
            b = b.replace(":", "\"" + ": \"", 1)
            b = b.replace(b[-1], "\"," + b[-1], 1)
            b = b.replace(b[8], "\"" + b[8], 1)
            for much_lines in b:
                b = b.replace("\"" + " ", "\"", 1)
            count += 1
            if count == 6:
                l = len(b)
                b = b[:l-2] + "}, \n"
            if count == 12:             #костылииии
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
t_start = time.time()
for i in range(10):
    kek()
print(time.time() - t_start)
