package ManajemenSampah;

public class Bersih {
    public static void main(String[] args) {
        Sampah.Tampilan();
        Sekolah daurulang = new Sekolah();
        daurulang.inputan();
        daurulang.Identitas();
        daurulang.INFO();
        System.out.println(daurulang.PILIHAN());
        System.out.println(daurulang.PILIHAN2());
        System.out.println(daurulang.SAMPAH());
        daurulang.RUMUS();
        System.out.println(daurulang.HASIL());
        System.out.println(daurulang.NAMA());
        System.out.println(daurulang.KELAS());
        System.out.println(daurulang.NOABSEN());
        System.out.println(daurulang.BENDAHARA());
    }
}
