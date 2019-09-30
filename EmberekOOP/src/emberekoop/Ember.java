/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emberekoop;

import java.util.Calendar;

/**
 *
 * @author Diak
 */
public class Ember {
     private String nev;
    private String szulDatum;
    private String szulHely;
    
    
    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    public Ember(String sor){
        String[] adatok = sor.split(";");
        this.nev = adatok[0];
        this.szulDatum = adatok[1];
        this.szulHely = adatok[2];
    }
    
    public int getSzuletesiEv(){
        return Integer.parseInt(this.szulDatum.substring(0, 4));
    }
    
    public int getSzuletesiHonap(){
        String[] adatok = this.szulDatum.split("-");
        return Integer.parseInt(adatok[1]);
    }
    
    public int getSzuletesiNap(){
        String[] adatok = this.szulDatum.split("-");
        return Integer.parseInt(adatok[2]);
    }
    
    public int getEletKor(){
        int aktualisEv = Calendar.getInstance().get(Calendar.YEAR);
        return aktualisEv-this.getSzuletesiEv();
    }
    
    public String getNev(){
        return this.nev;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s", 
                this.nev,
                this.szulDatum,
                this.szulHely);
    }
    
}
