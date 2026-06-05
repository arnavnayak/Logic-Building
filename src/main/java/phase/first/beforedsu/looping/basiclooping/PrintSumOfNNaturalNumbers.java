package phase.first.beforedsu.looping.basiclooping;

public class PrintSumOfNNaturalNumbers {

    public int printSumOfNNaturalNumbersThroughLoops(int n){
        //complexity o(n)
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("sum of natural "+ n +" number through loops : "+sum);
        return sum;
    }

    public int printSumOfNNaturalNumbersThroughFormula(int n){
        //complexity o(1)
            int sum = (n*(n + 1))/2;
        System.out.println("sum of natural "+ n +" number through formula : "+sum);
        return sum;
    }
}
