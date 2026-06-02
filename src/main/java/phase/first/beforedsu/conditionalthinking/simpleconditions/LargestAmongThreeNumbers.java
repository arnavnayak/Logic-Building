package phase.first.beforedsu.conditionalthinking.simpleconditions;

import java.util.List;

public class LargestAmongThreeNumbers {

    public Integer largestAmongThree(List<Integer> numbers){
       int  i=0;
        Integer largest = numbers.get(i);

        while(i < numbers.size()-1){
            if(largest<numbers.get(i+1)){
                largest = numbers.get(i+1);
            }
            i++;
        }
        return largest;
    }
}
