import java.util.Scanner;

class Task
{
    private String taskName;
    private Integer estimatedTime;
    private Boolean completed;

    public Task(String taskName, Integer estimatedTime, Boolean completed)
    {
        this.taskName = taskName;
        this.estimatedTime = estimatedTime;
        this.completed = completed;
    }

    public String getTaskName()
    {
        return taskName;
    }

    public void setTaskName(String taskName)
    {
        this.taskName = taskName;
    }

    public Integer getEstimatedTime()
    {
        return estimatedTime;
    }

    public void setEstimatedTime(Integer estimatedTime)
    {
        this.estimatedTime = estimatedTime;
    }

    public Boolean getCompleted()
    {
        return completed;
    }

    public void setCompleted(Boolean completed)
    {
        this.completed = completed;
    }

    public void displayTask()
    {
        System.out.println("Task Name: " + taskName);
        System.out.println("Estimated Time: " + estimatedTime + " minutes");

        if (completed)
        {
            System.out.println("Status: Completed");
        }
        else
        {
            System.out.println("Status: Not completed");
        }

        System.out.println("-------------------------");
    }
}

public class TaskManager
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Task[] tasks = new Task[5];

        System.out.println("===== DAILY TASK MANAGER =====");

        for (int i = 0; i < tasks.length; i++)
        {
            System.out.println("\nEnter information for Task " + (i + 1));

            System.out.print("Enter task name: ");
            String name = scan.nextLine();

            System.out.print("Enter estimated time in minutes: ");
            Integer time = Integer.valueOf(scan.nextLine());

            System.out.print("Is the task completed? (true/false): ");
            Boolean status = Boolean.valueOf(scan.nextLine());

            tasks[i] = new Task(name, time, status);
        }

        System.out.println("\n===== YOUR DAILY TASKS =====");

        for (int i = 0; i < tasks.length; i++)
        {
            System.out.println("Task " + (i + 1));
            tasks[i].displayTask();
        }

        System.out.print("Enter the task number you want to update (1-5): ");
        int taskNumber = Integer.parseInt(scan.nextLine());

        if (taskNumber >= 1 && taskNumber <= 5)
        {
            System.out.println("1. Update estimated time");
            System.out.println("2. Mark task as completed");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scan.nextLine());

            if (choice == 1)
            {
                System.out.print("Enter the new estimated time in minutes: ");
                Integer newTime = Integer.valueOf(scan.nextLine());

                tasks[taskNumber - 1].setEstimatedTime(newTime);
                System.out.println("Task time updated.");
            }
            else if (choice == 2)
            {
                tasks[taskNumber - 1].setCompleted(true);
                System.out.println("Task marked as completed.");
            }
            else
            {
                System.out.println("Invalid option.");
            }

            System.out.println("\n===== UPDATED TASK =====");
            tasks[taskNumber - 1].displayTask();
        }
        else
        {
            System.out.println("Invalid task number.");
        }

        scan.close();
    }
}

