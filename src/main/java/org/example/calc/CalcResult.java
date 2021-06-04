package org.example.calc;

import org.example.Throw;
import java.util.List;

public class CalcResult {
    private List<Throw> successThrows;
    private List<Throw> failThrows;
    private double estimatedValue;
    private int numberOfThrows;
    private String equation;

    public CalcResult(List<Throw> successThrows, List<Throw> failThrows, double estimatedValue, int numberOfThrows, String equation) {
        this.successThrows = successThrows;
        this.failThrows = failThrows;
        this.estimatedValue = estimatedValue;
        this.numberOfThrows = numberOfThrows;
        this.equation = equation;
    }

    public CalcResult( double estimatedValue, int numberOfThrows, String equation) {
        this.estimatedValue = estimatedValue;
        this.numberOfThrows = numberOfThrows;
        this.equation = equation;
    }

    @Override
    public String toString() {
        return "CalcResult{ estimatedValue=" + String.format("%.10f", estimatedValue) +
                ", numberOfThrows=" + numberOfThrows + '}';
    }

    public List<Throw> getSuccessThrows() {
        return successThrows;
    }

    public void setSuccessThrows(List<Throw> successThrows) {
        this.successThrows = successThrows;
    }

    public List<Throw> getFailThrows() {
        return failThrows;
    }

    public void setFailThrows(List<Throw> failThrows) {
        this.failThrows = failThrows;
    }

    public void setEstimatedValue(double estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public void setNumberOfThrows(int numberOfThrows) {
        this.numberOfThrows = numberOfThrows;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }

    public double getEstimatedValue() {
        return estimatedValue;
    }

    public int getNumberOfThrows() {
        return numberOfThrows;
    }

    public String getEquation() {
        return equation;
    }
}
