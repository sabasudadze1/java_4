package ge.edu.btu.DEMO3;


import ge.edu.btu.DEMO3.parents.Simbian;



import ge.edu.btu.DEMO3.parents.Smartphone;



public class demo3 {
    public static void main(String[] args) {



        Smartphone smartphone = new Smartphone();

        Simbian simbian = new Simbian();


        smartphone.printSmartphone();


        System.out.println("\n");

        simbian.printSimbian();

    }
}