import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequence {

    public static void printSubsequences(int arr[], int i, List<Integer> list){
        if(i>=arr.length){
            System.out.println(list);
            return;
        }
        list.add(arr[i]);
        printSubsequences(arr, i+1, list);
        list.remove(list.size()-1);
        printSubsequences(arr, i+1, list);
    }

    public static void main(String args[]){
        int arr[] = {3,1,2};
        List<Integer> list = new ArrayList<>();
        printSubsequences(arr, 0, list);
    }
}
