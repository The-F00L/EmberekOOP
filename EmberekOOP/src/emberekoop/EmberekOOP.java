/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emberekoop;

/**
 *
 * @author Diak
 */
public class EmberekOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ember valaki = 
                new Ember("Nevem Senki", "1972-03-21", "Bugyi");
        System.out.println(valaki);
        
        System.out.println(valaki.getEletKor());
                
        Emberek E = new Emberek();
        System.out.println(E);
        
        Emberek FE = new Emberek("emberek.txt");
        System.out.println(FE);
        
        System.out.println(FE.getAdottHonapbanSzuletettekSzama(6));
        
        System.out.println("Az átlagos testtömeg indexet: nem kiszamithato ezekbol");

        System.out.println("Legfiatalabb neve: "+FE.getLegfiatalabb());
        
        System.out.println("Legidosebb sorszama: "+FE.getLegidosebb());
        
    }
    
}
