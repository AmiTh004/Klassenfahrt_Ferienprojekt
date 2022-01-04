package controller;

//Oberkalsse für alle außer Maincontroller
public abstract class ClassController {
    
    MainController mc;

    public ClassController(MainController mc) {
        setMc(mc);
    }

    //abstrakte Methoden, die in allen Unterklassen übernommen werden.
    //Methode in der die Demodaten generiert werden:
    public abstract void createDemodata();

    // Methode, die alle vorhandenen Elemente der ArrayList ausgibt
    public abstract void printAllObjects();

    // Methode, die ein bestimmtes Objeht der ArrayList ausgibt, in den Parametern wird der Index dieses Elements übergeben
    public abstract void printSpecificObject(int index);

    //Methode, die einen String an die View überliefert, die ihn dann ausgibt.
        //Diese Methode wurde nur dazu eingerichtet um Retundanten Code zu sparen.
    public void sendOutput(String data) {
        getMc().getOutput().printData(data);
    }


    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public MainController getMc() {
        return mc;
    }

}
