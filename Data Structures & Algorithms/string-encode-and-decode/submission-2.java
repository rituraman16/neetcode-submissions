class Solution {

    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for(String s: strs){
            ans.append(s+"→");
        }
        return ans.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='→'){
                ans.add(temp.toString());
                temp.setLength(0);
            }
            else{
                temp.append(str.charAt(i));
            }
        }
        if (temp.length()!=0){
            ans.add(temp.toString());
        }
        return ans;
    }
}
