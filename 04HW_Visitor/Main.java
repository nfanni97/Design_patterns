import tree.Addition;
import tree.Multiplication;
import tree.Node;
import tree.Number;
import visitor.CalculatingVisitor;
import visitor.PrintingVisitor;
import visitor.Visitor;

public class Main {
    public static void main(String[] args) {
        Node tree = new Addition(new Number(3), new Multiplication(new Number(5), new Number(6)));

        Visitor printer = new PrintingVisitor();
        tree.infixIteration(printer);
        printer.printResult();

        Visitor calculator = new CalculatingVisitor();
        tree.postfixIteration(calculator);
        calculator.printResult();
    }
}
