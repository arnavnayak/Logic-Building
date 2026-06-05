package phase.first.beforedsu.looping.basiclooping;

public class PrintAllEvenAndOddNumbersFrom1To100 {

    public void printEvenAndOddNumbersBetween1To100(){

        for(int i=1;i<=100;i++){
            if(i%2 == 0){
                System.out.println("Even numbers");
                System.out.println(i);
            }else{
                System.out.println("odd numbers");
                System.out.println(i);
            }
        }
    }
}
