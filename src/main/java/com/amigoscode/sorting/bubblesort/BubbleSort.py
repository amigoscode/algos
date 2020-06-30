list = [6, 4, 5, 3, 2, 1]
print(list)
for i in range(0, len(list)-1):
    for j in range(0, len(list) - 1 - i):
        if (list[j] > list[j+1]):
            list[j], list[j+1] = list[j+1], list[j]
print(list)
