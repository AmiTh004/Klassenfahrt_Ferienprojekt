package model;

public class Lehrer {
    
    String vorname;
    String nachname;
    public boolean reiseerlaubnis;

    //Constructor
    public Lehrer(String vorname, String nachname, boolean reiseerlaubnis){
        setNachname(nachname);
        setReiseerlaubnis(reiseerlaubnis);
        setVorname(vorname);
    }

    /**
     * 
     * SETTER UND GETTER
     * 
     */

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public String getNachname() {
        return nachname;
    }
    public void setReiseerlaubnis(boolean reiseerlaubnis) {
        this.reiseerlaubnis = reiseerlaubnis;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getVorname() {
        return vorname;
    }
    public String getName() {
        return getVorname()+ " "+getNachname();
    }
}
