import java.util.*;

public class PatternsInRecursion {

    //Subsequence with sum k
    public static void f1(int i, int arr[], int s, int sum, List<Integer> list){
        if(s>sum) return;
        if(i == arr.length){
            if(s == sum){
                System.out.println(list);
            }
            return;
        }
        list.add(arr[i]);
        s += arr[i];
        f1(i+1, arr, s, sum, list);

        list.remove(list.size()-1);
        s -= arr[i];
        f1(i+1, arr, s, sum, list);
    }

    public static boolean f2(int i, int arr[], int s, int sum, List<Integer> list){
        if(s>sum) return false;
        if(i == arr.length){
            if(s == sum){
                System.out.println(list);
                return true;
            }
            return false;
        }

        list.add(arr[i]);
        s += arr[i];
        if(f2(i+1, arr, s, sum, list) == true) return true;

        list.remove(list.size() - 1);
        s -= arr[i];
        if(f2(i+1, arr, s, sum, list) == true) return true;

        return false;
    }

    public static int f3(int i, int arr[], int s, int sum){
        if(s>sum) return 0;
        if(i == arr.length){
            if(s == sum){
                return 1;
            }
            return 0;
        }

        s += arr[i];
        int left = f3(i+1, arr, s, sum);

        s -= arr[i];
        int right = f3(i+1, arr, s, sum);

        return left + right;
    }

    public static void main(String args[]){

        int arr[] = {1,2,1};
        List<Integer> list = new ArrayList<>();

        //Subsequence with sum k
        f1(0, arr, 0, 2, list);

        //One subsequence with sum k
        f2(0, arr, 0, 2, list);

        //Count subsequences with sum k
        System.out.println(f3(0, arr, 0, 2));

    }
}
