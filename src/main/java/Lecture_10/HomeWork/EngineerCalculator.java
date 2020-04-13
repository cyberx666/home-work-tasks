package Lecture_10.HomeWork;

public class EngineerCalculator extends Calculator{

int n1 = 10;
int n2 =20;
    @Override
    public int sum(int num1, int num2) {
        return num1+num2;

    }

    @Override
    public int multiple(int n1, int n2) {
        return n1 *n2;
    }

    @Override
    public int minus(int n1, int n2) {
        return n1-n2;
    }

    @Override
    public int degree(int n1, int n2) {
        return n1/n2;
    }
    public static double sqrt(int x){
        return Math.sqrt(x);
    }
    public static double round(double x){
        return Math.round(x);
    }
    public static double cbrt(int x){
        return Math.cbrt(x);
    }

    public static double ceil(int x){
        return Math.ceil(x);
    }


    public static void main(String[] args) {
         Calculator obj = new EngineerCalculator();
        System.out.println(obj.sum(10,20));
        System.out.println(obj.minus(30,10));
        System.out.println(obj.degree(50,20));
        System.out.println(obj.multiple(20,75));


        System.out.println(sqrt(100));
        System.out.println(round(9.34453));
        System.out.println(cbrt(100));
        System.out.println(ceil(458));
    }
}







