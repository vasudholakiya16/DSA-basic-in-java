package Object_Orianted_Programming.OOP_two.static_keyWord;

public class Initialisation_of_static_variables {


    static int a = 4;
    static int b;

    /*
    we want to initialize above declare variable ??
    answer:- us static bloc and static block is executed exactly once when the class is first loaded
     */

    static {
        System.out.println("I am in Static Block:-");
        b= a*5;
    }

    public static void main(String[] args) {
        Initialisation_of_static_variables object = new Initialisation_of_static_variables();
        System.out.println(Initialisation_of_static_variables.a);
        System.out.println(Initialisation_of_static_variables.b);

        Initialisation_of_static_variables.b+=3;
        System.out.println(Initialisation_of_static_variables.b);


        Initialisation_of_static_variables obj2 = new Initialisation_of_static_variables();
        System.out.println(Initialisation_of_static_variables.a);
        System.out.println(Initialisation_of_static_variables.b);



    }


}
