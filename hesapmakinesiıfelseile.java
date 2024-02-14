
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pursa
 */
public class hesapmakinesiıfelseile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner scan = new Scanner(System.in);
        int a,b;
        
        System.out.println("*****HESAP MAKİNEME HOŞGELDİNİZ***");
        System.out.println("\n***LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ\n***");
        System.out.println("1.TOPLAMA");
        System.out.println("2.ÇIKARMA");
        System.out.println("3.ÇARPMA");
        System.out.println("4.BÖLME");
        int işlem = scan.nextInt();
        
        System.out.println("lütfen ilk sayıyı giriniz: ");
        a = scan.nextInt();
        System.out.println("lütfen ikinci sayıyı giriniz: ");
        b = scan.nextInt();
        
        if(işlem==1){
            System.out.println("Sonuç: " + (a+b));
        }
            else if(işlem==2){
                    System.out.println("Sonuç: " + (a-b));
                    
                    }
            else if (işlem==3){
                System.out.println("Sonuç: " + (a*b));
            }
            else if (işlem==4){
                    
                System.out.println("Sonuç: " + (a/b));
            }
    }
    
}
