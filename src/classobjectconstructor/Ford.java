package classobjectconstructor;

public class Ford {
    String carName;
    String carColor;
    String carType;

    Ford(String thisCarName, String thisCarType){
        carName = thisCarName;
        carType= thisCarType;
        System.out.println("This car is " +thisCarName+ " and the color is " +thisCarType);
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
