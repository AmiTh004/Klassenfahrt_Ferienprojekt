package model;

public class Reiseziel {
    
    String name;
    String hotel;
    int schuelerpreis;
    int lehrerpreis;
    int altersgrenze;

    //Constructor
    public Reiseziel(String name, String hotel, int schuelerpreis, int lehrerpreis, int altersgrenze) {
        setAltersgrenze(altersgrenze);
        setHotel(hotel);
        setLehrerpreis(lehrerpreis);
        setSchuelerpreis(schuelerpreis);
        setName(name);
    }

    /**
     * 
     * 
     * SETTER UND GETTER
     */

     public void setAltersgrenze(int altersgrenze) {
         this.altersgrenze = altersgrenze;
     }
     public int getAltersgrenze() {
         return altersgrenze;
     }
     public void setHotel(String hotel) {
         this.hotel = hotel;
     }
     public String getHotel() {
         return hotel;
     }
     public void setLehrerpreis(int lehrerpreis) {
         this.lehrerpreis = lehrerpreis;
     }
     public int getLehrerpreis() {
         return lehrerpreis;
     }
     public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }
     public void setSchuelerpreis(int schuelerpreis) {
         this.schuelerpreis = schuelerpreis;
     }
     public int getSchuelerpreis() {
         return schuelerpreis;
     }

    
}
