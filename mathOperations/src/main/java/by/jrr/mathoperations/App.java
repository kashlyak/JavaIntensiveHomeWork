package by.jrr.mathoperations;

import by.jrr.mathoperations.bean.MathOperation;
import by.jrr.mathoperations.service.*;

public class App {
    public static void main(String[] args) {
        MathOperation[] operations = {
                new AdditionOperation(),
                new SubtractionOperation(),
                new MultiplicationOperation(),
                new DivisionOperation()
        };
        OperationExecutor executor = new OperationExecutor();
      executor.execute(operations, 10, 5);
    }
}
