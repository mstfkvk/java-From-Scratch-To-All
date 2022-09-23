package day04_variables;

public class Rectangle {
    public static void main(String[] args) {
        double length = 8;
        double width = 7;
        double area = length * width ;
        double perimeter = 2 *(length + width);
        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}

/*2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
						length
						width

						area = length * width
						perimeter =  2 * (length + width)*/