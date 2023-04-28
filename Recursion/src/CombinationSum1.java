import java.util.*;

public class CombinationSum1 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        f(0, candidates, 0, target, temp, res);
        return res;
    }
    public static void f(int i, int arr[], int s, int target, List<Integer> temp, List<List<Integer>> res){
        if(i==arr.length || s >= target){
            if(s == target){
                res.add(new ArrayList<Integer>(temp));
            }
            return;
        }

        temp.add(arr[i]);
        s += arr[i];
        f(i, arr, s, target, temp, res);

        temp.remove(temp.size() - 1);
        s -= arr[i];
        f(i+1, arr, s, target, temp, res);
    }

    public static void main(String args[]) {
        int arr[] = {2,3,6,7};
        List<List<Integer>> res = combinationSum(arr, 7);
        for(List<Integer> list : res) System.out.println(list);
    }
}
