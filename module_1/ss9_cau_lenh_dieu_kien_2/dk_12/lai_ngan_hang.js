function laisuat() {
    let a=document.getElementById('vay').value;
    let b=document.getElementById('thang').value;
    let c=document.getElementById('lai').value;
    let result=a*b*(0.12*c/100);
    let d=result.toFixed(2)
    document.getElementById('result').innerHTML='Lãi suất ngân hàng là: '+d+ ' TrVNd';

}