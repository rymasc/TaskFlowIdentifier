package ANTLR;

import TaskRepresenation.FunctionCall;
import TaskRepresenation.ProgramInfo;
import TaskRepresenation.Task;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

public class CodeListener extends EHPBaseListener {

    public TokenStreamRewriter rewriter;
    public TokenStream tokens;

    public CodeListener(TokenStream tokenStream){
        rewriter = new TokenStreamRewriter(tokenStream);
        tokens = tokenStream;
    }

    @Override
    public void enterFunctionCall(EHPParser.FunctionCallContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        int charNumber = ctx.getStart().getCharPositionInLine();
        FunctionCall functionCall = new FunctionCall(ctx.getChild(0).getText());
        functionCall.setPosition(lineNumber, charNumber);

        ProgramInfo programInfo = ProgramInfo.getInstance();
        if (programInfo.currentTask != null){
            //set function call as a called function in the task
            programInfo.addFunctionCallToCurrentTask(functionCall);
            System.out.println(programInfo.currentTask.getFunctionCalls().size());
        }
    }

    @Override
    public void enterTaskDeclaration(EHPParser.TaskDeclarationContext ctx){

        EHPParser.TaskStartTagContext startTag = ctx.taskStartTag();
        EHPParser.TaskEndTagContext endTag = ctx.taskEndTag();


        String taskName = startTag.Identifier().toString();
        System.out.println("Found task "+taskName+ " declaration");

        Task task = new Task(taskName);
        ProgramInfo programInfo = ProgramInfo.getInstance();
        programInfo.currentTask = task;

        programInfo.addTask(task);

        int count = ctx.externalDeclaration().size();
        if (count > 0){
            String functionCode = ctx.externalDeclaration(0).functionDefinition().compoundStatement().getText();
        }
        //insert task complete code
        rewriter.insertAfter(endTag.stop, "\n TaskComplete();");

        //remove Tags
        rewriter.delete(startTag.start, startTag.stop);
        rewriter.delete(endTag.start, endTag.stop);

    }

    @Override
    public void exitTaskDeclaration(EHPParser.TaskDeclarationContext ctx) {
        ProgramInfo programInfo = ProgramInfo.getInstance();
        programInfo.currentTask = null;
    }
}
