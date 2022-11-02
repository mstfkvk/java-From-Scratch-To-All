package agam_Day35;

public class Rectangle {
    private double width , length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.err.println("invalid data");
            return;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(width<=0){
            System.err.println("invalid data");
            return;
        }
        this.length = length;
    }

    public Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }

    public double calcArea(){
        return width*length;
    }
    public double calcPerimeter(){
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", Area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }

    public static void main(String[] args) {
        Rectangle r1=new Rectangle(4,12);
        System.out.println(r1);
    }

}
/*2. Rectangle Task:
		2.1 Create a class named Rectangle:
				Private variables:
					width, length

				Encapsulate all the fields
						Conditions:
							width of the rectangle should not be negative
							length of the rectangle should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of rectangle
					calcPerimeter(): returns the perimeter of rectangle
					toString(): can display the width, length, area,
					and perimeter of rectangle when object is passed in print statement
*/