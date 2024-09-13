import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

class SentenceTest {

    @DisplayName("Same starts")
    @org.junit.jupiter.api.Test
    fun findWordsOne() {
        val arr = arrayListOf("Hello", "Haribo")
        var myarray = Sentence("Hammer Hello, Hoe,Haribo ,Hand")
        var result = myarray.findWords()
        assertEquals(arr, result)
    }
    @DisplayName("Same ends")
    @org.junit.jupiter.api.Test
    fun findWordsTwo() {
        val arr = arrayListOf("Hammer", "Hunter")
        var myarray = Sentence("Driver Hammer, Liker,Hunter ,Gamer")
        var result = myarray.findWords()
        assertEquals(arr, result)
    }
    @DisplayName("Same starts and ends")
    @org.junit.jupiter.api.Test
    fun findWordsThree() {
        val arr = arrayListOf("Hammer", "Hunter", "Hello", "Haribo")
        var myarray = Sentence("Driver Hammer, Hello,Hunter ,Haribo")
        var result = myarray.findWords()
        assertEquals(arr, result)
    }
}