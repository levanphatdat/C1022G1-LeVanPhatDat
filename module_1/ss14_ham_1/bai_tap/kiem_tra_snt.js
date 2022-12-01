function isPrime(m) {
    let count = 0;
    for (let i = 1; i <= m; i++) {
        if (m % i === 0) {
            count++;
        }
    }
    if (count === 2) {
        return true;
    } else {
        return false;
    }
}