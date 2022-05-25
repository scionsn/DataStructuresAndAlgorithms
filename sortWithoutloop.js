let arr = [4, 3, 5, 1, 2, 2, -2, 4];

function sort(arr, size) {

    if (size > 1) {

        let maxidx = getmaxidx(arr, size);
        let temp = arr[size - 1];
        arr[size - 1] = arr[maxidx];
        arr[maxidx] = temp;
        console.log(arr[size - 1]);
        sort(arr, size - 1);
    }
}
 
function getmaxidx(arr, size) {
    let max = arr[0],
        maxidx = 0;
    for (let i = 1; i < size; i++) {

        if (arr[i] > max) {
            max = arr[i];
            maxidx = i;

        }
    }
    return maxidx;


}
console.log(sort(arr, arr.length));
console.log(arr);