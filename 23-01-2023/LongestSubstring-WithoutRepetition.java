class Solution {
    public int lengthOfLongestSubstring(String s) {    
        if(s.length()==0){return 0;}    
        int le=0,l=0;

        HashSet<Character> set = new HashSet<Character>(); 
        for(int r=0;r<s.length();r++){

            if(set.contains(s.charAt(r))){

                while(l<r && set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l+=1;}}

            set.add(s.charAt(r));
            
            if((r-l+1)>le){le=(r-l+1);}



        }return le;

}
}
