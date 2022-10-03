package agam_Day21;

import java.util.Arrays;

public class Appearance {
    public static void main(String[] args) {

        String sentence = "java java python python java python";
        String str[]=sentence.split(" ");
        int jCounter=0,pCounter=0;

        for (String s:str){
            if(s.equalsIgnoreCase("java"))
                jCounter++;
            if(s.equalsIgnoreCase("python"))
                pCounter++;
        }
        System.out.println("java: "+jCounter+" python: "+pCounter);

    }
}
/*6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)*/