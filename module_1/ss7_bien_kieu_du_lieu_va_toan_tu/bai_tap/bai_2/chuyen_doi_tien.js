function ChangeMoney() {
    let amount=document.getElementById("amount").value;
    let from=document.getElementById("from").value;
    let to=document.getElementById("to").value;
    let a;
    if  (from=="USD" && to=="VND"){a="So tien la "+(amount*23000)+" VND";}
    else if(from=="VND" && to=="USD"){a="So tien la "+(amount/23000)+" $";}
    else  if (from=="USD" && to=="USD"){a="So tien la "+amount+" $";}
    else {a=" So tien la "+amount+" VND";}
    document.getElementById('a').innerHTML=a;
}