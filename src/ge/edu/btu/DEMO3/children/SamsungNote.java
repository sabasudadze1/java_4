package ge.edu.btu.DEMO3.children;



import ge.edu.btu.DEMO3.parents.Smartphone;



public class SamsungNote<T> extends Smartphone {



    String title;
    String screenTouch;

    public SamsungNote(String title, String screenTouch) {



        this.title = title;
        this.screenTouch = screenTouch;
    }

    @Override
    public String toString() {




        return "SamsungNote{" +
                "სათაური='" + title + '\'' +
                ", სქრინთაჩი='" + screenTouch + '\'' +
                '}';
    }
}