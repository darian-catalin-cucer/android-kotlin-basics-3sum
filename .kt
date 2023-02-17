class Solution {

fun threeSum(nums: IntArray): List<List<Int>> {
    val n = nums.size
    val result = arrayListOf<List<Int>>()
    nums.sort()

    for(i in 0 until n - 2) {
        if(i ==0 || (i > 0 && nums[i] != nums[i-1])) {
            var low = i+1
            var high = nums.size - 1
            var sum = 0 - nums[i]
            while(low < high) {
                if(nums[i] + nums[low] + nums[high] == 0) {
                    result.add(listOf(nums[i], nums[low], nums[high]))
                    while(low < high && nums[low] == nums[low+1]) low++
                    while(low < high && nums[high] == nums[high-1]) high--
                    low++
                    high--
                } else if(nums[low] + nums[high] > sum) {
                    high--
                } else {
                    low++
                }
            }
        }
    }
    return result
}
}
