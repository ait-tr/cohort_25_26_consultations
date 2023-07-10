console.log("hehey");
// v8 двигатель - и в node.js и в браузере chrome

// как создать пустой массив? 
const arr1 = Array(); // new Array() - new можно опустить
const arr2 = [];
console.log(arr1);    // []
console.log(arr2);    // []
// JS vs Java 
// - можно хранить несколько типов данный - tuple 
// - в Java нельзя менять длину массива 
// - в JS - динамическим массивом - то есть у него увачиваться размер при 
// добавлении элементов
// - упорядоченная - индексы идут с 0-го
// можно создать массив с данными
const fruits = ["apple", "orange", "mango"];
const numbers = [9, 12, 18, 23];
// как изменить данные в массиве
// заменить orange на peach
console.log(fruits);  //  ["apple", "orange", "mango"]
fruits[1] = "peach";  // можем изменить значение ячейки под определенным индексом
console.log(fruits);  // [ 'apple', 'peach', 'mango' ]
// 
console.log(fruits[2]); // получение по индексу 

// Поменять первый и последний элементы массива

let temp = fruits[0];
fruits[0] = fruits[fruits.length - 1];
fruits[fruits.length - 1] = temp;

// Тонкости: 
const vegitables = ["carrot", "potato", "tomato"];
const seventhElement = vegitables[7]; // undefined
// Если из массива вывели по индексу большему чем его длина - получили undefined
// Если не инициализировали переменную - то в ней будет undefined 
let n5;
console.log(n5); // undefined  - когда не присвоили значение 
// null - особое "значение" - примитивный тип - 
let n6 = 9;
n6 = null; // в переменной 
console.log(n6);

let n7 = undefined; // так тоже можно 

// 0 vs null
// 0 - это число - тип number 
// null - эти тип null - это отсутвие значения 

// Преобразовние типов 
// неявное преобразование 
// из number в string 
let n8 = 9 + ""; // "9" - string // так же как в java 
// из string в number 
let n9 = +"9" + +"10"; // 19 number 
let n10 = + ("9" + "10"); // 910 - number
console.log(typeof n10); // typeof - возвращает строку название типа: "number", "string", "boolean" ...
console.log(typeof n10 === 'number'); // true
// Явное преобразование типов: 
// - в строку:
// 9 -> "9"
let n11 = String(9); // "9"
// - в число
let n12 = Number("155");
// - особый случай 
let n13 = Number("%128df"); // NaN - когда не получается преобразовать корректно
// NaN - это специальное значение - его тип - number - такой парадокс

// Функции 
// объявление функции (декларация): 
// при помощи слова function
// сколько собаке лет в человечeских года  - год собачий === 4 человеческих 

function getHumanAgeOfDog(dogAge) {
  return dogAge * 4;
}

// вызов функции 
let humanAgeOfBobby = getHumanAgeOfDog(11);
console.log(humanAgeOfBobby);
// нет безопасности типов
let humanAgeOfBobby2 = getHumanAgeOfDog("11"); // неявное преобразвоание dogAge * 4;
console.log(humanAgeOfBobby2);

// стрелочная функция 
// объявление
// блочная
const catAgeToHuman = (catAge) => {
  return catAge * 5;
}
// строчная версия того же самого 
const catAgeToHumanVer2 = (catAge) => catAge * 5;
// вызов 
const humanAgeOfGarfield = catAgeToHuman(7);
console.log(humanAgeOfGarfield);

// синтаксис условных выражений и switch и тернарного такой же как в java 

function hello(gender, name) {
  if (gender === "male") {
    return "Good day, mr. " + name
  }
  return "Good day, ms. " + name
}

console.log(hello("male", "John Smith")); // Good day, mr. John Smith








