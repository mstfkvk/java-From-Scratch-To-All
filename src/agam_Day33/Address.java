package agam_Day33;

public class Address {
    public String street,city,state;
    public int zipcode;
    public static String country="USA", planet="earth";

    public Address(String street, String city, String state, int zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +"\n"+
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
/*5. Address Task:
		1. Create a class named Address:

		    Attributes:
		        instance:  street, city, state, zipCode;
		        static: country, planet

	        Add a constructor that can set All the fields (instances)

		    Actions

		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012

*/