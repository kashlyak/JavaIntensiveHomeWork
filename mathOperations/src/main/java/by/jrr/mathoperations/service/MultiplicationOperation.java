package by.jrr.mathoperations.service;

import by.jrr.mathoperations.bean.MathOperation;

public class MultiplicationOperation implements MathOperation {
    @Override
    public double compute(double a, double b) {
        return a*b;
    }
}
