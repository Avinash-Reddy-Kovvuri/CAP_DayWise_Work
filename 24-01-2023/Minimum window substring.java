class Solution {
    public String minWindow(String s, String t) {

        if((s.length()==0 || t.length()==0) || t.length()>s.length()){return "";}

        HashMap<Character,Integer> count = new HashMap<Character,Integer>();

        int l=0,r=0;
    
        for(int i=0;i<t.length();i++){
            if(count.containsKey(t.charAt(i))){
                count.put(t.charAt(i),count.get(t.charAt(i))+1);
            }
            else{
                count.put(t.charAt(i),1);
            }
        }
        int res=count.size(),update=0;
        int[] result = {0,0,-1};

        HashMap<Character,Integer> wincount = new HashMap<Character,Integer>();
        
        while(r<s.length()){
            char c = s.charAt(r);
            if(wincount.containsKey(c)){
                wincount.put(c,wincount.get(c)+1);
            }
            else{
                wincount.put(c,1);
            }
            if(count.containsKey(c) && count.get(c).intValue()==wincount.get(c).intValue()){
                    update += 1;
            }
            while(l<=r && update==res){
                char lc = s.charAt(l);
                if(result[2]==-1 || r-l+1<result[2]){
                    
                    result[0]=l;
                    result[1]=r;
                    result[2]=(r-l+1);
                }                
                wincount.put(lc, (wincount.get(lc)-1));
                if(count.containsKey(lc) && count.get(lc).intValue()>wincount.get(lc).intValue()){
                    update-=1;}
                l+=1;
            }
            r+=1;
        }
        if(result[2]==-1){return "";}
        return (s.substring(result[0],result[1]+1));
        
}
}
