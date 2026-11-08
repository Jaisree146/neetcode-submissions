class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        String res1=new String(s1);
        String res2=new String(t1);
        if(res1.equals(res2)) return true;
        return false;
    }
}
