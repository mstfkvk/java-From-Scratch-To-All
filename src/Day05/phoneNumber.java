package Day05;

public class phoneNumber {
    public static void main(String[] args) {
        int countryCode= 1;
        int areaCode = 703;
        int localNumber = 4122625;
        String phone_Number="+" +countryCode + "(" +areaCode + ")-" + localNumber;
        System.out.println("phone_Number = " + phone_Number);
    }
}
