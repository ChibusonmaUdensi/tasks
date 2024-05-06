const cars = [1, 2, 2, 2, 3];

let maximum = cars[0];
for (let i = 0; i < cars.length; i++) {
	if (cars[i] > maximum) {
	maximum = cars[i];
	}
}

console.log(maximum)


const numbers = [2, 3, 7, 1, 2];

let maximumno = numbers[0];
for (let i = 0; i < numbers.length; i++) {
	if (numbers[i] > maximumno) {
	maximumno = numbers[i];
	}
}

console.log(maximumno)
