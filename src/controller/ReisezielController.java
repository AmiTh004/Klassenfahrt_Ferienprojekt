package controller;

import java.util.ArrayList;

import model.Reiseziel;

public class ReisezielController extends ClassController{

    ArrayList<Reiseziel> reiseziele;

    public ReisezielController(MainController mc) {
        super(mc);
        setReiseziele(new ArrayList<Reiseziel>());
    }

    public void createDemodata() {
        getReiseziele().add(new Reiseziel("Greifswald", "Jugendherberge Greifswald", 200, 250, 10));
        getReiseziele().add(new Reiseziel("Berlin", "Hotel Alexanderplatz", 300, 400, 15));
        getReiseziele().add(new Reiseziel("Königssee", "Gastwirtschaft Huber", 250, 300, 14));
        // Fehlermenldungs-check:
        getReiseziele().add(new Reiseziel("Sylt", "Welnesshotel Westerland", 500, 500, 18));
    }


    public void printAllObjects() {
        int i=0;
        sendOutput("Alle Reiseziele:\n");
        for (Reiseziel reiseziel : reiseziele) {
            sendOutput(i+".\nReiseziel: "+reiseziel.getName()+"\nUnterkunft: "+reiseziel.getHotel()+"\nSchülerpreis: "+reiseziel.getSchuelerpreis()+" Euro\nLehrerpreis: "+reiseziel.getLehrerpreis()+" Euro\nMindestalter: "+reiseziel.getAltersgrenze()+" Jahre\n");
            i++;
        }
    }


    public void printSpecificObject(int index) {
        Reiseziel r= getReiseziele().get(index);
        sendOutput("Reiseziel: "+r.getName()+"\nUnterkunft: "+r.getHotel()+"\nSchülerpreis: "+r.getSchuelerpreis()+" Euro\nLehrerpreis: "+r.getLehrerpreis()+" Euro\nMindestalter: "+r.getAltersgrenze()+" Jahre\n");
    }

    /**
     * 
     * SETTER UND GETTER
     * 
     */
    public void setReiseziele(ArrayList<Reiseziel> reiseziele) {
        this.reiseziele = reiseziele;
    }
    public ArrayList<Reiseziel> getReiseziele() {
        return reiseziele;
    }
    
}
