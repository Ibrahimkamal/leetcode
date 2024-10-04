class ListNode:
    def __init__(self, key, val):
        self.key = key
        self.val = val
        self.prev = None
        self.next = None


class LRUCache:
    def __init__(self, capacity: int):
        self.map = {}
        self.capacity = capacity

        # Dummy nodes to handle edges more easily
        self.left = ListNode(-1, -1)
        self.right = ListNode(-1, -1)
        self.left.next = self.right
        self.right.prev = self.left

    def remove(self, node):
        prev_node = node.prev
        next_node = node.next
        prev_node.next = next_node
        next_node.prev = prev_node

    def insert(self, node):
        prev_node = self.right.prev
        prev_node.next = node
        node.prev = prev_node
        node.next = self.right
        self.right.prev = node

    def get(self, key: int) -> int:
        if key not in self.map:
            return -1

        node = self.map[key]
        # Move the accessed node to the right (most recently used)
        self.remove(node)
        self.insert(node)
        return node.val

    def put(self, key: int, value: int) -> None:
        if key in self.map:
            node = self.map[key]
            node.val = value
            self.remove(node)
        else:
            if len(self.map) == self.capacity:
                # Remove the least recently used node (left.next)
                lru_node = self.left.next
                self.remove(lru_node)
                del self.map[lru_node.key]
            node = ListNode(key, value)

        self.insert(node)
        self.map[key] = node
