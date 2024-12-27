package Object_Orianted_Programming.OOP_two.static_keyWord;

public class Main {
    public static void main(String[] args) {
            Human vasu = new Human(22,"Vasu Dholakiya",10000,false);
            Human het = new Human(13,"Het Dholakiya",100,false);

       System.out.println(vasu.name);
        System.out.println(Human.population);
       System.out.println(Human.population);

      //  greeting(); // give me error because we have no dealer a method in static and we don't declare
                    // non-static method in static variable
                    // static method is only access static data can't access not static data
    }

    // this is not  dependent on Objects
    static void fun(){ // not belongs to and instance
      //  greeting(); // dependent on Object , you cant use this because it requires instance
                    // but the function you are using it in does not dependent on objects on instances

        Main obj = new Main(); // create an object we use non-static property
        obj.greeting();

    }

    //  we know that something which is not static, belong to an object
    void greeting(){ // belongs to an instance
        System.out.println("Hoo..");
//        fun();
    }

}
