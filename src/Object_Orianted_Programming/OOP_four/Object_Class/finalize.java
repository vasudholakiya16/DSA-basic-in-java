package Object_Orianted_Programming.OOP_four.Object_Class;

public class finalize {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected");
    }

    public static void main(String[] args) {
        finalize obj = new finalize();
        obj = null;
        System.gc(); // Request garbage collection
    }
}
