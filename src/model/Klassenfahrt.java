package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Klassenfahrt {
    
    Reiseziel reiseziel;
    Lehrer lehrer_1;
    Lehrer lehrer_2;
    Klasse klasse;
    SimpleDateFormat sdf;
    Date start;
    Date ende;

    //Constructor
    public Klassenfahrt(Reiseziel reiseziel,Klasse klasse, Lehrer lehrer_1, Lehrer lehrer_2, String start, String ende) {
        setLehrer_1(lehrer_1);
        setLehrer_2(lehrer_2);
        setReiseziel(reiseziel);
        setKlasse(klasse);
        setSdf(new SimpleDateFormat("dd.MM.yyyy"));
        try {
            setEnde(sdf.parse(ende));
            setStart(sdf.parse(start));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

    }



    /**
     * 
     * SETTER UND GETTER
     */

     public void setLehrer_1(Lehrer lehrer_1) {
         this.lehrer_1 = lehrer_1;
     }
     public Lehrer getLehrer_1() {
         return lehrer_1;
     }
     public void setLehrer_2(Lehrer lehrer_2) {
         this.lehrer_2 = lehrer_2;
     }
     public Lehrer getLehrer_2() {
         return lehrer_2;
     }
     public void setReiseziel(Reiseziel reiseziel) {
         this.reiseziel = reiseziel;
     }
     public Reiseziel getReiseziel() {
         return reiseziel;
     }
     public void setKlasse(Klasse klasse) {
         this.klasse = klasse;
     }
     public Klasse getKlasse() {
         return klasse;
     }
     public void setSdf(SimpleDateFormat sdf) {
         this.sdf = sdf;
     }
     public SimpleDateFormat getSdf() {
         return sdf;
     }
     public void setEnde(Date ende) {
         this.ende = ende;
     }
     public Date getEnde() {
         return ende;
     }
     public void setStart(Date start) {
         this.start = start;
     }
     public Date getStart() {
         return start;
     }
}
