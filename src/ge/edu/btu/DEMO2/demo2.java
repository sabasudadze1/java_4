package ge.edu.btu.DEMO2;

public class demo2 {


    public static void main(String[] args) {



        demo2.sumable<Integer, Integer> func = (a, b) -> Integer.sum(a, b);



        System.out.println(func.apply(141, 142));
    }



    interface sumable<X, Y> {



        
        int apply(X var1, Y var2);
    }
}