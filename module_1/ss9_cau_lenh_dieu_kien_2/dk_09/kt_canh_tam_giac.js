let a = parseInt(prompt('Nhập số a:'));
let b = parseInt(prompt('Nhập số b:'));
let c = parseInt(prompt('Nhập số c:'));
d = a + b
e = b + c
f = a + c
if (a > 0 && b > 0 && c > 0 && d > c && e > a && f > b) {
    alert('a,b,c là cạnh của một tam giác');
} else {
    alert('a,b,c không phải là cạnh của một tam giác');
}