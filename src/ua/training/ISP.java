package ua.training;

public class ISP {

    public static void main(String[] args) {
        IWorker iWorker = new Driver();
        iWorker.work();
        iWorker.eat();
        iWorker.work();
    }

}

interface Worker {
    void work();
}

interface Eater {
    void eat();
}

interface IWorker extends Worker, Eater {
}

class Driver implements IWorker {
    @Override
    public void work() {
        System.out.println("drive");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }
}

class Waiter implements Worker {
    @Override
    public void work() {
        System.out.println("deliver food");
    }
}
