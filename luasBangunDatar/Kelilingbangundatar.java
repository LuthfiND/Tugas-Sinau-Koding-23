
package luasBangunDatar;
import java.util.Scanner;

public class Kelilingbangundatar {

    private static int KelilingSegitiga(int sisi1,int sisi2){
        int keliling = 2 * (sisi1 * sisi2);
        return keliling;
    }
    
    private static int KelilingPersegi(int sisi){
        int keliling = 4 * (sisi);
        return keliling;
    }
    
    private static int KelilingPersegiPanjang(int panjang, int lebar){
        int keliling = 2 *(panjang * lebar);
        return keliling;
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
        
        System.out.println("Silahkan pilih keliling apa yang akan anda hitung !");
        System.out.println("A. Persegi");
        System.out.println("B. Persegi Panjang");
        System.out.println("C. Segitiga");
        System.out.println();
        System.out.print("Masukan pilihan anda : ");
        String choise = input.nextLine();
        System.out.println("------------------------------"); 
        switch(choise.toLowerCase()){
            case "a":
                System.out.println("Menghitung Keliling Persegi");
                System.out.print("Masukan Nilai Sisi : ");
                String sisi = input.nextLine();
                if(CekValue(sisi)){
                    int s = Integer.parseInt(sisi);
                    int keliling = KelilingPersegi(s);
                    System.out.println("Keliling Persegi anda : "+keliling);
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
                    int keliling = KelilingPersegiPanjang(p,l);
                    System.out.println("Luas Persegi Panjang anda : "+keliling);
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
                    int keliling = KelilingSegitiga(a,t);
                    System.out.println("Luas Segitiga anda : "+keliling);
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
