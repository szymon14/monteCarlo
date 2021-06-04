package org.example.calc;

public class CalcSheetObject {
    private String name;
    private CalcResult calcResult;

    public CalcSheetObject(String name, CalcResult calcResult) {
        this.name = name;
        this.calcResult = calcResult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CalcResult getCalcResult() {
        return calcResult;
    }

    public void setCalcResult(CalcResult calcResult) {
        this.calcResult = calcResult;
    }
}
