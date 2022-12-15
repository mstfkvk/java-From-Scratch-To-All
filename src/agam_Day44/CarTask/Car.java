package agam_Day44.CarTask;

public abstract class Car {
    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear() {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new RuntimeException("it can not be null");
        }
        this.color = color;
    }

    public abstract void start();

    public abstract void drive();

    public void stop() {
        System.out.println(getModel() + "is stopped");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
* Variables:
					make (final), model (final), year (final), price, color
				Encapsulate all the fields
				Add a constructor that can set all the fields
				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative
					If invalid arguments are given for setting the instances, then manually throw an exception
				abstract methods:
					start();
					drive();
				none abstract methods:
		            stop()
					toString()
* */