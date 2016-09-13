package calculatorcda;

public class CalculatorCDA {

    public static void main(String[] args) 
    {
        add(5, 6);
        subtract(6, 5);
        add(10, 11);
        subtract(10, 11);
        multi (5, 6);
        div (10, 3);
    }
    
    public static int add(int x, int y){
        int total = x+y;
        System.out.println(total);
        return total;
    }
    
    public static int subtract(int x, int y){
        int total = x-y;
        System.out.println(total);
        return total;
    }
    public static int multi(int x, int y){
        int total = x*y;
        System.out.println(total);
        return total;
    }
    public static double div(int x, int y){
        double total = x/y;
        System.out.println(total);
        return total;
    } 
            
}