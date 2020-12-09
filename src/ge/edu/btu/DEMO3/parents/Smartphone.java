

package ge.edu.btu.DEMO3.parents;



import ge.edu.btu.DEMO3.children.IphoneX;



import ge.edu.btu.DEMO3.children.SamsungNote;

public class Smartphone {



    public String screenTouch(){
        return "მე მაქვს სქრინთაჩი";
    }

    public void printSmartphone() {




        IphoneX<String> iphoneX = new IphoneX<>("Iphone", screenTouch());
        SamsungNote<String> samsungNote = new SamsungNote<>("Samsung Note", screenTouch());
        System.out.println(iphoneX);
        screenTouch();
        System.out.println(samsungNote);
        screenTouch();

    }
}