package ge.edu.btu.DEMO3.children;



import ge.edu.btu.DEMO3.parents.Smartphone;



public class IphoneX<T> extends Smartphone {

    String title;

    String screenTouch;


    public IphoneX(String title, String screenTouch) {

        this.title = title;

        this.screenTouch = screenTouch;

    }

    @Override
    public String toString() {


        return "IphoneX{" +
                "სათაური='" + title + '\'' +
                ", სქრინთაჩი='" + screenTouch + '\'' +
                '}';
    }
}