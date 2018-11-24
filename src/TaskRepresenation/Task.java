package TaskRepresenation;

import java.util.ArrayList;

public class Task {
    private String name;
    private Task dependentTask;
    private String taskCode;
    private ArrayList<FunctionCall> functionCalls;
    private ArrayList<Function> functions;

    public Task(String taskName){
        name = taskName;
        taskCode = "";
        functionCalls = new ArrayList<>();
        functions = new ArrayList<>();
    }

    public void setDependentTask(Task task){
        dependentTask = task;
    }

    public Task getDependentTask() {
        return dependentTask;
    }

    public String getName() {
        return name;
    }

    public void addFunction(Function function){
        functions.add(function);
    }

    public void addFunctionCall(FunctionCall functionCall){
        functionCalls.add(functionCall);
    }

    public ArrayList<Function> getFunctions() {
        return functions;
    }

    public ArrayList<FunctionCall> getFunctionCalls() {
        return functionCalls;
    }
}
