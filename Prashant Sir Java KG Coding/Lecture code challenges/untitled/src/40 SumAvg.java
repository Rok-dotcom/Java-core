// I)write down this program in notes
class SumAvg {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sum and average ");
        int[] nums = ArrayUtility.inputArray();      // made library class(Array Utility) or utility(inputArray)
        int sum = Sum(nums);
        int avg = Average(nums);
        System.out.println("Sum is = " + sum);
        System.out.println("Average is = " + avg);
    }
    public static int Sum(int[] nums) {
        int i = 0;
        int sum = 0;
        while (i < nums.length) {
            sum += nums[i];
            i++;
        }return sum;
    }
    public static int Average(int[] nums) {
        int sumis = Sum(nums);
        return sumis/ nums.length;
    }
}
