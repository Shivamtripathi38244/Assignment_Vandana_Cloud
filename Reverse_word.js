function reverse_word(sentence) {
    const words = sentence.split(' ');
    const reversedWordsarray = words.map(word => reverseWord(word));

    const reversedwords = reversedWordsarray.join(' ');

    return reversedwords;
}

function reverseWord(word) {
   
    return word.split('').reverse().join('');
}

const input = "This is a sunny day";
// const input= prompt("Enter a sentence:");
// Here we take the input from the user 
const Finalsentence = reverse_word(input);
console.log(Finalsentence);
