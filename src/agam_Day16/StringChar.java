package agam_Day16;

public class StringChar {
    public static void main(String[] args) {
        String str="aabcccd";
        char c=' ';
        int counter=0;
        for (int i = 0; i <str.length() ; i++) {
        if(str.charAt(i)== c){
            counter++;
        }
        }
        System.out.println(counter);

    }
}
/*2. Write a program that asks user to entera string and a char,
 the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4























                */