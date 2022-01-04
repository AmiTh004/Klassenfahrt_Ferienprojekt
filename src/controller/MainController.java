package controller;

import view.Output;

public class MainController {

    KlasseController kc;
    KlassenfahrtController kfc;
    LehrerController lc;
    ReisezielController rc;
    Output output;

    public MainController() {
        setKc(new KlasseController(this));
        setKfc(new KlassenfahrtController(this));
        setLc(new LehrerController(this));
        setRc(new ReisezielController(this));
        setOutput(new Output());
        
        
        demodata();
        printDemodata();
        
    }

    public void demodata() {
        getKc().createDemodata();
        getRc().createDemodata();
        getLc().createDemodata();
        getKfc().createDemodata();
    }

    public void printDemodata() {
        getLc().printAllObjects();
        getKc().printAllObjects();
        getRc().printAllObjects();
        getKfc().printAllObjects();
    }

    public void checkKlassenfahrten() {
        getKfc().checkAll();
    }

    /**
     * 
     * 
     * SETTER UND GETTER
     */

     public void setKc(KlasseController kc) {
         this.kc = kc;
     }
     public KlasseController getKc() {
         return kc;
     }
     public void setKfc(KlassenfahrtController kfc) {
         this.kfc = kfc;
     }
     public KlassenfahrtController getKfc() {
         return kfc;
     }
     public void setLc(LehrerController lc) {
         this.lc = lc;
     }
     public LehrerController getLc() {
         return lc;
     }
     public void setRc(ReisezielController rc) {
         this.rc = rc;
     }
     public ReisezielController getRc() {
         return rc;
     }
     public void setOutput(Output output) {
         this.output = output;
     }
     public Output getOutput() {
         return output;
     }
    
}
