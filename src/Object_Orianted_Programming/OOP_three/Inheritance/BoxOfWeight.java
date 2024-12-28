package Object_Orianted_Programming.OOP_three.Inheritance;

public class BoxOfWeight extends Box_example {

    double weight;

    public BoxOfWeight() {
        this.weight = -1;
        //this.w = -1;// show me error because we declare w is private
    }

    BoxOfWeight(BoxOfWeight other){
        super(other);
        weight=other.weight;

    }

    public BoxOfWeight(double w, double h, double l, double weight) {
        super(w, h, l); // call the parent class constructor
        // use to initialized values present in patent class
        this.weight = weight;
    }
}
