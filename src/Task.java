import java.io.ObjectInputFilter;
import java.util.Date;

public interface Task {
    String getAssignee();
    String getId();
    String getExecutionId();
    Date getCreationTime();
    ObjectInputFilter.Status getStatus();
}
