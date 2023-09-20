import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter an equation");
        Scanner input = new Scanner(System.in);
        String expressionText = input.next();
        List<Lexeme> lexemes = LexemeBuffer.lexAnalyze(expressionText);
        LexemeBuffer lexemeBuffer = new LexemeBuffer(lexemes);
        System.out.println("Result: " + LexemeBuffer.expr(lexemeBuffer));
    }



}
