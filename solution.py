class Solution:
    def value(self, word):
        sb = []
        for c in word:
            sb.append(str(ord(c) - ord("a")))
        
        return int("".join(sb))

    def isSumEqual(self, firstWord: str, secondWord: str, targetWord: str) -> bool:
        return self.value(firstWord) + self.value(secondWord) == self.value(targetWord)
