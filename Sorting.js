function Sort(arr) {     //Performed Sorting using bubble sort Algorithm to Sort the array in decending order
    const n = arr.length;
    let flag=false;
    do {
        flag = false;
        for (let i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                // Swap arr[i] and arr[i + 1]
                const temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                flag = true;
            }
        }
    } while (flag);

    return arr;
}
const arr = [5, 2, 9, 1, 5, 6];
Sort(arr);
console.log(arr); 
