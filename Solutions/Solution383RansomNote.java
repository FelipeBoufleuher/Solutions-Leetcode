class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int aux;
        if(magazine.length() < ransomNote.length()) return false;
        else {
            for(int i = 0; i < ransomNote.length(); i++) {
                aux = magazine.indexOf(ransomNote.charAt(i));
                if(aux != -1) {
                    magazine = magazine.substring(0, aux) + magazine.substring(aux + 1);
                } 
                else return false;
                }
            } return true;
    }
}