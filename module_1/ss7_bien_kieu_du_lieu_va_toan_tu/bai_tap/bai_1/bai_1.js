let inputLy;
let inputHoa;
let inputSinh;
inputLy=prompt('Nhap diem Ly:');
inputHoa=prompt('Nhap diem Hoa');
inputSinh=prompt('Nhap diem Sinh');
let ly=parseInt(inputLy);
let hoa=parseInt(inputHoa);
let sinh=parseInt(inputSinh);
let diemtb=(ly+hoa+sinh)/3;
document.write('Diem trung binh la:'+diemtb);