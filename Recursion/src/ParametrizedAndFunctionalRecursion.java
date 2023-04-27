public class ParametrizedAndFunctionalRecursion {

    //Sum of first n numbers
    public static int f1(int n){
        if(n==0) return 0;
        return f1(n-1) + n;
    }

    //Factorial of n
    public static int f2(int n){
        if(n==1) return 1;
        return f2(n-1) * n;
    }

    public static void main(String args[]){
        //Sum of first n numbers
        System.out.println(f1(5));

        //Factorial of n
        System.out.println(f2(5));
    }
}
