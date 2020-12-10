import java.io.ObjectInputFilter;

public class TaskBean {
    private String id;
    private String assignee;

    /*
    ar vicodi romeli status klasi iyo gamosayenebeli da am shemtxvevashi
    OjbectInputFilter.Status gamoviyene, "done"-is dabrunebashi
    vtvli OjbectInputFilter.Status.ALLOWED enum-is gamoyenebas
     */
    private ObjectInputFilter.Status status;

    public TaskBean(Task task){
        this.assignee = task.getAssignee();
        this.id = task.getId();
        status = task.getStatus();
    }

    public TaskBean(HistoricTask task){
        this.assignee = task.getAssignee();
        this.id = Integer.toString(task.getId());
        status = ObjectInputFilter.Status.ALLOWED;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public ObjectInputFilter.Status getStatus() {
        return status;
    }

    /*
     garedan rom ar sheucvalot historictask-s statusi
     tuki garedan dasetva ar unda xdebodes taskis monacemebis
     ubralod wavshlit seterebs an private-ze gadaviyvant
     */
    private void setStatus(ObjectInputFilter.Status status) {
        this.status = status;
    }
}
