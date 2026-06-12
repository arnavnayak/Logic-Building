package phase.first.beforedsu.looping.mathematicallooping;

public class PrintSumOfFactorsOfGivenNumber {

    public String sumOfFactorsOfANumber(int num) {
        if(num < 0){
            return "number not valid for factors";
        }
        if(num == 1){
            return "sum of factors of " + num + " is 1";
        }
        int sum = 0;
        for(int i=1;i*i<= num;i++){
            if(num % i == 0){
                sum = sum + (num / i) + i;
            }
        }
        return "sum of factors of " + num + " is " + sum;
    }
}
