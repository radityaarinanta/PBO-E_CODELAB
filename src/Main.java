import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;

public class Main {
    public static void main(String[] args) {;
        Scanner input = new Scanner (System.in);
        String Nama,TanggalLahirString,JenisKelamin;

        //input nama
        System.out.print("Nama : ");
        Nama = input.nextLine();

        //input tanggal lahir
        System.out.print("Tanggal Lahir (yyyy-mm-dd) : ");
        TanggalLahirString   = input.nextLine();
        LocalDate TanggalLahir = LocalDate.parse(TanggalLahirString);

        //input jenis kelamin
        System.out.print("jenis kelamain (L/P) : ");
        JenisKelamin = input.nextLine();
        JenisKelamin = JenisKelamin.equalsIgnoreCase("L") ? "Laki-laki" : "Perempuan";

        //hitung tgl
        LocalDate now = LocalDate.now();
        long tahun = ChronoUnit.YEARS.between(TanggalLahir,now);
        long bulan = ChronoUnit.MONTHS.between(TanggalLahir.plusYears(tahun) , now);

        //output program
        System.out.println("===========");
        System.out.println("Nama : "+Nama);
        System.out.println("Jenis Kelamin : "+JenisKelamin);
        System.out.println("Umur Anda: " + tahun + " tahun " + bulan + " bulan");
    }
}