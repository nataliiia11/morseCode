import jdk.nashorn.internal.objects.NativeString.toLowerCase

fun main() {
    var morseEngMap = mutableMapOf(
             'a'  to ".-",
             'b'  to "-...",
             'c'  to "-.-.",
             'd'  to "-..",
             'e'  to ".",
             'f'  to "..-.",
             'g'  to "--.",
             'h'  to "....",
             'i'  to "..",
             'j'  to ".---",
             'k'  to "-.-",
             'l'  to ".-..",
             'm'  to "--",
             'n'  to "-.",
             'o'  to "---",
             'p'  to ".--.",
             'q'  to "--.-",
             'r'  to ".-.",
             's'  to "...",
             't'  to "-",
             'u'  to "..-",
             'v'  to "...-",
             'w'  to ".--",
             'x'  to "-..-",
             'y'  to "-.--",
             'z'  to "--..",
             'ü'  to "..--",
             'ö'  to "---.",
             'ä'  to ".-.-",
             'ß'  to "...--..",
             '1'  to ".----",
             '2'  to "..---",
             '3'  to "...--",
             '4'  to "....-",
             '5'  to "-....",
             '6'  to "--...",
             '7'  to "--...",
             '8'  to "---..",
             '9'  to "----.",
            '0'  to "-----"
        )
    
    println("Please enter your Morse message")
    var text = readLine()
    if (text != null) {
        text =  toLowerCase(text)
        val chars: CharArray =  text.toCharArray()

        for (char in chars) {
            if(morseEngMap[char] != null) {
                print(morseEngMap [char] + " ")
            }
        }
    }
    println()
    println("please enter your Morse message")
    val code = readLine()
    if (code != null) {
        val words = code.split("\\s".toRegex()).toTypedArray()
        for(word in words) {
            val matchingKey = morseEngMap.entries.find { it.value == word }?.key
            if(matchingKey != null) {
                print(matchingKey)
            } else {
                print(word)
                print(" ")
            }
        }
    }
}