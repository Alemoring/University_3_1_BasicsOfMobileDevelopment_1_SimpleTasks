class Sentence {
    var words : List<String>
        get() = field
    constructor(input : String) {
        words = input.split(',', ' ')
    }
    fun findWords(): ArrayList<String> {
        var wordsWithSameChar = arrayListOf<String>()
        for (i in 0 .. words.size - 1){
            for (j in i + 1 .. words.size - 1){
                if (!words.get(i).isEmpty() && !words.get(j).isEmpty()){
                    if ((words.get(i).get(0) == words.get(j).get(0)) && (words.get(i).get(words.get(i).length - 1) == words.get(j).get(words.get(j).length - 1))){
                        wordsWithSameChar.add(words.get(i))
                        wordsWithSameChar.add(words.get(j))
                    }
                }
            }
        }
        return wordsWithSameChar
    }
}