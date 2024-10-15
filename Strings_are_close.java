package src;

public class Strings_are_close {
    public static void main(String[] args) {

    }
    public boolean closeStrings(String word1, String word2) {
        boolean ans = true;
        char[] arr1 = new char[word1.length()];
        char[] arr2 = new char[word2.length()];
        if (word1.length() != word2.length()) {
        int c1=0, c2=0;
     for(int i=0 ; i<word1.length(); i++ ){
         c1++;
          arr1[i]= word1.charAt(i);
     }
     for(int i=0; i<word2.length(); i++){
         c2++;
         arr2[i] = word2.charAt(i);
     }
    }
        else{
            ans =  false;
        }
        return ans;
    }
}
