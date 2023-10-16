function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => word.split('').reverse().join(''));
    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

// Example usage:
const inputSentence = "This is a sunny day";
const reversedResult = reverseWordsInSentence(inputSentence);
console.log(reversedResult);