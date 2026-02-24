package questionss;

import java.util.LinkedHashMap;
import java.util.Map;

public class TrapingRainWater {
    public static void main(String[] args) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        String s = "geeksforgeeks";
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        System.out.println("map : "+map);

        int i=0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();

//            if(value == 1) return key;
            i++;
        }

    }
}
