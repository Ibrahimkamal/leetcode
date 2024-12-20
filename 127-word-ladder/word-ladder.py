from collections import defaultdict


class Solution:

    def ladderLength(self, beginWord: str, endWord: str, wordList: List[str]) -> int:
        if not endWord or not beginWord or not wordList or not endWord in wordList:
            return 0
        length = len(beginWord)
        all_combo_dict = defaultdict(list)
        for word in wordList:
            for i in range(length):
                option = word[:i] + "*" + word[i + 1 :]
                all_combo_dict[option].append(word)
        queue = [(beginWord, 1)]
        visited = {beginWord: True}
        while queue:
            current_word, level = queue.pop(0)
            for i in range(length):
                intermediate_word = current_word[:i] + "*" + current_word[i + 1 :]
                for word in all_combo_dict[intermediate_word]:
                    if word == endWord:
                        return level + 1
                    if word not in visited:
                        visited[word] = True
                        queue.append((word, level + 1))

                all_combo_dict[intermediate_word] = []
        return 0
