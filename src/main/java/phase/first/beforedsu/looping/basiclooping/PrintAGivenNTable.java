package phase.first.beforedsu.looping.basiclooping;

public class PrintAGivenNTable {

    public void printAGivenNTable(int n){
        System.out.println("Table of " + n );
        for(int i=1;i<=10;i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
