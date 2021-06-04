package org.example;

import org.example.calc.CalcResult;
import org.example.calc.CalcSheetObject;
import org.example.calc.CalcWriter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MonteCarloApp {

    public static void main(String[] args) throws IOException {
        List<CalcSheetObject> monteCarloResult = new ArrayList<>();
        CalcResult calcResultCircle1 = SolveMe.calculatePI(100,"y=sqrt(1-x^2)");
        CalcResult calcResultCircle2 = SolveMe.calculatePI(3000,"y=sqrt(1-x^2)");
        CalcResult calcResultIntegral1 = SolveMe.calculateIntegral(100,"y=x^2");
        CalcResult calcResultIntegral2 = SolveMe.calculateIntegral(99999,"y=x^2");

        monteCarloResult.add(new CalcSheetObject("kolo 1",calcResultCircle1));
        monteCarloResult.add(new CalcSheetObject("kolo 2",calcResultCircle2));
        monteCarloResult.add(new CalcSheetObject("calka 1",calcResultIntegral1));
        monteCarloResult.add(new CalcSheetObject("calka 2",calcResultIntegral2));

        CalcWriter.generateXlsx(monteCarloResult);

        for(CalcSheetObject obj : monteCarloResult){
            System.out.println(obj.getCalcResult());
        }
    }
}
