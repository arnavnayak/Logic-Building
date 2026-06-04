package phase.first.beforedsu.conditionalthinking.logicaloperatorscompoundstatement;

public class ThreeDigitPrintMedianValue {
    public int findMedianValueOfTheThreeDigit(int a,int b,int c){
        int sum = a+b+c;
        int maxOfThree = Math.max(a,Math.max(b,c));
        int minOfThree = Math.min(a,Math.min(b,c));

        int median = sum - (maxOfThree + minOfThree);

        return median;
    }
}
