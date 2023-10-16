const myArray = [5, 2, 8, 1, 9, 3];

// Using the sort() method with a custom comparison function
const sortedArrayDescending = myArray.sort((a, b) => b - a);

console.log("Sorted Array (Descending):", sortedArrayDescending);