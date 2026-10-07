class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i<Math.min(strs[0].length(), strs[strs.length-1].length())){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                ans.append(strs[0].charAt(i));
            }
            else{
                break;
            }
            i++;
        }
        return ans.toString();
    }
}