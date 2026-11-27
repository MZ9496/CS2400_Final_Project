

public class Task 
{
    protected static int idNum = 0;
    protected int taskID;
    protected String taskTitle;
    protected String taskDescription;
    protected String dueDate;
    protected String status;
    

    public Task() 
    {
        this.taskTitle = "Default Title";
        this.taskDescription = "Default Description";
        this.dueDate = "1/1/2000";
        this.status = "In Progress";
        idNum = idNum + 1;
        this.taskID = idNum;
    }

    public Task(String taskTitle, String taskDescription, String dueDate)
    {
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
        this.status = "In Progress";
        idNum = idNum + 1;
        this.taskID = idNum;
    }

    public static int getIDNum()
    {
        return idNum;
    }

    public int getTaskID()
    {
        return taskID;
    }

    public String getTaskTitle()
    {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle)
    {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription()
    {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription)
    {
        this.taskDescription = taskDescription;
    }

    public String getDueDate()
    {
        return dueDate;
    }

    public void setDueDate(String dueDate)
    {
        this.dueDate = dueDate;
    }

    public String getStatus()
    {
        return status;
    }

    public void changeStatusToComplete()
    {
        status = "Complete";
    }

    public void changeStatusToInProgress()
    {
        status = "In Progress";
    }

    public void printTask()
    {
        System.out.println("Task ID: " + taskID + "\tTask Title: " + taskTitle + "\tTask Description: " + taskDescription + "\tDue Date: " + dueDate + "\tStatus: " + status + "\n");
    }

}
