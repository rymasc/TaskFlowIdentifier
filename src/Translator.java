import ANTLR.CodeListener;
import ANTLR.EHPLexer;
import ANTLR.EHPParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Translator {

    private CharStream input;
    private TokenStream tokens;
    private ParseTree parseTree;
    private ParseTreeWalker walker;
    private String parsedCode;

    public Translator(CharStream inputStream){
        input = inputStream;
        EHPLexer lexer = new EHPLexer(input);
        tokens = new CommonTokenStream(lexer);
        EHPParser parser = new EHPParser(tokens);
        parseTree = parser.compilationUnit();
    }

    public void translate(){
        System.out.println("translate called");
        walker = new ParseTreeWalker();
        CodeListener listener = new CodeListener(tokens);
        walker.walk(listener, parseTree);
        parsedCode = listener.rewriter.getText();
       //System.out.println("Parsed Code:\n\n"+parsedCode);
    }
}
