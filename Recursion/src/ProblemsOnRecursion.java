public class ProblemsOnRecursion {

    //Print name n times
    public static void f1(int n){
        if(n==0) return;
        f1(n-1);
        System.out.println("Rahul");
    }

    //Print linearly from 1 to n
    public static void f2(int n){
        if(n==0) return;
        f2(n-1);
        System.out.println(n);
    }

    public static void f3(int n){
        if(n==0) return;
        System.out.println(n);
        f3(n-1);
    }

    public static void main(String args[]){

        //Print name 5 times
        f1(5);

        //Print linearly from 1 to n
        f2(5);

        //Print n to 1
        f3(5);
    }
}
