import yaml
import json
import time
def kek1():
    for i in range(10):
        with open("New_yaml.yaml", "r") as y:
            with open("2zd.json", "w") as j:
                yaml_data = yaml.safe_load(y.read())
                json.dump(yaml_data, j,ensure_ascii=False, indent=2)
t = time.time()
for i in range(10):
    kek1()
print(time.time()-t)
