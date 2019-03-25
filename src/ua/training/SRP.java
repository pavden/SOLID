package ua.training;

public class SRP {

    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacade();

        employeeFacade.cook();
        employeeFacade.cleanFloor();
        employeeFacade.deliverFood();
    }

}

//class Employee {
//    int getSalary() {return 10;}
//    void cook() {}
//    void cleanFloor() {}
//    void deliverFood() {}
//}

interface Employee {
    int getSalary();
}

class Cook implements Employee {
    @Override
    public int getSalary() {
        return 10;
    }

    void cook() {}
}

class Janitor implements Employee {
    @Override
    public int getSalary() {
        return 20;
    }

    void cleanFloor() {}
}

class Courier implements Employee {
    @Override
    public int getSalary() {
        return 30;
    }

    void deliverFood() {}
}

class EmployeeFacade {
    Cook cook = new Cook();
    Janitor janitor = new Janitor();
    Courier courier = new Courier();

    void cook() {
        cook.cook();
    }

    void cleanFloor() {
        janitor.cleanFloor();
    }

    void deliverFood() {
        courier.deliverFood();
    }
}