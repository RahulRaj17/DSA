import java.util.*;

public class CombinationSum2 {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, candidates, 0, target, temp, res);
        return res;
    }

    public static void helper(int i, int arr[], int s, int target, List<Integer> temp, List<List<Integer>> res){
        if(i == arr.length || s >= target){
            if(s == target){
                res.add(new ArrayList<>(temp));
            }
            return;
        }

        temp.add(arr[i]);
        s += arr[i];
        helper(i+1, arr, s, target, temp, res);

        temp.remove(temp.size()-1);
        s -= arr[i];

        while(i+1 < arr.length && arr[i] == arr[i+1]) i++;
        helper(i+1, arr, s, target, temp, res);
    }

    public static void main(String args[]){
        int arr[] = {10,1,2,7,6,1,5};
        List<List<Integer>> res = combinationSum2(arr, 8);
        for(List<Integer> list : res) System.out.println(list);
    }
}

