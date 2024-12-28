package Object_Orianted_Programming.OOP_three.Inheritance;

public class BoxPrice extends BoxOfWeight {

    double cost;

    BoxPrice(){
        super();
        this.cost =-1;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost=other.cost;

    }

    public BoxPrice(double w, double h, double l, double weight, double cost) {
        super(w, h, l, weight);
        this.cost = cost;
    }
}
