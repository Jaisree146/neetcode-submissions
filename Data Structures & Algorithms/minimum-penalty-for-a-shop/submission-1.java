class Solution {
    public int bestClosingTime(String customers) {
        int p=0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y') p++;
        }
        if(p==0) return 0;
        int minp=p;
        int ans=0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y'){
                p--;
            }
            else{
                p++;
            }
            if(minp>p){
                ans=i+1;
                minp=p;
            }
        }
        return ans;
    }
}