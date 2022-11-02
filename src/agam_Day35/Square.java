package agam_Day35;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<0){
            System.err.println("invalid data");
            return ;
        }
        this.side = side;
    }

    public Square(double side) {
        setSide(side);
    }

    public double calcArea(){
        return side*side;
    }

    public double calcPerimeter(){
        return 4*side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                "Perimeter=" + calcPerimeter() +
                "Area=" + calcArea() +
                '}';
    }


    public static void main(String[] args) {
        Square s1=new Square(-4);
        System.out.println(s1);
        s1.setSide(6);
        System.out.println(s1.getSide());
    }
}
/*
* 1. Square Task:
		1.1 Create a class named Square:
				Private variables:
					side

				Encapsulate all the fields

					Condition:
						side of the square should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of square
					calcPerimeter(): returns the perimeter of square
					toString(): can display the side, area, perimeter of square when
					* object is passed in print statement
*/