import com.sun.jdi.IntegerType
// 9.	Дана строка символов. Слова отделяются друг от друга пробелами или запятыми.
// Вывести слова, начинающиеся и заканчивающиеся одной и той же буквой.
fun main() {
    val input = readln()
    println("Исходная строка: $input")
    val sentence = Sentence(input)
    val words = sentence.words
    println("Получившиеся слова:")
    var i = 1;
    for (word in words){
        if (!word.isEmpty()){
            println("$i) $word")
            i++
        }
    }
    println("Слова начинающиеся на одинаковую букву:")
    var wordsWithSameChar = sentence.findWords()
    for (i in 0..wordsWithSameChar.size - 1){
        println((i+1).toString() + ") " + wordsWithSameChar.get(i))
    }
}