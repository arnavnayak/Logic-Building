package phase.first.beforedsu.looping.numberbasedlooping;

public class FindTheFibonacciSeriesAndFindSum {

    public void printTheFibonacciSeries(int num){
        System.out.println("\nFibonacci series up to " + num + " terms: ");
        if(num<=0){
            System.out.println("Please enter positive integer for fibonacci series");
        }

        long first = 0;
        long second = 1;
        long sum = 0;

        for(int i=1;i<=num;i++){
            System.out.print(first + " ");
            sum = sum + first;
            long nextTerm = first +second;
            first = second;
            second = nextTerm;
        }
        System.out.println("sum of " + num + " terms: " + sum);
    }
}
