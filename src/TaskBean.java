import java.io.ObjectInputFilter;

public class TaskBean {

    private String id;
    private String assignee;

    /*
    status klass rom ar sheeqmna kompaileristvis problema
    shevqmeni axali Status class da 3 rendom stringidan vabrunebineb
    romelimes, HistoricTask-is shemtxvevashi sul iqneba "done"
     */
    private Status status;

    public TaskBean(Task task){
        this.assignee = task.getAssignee();
        this.id = task.getId();
        status = task.getStatus();
    }

    public TaskBean(HistoricTask task){
        this.assignee = task.getAssignee();
        this.id = Integer.toString(task.getId());
        status = new Status();
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public Status getStatus() {
        return status;
    }

//    private void setStatus(Status status) {
//        this.status = status;
//    }
}
