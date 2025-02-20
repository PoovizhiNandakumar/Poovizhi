let num1 = prompt("Enter the First number:");
let operator = prompt("Enter the operator:");
let num2 = prompt("Enter the Second number:");

num1 = parseFloat(num1);
num2 = parseFloat(num2);

let result;

if (operator === "+") {
    result = num1 + num2;
} 
else if (operator === "-") {
    result = num1 - num2;
}
else if (operator === "*") {
    result = num1 * num2;
} 
else if (operator === "/") {
        result = num1 / num2;
    } 

console.log("The result is: " + result);
