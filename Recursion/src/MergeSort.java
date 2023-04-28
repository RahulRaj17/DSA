public class MergeSort {

    public static void mergeSort(int arr[]){
        int n = arr.length;
        if(n < 2) return;

        int mid = n/2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];

        int ind = 0;
        for(; ind<mid; ind++){
            left[ind] = arr[ind];
        }

        for(; ind<n; ind++){
            right[ind-mid] = arr[ind];
        }

        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }

    public static void merge(int left[], int right[], int arr[]){
        int nL = left.length;
        int nR = right.length;
        int n = arr.length;

        int i=0;
        int j=0;
        int k=0;

        while(i < nL && j < nR){
            if(left[i] < right[j]){
                arr[k] = left[i];
                k++;
                i++;
            }else{
                arr[k] = right[j];
                k++;
                j++;
            }
        }

        while(i < nL){
            arr[k] = left[i];
            k++;
            i++;
        }

        while(j < nR){
            arr[k] = right[j];
            k++;
            j++;
        }
    }

    public static void main(String args[]){
        int arr[] = {2,4,1,6,8,5,3,7};
        mergeSort(arr);
        for(int val : arr) System.out.println(val);
    }
}
