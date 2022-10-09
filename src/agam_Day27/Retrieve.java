package agam_Day27;

public class Retrieve {
    public static String retrieve(String str, String specialChars){
        for (int i = 0; i < specialChars.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if(specialChars.charAt(i)==str.charAt(j))
                   str= str.replaceAll(""+specialChars.charAt(i),"");
            }
        }
        return str;
    }


    public static void main(String[] args) {
        String str = "Wooden Spoon!";
        System.out.println(retrieve(str,"! "));
    }
}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
*/