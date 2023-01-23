class Solution {
    public int myAtoi(String s) {

        String ss="";
        int po=1,flag=0;
        for(int i=0;i<s.length();i++){
            
            if(Character.isDigit(s.charAt(i))){
                 if(flag==0 && s.charAt(i)!='0'){
                ss+=s.charAt(i);
                flag=1;}
                else if(flag==1){
                    ss+=s.charAt(i);
                }
                else if(s.charAt(i)=='0'){flag=1;}

            }
            else{
                if(flag==0){
                    if(s.charAt(i)=='-'){po*=-1;flag=1;}
                    else if(s.charAt(i)=='+'){flag=1;continue;}
                    else if(s.charAt(i)==' '){continue;}
                    else{return 0;}
                
                }
                else{break;}
            }

        }
        if(ss.length()==0){return 0;}
        double res = Double.parseDouble(ss);
        if(po==-1){res = po*res;}
        return (int)res; 
    }
}
