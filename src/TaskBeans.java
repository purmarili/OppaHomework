import java.util.ArrayList;
import java.util.List;

public class TaskBeans {
    private ArrayList<TaskBean> taskBeanData;

    public TaskBeans(){
        this.taskBeanData = new ArrayList<>();
    }

    public TaskBeans(ArrayList<TaskBean> taskBeanData){
        this.taskBeanData = taskBeanData;
    }

    public void add(TaskBean taskBean){
        taskBeanData.add(taskBean);
    }

    public int size(){
        return taskBeanData.size();
    }

    public boolean contains(TaskBean task){
        if (taskBeanData.contains(task))
            return true;
        return false;
    }

    public TaskBean getTask(int index){
        if (index >= taskBeanData.size())
            return null;
        return taskBeanData.get(index);
    }

    public void removeTask(TaskBean task){
        taskBeanData.remove(task);
    }

    public List<Task> getAllTasks(){
        return null;
    }

    public List<HistoricTask> getAllHistoricTasks(){
        return null;
    }
}
