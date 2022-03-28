package classobjectconstructor;

public class Nissan {
    String carName;
    String carColor;

    Nissan(String thisCarName, String thisCarColor){
        carName = thisCarName;
        carColor= thisCarColor;
        System.out.println("This car is " +thisCarName+ " and the color is " +thisCarColor);
    }

    //methods
    void doors(){
        System.out.println("Open Close");
    }

    void seats(){
        System.out.println("Take a seat");
    }

    void gear(){
        System.out.println("Shift");
    }

    public void engine(){
        System.out.println("Roar");
    }

}
