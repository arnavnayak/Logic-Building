package phase.first.beforedsu.conditionalthinking.mathandnumber;

public class CheckAmountDivisibleByCurrencyNotes {
//taken currency notes as 2000 500 and 100
    public String amountDivisibleByCurrencyNotes(int amount){
        //to validate whether amount given can be divisible perfectly or not
        if(amountCanBeDividedPerfectly(amount)){
            System.out.println("Amount can be divided perfectly");
            int notes2000 = amount/2000;
            int remainder = amount%2000;

            int notes500 = remainder/500;
            remainder = remainder%500;

            int notes100 = remainder/100;
            remainder = remainder%100;

            System.out.println(" - 2000 Notes : " + notes2000);
            System.out.println(" - 500 Notes  : " + notes500);
            System.out.println(" - 100 Notes  : " + notes100);
            System.out.println("divisible perfectly for 2000 500 and 100 leaves a remainder of " + remainder);
            return "divisible perfectly  - 2000 Notes : " + notes2000 + " - 500 Notes  : " + notes500 + " - 100 Notes  : " + notes100 + " - remainder : " + remainder;
        }else{
            System.out.println("Amount cannot be divided perfectly for 2000 500 and 100 currency note");
            int notes2000 = amount/2000;
            int remainder = amount%2000;

            int notes500 = remainder/500;
            remainder = remainder%500;

            int notes100 = remainder/100;
            remainder = remainder%100;

            System.out.println(" - 2000 Notes : " + notes2000);
            System.out.println(" - 500 Notes  : " + notes500);
            System.out.println(" - 100 Notes  : " + notes100);
            System.out.println("as not divisible perfectly for 2000 500 and 100 leaves a remainder of " + remainder);
            return "not divisible perfectly  - 2000 Notes : " + notes2000 + " - 500 Notes  : " + notes500 + " - 100 Notes  : " + notes100 + " - remainder : " + remainder;
        }
    }

    private boolean amountCanBeDividedPerfectly(int amount) {
        return amount > 0 && amount % 100 == 0;
    }
}
