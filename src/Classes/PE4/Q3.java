package Classes.PE4;

import java.util.HashMap;
import java.util.Map;

public class Q3 {

public static  void find(){

    String[] arr = new String[]{"a","b","c","d","a","c","c"};

    Map<String, Boolean> m1 = new HashMap<String, Boolean>();

    for(int i=0;i<arr.length;i++){
        if(!m1.containsKey(arr[i])){
            m1.put(arr[i],false);
            //System.out.println("false");
        }
        else{
            m1.put(arr[i],true);
          //  System.out.println("true");
        }


    }

    System.out.println("\n");
    System.out.println(m1);





}
}
