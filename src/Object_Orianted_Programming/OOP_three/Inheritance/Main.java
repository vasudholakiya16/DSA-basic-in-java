package Object_Orianted_Programming.OOP_three.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box_example Box = new Box_example();
        Box_example Box1 = new Box_example(4.0);
        Box_example Box2 = new Box_example(4.0,3.7,7.9);
        Box_example Box3 = new Box_example(Box2);
        BoxOfWeight Box4 = new BoxOfWeight();
        BoxOfWeight Box5 = new BoxOfWeight(7,8,9,5);


        System.out.println(Box.l + " " + Box.w + " "+ Box.h);
        System.out.println(Box1.l + " " + Box1.w + " "+ Box1.h);
        System.out.println(Box2.l + " " + Box2.w + " "+ Box2.h);
        System.out.println(Box3.l + " " + Box3.w + " "+ Box3.h);
        System.out.println(Box4.h + " "+ Box4.weight);


        Box_example Box6 = new BoxOfWeight(2,3,4,8);
        /*
        If we declare bellow format
                Box_example Box6 = new BoxOfWeight(2,3,4,8);
         we easily access the all Box_example property but we cat access BoxOfWeight property

         */
/*
        BoxOfWeight Box7 = new Box_example(1,2,3,4); // come error
        their are many variable in both parent and child classics
        you are given access to variables that are in a reference type hence,
        you should have access to weight variable.
        it also means that the ones you are truing to access should be initialized
        but hear the object itself is a type of parent class , how will call to the constructor
        of child class
 */

        BoxPrice box8= new BoxPrice();


    }
}
