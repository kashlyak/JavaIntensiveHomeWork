package by.jrr.mathoperations.service;

import by.jrr.mathoperations.bean.MathOperation;

public class OperationExecutor {

    public void execute(MathOperation[] operations, double a, double b){
        double result;
        for (MathOperation operation : operations){
            result = operation.compute(a,b);
            System.out.println(result);
        }
    }
}
