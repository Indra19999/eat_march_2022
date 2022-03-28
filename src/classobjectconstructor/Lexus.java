package classobjectconstructor;

public class Lexus {
    String carName;
    String carColor;
    String carType;

    Lexus(String thisCarName, String thisCarColor, String thisCarType){
        carName = thisCarName;
        carColor= thisCarColor;
        carType = thisCarType;
        System.out.println("This car is " +thisCarName+ " and the color is " +thisCarColor+ " with a " +thisCarType);
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
