package controller;

import java.util.ArrayList;

import model.Klassenfahrt;

public class KlassenfahrtController extends ClassController{
    
    ArrayList<Klassenfahrt> klassenfahrten;

    public KlassenfahrtController(MainController mc) {
        super(mc);
        setKlassenfahrten(new ArrayList<Klassenfahrt>());
    }

    public void createDemodata() {
        getKlassenfahrten().add(new Klassenfahrt(getMc().getRc().getReiseziele().get(0), getMc().getKc().getKlassen().get(0), getMc().getLc().getLehrerInnen().get(0), getMc().getLc().getLehrerInnen().get(1), "22.03.2020","29.03.2020"));
        getKlassenfahrten().add(new Klassenfahrt(getMc().getRc().getReiseziele().get(1), getMc().getKc().getKlassen().get(1), getMc().getLc().getLehrerInnen().get(2), getMc().getLc().getLehrerInnen().get(3), "01.05.2021", "04.05.2021"));
        getKlassenfahrten().add(new Klassenfahrt(getMc().getRc().getReiseziele().get(3), getMc().getKc().getKlassen().get(2), getMc().getLc().getLehrerInnen().get(0), getMc().getLc().getLehrerInnen().get(2),"13.10.2021","17.10.2021"));
    }

    public void printAllObjects() {
        int i =0;
        sendOutput("Alle Klassenfahrten:\n");
        for (Klassenfahrt klassenfahrt : klassenfahrten) {
            // Ausgabe der Eigenschaften. In den letzten beiden Abfragen wird das Start- bzw Enddatum angegeben -> Erklährung siehe Notizen
            sendOutput(i+". \nReiseziel: "+klassenfahrt.getReiseziel().getName()+"\nKlasse: "+klassenfahrt.getKlasse().getName()+"\nLehrer eins: "+klassenfahrt.getLehrer_1().getName()+"\nLehrer zwei: "+klassenfahrt.getLehrer_2().getName()+"\nStart: "+klassenfahrt.getSdf().format(klassenfahrt.getStart())+ "\nEnde:  "+klassenfahrt.getSdf().format(klassenfahrt.getEnde())+"\n");
            i++;
        }
        
    }

    public void printSpecificObject(int index) {
        Klassenfahrt k = getKlassenfahrten().get(index);
        sendOutput("Reiseziel: "+k.getReiseziel().getName()+"\nKlasse: "+k.getKlasse().getName()+"\nLehrer eins: "+k.getLehrer_1().getName()+"\nLehrer zwei: "+k.getLehrer_2().getName()+"\nStart: "+ k.getSdf().format(k.getStart())+"\nEnde: "+k.getSdf().format(k.getEnde()));
        
    }

    public void checkAll() {
        int i=0;
        for (Klassenfahrt k : klassenfahrten) {
            //Für bessere Übersicht wird hier einmal die zu überprüfende Klassenreise ausgegeben:
            printSpecificObject(i);
            i++;
            //Boolean, der mitgeführt wird um zum Schluss zulässigkeit anzugeben. Trifft eine Prämisse nicht zu, wird er auf false gestellt.
            boolean b = true;
            //Überprüfen, ob zwei (verschiedene) Lehrer dabei sind
            if (k.getLehrer_1() != k.getLehrer_2()) {
            
            } else {
                b = false;
                sendOutput("Es müssen zwei Lehrer mitfahren!");
            }
            //Überprüfen ob beide fahren dürfen, wenn nicht wird ausgegeben, welcher keine Reiseerlaubnis hat.
            if (k.getLehrer_1().reiseerlaubnis && k.getLehrer_2().reiseerlaubnis) {
                
            } else {
                b = false;
                //Welcher der Lehrer hat keine Reiseerlaubnis?
                if (k.getLehrer_1().reiseerlaubnis) {
                    sendOutput(k.getLehrer_2().getName()+" hat keine Reiseerlaubnis.");
                } 
                else if(k.getLehrer_2().reiseerlaubnis) {
                    sendOutput(k.getLehrer_1().getName()+" hat keine Reiseerlaubnis.");
                } else {
                    sendOutput("Keiner der Lehrer hat eine Reiseerlaubnis.");
                }
            }
            //Prüfen, ob das Finanzbudget der Schüler ausreicht
            if (k.getKlasse().getFinanzbudget()>= k.getReiseziel().getSchuelerpreis()) {
                    
            } else {
                b = false;
                //Errechnen der Differenz zwischen Budget und Schülerpreis
                int differenz = k.getReiseziel().getSchuelerpreis() - k.getKlasse().getFinanzbudget();
                sendOutput("Das Finanzbudget der Klasse wurde um "+ differenz+" Euro überschritten.");
            }
            //Überprüfen des Mindestalters
            if (k.getKlasse().getDurchschnittsalter()>= k.getReiseziel().getAltersgrenze()) {
                
            } else {
                b = false;
                sendOutput("Das Mindestalter wird nicht erfüllt!");
            }

            //kann die Klassenreise Stattfinden?
            if (b) {
                sendOutput("Die Klassenreise kann stattfinden!\n");
            } else{
                sendOutput("Die Klassenreise kann leider nicht stattfinden!\n");
            }
        }
        
    }

    
    //Methode zum Überprüfen einer Spezifischen Klassenfahrt
    public void checkSpecific(int index) {
        //Für bessere Übersicht wird hier einmal die zu überprüfende Klassenreise ausgegeben:
        printSpecificObject(index);
        Klassenfahrt k = getKlassenfahrten().get(index);
        //Boolean, der mitgeführt wird um zum Schluss zulässigkeit anzugeben.
        boolean b = true;
        //Überprüfen, ob zwei (verschiedene) Lehrer dabei sind
        if (k.getLehrer_1() != k.getLehrer_2()) {
            
        } else {
            b = false;
            sendOutput("Es müssen zwei Lehrer mitfahren!");
        }
        //Überprüfen ob beide fahren dürfen, wenn nicht wird ausgegeben, welcher keine Reiseerlaubnis hat.
        if (k.getLehrer_1().reiseerlaubnis && k.getLehrer_2().reiseerlaubnis) {
                
        } else {
            b = false;
            //Welcher der Lehrer hat keine Reiseerlaubnis?
           if (k.getLehrer_1().reiseerlaubnis) {
               sendOutput(k.getLehrer_2().getName()+" hat keine Reiseerlaubnis");
           } 
           else if(k.getLehrer_2().reiseerlaubnis) {
               sendOutput(k.getLehrer_1().getName()+" hat keine Reiseerlaubnis");
           } else {
               sendOutput("Keiner der Lehrer hat eine Reiseerlaubnis.");
           }
        }
        //Prüfen, ob das Finanzbudget der Schüler ausreicht
        if (k.getKlasse().getFinanzbudget()>= k.getReiseziel().getSchuelerpreis()) {
                    
        } else {
            b = false;
            //Errechnen der Differenz zwischen Budget und Schülerpreis
            int differenz = k.getReiseziel().getSchuelerpreis() - k.getKlasse().getFinanzbudget();
            sendOutput("Das Finanzbudget der Klasse wurde um "+ differenz+" Euro überschritten.");
        }
        //Überprüfen des Mindestalters
        if (k.getKlasse().getDurchschnittsalter()>= k.getReiseziel().getAltersgrenze()) {
            
        } else {
            b = false;
            sendOutput("Das Mindestalter wird nicht erfüllt!");
        }

        //kann die Klassenreise Stattfinden?
        if (b) {
            sendOutput("Die Klassenreise kann stattfinden!\n");
        }
    }

    /**
     * 
     * SETTER UND GETTER
     * 
     */
    public void setKlassenfahrten(ArrayList<Klassenfahrt> klassenfahrten) {
        this.klassenfahrten = klassenfahrten;
    }
    public ArrayList<Klassenfahrt> getKlassenfahrten() {
        return klassenfahrten;
    }

    

}
