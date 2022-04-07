

package Practice;

public class Mock {

    public static void maxRight (int arr[]){
//        // 7, 5, 6, 2, 3, 1
//
//        // 6, 6, 3, 3, 1, -1
//
        int totalNum = arr.length;
//        int maxElem = arr[0];
//        int finalArr[] = new int[totalNum];

        for (int i=0; i<totalNum; i++){
            for (int j=1; j<totalNum; j++){
                if (arr[i] < arr[j]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
                else {
                    continue;
                }

            }
        }
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {7, 5, 6, 2, 3, 1};
        maxRight(arr);

    }
}
