class Solution:
    def findSubstring(self, s: str, words: List[str]) -> List[int]:
        if not s or not words:
            return []
        
        step = len(words[0])  # Length of each word
        total_length = len(words) * step  # Total length of the substring formed by all words concatenated
        word_count = Counter(words)  # Frequency count of words in the list
        result = []
        
        # We need to slide over the string in `step` intervals
        for i in range(step):
            start = i
            curr_count = Counter()  # Tracks the current window's word frequencies
            for end in range(i, len(s) - step + 1, step):
                curr_word = s[end:end + step]
                # If the word is part of the word list, add it to the current window's count
                if curr_word in word_count:
                    curr_count[curr_word] += 1
                    # If we have more occurrences of `curr_word` than needed, slide the window
                    while curr_count[curr_word] > word_count[curr_word]:
                        start_word = s[start:start + step]
                        curr_count[start_word] -= 1
                        start += step
                    
                    # If the current window matches the total length of words, it's a valid index
                    if end + step - start == total_length:
                        result.append(start)
                else:
                    # Reset the window if `curr_word` is not in the word list
                    curr_count.clear()
                    start = end + step
        
        return result
