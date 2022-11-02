package agam_Day36.CyrptoToken;

public class MyWallet {
    public static void main(String[] args) {
        Bitcoin b = new Bitcoin();

        b.setInfo(22000,12,51353443,6362,true);

        System.out.println(b.getMarketCap());

    }
}
