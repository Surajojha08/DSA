class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String res = "";

        for(int i = words.length - 1; i >= 0; i--) {
            res += words[i];
            if(i != 0) res += " "; // ye yaha p hr word k baad space add kar rahi hai except last word
        }

        return res;
    }
}