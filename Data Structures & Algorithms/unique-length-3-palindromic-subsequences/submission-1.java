class Solution {
    public int countPalindromicSubsequence(String s) {

        Set<String> set = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ch++){
            int first = s.indexOf(ch);
            int last = s.lastIndexOf(ch);
            if(first!=-1 && last-first>1) {
                for(int i = first + 1; i < last; i++) {
                    String str = "" + ch + s.charAt(i) + ch;
                    set.add(str);
                }
            }
        }
        return set.size();
    }
}