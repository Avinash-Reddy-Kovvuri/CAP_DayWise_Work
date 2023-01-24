class Solution {
    public int findSubString( String str) {
        // Your code goes here
        HashSet<Character> set = new HashSet<Character>();
        HashSet<Character> set1 = new HashSet<Character>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        
        int siz = set.size();
        
        int l=0,r=0,res=0,out=-1;
        HashMap<Character,Integer> winc = new HashMap<Character,Integer>();
        while(r<str.length()){
            char c = str.charAt(r);
            if(winc.containsKey(c)){
                winc.put(c,winc.get(c)+1);
            }
            else{
                winc.put(c,1);
            }
            if(winc.size()==siz){res=1;}
            
            while(l<=r && res==1){
                if(out==-1 || out>r-l+1){
                    out=r-l+1;
                }

                // System.out.print(str.substring(l,r+1)+" - ");
                // System.out.println(out);
                char lc = str.charAt(l);
                winc.put(lc,winc.get(lc)-1);
                if(winc.get(lc)==0){winc.remove(lc);}
                if(winc.size()!=siz){res=0;}
                l+=1;
            }
            r+=1;
            
            
        }
        return out;
    }
}
