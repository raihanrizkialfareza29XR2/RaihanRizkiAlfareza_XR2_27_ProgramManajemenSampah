package ManajemenSampah;

import java.util.Scanner;

public class Sekolah {
    int pilihan;
    int pilihan2;
    int pilihann2;
    int sampah;
    int rumus;
    String detail;
    double hasil;
    String ulangi;
    String nama;
    int absen;
    String kelas;
    String bendahara;
    boolean running = true;
    void inputan(){
        while (running){
            Scanner input = new Scanner(System.in);
            System.out.println("|-Silahkan Pilih dan Identifikasi Jenis Sampah yang Anda Bawa-|");
            System.out.println("|   --Berdasarkan Seperti yang Telah Dicontohkan Diatas--     |");
            System.out.print("|   --Masukkan Nomornya Saja : ");
            pilihan = input.nextInt();
            System.out.println("");
            if (pilihan == 1){
                System.out.println("|---Anda Membawa Sampah Jenis Organik---|");
                System.out.println("");
                System.out.println("|---Berikut Adalah Daftar Harga Dari Masing Masing Jenis Sampah Organik---|");
                System.out.println("|=========================================================================|");
                System.out.println("|               1. Tipe : P10 (Dedaunan) = Rp 2.800,00 /Kg                |");
                System.out.println("|           2. Tipe : P11 (Kayu / Ranting Pohon) = Rp 3.000 /Kg           |");
                System.out.println("|=========================================================================|");
                System.out.println("");
                System.out.print("|Silakan Masukkan Tipe Sampah Organik Anda : ");
                pilihan2 = input.nextInt();
                if (pilihan2 == 1){
                    System.out.println("");
                    System.out.println("|Yang Anda Pilih Adalah Tipe P10 (Dedaunan) = Rp 2.800,00 /Kg");
                    System.out.print("|Masukkan Jumlah Berat Sampah Anda (Dibulatkan Ke Kg) : ");
                    sampah = input.nextInt();
                    System.out.println("");
                    rumus = (2800 * sampah);
                    hasil = rumus;
                }
                else if (pilihan2 == 2){
                    System.out.println("");
                    System.out.println("|Yang Anda Pilih Adalah Tipe P11 (Kayu / Ranting Pohon) = Rp 3.000 /Kg");
                    System.out.print("|Masukkan Jumlah Berat Sampah Anda (Dibulatkan Ke Kg) : ");
                    sampah = input.nextInt();
                    System.out.println("");
                    rumus = (3000 * sampah);
                    hasil = rumus;
                }
            }
            else if (pilihan == 2){
                System.out.println("|---Anda Membawa Sampah Jenis Anorganik---|");
                System.out.println("");
                System.out.println("|---Berikut Adalah Daftar Harga Dari Masing Masing Jenis Sampah Anorganik---|");
                System.out.println("|===========================================================================|");
                System.out.println("|          1. Tipe : Q10 (Aqua Gelas Bersih / Kotor) = Rp 3.500 /Kg         |");
                System.out.println("|         2. Tipe : Q11 (Gelas Ale-Ale / Teh Gelas) = Rp 3.200 /Kg          |");
                System.out.println("|          3. Tipe : Q12 (Koran atau Kertas Minyak) = Rp 3.100 /Kg          |");
                System.out.println("|             4. Tipe : Q13 (Amplop / Map Bekas) = Rp 3.150 /Kg             |");
                System.out.println("|           5. Tipe : Q14 (Susu / Teh Kotak Bekas) = Rp 3.200 /Kg           |");
                System.out.println("|===========================================================================|");
                System.out.println("");
                System.out.print("|Silakan Masukkan Tipe Sampah Organik Anda : ");
                pilihann2 = input.nextInt();
                if (pilihann2 == 1){
                    System.out.println("");
                    System.out.println("|Yang Anda Pilih Adalah Tipe Q10 (Aqua Gelas Bersih / Kotor) = Rp 3.500 /Kg");
                    System.out.print("|Masukkan Jumlah Berat Sampah Anda (Dibulatkan Ke Kg) : ");
                    sampah = input.nextInt();
                    System.out.println("");
                    rumus = (3500 * sampah);
                    hasil = rumus;
                }
                else if (pilihann2 == 2){
                    System.out.println("");
                    System.out.println("|Yang Anda Pilih Adalah Tipe Q11 (Gelas Ale-Ale / Teh Gelas) = Rp 3.200 /Kg");
                    System.out.print("|Masukkan Jumlah Berat Sampah Anda (Dibulatkan Ke Kg) : ");
                    sampah = input.nextInt();
                    System.out.println("");
                    rumus = (3200 * sampah);
                    hasil = rumus;
                }
                else if (pilihann2 == 3){
                    System.out.println("");
                    System.out.println("|Yang Anda Pilih Adalah Tipe Q12 (Koran atau Kertas Minyak) = Rp 3.100 /Kg");
                    System.out.print("|Masukkan Jumlah Berat Sampah Anda (Dibulatkan Ke Kg) : ");
                    sampah = input.nextInt();
                    System.out.println("");
                    rumus = (3100 * sampah);
                    hasil = rumus;
                }
                else if (pilihann2 == 4){
                    System.out.println("");
                    System.out.println("|Yang Anda Pilih Adalah Tipe Q13 (Amplop / Map Bekas) = Rp 3.150 /Kg");
                    System.out.print("|Masukkan Jumlah Berat Sampah Anda (Dibulatkan Ke Kg) : ");
                    sampah = input.nextInt();
                    System.out.println("");
                    rumus = (3150 * sampah);
                    hasil = rumus;
                }
                else if (pilihann2 == 5){
                    System.out.println("");
                    System.out.println("|Yang Anda Pilih Adalah Tipe Q14 (Susu / Teh Kotak Bekas) = Rp 3.250 /Kg");
                    System.out.print("|Masukkan Jumlah Berat Sampah Anda (Dibulatkan Ke Kg) : ");
                    sampah = input.nextInt();
                    System.out.println("");
                    rumus = (3250 * sampah);
                    hasil = rumus;
                }
            }
            Scanner darurat = new Scanner(System.in);
            System.out.print("Apakah Anda Ingin Mengulang Program Dari Awal? (Y/T) : ");
            ulangi = darurat.nextLine();
            if (ulangi.equalsIgnoreCase("T")){
                running = false;
            }
        }
    }
    void Identitas(){
        Scanner baru = new Scanner(System.in);
        System.out.println("");
        System.out.println("|      ---Jangan Lupa Masukkan Identitas Berikut!---      |");
        System.out.print("|Nama  : ");
        nama = baru.nextLine();
        System.out.print("|Kelas : ");
        kelas = baru.nextLine();
        System.out.print("|No. Absen : ");
        absen = baru.nextInt();
        Scanner duarurat = new Scanner(System.in);
        System.out.print("|Bendahara : ");
        bendahara = duarurat.nextLine();
        System.out.println("|=========================================================|");
    }
     void INFO(){
        System.out.println("");
        System.out.println("|=========================================================|");
        System.out.println("|Harga dari setiap sampah per Kg nya telah disesuaikan    |");
        System.out.println("|dengan harga yang telah ditetapkan oleh bank sampah Kota |");
        System.out.println("|Malang. Jadi sekolah hanya berperan sebagai inisiator dan|");
        System.out.println("|distributor. Agar siswa siswi SMK Telkom Malang menjadi  |");
        System.out.println("|lebih bijak dalam mengelola sampah disekitarnya. Hasil   |");
        System.out.println("|dari penjualan sampah ini juga akan masuk ke KAS masing2 |");
        System.out.println("|kelas melalui bendahara. Agar bisa digunakan untuk       |");
        System.out.println("|memenuhi kebutuhan kelas.                                |");
        System.out.println("|=========================================================|");
        System.out.println("");
    }
    int PILIHAN(){
        System.out.print("|Pilihan Anda Adalah : ");
        return pilihan;
    }
    int PILIHAN2(){
        System.out.print("|Pilihan Anda Berikutnya Adalah : ");
        return pilihan2;
    }
    int SAMPAH(){
        System.out.println("");
        System.out.print("|Jumlah Berat Sampah Anda (Dibulatkan Ke Kg) : ");
        return sampah;
    }
    void RUMUS(){
        if (pilihan2 == 1){
            System.out.println("|Detail Pembayaran : (" + sampah + " x " + "Rp 2.800) = " + hasil);
        }
        else if (pilihan2 == 2){
            System.out.println("|Detail Pembayaran : (" + sampah + " x " + "Rp 3.000) = " + hasil);
        }
        else if (pilihann2 == 1){
            System.out.println("|Detail Pembayaran : (" + sampah + " x " + "Rp 3.500) = " + hasil);
        }
        else if (pilihann2 == 2){
            System.out.println("|Detail Pembayaran : (" + sampah + " x " + "Rp 3.200) = " + hasil);
        }
        else if (pilihann2 == 3){
            System.out.println("|Detail Pembayaran : (" + sampah + " x " + " Rp 3.100) = " + hasil);
        }
        else if (pilihann2 == 4){
            System.out.println("|Detail Pembayaran : (" + sampah + " x " + " Rp 3.150) = " + hasil);
        }
        else if (pilihann2 == 5){
            System.out.println("|Detail Pembayaran : (" + sampah + " x " + " Rp 3.200) = " + hasil);
        }
    }
    double HASIL(){
        System.out.print("|Nominal yang Didapat Dari Hasil Daur Ulang Sampah Adalah : ");
        return hasil;
    }
    String NAMA(){
        System.out.println("");
        System.out.println("|=========================================================|");
        System.out.print("|Nama Anda Adalah : ");
        return nama;
    }
    String KELAS(){
        System.out.print("|Kelas Anda Adalah : ");
        return kelas;
    }
    int NOABSEN(){
        System.out.print("|Nomor Absen Anda Adalah : ");
        return absen;
    }
    String BENDAHARA(){
        System.out.print("|Bendahara Kelas Anda Adalah : ");
        return bendahara;
    }

}
