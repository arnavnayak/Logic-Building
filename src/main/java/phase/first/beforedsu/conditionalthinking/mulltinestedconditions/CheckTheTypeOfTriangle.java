package phase.first.beforedsu.conditionalthinking.mulltinestedconditions;

public class CheckTheTypeOfTriangle {

    private final CheckForValidTriangle checkForValidTriangle = new CheckForValidTriangle();

    public String checkTypeOfTriangle(int a, int b, int c){
        if(checkForValidTriangle.checkIDValidTriangle(a,b,c)){
            if(b == c && c == a){
                return "Equilateral triangle";
            }else if(a==b || b==c || c==a){
                return "Isosceles triangle";
            }else {
                return "Scalene triangle";
            }
        }
        return "not a valid triangle";
    }
}
