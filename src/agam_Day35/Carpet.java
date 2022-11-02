package agam_Day35;

public class Carpet {
    private double width, length, unitPrice;
    private boolean isPersian;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.err.println("invalid data");
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.err.println("invalid data");
            System.exit(1);
        }
        this.length = length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0) {
            System.err.println("invalid data");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setPersian(boolean persian) {
        this.isPersian = persian; //this is unnecessary
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        setPersian(isPersian);
    }

    public double calcCost() {
        if (isPersian) {
            return length * width * unitPrice + 200;
        }
        return length * width * unitPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", cost=" + calcCost() +
                '}';
    }


    public static void main(String[] args) {
        Carpet carpet = new Carpet(4, 5, -3.5, false);

        System.out.println(carpet);

        carpet.setPersian(true);
        carpet.setUnitPrice(8);
        carpet.setWidth(7);
        carpet.setLength(6);

        System.out.println(carpet.getWidth() + " / " + carpet.getLength());
    }
}
/*3. Carpet Task
		3.1create a class named Carpet:
                private variables:
                        width, length, unitPrice, isPersian (boolean)

                Encapsulate all the fields:
                		Conditions:
                			width can not be negative
                			width can not be negative
                			unit price can not be negative

		Add a constructor to set all the instances
                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and
                        return it as double
                        toString(): should be able to display all the info of the carpet
                        including the total cost of the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitPrice
            if the carpet is persian  carpet, add 200$ to the totalPrice
*/