function check() {
    let a = +document.getElementById('sodien').value;
    bac1 = a * 1678
    bac2 = a * 1734
    bac3 = a * 2014
    bac4 = a * 2536
    if (a < 0 && a <= 50) {
        document.getElementById('result').innerHTML = bac1 + ' VND';
    } else if (a <= 100) {
        document.getElementById('result').innerHTML = bac2 + ' VND';
    } else if (a <= 200) {
        document.getElementById('result').innerHTML = bac3 + ' VND';
    } else if (a > 200) {
        document.getElementById('result').innerHTML = bac4 + ' VND';
    }

}