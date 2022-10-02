package agam_Day19;

public class frequency {
    public static void main(String[] args) {
        String str="aaaaabbbbbcccd", str1="";
        int max=Integer.MIN_VALUE, count=0;
        for (int i = 0; i < str.length(); i++) {
            count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>max){
                if(!(str1.contains(""+str.charAt(i)))){
                    str1=""+str.charAt(i);
                }
                max=count;
            }
        }
        System.out.println(str1+max);
    }
}
/*6.  Write a program that can find the character that has the highest frequency from a string
 */