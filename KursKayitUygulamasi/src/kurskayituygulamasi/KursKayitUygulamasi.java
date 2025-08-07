
package kurskayituygulamasi;

import java.util.Scanner;


public class KursKayitUygulamasi {

  
    public static void main(String[] args) {
 Scanner scan=new Scanner(System.in);
        System.out.println("kursa kayıt edilecek kisi sayisi : ");
        int n=scan.nextInt();
        KursStack liste=new KursStack(n);
        int seçim=-1;

 while(seçim!=0){
            System.out.println("1- kisi ekle");
            System.out.println("2- kisi sil");
            System.out.println("3-son kisiyi goster");
            System.out.println("4-kursa kayit kisiler");
            System.out.println("5-kalan kontenjan");
            System.out.println("0-cikis");
            System.out.println("seciminiz : ");seçim=scan.nextInt();
            
            switch(seçim){
                case 1:liste.push();break;
                case 2:liste.pop();break;
                case 3:liste.sonKişiyiGöster();break;
                case 4: liste.print();break;
                case 5:liste.kalanKontenjanSayısı();break;
                case 0:System.out.println("cikis yapiliyor");break;
                default:System.out.println("hatalı secim (0-5)");
            }


    }
    
}}
