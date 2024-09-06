class Solution:
    def format_word(self, word: str, maxWidth: int):
        word = word.strip()
        if word.count(" ") == 0:
            for i in range(maxWidth - len(word)):
                word += " "
            return word
        spaces_list = [" "] * word.count(" ")
        for i in range(maxWidth - len(word)):
            index = i % len(spaces_list)
            spaces_list[index] = spaces_list[index] + " "
        splitted_words = word.split(" ")
        index1 = 0
        index2 = 0
        result = ""
        for i in range(len(splitted_words) + len(spaces_list)):
            if i % 2 == 0:
                result += splitted_words[index1]
                index1 += 1
            else:
                result += spaces_list[index2]
                index2 += 1
        return result

    def fullJustify(self, words: List[str], maxWidth: int) -> List[str]:
        result = []
        temp_word = ""
        for word in words:
            if len(temp_word + word) > maxWidth:
                temp_word = self.format_word(temp_word, maxWidth)
                result.append(temp_word)
                temp_word = ""
            temp_word += word + " "
        temp_word = temp_word.strip()
        for i in range(maxWidth - len(temp_word)):
            temp_word += " "

        result.append(temp_word)
        return result
