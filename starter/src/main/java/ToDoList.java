import java.util.*;
import java.util.Scanner;

public class ToDoList 
{
    protected LinkedList<Task> toDoList;
    protected Queue<Task> listQueue;

    public ToDoList()
    {
        toDoList = new LinkedList<Task>();
        listQueue = new LinkedList<Task>();
    }

    public void addTask(String taskTitle, String taskDescription, String dueDate)
    {
        toDoList.add(new Task(taskTitle, taskDescription, dueDate));
    }

    public void displayAllTasks()
    {
        if(toDoList.size() == 0)
        {
            System.out.println("Your to-do list is empty, please add at least one task.");
            return;
        }
        else
        {
           for(int i = 0 ; i < toDoList.size() ; i++)
           {
               Task currentTask = toDoList.get(i);
               currentTask.printTask();
           }
        }
    }

    public void viewTaskOneAtTime(Scanner keyboard)
    {
        if(toDoList.size() == 0)
        {
            System.out.println("Your to-do list is empty, please add at least one task.");
            return;
        }
        else
        {
            int userChoice = 1;

            for(int i = 0 ; i < toDoList.size() ; i++)
            {
                Task currentTask = toDoList.get(i);
                listQueue.offer(currentTask);
            }

            while(userChoice == 1 || userChoice == 2)
            {
                System.out.println("Enter either 1 to view next item in your to do list or enter 2 to quit.");
                userChoice = keyboard.nextInt();

                if(listQueue.isEmpty())
                {
                    System.out.println("No more items left to display. Exiting...");
                    break;
                }

                if(userChoice == 1)
                {
                    Task currentTask = listQueue.poll();
                    currentTask.printTask();

                }
                else if(userChoice == 2)
                {
                    System.out.println("Exiting...");
                    listQueue.clear();
                    break;
                }
                else
                {
                    System.out.println("Please try again. The valid inputs are either 1 or 2. Please select the option to view each task one at a time to try again.");
                    listQueue.clear();
                }
            }
            
        }
    }

    public void markTaskAsComplete(int idNum) throws NullPointerException, IndexOutOfBoundsException
    {
        int taskID = idNum - 1;

        if(toDoList.size() == 0)
        {
            throw new NullPointerException("Your to-do list is empty, please add at least one task.");
        }
        else if(taskID < 0 || taskID >= toDoList.size())
        {
            throw new IndexOutOfBoundsException("Invalid input, please input an ID between 1 and the ID value of the last task you added.");
        }

        Task currentTask = toDoList.get(taskID);
        currentTask.changeStatusToComplete();
        System.out.println("The specified task has been marked as complete");
    }

    public void markTaskAsInProgress(int idNum) throws NullPointerException, IndexOutOfBoundsException
    {

        int taskID = idNum - 1;
        if(toDoList.size() == 0)
        {
            throw new NullPointerException("Your to-do list is empty, please add at least one task.");
        }
        else if(taskID < 0 || taskID >= toDoList.size())
        {
            throw new IndexOutOfBoundsException("Invalid input, please input an ID between 1 and the ID value of the last task you added.");
        }
        
        Task currentTask = toDoList.get(taskID);
        currentTask.changeStatusToInProgress();
        System.out.println("The specified task has been marked as in progress");
    }

    public void filterByInProgress()
    {
        Task currentTask;

        for(int i = 0 ; i < toDoList.size() ; i++)
        {
            currentTask = toDoList.get(i);
            if(currentTask.getStatus().equals("In Progress"))
            {
                listQueue.offer(currentTask);
            }
        }
        
        if(listQueue.isEmpty())
        {
            System.out.println("Either your to-do list is empty or no tasks are marked as in progress.");
            System.out.println("Please verify that your list has at least one task and that you have at least one task marked as in progress.");
            return;
        }
        
        while(!listQueue.isEmpty())
        {
            currentTask = listQueue.poll();
            currentTask.printTask();
        }

        listQueue.clear();
    }


    public void filterByCompleted()
    {
        Task currentTask;

        for(int i = 0 ; i < toDoList.size() ; i++)
        {
            currentTask = toDoList.get(i);
            if(currentTask.getStatus().equals("Complete"))
            {
                listQueue.offer(currentTask);
            }
        }

        if(listQueue.isEmpty())
        {
            System.out.println("Either your to-do list is empty or no tasks are marked as complete.");
            System.out.println("Please verify that your list has at least one task and that you have at least one task marked as complete.");
            return;
        }

        while(!listQueue.isEmpty())
        {
            currentTask = listQueue.poll();
            currentTask.printTask();
        }

        listQueue.clear();
    }
}
