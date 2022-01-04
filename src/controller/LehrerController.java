package controller;

import java.util.ArrayList;

import model.Lehrer;

public class LehrerController extends ClassController{
    
    ArrayList<Lehrer> lehrerInnen;

    public LehrerController(MainController mc) {
        super(mc);
        setLehrerInnen(new ArrayList<Lehrer>());
    }

    public void createDemodata() {
        getLehrerInnen().add(new Lehrer("Holger", "Trampe", true));
        getLehrerInnen().add(new Lehrer("Mattias", "Schröder", true));
        getLehrerInnen().add(new Lehrer("Bianca", "Tront", true));
        // zur Überprüfung von Zulässigkeits-check: 
        getLehrerInnen().add(new Lehrer("Lena", "Türk", false));
    }

    public void printAllObjects() {
        int i=0;
        sendOutput("Alle LehrerInnen: \n");
        for (Lehrer lehrer : lehrerInnen) {
            if (lehrer.reiseerlaubnis) {
                sendOutput(i+". \nName: "+lehrer.getName()+ "\nReiseerlaubnis: ja\n");
            } else {
                sendOutput(i+". \nName: "+ lehrer.getName()+"\nReiseerlaunis: nein\n");
            }
            i++;
        }
    }

    public void printSpecificObject(int index) {
        Lehrer l = getLehrerInnen().get(index);
        if (l.reiseerlaubnis) {
            sendOutput("Name: "+l.getName()+"\nReiseerlaubnis: ja\n");
        } else {
            sendOutput("Name: "+l.getName()+"\nReiseerlaubnis: nein\n");
        }
        
    }

    /**
     * 
     * SETTER UND GETTER
     * 
     */
    public void setLehrerInnen(ArrayList<Lehrer> lehrerInnen) {
        this.lehrerInnen = lehrerInnen;
    }
    public ArrayList<Lehrer> getLehrerInnen() {
        return lehrerInnen;
    }

}
