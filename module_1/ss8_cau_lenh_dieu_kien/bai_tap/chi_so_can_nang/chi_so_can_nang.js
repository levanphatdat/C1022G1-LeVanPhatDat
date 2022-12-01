function kiemTra() {
let weight = +document.getElementById('nang').value;
let height = +document.getElementById('cao').value;
let bmi = weight /(height*height)
let result='';
if (bmi<18.5){
    result= 'You underweight';
} else if (bmi<25) {
    result= 'You normal';
} else if (bmi<30) {
    result= 'You overweight';
} else {
    result='You Osebe';
    }
document.getElementById('result').innerHTML= 'BMI: '+bmi+ '. ' +result;
}