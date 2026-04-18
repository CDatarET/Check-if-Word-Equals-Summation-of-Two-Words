public class Solution {
    private int value(string s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.Length; i++)sb.Append(s[i] - 'a');
        return(int.Parse(sb.ToString()));
    }

    public bool IsSumEqual(string firstWord, string secondWord, string targetWord) {
        return(value(firstWord) + value(secondWord) == value(targetWord));
    }
}
