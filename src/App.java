import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = scan.nextLine();

        System.out.print("Jenis kelamin (L/P) : ");
        String JenisKelamin = scan.nextLine();
        if (JenisKelamin.equalsIgnoreCase("L")) {
            JenisKelamin = "Laki - Laki";
        } else if (JenisKelamin.equalsIgnoreCase("P")) {
            JenisKelamin = "Perempuan";
        }else{
            System.err.println("Inputan Jenis kelamin Salah");
            System.exit(0);
        }
        
        System.out.print("Tanggal lahir (yyyy-mm-dd) : ");
        String tanggalinput = scan.nextLine();
        LocalDate tanggallahir = LocalDate.parse(tanggalinput);

        LocalDate TanggalSekarang = LocalDate.now();
        int umur = Period.between(tanggallahir, TanggalSekarang).getYears();
        int bulan = Period.between(tanggallahir, TanggalSekarang).getMonths();
        int hari = Period.between(tanggallahir, TanggalSekarang).getDays();

        System.out.println("\nDATA DIRI");
        System.out.println("Nama : " + nama);
        System.out.println("Jenis kelamin :" + JenisKelamin);
        System.out.println("Umur : " + umur + " tahun " + bulan + " Bulan " + hari + " Hari");
        scan.close();
    }
}