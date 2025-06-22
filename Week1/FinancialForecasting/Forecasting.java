package FinancialForecasting;
public class Forecasting {

    // Simple Moving Average
    public static double[] movingAverage(double[] revenue, int window) {
        int n = revenue.length;
        if (n < window) return new double[0];

        double[] result = new double[n - window + 1];

        for (int i = 0; i <= n - window; i++) {
            double sum = 0;
            for (int j = 0; j < window; j++) {
                sum += revenue[i + j];
            }
            result[i] = sum / window;
        }
        return result;
    }
}
