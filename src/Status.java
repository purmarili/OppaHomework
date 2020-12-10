import java.util.Random;

public class Status {
    private String status;
    String [] statuses = {"done", "in process", "other"};
    Random rand = new Random(3);

    public Status(){
        status = statuses[rand.nextInt()];
    }

    public Status(HistoricTask task){
        status = "done";
    }

    public String getStatus(){
        return status;
    }
}
