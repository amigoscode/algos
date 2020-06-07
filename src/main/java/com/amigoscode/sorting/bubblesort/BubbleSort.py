list = [1, 3, 8, 100, 4, 0]

print(list)

for i in range(0, len(list) - 1):
    for j in range(0, len(list) - 1 - i):
        if list[j] > list[j + 1]:
            list[j], list[j + 1] = list[j + 1], list[j]

print(list)
