let kt=+prompt('Diem kiem tra');
let gk=+prompt('Diem giua ki');
let ck=+prompt('Diem cuoi ki');
result=(kt + gk*2 + ck*3)/6;
if (result >= 8) {
    alert('Hoc sinh gioi')
} else if (result >= 6.5) {
    alert('Hoc sinh kha')
} else if (result >= 5) {
    alert('Hoc sinh trung binh')
} else alert('Hoc sinh yeu')