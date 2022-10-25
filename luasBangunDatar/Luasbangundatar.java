
package luasBangunDatar;
import java.util.Scanner;

public class Luasbangundatar {

    private static double LuasSegitiga(int alas,int tinggi){
        double luas = 0.5 * (alas * tinggi);
        return luas;
    }
    
    private static int LuasPersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }
    
    private static int LuasPersegiPanjang(int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    }
    
  
    private static boolean CekValue(String value){
        try {
                Integer.parseInt(value);
                return true;
            } catch (NumberFormatException ex)
            {
                return false;
            }
    }
    public static void main(String[] args) {
        //Pilihan untuk hitung luas
        Scanner input = new Scanner(System.in);
        
        System.out.println("Silahkan pilih luas apa yang akan anda hitung !");
        System.out.println("A. Persegi");
        System.out.println("B. Persegi Panjang");
        System.out.println("C. Segitiga");
        System.out.println();
        System.out.print("Masukan pilihan anda : ");
        String choise = input.nextLine();
        System.out.println("------------------------------"); 
        switch(choise.toLowerCase()){
            case "a":
                System.out.println("Menghitung Luas Persegi");
                System.out.print("Masukan Nilai Sisi : ");
                String sisi = input.nextLine();
                if(CekValue(sisi)){
                    int s = Integer.parseInt(sisi);
                    int luas = LuasPersegi(s);
                    System.out.println("Luas Persegi anda : "+luas);
                }else{
                    System.out.println("Nilai yang anda masukan harus integer");
                }
                break;
            case "b":
                System.out.println("Menghitung Luas Persegi Panjang");
                System.out.print("Masukan Nilai Panjang : ");
                String panjang = input.nextLine();
                System.out.print("Masukan Nilai Lebar : ");
                String lebar = input.nextLine();
                if(CekValue(panjang) && CekValue(lebar)){
                    int p = Integer.parseInt(panjang);
                    int l = Integer.parseInt(lebar);
                    int luas = LuasPersegiPanjang(p,l);
                    System.out.println("Luas Persegi Panjang anda : "+luas);
                }else{
                    System.out.println("Nilai yang anda masukan harus integer");
                }
                break;
            case "c":
                System.out.println("Menghitung Luas Segitiga");
                System.out.print("Masukan Nilai Alas : ");
                String alas = input.nextLine();
                System.out.print("Masukan Nilai Tinggi : ");
                String tinggi = input.nextLine();
                if(CekValue(alas) && CekValue(tinggi)){
                    int a = Integer.parseInt(alas);
                    int t = Integer.parseInt(tinggi);
                    double luas = LuasSegitiga(a,t);
                    System.out.println("Luas Segitiga anda : "+luas);
                }else{
                    System.out.println("Nilai yang anda masukan harus integer");
                }
                break;
            default:
                System.out.println("Pilihan anda tidak tersedia");
        } 
        System.out.println("-------------------------------------");
    }
    
    
}
