public class IntroductionToRecursion {

    //Infinite Recursion
    public static void f1(){
        System.out.println(1);
        f1();
    }

    //Base Condition
    public static void f2(int count){
        if(count==3) return;
        System.out.println(count);
        count+=1;
        f2(count);
    }

    public static void main(String args[]){
        //Infinite Recursion
        f1();

        //Base Condition
        f2(0);
    }
}
