package iykCalc.Calculator.services;

import iykCalc.Calculator.InvalidOperationException;

public interface MathOperator {
    double doMath(double operand1, double operand2, String operation) throws InvalidOperationException;
}
