package ge.edu.btu.DEMO3.children;



import ge.edu.btu.DEMO3.parents.Smartphone;




public class Nokia<T> extends Smartphone {


    String title;

    String screenTouch;


    public Nokia(String title, String screenTouch) {

        this.title = title;

        this.screenTouch = screenTouch;
    }

    @Override
    public String toString() {



        return "Nokia{" +
                "სათაური='" + title + '\'' +
                ", სქრინთაჩი='" + screenTouch + '\'' +
                '}';
    }
}