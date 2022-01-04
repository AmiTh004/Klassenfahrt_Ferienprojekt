package controller;

import java.util.ArrayList;

import model.Klasse;

public class KlasseController extends ClassController{

    ArrayList<Klasse> klassen;

    public KlasseController(MainController mc) {
        super(mc);
        setKlassen(new ArrayList<Klasse>());
    }

    public void createDemodata() {
        getKlassen().add(new Klasse("8a", 28, 13, 200));
        getKlassen().add(new Klasse("S1 Inf-PGW", 7, 16, 400));
        getKlassen().add(new Klasse("10c", 22, 15, 350));
        getKlassen().add(new Klasse("10a", 24, 15, 300));
    }

    public void printAllObjects(){
        int i =0;
        sendOutput("Alle Schulklassen:\n");
        for (Klasse klasse : klassen) {
            sendOutput(i+". \nKlasse: "+klasse.getName()+"\nSchüleranzahl: "+klasse.getSchueleranzahl()+"\nDurchschnittsalter: "+ klasse.getDurchschnittsalter()+" Jahre\nFinanzbudget: "+klasse.getFinanzbudget()+" Euro\n");
            i++;
        }
    }


    public void printSpecificObject(int index) {
        Klasse k = getKlassen().get(index);
        sendOutput("Klasse: "+k.getName()+"\nSchüleranzahl: "+k.getSchueleranzahl()+"\nDurchschnittsalter: "+ k.getDurchschnittsalter()+" Jahre\nFinanzbudget: "+k.getFinanzbudget()+" Euro\n");
        
    }
    
    /**
     * 
     * SETTER UND GETTER
     * 
     */
    public void setKlassen(ArrayList<Klasse> klassen) {
        this.klassen = klassen;
    }
    public ArrayList<Klasse> getKlassen() {
        return klassen;
    }

    


}
