

const addAsArrow = (numbers)=>{
    let sum = 0;
    for (let  index = 0; index < numbers.length; index++) {
        const element = numbers[index];
        sum += element;
    }
    return sum;
}

console.log(addAsArrow([1,2,3]));

// function add() {
//     console.log(arguments);
//     let sum = 0;
//     for (let index = 0; index < arguments.length; index++) {
//         const element = arguments[index];
//         sum += element;
//     }
//     return sum;
// }
// // console.log(arguments);
// const result = add(3,4, 6,6);
// console.log(result);
