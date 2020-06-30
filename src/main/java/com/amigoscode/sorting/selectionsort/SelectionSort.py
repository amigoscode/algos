numbers = [4, 9, 3, 6, 2]

for i in range(len(numbers)):
    min_idx = i
    for j in range(i+1, len(numbers)):
        if numbers[j] < numbers[min_idx]:
            min_idx = j
    numbers[i], numbers[min_idx] = numbers[min_idx], numbers[i]

print(numbers)
