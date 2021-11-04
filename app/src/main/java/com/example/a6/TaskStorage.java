package com.example.a6;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private List<Task> tasks;
    private static TaskStorage con = new TaskStorage();

    public TaskStorage()
    {
        tasks = new ArrayList<>();
        for(int i=0;i<100;i++)
        {
            tasks.add(new Task("Task "+i));
        }
    }

    public List<Task> getTasks()
    {
        return tasks;
    }

    public Task getTask(UUID id)
    {
        for(Task x:tasks)
        {
            if(x.getId().equals(id))
            {
                return x;
            }
        }
        return null;
    }

    public static TaskStorage getCon()
    {
        if(con==null)
        {
            con = new TaskStorage();
        }
        return con;
    }

}
