package Day08;

public class GradeLevel {
    public static void main (String[] args){
        byte grade = 3;
        if( grade >= 1 && grade <=5){
            System.out.println("Elementary school");
        }
        if( grade >= 6 && grade <=8){
            System.out.println("Middle school");
        }
        if( grade >= 9 && grade <=12){
            System.out.println("High school");
        }
        if( grade >= 13 && grade <=16){
            System.out.println("Collage");
        }
        if( grade >= 17 && grade <=18){
            System.out.println("Grad school");
        }
    }
}

/*2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18       */