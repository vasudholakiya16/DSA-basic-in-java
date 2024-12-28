package Object_Orianted_Programming.OOP_three.Inheritance;

public class Box_example {
//  private  double w; // use only this file outside the file we not use

    double w;
    double h;
    double l;

    public Box_example() {
        this.w = -1;
        this.h = -1;
        this.l = -1;
    }
    // cube
    public Box_example(double side){

        super();// refer to object class
        this.w= side;
        this.h= side;
        this.l= side;
    }

    public Box_example(double w, double h, double l) {
        System.out.println("Print the box class constructor");
        this.w = w;
        this.h = h;
        this.l = l;
    }
    Box_example(Box_example old){
        this.h= old.h;
        this.w = old.w;
        this.l=old.l;
    }

    public void information(){
        System.out.println("Running the box ");
    }

}
