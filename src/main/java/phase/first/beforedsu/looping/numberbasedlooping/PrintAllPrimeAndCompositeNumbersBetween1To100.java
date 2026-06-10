package phase.first.beforedsu.looping.numberbasedlooping;

public class PrintAllPrimeAndCompositeNumbersBetween1To100 {

    public void printingAllPrimeAndCompositeNumbersBetween1To100() {
        System.out.println("prime number : 2");
        for (int i = 3; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("prime number : " + i);
            } else {
                System.out.println("composite number : " + i);
            }
        }
    }
}
