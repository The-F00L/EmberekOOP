package emberekoop;

import emberekoop.Ember;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Emberek {
    
    private List<Ember> emberLista;
    
    public Emberek(){
        this.emberLista = new ArrayList<>();
        
        String[] nevek = {"Kiss Geza","Nagy Balint","Kolompar Elek","Lakatos Ramirez","Suranyi Ábel"};
        String[] szulDatumok = {"1999-2-3","2003-6-4","2001-9-12","2000-4-5","2009-2-2"};
        String[] szulHelyek = {"Pécs","Budapest", "Bukarest", "Sopron", "Budapest"};

        for (int i = 0; i < nevek.length; i++) {
            Ember e = new Ember(nevek[i], szulDatumok[i], szulHelyek[i]);
            this.emberLista.add(e);
        }
    }
    
    public Emberek(String fajlNev){
        this.emberLista = new LinkedList<>();
        try {
            FileReader fr = new FileReader(fajlNev);
            BufferedReader br = new BufferedReader(fr);

            String sor = br.readLine();
            while (sor != null){
                Ember e = new Ember(sor);
                this.emberLista.add(e);
                sor = br.readLine();
            }
            
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            System.err.printf("Hiba: %s", ex.getMessage());
        } catch (IOException ex){
            System.err.printf("Hiba: %s", ex.getMessage());        
        } catch (Exception e){
            System.err.printf("Hiba: %s", e.getMessage());
        }    
    }
    
    public int getAdottHonapbanSzuletettekSzama(int honap){
        int db = 0;
        
        for (int i = 0; i < this.emberLista.size(); i++) {
            if (this.emberLista.get(i).getSzuletesiHonap() == honap){
                db++;
            }
        }
        
        return db;
    }
    
    public String getLegfiatalabb(){
        String nev=null;
        int min=emberLista.get(0).getEletKor();
        for (int i = 0; i < emberLista.size(); i++) {
            if (emberLista.get(i).getEletKor()<min) {
                min=emberLista.get(i).getEletKor();
                nev=emberLista.get(i).getNev();
            }
        }
        
        return nev;
    }
    
    public int getLegidosebb(){
        
        int ind=1;
        int max=emberLista.get(0).getEletKor();
        for (int i = 0; i < emberLista.size(); i++) {
            if (emberLista.get(i).getEletKor()>max) {
                max=emberLista.get(i).getEletKor();
                ind=i;
            }
            
        }
        
        
        
        return ind;
    }
    
    
    
    
    
    @Override
    public String toString(){
        String s = "";
        for (Ember e : this.emberLista) {
            s += e + "\n";
        }
        return s;
    }
    
    
    
}
