//This java file tests all of the methods and constructors located in Task.java
public class tasktest 
{
    public static void main(String[] args)
    {
    Task t1 = new Task();
    t1.printTask();
    t1.setTaskTitle("Wash Dishes");
    t1.setTaskDescription("Wash the dishes and put it in the kitchen cabinent.");
    t1.setDueDate("November 30th");
    t1.changeStatusToComplete();
    t1.printTask();
    t1.changeStatusToInProgress();
    Task t2 = new Task("Vaccum" , "Vaccum the living room and kitchen", "December 1st");
    t1.printTask();
    t2.printTask();
    System.out.println(Task.getIDNum());
    System.out.println(t2.getTaskID());
    System.out.println(t2.getTaskTitle());
    System.out.println(t2.getTaskDescription());
    System.out.println(t2.getDueDate());
    System.out.println(t2.getStatus());

    }
}
