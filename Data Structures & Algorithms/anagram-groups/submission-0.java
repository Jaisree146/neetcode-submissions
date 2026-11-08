class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,ArrayList<String>> hm=new HashMap<>();
        for(String s:strs){
            char[] st=s.toCharArray();
            Arrays.sort(st);
            String s1=new String(st);
            if(hm.containsKey(s1)){
                hm.get(s1).add(s);
            }
            else{
                hm.put(s1,new ArrayList<>());
                hm.get(s1).add(s);
            }
        }
        return new ArrayList<>(hm.values());
    }
}
