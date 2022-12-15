package agam_Day44.DeviceTask;

public abstract class Phone extends Device {
    public Phone(String brand, String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }
}
/*
* 2. Create a child abstract class of Device named Phone:
				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()

* */