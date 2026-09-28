class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String word[]=s.split("\\s+");
        String res="";
        for(int i=word.length-1;i>=0;i--){
            res+=word[i];
            if(i!=0){
                res+=" ";
            }
        }
        
        return res;
    }
}