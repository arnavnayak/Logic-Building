package phase.first.beforedsu.conditionalthinking.mulltinestedconditions;

public class CheckForValidTriangle {

    public boolean checkIDValidTriangle(int a, int b, int c){
        if(checkIfSidesAreNonZero(a,b,c)){
            return a + b > c && b + c > a && c + a > b;
        }
        return false;
    }

    private boolean checkIfSidesAreNonZero(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0;
    }
}
