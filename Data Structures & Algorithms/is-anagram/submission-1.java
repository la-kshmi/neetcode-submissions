class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
         return false;
        char[] charArray1 = s.toCharArray();
java.util.Arrays.sort(charArray1);
String ss = new String(charArray1);
        char[] charArray = t.toCharArray();
java.util.Arrays.sort(charArray);
String st = new String(charArray); 
        if(ss.equals(st))
        return true;

        return false; 
    }
}
