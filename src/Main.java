import java.util.Arrays;


public class Main {
    public static void main(String[] args)
    {
        int nums[] = {2, 34, 23, 31, 1, 3, 131, 30203, 1111, 2222, 56, 67, 59, 345, 5674, 289};

        //минимальный элемент массива

        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Min " + min);

        //максимальный элемент массива

        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max " + max);

        //четные/нечетные числа массива

        int n = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] % 2 == 0)
            {
               n = nums[i];

                System.out.println("Четные элементы массива: " + n);

            }
        }



        for (int j = 0; j < nums.length; j++)
        {
            if (nums[j] % 2 != 0)
            {
                n = nums[j];
                System.out.println( "Нечетные элементы массива: " + n);

            }
        }

        // по возрастанию

        Arrays.sort(nums);
        for (int val : nums)
        {
            System.out.println(val);
        }

        //палиндромы


        for (int i = 0; i < (nums.length)/2; i++)
        {
            if (i == nums.length - i - 1)
            {

                System.out.println("Палиндромы" + i);
            }
        }








    }

}