/**
 * @Author: Wang Yu Qiang
 * @Description:
 * @Date: Create in 16:19 2019/11/8
 */
public class removeDuplicatesTest {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int res = removeDuplicates(nums);
        for (int i = 0; i < res; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 1) {
            return 1;
        }
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                ++index;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }
}
