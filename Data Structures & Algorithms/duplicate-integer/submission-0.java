class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(Integer key:hm.keySet()){
            if(hm.get(key)>1){
                return true;
            }
        }
        return false;
    }
}