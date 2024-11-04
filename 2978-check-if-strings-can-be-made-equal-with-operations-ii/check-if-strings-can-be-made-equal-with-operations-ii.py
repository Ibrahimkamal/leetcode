class Solution:
    def checkStrings(self, s1: str, s2: str) -> bool:
        even_list_1 = []
        even_list_2 = []
        odd_list_1 = []
        odd_list_2 = []
        for i in range(0, len(s1)):
            if i % 2 == 0:
                even_list_1.append(s1[i])
                even_list_2.append(s2[i])
            if i % 2 == 1:
                odd_list_1.append(s1[i])
                odd_list_2.append(s2[i])
        if "".join(sorted(even_list_1)) == "".join(sorted(even_list_2)) and "".join(
            sorted(odd_list_1)
        ) == "".join(sorted(odd_list_2)):
            return True

        return False
