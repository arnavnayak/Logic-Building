package phase.first.beforedsu.looping.numberbasedlooping;

public class CheckWhetherArmstrongNumber {
    
    //counting the order
    public int countTheNumberOfDigit(int num){
        if(num == 0){
            return 1;
        }
        if(num < 0){
            return -1;
        }
        int count = 0;
        while(num > 0){
            num = num /10;
            count++;
        }
        return count;
    }
    
    public String checkWhetherArmstrongNumberOrNot(int num){
        int order = countTheNumberOfDigit(num);
        if(order == -1){
            return "negative number should be ignored for validating Armstrong number";
        }
        int originalNum = num;
        int sum = 0;
        while(num > 0){
            int lastDigit = num % 10; //to find the last digit
            sum = sum + (int) Math.pow(lastDigit,order);
            num = num /10; //to eliminate the last digit
        }
        if(originalNum == sum){
            return "Armstrong number : number given : " + originalNum + " sum of digits raised to power : " + sum;
        } else {
            return "not an Armstrong number : number given : " + originalNum + " sum of digits raised to power : " + sum;
        }
    }
}
