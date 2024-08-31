import random


class RandomizedSet:

    def __init__(self):
        self.elements = set()

    def insert(self, val: int) -> bool:
        if val not in self.elements:
            self.elements.add(val)
            return True
        return False

    def remove(self, val: int) -> bool:
        if val in self.elements:
            self.elements.remove(val)
            return True
        return False

    def getRandom(self) -> int:
        ra = random.randint(0, len(self.elements)-1)
        return list(self.elements)[ra]


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()
