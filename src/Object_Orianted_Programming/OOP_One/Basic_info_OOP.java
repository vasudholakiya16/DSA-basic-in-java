package Object_Orianted_Programming.OOP_One;

import java.util.Arrays;

public class Basic_info_OOP {
    public static void main(String[] args) {
        // store 5 roll number

        int [] num = new int[5];

        // store 5 name
        String [] name = new String[5];

        // create one datatype store data of 5 students include rollNumber ,marks, name

        // M-1 to create
        int[] rollNumber = new  int[5];
        float[] marks= new float[5];
        String[] nameStudent = new String[5];

        // M-2 to create one single line use class
        Student [] student = new Student[5];
        System.out.println(Arrays.toString(student));

////        M-1 to dealer
//        Student student1;// this method is known as declaring the object not create an object
//        // create an object of student
//        student1= new Student();

//        M-2  to dealer in one line
        Student student1 = new Student();

        System.out.println("Without declaration print the value :-  ");
        System.out.println(student1); // give a random value
        System.out.println(student1.rollNumber); // by-default value is zero
        System.out.println(student1.nameStudent);//by-default null
        System.out.println(student1.marks); // by-default 0.0 because we use float or 0

        // if we declare once a time the value then print that value
        System.out.println("With Declaration pint the value :- ");
        student1.rollNumber=14;
        student1.marks= (float) 17.9;
        student1.nameStudent= "Vasu";
//        System.out.println(student1);
        System.out.println(student1.rollNumber);
        System.out.println(student1.nameStudent);
        System.out.println(student1.marks);
        student1.changeName("Het");

        student1.name(); // My Name is :- Vasu


        System.out.println("Create a new without use this keyword :- ");
        Student vasu = new Student(15,"Vasu Dholakiya",50.6f);
        System.out.println(vasu.rollNumber);
        System.out.println(vasu.nameStudent);
        System.out.println(vasu.marks);
        /*
        Output:-  0
                null
                0.0
                Our value is not modify because we not use this keyword
        */

        System.out.println("Create a new with use this keyword :- ");
        Student het = new Student(16,"Het Dholakiya",50.6f);
        System.out.println(vasu.rollNumber);
        System.out.println(vasu.nameStudent);
        System.out.println(vasu.marks);

      /*  Output:-  0
        16
        Het Dholakiya
        50.6

                */






    }


}
// create a class for every single student
class Student{
    int rollNumber;
    float marks;
    String nameStudent;

    void name(){
        System.out.println("My Name is :- "+this.nameStudent);
    }
    void changeName( String newName ){
        nameStudent = newName;

    }

    // we  need a way to add the value of the above properties object by object
    // we need one word to access every object
    Student (){
        this.rollNumber=14;
        this.nameStudent="Vasu";
        this.marks= 23.50f;

    }
    Student (int rollNumber, String nameStudent,float marks ){
        this.rollNumber=rollNumber;
        this.nameStudent=nameStudent;
        this.marks= marks;

    }

}