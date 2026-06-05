package phase.first.beforedsu.looping.basiclooping;

public class PrintSumOfOddAndEvenNumberTilNGivenNumber {


    public int sumOfAllEvenTillNGivenNumberThroughLoop(int n){
        int sum=0;
        //complexity o(n)
        for(int i=2;i<=n;i+=2){
            sum = sum + i;
        }
        System.out.println("sumOfAllEvenTillNGivenNumberThroughLoop : "+sum);
        return sum;
    }

    public int sumOfAllOddTillNGivenNumberThroughLoop(int n){
        int sum=0;
        //complexity o(n)
        for(int i=1;i<=n;i+=2){
            sum = sum + i;
        }
        System.out.println("sumOfAllOddTillNGivenNumberThroughLoop : "+sum);
        return sum;
    }

    public int sumOfAllEvenTillNGivenNumberThroughFormula(int n){
        //complexity o(1)
        int k = n/2;
        int sum = k*(k+1);
        System.out.println("sumOfAllEvenTillNGivenNumberThroughFormula : "+sum);
        return sum;
    }

    public int sumOfAllOddTillNGivenNumberThroughFormula(int n){
        //complexity o(1)
        int k=(n+1)/2;
        int sum = k*k;
        System.out.println("sumOfAllOddTillNGivenNumberThroughFormula : "+sum);
        return sum;
    }
}
