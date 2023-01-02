package app;

import AST.Program;
import Visitor.ProgramVisitor;
import antlr.JsonLexer;
import antlr.JsonParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        try {
            String path = "samples/sample_1.txt";
            CharStream input = fromFileName(path);
            JsonLexer lexer = new JsonLexer(input);
            CommonTokenStream token = new CommonTokenStream(lexer);

            JsonParser parser = new JsonParser(token);
            ParseTree tree = parser.json();
            ProgramVisitor ProgramVisitor = new ProgramVisitor();
            Program program = ProgramVisitor.visit(tree);
            System.out.println(program);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
