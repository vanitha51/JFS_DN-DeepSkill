package com.dsalgo;

public class ForecastDemo {

public static void main(String[] args) {

    double currentInvestment = 50000;
    double growthRate = 0.08; // 8%
    int forecastYears = 5;

    double futureValue =
            FinancialForecaster.predictFutureValue(
                    currentInvestment,
                    growthRate,
                    forecastYears);

    System.out.println("Current Investment : ₹" + currentInvestment);
    System.out.println("Growth Rate        : " + (growthRate * 100) + "%");
    System.out.println("Forecast Period    : " + forecastYears + " years");
    System.out.printf("Predicted Value    : ₹%.2f%n", futureValue);
}

}