const array = [4, 5, 1];

console.log(array);

for (let i = 0, size = array.length; i < size - 1; i++) {
    for (let j = 0; j < size - 1 - i; j++) {
        if (array[j] > array[j+1]) {
            const temp = array[j];
            array[j] = array[j+1]
            array[j+1] = temp
        }
    }
}

console.log(array)