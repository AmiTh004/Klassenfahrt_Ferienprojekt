package model;

public class Klasse {
    
    String name;
    int schueleranzahl;
    int durchschnittsalter;
    int finanzbudget;

    //Constructor
    public Klasse(String name, int schueleranzahl, int durchschnittsalter, int finanzbudget) {
        setDurchschnittsalter(durchschnittsalter);
        setFinanzbudget(finanzbudget);
        setName(name);
        setSchueleranzahl(schueleranzahl);
    }

    /**
     * 
     * 
     * SETTER UND GETTER
     */

     public void setDurchschnittsalter(int durchschnittsalter) {
         this.durchschnittsalter = durchschnittsalter;
     }
     public int getDurchschnittsalter() {
         return durchschnittsalter;
     }
     public void setFinanzbudget(int finanzbudget) {
         this.finanzbudget = finanzbudget;
     }
     public int getFinanzbudget() {
         return finanzbudget;
     }
     public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }
     public void setSchueleranzahl(int schueleranzahl) {
         this.schueleranzahl = schueleranzahl;
     }
     public int getSchueleranzahl() {
         return schueleranzahl;
     }
    
}
