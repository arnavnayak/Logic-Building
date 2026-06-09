package phase.first.beforedsu.looping.numberbasedlooping;

public class CheckNumberForPalindrome {

    public String validateForPalindrome(int num){
        if(num < 0){
            return "negative number not to validate for palindrome";
        }

        if(num >= 0 && num <= 9){
            return "single digit not to validate for palindrome";
        }

        int originalNum = num;
        int reverseOrder = 0;
        do {
            int lastDigit = num % 10;
            reverseOrder = (reverseOrder * 10) + lastDigit;
            num = num /10;
        }while(num > 0);
        if(reverseOrder == originalNum){
            return "palindrome : number given : "+originalNum+" number after reversing : "+reverseOrder;
        }else{
            return "not a palindrome : number given : "+originalNum+" number after reversing : "+reverseOrder;
        }
    }
}
