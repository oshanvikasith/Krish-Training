function BuubleSort(value) {
  var array = value.split("");
  var temp;

  for (var i = 0; i < array.length; i++) {
    for (var j = i + 1; j < array.length; j++) {
      if (array[i] > array[j]) {
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
  }
  return array.join("");
}

var Anagram = (x, y) => {
  let size1 = x.length;
  let size2 = y.length;

  if (size1 != size2) {
    console.log("Enter a valid word");
  } else {
    let text1 = BuubleSort(x);
    let text2 = BuubleSort(y);

    if (text1 == text2) {
      return "Anagram Word";
    } else {
      return "Not an Anagram Word";
    }
  }
};

console.log("listen", "silent");
console.log(Anagram("listen", "silent"));
console.log();
console.log("hello", "come on");
console.log(Anagram("hello", "come on"));
