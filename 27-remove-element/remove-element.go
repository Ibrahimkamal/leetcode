func removeElement(nums []int, val int) int {
	ptr_start := 0
	ptr_end := len(nums) - 1

	for ptr_start <= ptr_end {
		if nums[ptr_start] == val {
			nums[ptr_start], nums[ptr_end] = nums[ptr_end], nums[ptr_start]
			ptr_end--
		} else {
			ptr_start++
		}
	}
	return ptr_start
}