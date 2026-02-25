s = input()
arr = list(int(float(item)) for item in s.split())

for i in range(len(arr)):
    if i == len(arr) - 1:
        print(arr[i], end="")
    else:
        print(arr[i], end=",")
