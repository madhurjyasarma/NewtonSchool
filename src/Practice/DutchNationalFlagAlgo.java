package Practice;

public class DutchNationalFlagAlgo {
    static int[] sortColor(int nums[]){
        // init low, hi, mid, temp
        // while mid doesn't cross hi
        //      switch nums[mid]
        //          if(mid == 0)
        //              swap low and mid
        //              increase mid and low
        //          if(mid == 1)
        //              increase mid
        //          if(mid == 2)
        //              swap mid and hi
        //              decrease hi

        int low =0;
        int hi = nums.length-1;
        int mid = 0;
        int temp;

        while (mid <= hi){
            switch (nums[mid]){
                case 0: {
                    // swap low and mid
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    // swap mid and hi
                    temp = nums[mid];
                    nums[mid] = nums[hi];
                    nums[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
        return nums;
    }
    static void printArr(int arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] {1,0,0,2,1,1,0,2,2};
        int arrFinal[] = sortColor(arr);
        printArr(arrFinal);

    }
}
