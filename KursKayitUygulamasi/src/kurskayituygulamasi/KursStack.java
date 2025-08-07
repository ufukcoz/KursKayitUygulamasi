
package kurskayituygulamasi;

import java.util.Scanner;


public class KursStack {
    Scanner scan=new Scanner(System.in);
   Node top;
 int kontenjan;
  int sayaç;
    public KursStack(int kontenjan) {
        this.kontenjan = kontenjan;
        sayaç=0;
        top=null;
    }
  String tc;
    String ad;
    String soyad;
    String mezunBölüm;
    
    void push(){
        System.out.println("kayit olacak kisilerin bilgileri : ");
        System.out.println("tc : ");tc=scan.nextLine();
         System.out.println("ad : ");ad=scan.nextLine();
         System.out.println("soyad : ");soyad=scan.nextLine();
         System.out.println("bolum : ");mezunBölüm=scan.nextLine();
         
         Node eleman=new Node(tc,ad,soyad,mezunBölüm);
         if(isFull()){
            System.out.println("kontenjan dolu kayit alamiyoruz");}
        else{
             if(isEmpty()){
                 top=eleman;
                 System.out.println(top.tc+"numrali ilk kisi eklendi");
             }
             else{
                 eleman.next=top;
                 top=eleman;
                 System.out.println(top.tc+" numaralı kisi eklendi");
             }
             sayaç++;
         }
         
    }
    void pop(){
        if(isEmpty()){
            System.out.println("kursta hickimse yok!!");
        }
        else{
            System.out.println(top.tc+" cikartildi");
            top=top.next;
            sayaç--;
        }
    }
    boolean isFull(){
       return kontenjan==sayaç;
   } 
   boolean isEmpty(){
       return sayaç==0;
   }
   void print(){
       if(isEmpty()){
            System.out.println("kurs bos!!");
        }
       else{
           Node temp=top;
           System.out.println("tcno\tad\tsoyad\tbolum");
           while(temp!=null){
               System.out.println(temp.tc+"\t"+temp.ad+"\t"+temp.soyad+"\t"+temp.mezunBölüm);
               temp=temp.next;
           }
       }
   }
   void sonKişiyiGöster(){
       if(isEmpty()){
            System.out.println("kurs bos!!");
        }
        else{
           System.out.println("kursa kayit olan son kisi : ");
            System.out.println(top.tc+ "\t"+top.ad+"\t"+top.soyad+"\t"+top.mezunBölüm) ;
   }
}     
    void kalanKontenjanSayısı(){
        System.out.println("kurstaki kisi sayisi : "+sayaç);
        System.out.println("kalan kontenjan: "+(kontenjan-sayaç));
    }
}
