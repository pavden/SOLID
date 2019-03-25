package ua.training;

public class OCP {

    public static void main(String[] args) {
//        Toyota toyota = new Toyota();
        Celica celica = new Celica();
        workInTaxi(celica);
    }

    static void workInTaxi(Car car) {
        car.workInTaxi();
    }

}

interface Car {
    void workInTaxi();
}

class Toyota implements Car {
    @Override
    public void workInTaxi() {
        getPassengers();
    }

    void getPassengers() {
        System.out.println("get few passengers");
    }
}

class Celica implements Car {
    @Override
    public void workInTaxi() {
        getPassenger();
    }

    void getPassenger() {
        System.out.println("get one passenger");
    }
}