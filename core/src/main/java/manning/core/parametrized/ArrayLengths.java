package manning.core.parametrized;

import java.util.ArrayList;
import java.util.List;

public class ArrayLengths {
    public List<Integer> getLength(List<String> arr){
        List<Integer> result = new ArrayList<>();
        for(String str : arr)
            result.add(str.length());
        return result;
    }
}
