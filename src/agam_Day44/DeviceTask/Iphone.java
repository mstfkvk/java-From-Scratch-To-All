package agam_Day44.DeviceTask;

public class Iphone extends Phone implements Downloadable, AppleApps{
    public Iphone(String brand, String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadable() {

    }
}
