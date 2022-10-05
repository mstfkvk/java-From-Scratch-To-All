package agam_Day24;

public class frequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java java java python pythonjava javja";
        String word = "java";
        int num=frequencyOfWords(sentence, word);
        System.out.println(num);
    }

    public static int frequencyOfWords(String sentence, String word) {
        int l = word.length(), frequency = 0;
        for (int i = 0; i < sentence.length() - word.length()+1; i++) {
            if (sentence.substring(i, i+l).equalsIgnoreCase(word)) {
                frequency+=1;
            }
        }
        return frequency;
    }
}
/*1.  create a method named frequencyOfWord that passes two parameters:
string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
*/