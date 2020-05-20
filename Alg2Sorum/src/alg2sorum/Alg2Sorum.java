/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg2sorum;

/**
 *
 * @author Doğu
 */
public class Alg2Sorum {

    /**
     * @param args the command line arguments
     */
    public static class Hayvan{
        
        public double boy;
        public double kilo;
        
        public void OzellikGoster(){
            
            System.out.println("Boy="+boy);
            System.out.println("Agırlık"+kilo);       
        }
    }
    
    public static class Kedi extends Hayvan{
        
        public String Turu;
        public void TurGoster(){
            System.out.println("Tur="+Turu);
        }
    }
    
    public static class Kus extends Hayvan{
        public int ayak_sayisi;
        public String turu;
        public void AyakSay(){
             System.out.println("Ayak Sayısı="+ayak_sayisi);
        }
        public void TurGoster(){
            System.out.println("Türü="+turu);
        }
    }
    
    public static class Penguen extends Kus{
        private boolean ucma_yetenek;
        
        private void Yetenek(){
            System.out.println("Uçabiliyor mu?="+ucma_yetenek);
            
        }
    
    }
    
    public static void main(String[] args) {
        Kedi kedi=new Kedi();
        kedi.Turu="Ankara Kedisi";
        kedi.TurGoster();
        
        kedi.kilo=10;
        kedi.boy=20;
        kedi.OzellikGoster();
        
        
        System.out.println("-----------------------------------");
        Kus kus = new Kus();
        kus.ayak_sayisi=2;
        kus.boy=12;
        kus.kilo=1;
        kus.OzellikGoster();
        kus.AyakSay();
        
        System.out.println("-----------------------------------");
        Penguen penguen = new Penguen();
        penguen.turu="Penguen";
        penguen.ucma_yetenek=false;
        penguen.boy=1;
        penguen.kilo=2;
        penguen.ayak_sayisi=2;
        penguen.TurGoster();
        penguen.OzellikGoster();
        penguen.AyakSay();
        penguen.Yetenek();
       
        // TODO code application logic here
    }
    
}
