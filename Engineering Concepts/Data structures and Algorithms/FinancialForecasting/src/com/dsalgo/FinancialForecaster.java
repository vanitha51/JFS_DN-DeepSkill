package com.dsalgo;

public class FinancialForecaster {

public static double predictFutureValue(
        double currentValue,
        double annualGrowthRate,
        int years) {

    if (years == 0) {
        return currentValue;
    }

    return predictFutureValue(
            currentValue * (1 + annualGrowthRate),
            annualGrowthRate,
            years - 1);
}

}