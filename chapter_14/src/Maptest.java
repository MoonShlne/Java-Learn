import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * @author polar
 * @version 1.0
 * @since 2025/2/17 13:31
 */
public class Maptest {
    @Test
    public void test(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("111",1);
    }
    @Test
    public void test2(){ 
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("aa");

        System.out.println(System.identityHashCode(objects));



    }

}
