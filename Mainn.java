package polymorphismhewan;

public class Mainn {
    public static void main(String[] args) {
        Hewann hewan = new Hewann();
        Kudaa kuda = new Kudaa();
        Kucingg kucing = new Kucingg();
        Ayamm ayam = new Ayamm();
        
        hewan.suara();
        
        hewan = kuda;
        hewan.suara();
        
        hewan = kucing;
        hewan.suara();
        
        hewan = ayam;
        hewan.suara();
    }
}
