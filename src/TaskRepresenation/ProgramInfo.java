package TaskRepresenation;

import java.util.ArrayList;

public class ProgramInfo {

    private ArrayList<Task> tasks;
    private String programName;
    private static ProgramInfo instance = null;
    public Task currentTask;

    private ProgramInfo(){
        programName = "";
        tasks = new ArrayList<>();

    }

    public static ProgramInfo getInstance(){
        if (instance == null){
            instance = new ProgramInfo();
        }

        return instance;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramName() {
        return programName;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void addFunctionCallToCurrentTask(FunctionCall functionCall){
        currentTask.addFunctionCall(functionCall);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
