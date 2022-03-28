package classobjectconstructor;

public class BMW {
    String carName;
    String carType;

    BMW(String thisCarName, String thisCarType){
        carName = thisCarName;
        carType= thisCarType;
        System.out.println("This car is " +thisCarName+ " and this car is " +thisCarType);
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
