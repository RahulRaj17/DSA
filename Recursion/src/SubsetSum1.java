import java.util.*;

public class SubsetSum1 {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(0, nums, temp, res);
        return res;
    }

    public static void helper(int i, int arr[], List<Integer> temp, List<List<Integer>> res){
        if(i == arr.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(arr[i]);
        helper(i+1, arr, temp, res);

        temp.remove(temp.size()-1);
        helper(i+1, arr, temp, res);
    }

    public static void main(String args[]){
        int arr[] = {1,2,3};
        List<List<Integer>> res = subsets(arr);
        for(List<Integer> list : res) System.out.println(list);
    }
}
