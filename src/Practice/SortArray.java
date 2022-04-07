// LeetCode Sort color
package Practice;

public class SortArray {

    static void sort(int arr[], int size){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i=0; i<size; i++){
            if (arr[i] == 0){
                count0++;
            }
            else if (arr[i] == 1){
                count1++;
            }
            else if (arr[i] == 2){
                count2++;
            }
        }
        int arrFinal[] = new int[size];
        for (int i=0; i<size; i++){
            if (count0>0){
                arrFinal[i] = 0;
                count0--;
            }
            else if (count1>0){
                arrFinal[i] = 1;
                count1--;
            }
            else if (count2>0){
                arrFinal[i] = 2;
                count2--;
            }
            System.out.print(arrFinal[i] + " ");

        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2,1,0};
        int size = arr.length;
        sort(arr,size);
    }
}
