class Solution {
    private int value(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            sb.append('a' - s.charAt(i));
        }

        return(Integer.parseInt(sb.toString()));
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return(value(firstWord) + value(secondWord) == value(targetWord));
    }
}
