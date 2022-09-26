package Day09;

public class Identity {
    public static void main(String[] args) {
        char ch = ';';
        int convert = ch;
        if ( (convert >= 65 && convert <=90) || (convert >= 97 && convert <=122)){
            System.out.println("convert: " + (char)(convert) + " is alphabetic character");
        } else if (convert >= 48 && convert <= 57) {
            System.out.println("convert: " + (char)(convert) + " is DIGIT");
        }else {
            System.out.println("convert: " + (char)(convert) + " is special character");
        }
    }
}

/*4. Create a class called Character Identity,
and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z)
or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table
*/