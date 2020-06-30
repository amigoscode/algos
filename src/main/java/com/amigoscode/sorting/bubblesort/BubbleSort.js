const array = [6, 4, 5, 3, 2, 1];
console.log(array);
for (let i=0, size = array.length; i < array.length - 1; i++) {
    for (let j = 0; j < size - 1 - i; j++) {
        if (array[j] > array[j+1]) {
            const tmp = array[j];
            array[j] = array[j+1];
            array[j+1] = tmp;
        }
    }
}
console.log(array);
