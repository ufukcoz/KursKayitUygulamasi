
package kurskayituygulamasi;

public class Node {
    String tc;
    String ad;
    String soyad;
    String mezunBölüm;
    Node next;

    public Node(String tc, String ad, String soyad, String mezunBölüm) {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.mezunBölüm = mezunBölüm;
        next=null;
    }
    
    
    
}
