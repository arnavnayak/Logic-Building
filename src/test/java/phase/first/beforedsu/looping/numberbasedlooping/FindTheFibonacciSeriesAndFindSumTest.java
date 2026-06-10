package phase.first.beforedsu.looping.numberbasedlooping;

import org.junit.jupiter.api.Test;

class FindTheFibonacciSeriesAndFindSumTest {

    @Test
    void printTheFibonacciSeries() {
        FindTheFibonacciSeriesAndFindSum series = new FindTheFibonacciSeriesAndFindSum();
        // This method prints to console; we invoke it to ensure no runtime exceptions occur.
        series.printTheFibonacciSeries(10);
        series.printTheFibonacciSeries(0);
        series.printTheFibonacciSeries(-5);
    }
}