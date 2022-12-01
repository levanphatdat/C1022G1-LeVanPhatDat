let nam=parseInt(prompt("Nhap nam:"));
if (nam % 4==0) {
    if (nam % 100 == 0)     {
        if (nam % 400 == 0) {
            alert(nam + " la nam nhuan");
        } else {
            alert(nam + ' khong phai la nam nhuan');
        }

    } else {
        alert(nam + " la nam nhuan");
    }

}else {
    alert(nam + ' khong phai la nam nhuan');}