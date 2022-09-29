package agam_Day11;

public class Browser {
    public static void main(String[] args) {
        String browserName = "edgee", b = "";

        switch (browserName) {
            case "chrome":
            case "firefox":
            case "opera":
            case "safari":
            case "edge":
                b= browserName;
                break;
            default:
                b = " invalid browser";
        }
        System.out.println(b);
    }
}
/*3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
*/