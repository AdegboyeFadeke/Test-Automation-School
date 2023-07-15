function getVowel(string){
let vowels = "aeiou";
let numberOfVowels = 0;

for(let i =0; i < string.length; i++){
    if(vowels.indexOf(string[i]) !== -1){
           numberOfVowels +=1
    }
}
return numberOfVowels;
}
console.log(getVowel("I am a beleiever"))