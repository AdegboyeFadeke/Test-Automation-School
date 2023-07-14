const Arr = [10, 20, 3, 4, 40, 50];

for(let i =0; i<Arr.length; i++){
    if (Arr[i]%10 === 0){
        console.log(i, "is divisible by 10, true")
    }else{
        console.log(i, "is not divisible by 10, false")
    }
}