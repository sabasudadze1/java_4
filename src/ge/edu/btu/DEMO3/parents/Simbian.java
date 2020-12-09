package ge.edu.btu.DEMO3.parents;




import ge.edu.btu.DEMO3.children.Nokia;



import ge.edu.btu.DEMO3.children.Panasonic;

public class Simbian {
    public String keyboard() {
        return "მე მაქვს კლავიატურა";
    }

    public void printSimbian() {

        Nokia<String> nokia = new Nokia<>("Nokia", keyboard());

        System.out.println(nokia);


        keyboard();





        Panasonic<String> panasonic = new Panasonic<>("Panasonic", keyboard());


        System.out.println(panasonic);

        keyboard();

    }
}