package agam_Day39.Device;

public class Iphone extends Device {
    public Iphone(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    public void faceTime(long phoneNum){
        System.out.println(getBrand()+" "+getModel()+" is face timing with "+phoneNum);
    }

    public void faceTime(String email){
        System.out.println(getBrand()+" "+getModel()+" is face timing with "+email);
    }

}
