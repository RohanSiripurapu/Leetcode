class Solution {
    public int numDifferentIntegers(String word) {
        word=word.replaceAll("[a-zA-Z]+"," ");
        String arr[]=word.trim().split("\\s+");
        if (word.trim().isEmpty()) {
            return 0;
        }
        HashSet<String> map=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i].replaceFirst("^0+","");
            if(arr[i].equals("")){
                arr[i]="0";
            }
            map.add(arr[i]);
        }
        return map.size();
    }
}