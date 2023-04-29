import java.util.*;

public class SubsetSum2 {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        helper(0, temp, res, nums);
        return res;
    }

    public static void helper(int i, List<Integer> temp, List<List<Integer>> res, int arr[]){
        if(i == arr.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(arr[i]);
        helper(i+1, temp, res, arr);

        temp.remove(temp.size()-1);

        while(i+1 < arr.length && arr[i] == arr[i+1]) i++;
        helper(i+1, temp, res, arr);
    }

    public static void main(String args[]){
        int arr[] = {1,2,2};
        List<List<Integer>> res = subsetsWithDup(arr);
        for(List<Integer> list : res) System.out.println(list);
    }
}
