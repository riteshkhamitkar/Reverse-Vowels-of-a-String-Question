class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] c = s.toCharArray();
        while(i < j){
            
            while(i<j && !isVowel(c[i])){
                i++;
            }
            while(i <j && !isVowel(c[j])){
                j--;
            }
            if( i>=j){
                break;
            }
            swap(c,i,j);
            i++;
            j--;
        }
        return new String(c);
    }
    
    public void swap(char[] c,int i,int j){
        char temp = c[i];
        c[i]=c[j];
        c[j]=temp;
    }
    public boolean isVowel(char c){
        return c =='a' || c =='e' ||c =='i' ||c =='o' ||c =='u' ||
            c =='A' ||c =='E' ||c =='I' ||c =='O' ||c =='U';
    }
}