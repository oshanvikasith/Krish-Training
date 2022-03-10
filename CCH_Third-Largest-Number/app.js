var array = [33, 23, 44, 55, 75, 100];
var ThirdLargestNumber = (array) => {
  let Maximum = 0;
  let SecondLargest = 0;
  let ThirdLargest = 0;

  for (let n of array) {
    if (n > Maximum) {
      Maximum = n;
    }
  }
  for (let n of array) {
    if (n != Maximum && n > SecondLargest) {
      SecondLargest = n;
    }
  }
  for (let n of array) {
    if (n != Maximum && n != SecondLargest && n > ThirdLargest) {
      ThirdLargest = n;
    }
  }
  return ThirdLargest;
};
console.log("Number Sequence:" + array);
console.log("Third Largest Number:" + ThirdLargestNumber(array));
