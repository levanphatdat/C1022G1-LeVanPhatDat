function Cong() {
    let so1 =document.getElementById('num1').value;
    let so2 =document.getElementById('num2').value;
    let result=Number(so1)+Number(so2);
    document.getElementById('result').innerHTML=result;

}
function Tru() {
    let so1=document.getElementById('num1').value;
    let so2=document.getElementById('num2').value;
    let result=Number(so1)-Number(so2);
    document.getElementById('result').innerHTML=result;

}