import java.util.HashMap;
import java.util.Map;

public class Random {
    public static void main(String[] args) {
        String name="hemna khanal";
        char[] chars = name.toCharArray();

        Map map= new HashMap();

        Map<Character,Integer> charMap =new HashMap<>();

        for(char c: chars){
            if(charMap.containsKey(c)){
                int value= charMap.get(c)+1;
                charMap.put(c,value);
            }else{
               charMap.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> e:charMap.entrySet()){
            System.out.println(e.getKey()+"       "+e.getValue());
        }

    }
}
