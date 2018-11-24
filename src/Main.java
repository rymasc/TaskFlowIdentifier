import TaskRepresenation.ProgramInfo;
import TaskRepresenation.Task;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("START TFI");
        String filename;
        if(args[0] == null){
            return;
        }
        filename = args[0];
        String s = filename.replace("src\\", "");
        ProgramInfo programInfo = ProgramInfo.getInstance();
        programInfo.setProgramName(s.replace(".c", ""));

        CharStream in = CharStreams.fromPath(Paths.get(filename));
        Translator translator = new Translator(in);
        translator.translate();

        ArrayList<Task> tasks = programInfo.getTasks();
        for (Task task:tasks) {
            System.out.println(task.getName() + " has "+ task.getFunctionCalls().size() + " function calls");
        }

    }
}
