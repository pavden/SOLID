package ua.training;

public class DIP {

    public static void main(String[] args) {
        Client client = new Client();
        client.doJob();
    }

}

interface DAO {
    void execute();
}

class DataAccess implements DAO {
    @Override
    public void execute() {
        System.out.println("execute");
    }
}

class Client {
    private DAO dataAccess = new DataAccess();

    void doJob() {
        dataAccess.execute();
    }
}