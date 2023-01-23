import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
class Solution {
    public int firstUniqChar(String s) {
    
         HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        int oo=5000000;
        for (Character key : map.keySet()) {
            if(map.get(key)==1 && s.indexOf(key)<oo){oo=s.indexOf(key);}
}
        if(oo!=5000000){return oo;}
        return -1;
}
}
