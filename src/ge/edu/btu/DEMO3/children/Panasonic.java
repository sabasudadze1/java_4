package ge.edu.btu.DEMO3.children;



import ge.edu.btu.DEMO3.parents.Smartphone;



public class Panasonic<T> extends Smartphone {




    String title;
    String screenTouch;

    public Panasonic(String title, String screenTouch) {



        this.title = title;
        this.screenTouch = screenTouch;
    }

    @Override
    public String toString() {



        return "Panasonic{" +
                "სათაური='" + title + '\'' +
                ", სქრინთაჩი='" + screenTouch + '\'' +
                '}';
    }
}