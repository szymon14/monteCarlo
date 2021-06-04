package org.example;

import org.example.calc.CalcResult;

import java.util.ArrayList;
import java.util.List;

public class SolveMe{

    //Pole koła o promieniu r=1
    public static CalcResult calculatePI(int numberOfThrows, String equation){
        double result  = 0.0;
        List<Throw> successThrows = new ArrayList<>();
        List<Throw> failThrows = new ArrayList<>();

        //#TODO algorytm liczący pole koła metodą monte carlo ( usuń przed oddaniem studentom )
        int successCount = 0;

        for(int i=0; i < numberOfThrows ; i++) {
            double x = Math.random();
            double y = Math.random();
            if (x * x + y * y <= 1) {
                successCount++;
                successThrows.add(new Throw(x,y,true));
            } else {
                failThrows.add(new Throw(x,y,false));
            }
        }
        result  = (double)4*successCount/numberOfThrows;
        //
        return new CalcResult(successThrows,failThrows,result,numberOfThrows,equation);
    }

    //pole pdo wykresem funkcji x^2 dla x(0,2)
    public static CalcResult calculateIntegral(int numberOfThrows, String equation){
        double result = 0.0;

        //#TODO algorytm liczący całkę (usuń przed oddaniem studentom)
        for(int i=0; i < numberOfThrows ; i++) {
            double x = (Math.random() * 2.0);
            result = result + x*x;
        }
        result  = (2.0 - 0.0)*(result/numberOfThrows);
        //
        return new CalcResult(result,numberOfThrows,equation);
    }
}
