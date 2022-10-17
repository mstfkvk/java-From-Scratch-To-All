package agam_Day33;

public class Dog {
    public String breed,color;
    public int size,age;
    public char gender;
    public static int numberOfLegs=4,numberOfEyes=2,numberOfWings=0;
    public static boolean isFriendly=true ;

    public Dog(String breed, String color, int size, int age, char gender) {
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(breed+" eating");
    }
    public void sleep(){
        System.out.println(breed+" sleeping");
    }
    public void play(){
        System.out.println(breed+" playing");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*6. Dog Task:
		1. Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()
*/