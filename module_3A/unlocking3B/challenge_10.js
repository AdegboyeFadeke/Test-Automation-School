let numberArray = [25, -27, 0, 4, 82, 19, -27, 31, -21, 38, -1, -10];

let result = numberArray.filter(filterNegatives);

function filterNegatives(values){

return values < 0;

}

console.log("Array of Negative Numbers: " , result);