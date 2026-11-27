import java.util.Scanner;

public class ToDoListTest 
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    
    ToDoList l1 = new ToDoList();
    l1.addTask("Clean Bathroom" , "Clean the toilet, wash the mirrors, and wipe the counter." , "December 3rd");
    l1.addTask("Go to the grocery store" , "Buy some beef, potatos, carrots, and rice to make soup", "December 4th");
    l1.addTask("Vaccum", "Vaccum the kitchen, living room, and bathroom" , "December 7th");
    
    l1.viewTaskOneAtTime(keyboard);
    /* 
    try 
    {
    l1.markTaskAsComplete(3);
    }
    catch(NullPointerException e)
    {
        System.out.println(e.getMessage());

    }
    catch(IndexOutOfBoundsException e)
    {
        System.out.println(e.getMessage());
    }
    
    try 
    {
    l1.markTaskAsComplete(4);
    }
    catch(NullPointerException e)
    {
        System.out.println(e.getMessage());

    }
    catch(IndexOutOfBoundsException e)
    {
        System.out.println(e.getMessage());
    }

    try 
    {
    l1.markTaskAsComplete(0);
    }
    catch(NullPointerException e)
    {
        System.out.println(e.getMessage());

    }
    catch(IndexOutOfBoundsException e)
    {
        System.out.println(e.getMessage());
    }
    
    l1.displayAllTasks();
    l1.filterByCompleted();

    try 
    {
    l1.markTaskAsInProgress(3);
    }
    catch(NullPointerException e)
    {
        System.out.println(e.getMessage());

    }
    catch(IndexOutOfBoundsException e)
    {
        System.out.println(e.getMessage());
    }

    try 
    {
    l1.markTaskAsInProgress(4);
    }
    catch(NullPointerException e)
    {
        System.out.println(e.getMessage());

    }
    catch(IndexOutOfBoundsException e)
    {
        System.out.println(e.getMessage());
    }

    try 
    {
    l1.markTaskAsInProgress(0);
    }
    catch(NullPointerException e)
    {
        System.out.println(e.getMessage());

    }
    catch(IndexOutOfBoundsException e)
    {
        System.out.println(e.getMessage());
    }

    l1.displayAllTasks();
    l1.filterByInProgress();
    
    
    ToDoList l2 = new ToDoList();
    
    try 
    {
    l2.markTaskAsComplete(3);
    }
    catch(NullPointerException e)
    {
        System.out.println(e.getMessage());

    }
    catch(IndexOutOfBoundsException e)
    {
        System.out.println(e.getMessage());
    }

    try 
    {
    l2.markTaskAsInProgress(4);
    }
    catch(NullPointerException e)
    {
        System.out.println(e.getMessage());

    }
    catch(IndexOutOfBoundsException e)
    {
        System.out.println(e.getMessage());
    }

    l2.filterByCompleted();
    l2.filterByInProgress();
    */

    

    
    }
    
}
