package classobjectconstructor;

public class Tesla {
    String carName;
    String carType;


    Tesla(String thisCarName, String thisCarType){
        carName = thisCarName;
        carType= thisCarType;
        System.out.println("This car is " +thisCarName+ " and it is " +thisCarType);
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
