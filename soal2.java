package kuis;

class MahlukHidup{
    String nafas;
    String berkembang_biak;
    String jenis_makanan;
}

class manusia extends MahlukHidup{
    String nafas = "paru-paru";
    String berkembang_biak = "melahirkan";
    String jenis_makanan = "omivora";
    
    void manusia(){
        System.out.println("manusia adalah mahluk hidup yang paling sempurna");
    }
}    

class ayam extends MahlukHidup{
    String nafas = "paru-paru";
    String berkembang_biak = "bertelur";
    String jenis_makanan = "omivora";
    
    void ayam(){
        System.out.println("ayaam mempunyai suara kukuruyuuu....");
    }
}

class singa extends MahlukHidup{
    String nafas = "paru-paru";
    String berkembang_biak = "melahirkan";
    String jenis_makanan = "karnivora";
    
    void singa(){
        System.out.println("singa merupakan raja hutan");
    }
}

public class soal2 {
    public static void main(String[] args) {
        manusia doni = new manusia();
        System.out.println("mahluk hidup ini bernafas dengan " + doni.nafas);
        System.out.println("mahluk hidup berkembang biak dengan " + doni.berkembang_biak);
        System.out.println("jenis makanan " + doni.jenis_makanan);
        doni.manusia();
        
        System.out.println("======================================");
        
        ayam rembo = new ayam();
        System.out.println("mahluk hidup ini bernafas dengan " + rembo.nafas);
        System.out.println("mahluk hidup berkembang biak dengan " + rembo.berkembang_biak);
        System.out.println("jenis makanan " + rembo.jenis_makanan);
        rembo.ayam();
        
        System.out.println("======================================");
        
        singa king = new singa();
        System.out.println("mahluk hidup ini bernafas dengan " + king.nafas);
        System.out.println("mahluk hidup berkembang biak dengan " + king.berkembang_biak);
        System.out.println("jenis makanan " + king.jenis_makanan);
        king.singa();
    }
}