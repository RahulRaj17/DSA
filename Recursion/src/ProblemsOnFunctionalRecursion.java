public class ProblemsOnFunctionalRecursion {

    //Reverse an Array using left and right
    public static void f1(int arr[], int l, int r){
        if(l >= r) return;
        //Swap l and r
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        f1(arr, l+1, r-1);
    }

    //Reverse an array using single pointer
    public static void f2(int arr[], int i){
        if(i >= arr.length/2) return;
        int temp = arr[0];
        arr[0] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;
        f2(arr, i+1);
    }

    //Check if a given string is palindrome
    public static boolean f3(String s, int i){
        if(i>=s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return f3(s, i+1);
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};

        //Reverse an Array using left and right
        f1(arr, 0, 4);

        //Reverse an Array using single pointer
        f2(arr, 0);

        for(int i : arr) System.out.println(i);

        //Check if a given string is palindrome
        System.out.println(f3("madam", 0));
    }
}
