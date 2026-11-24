class Solution {
    public int partitionString(String s) {
        int p=0;
    HashMap<Character,Integer> hm=new HashMap<>();
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(hm.containsKey(c)){
            hm.clear();
            hm.put(c,1);
            p++;
        }
        else{
            hm.put(c,1);
        }
    }
    
        return p+1;
    }
}
