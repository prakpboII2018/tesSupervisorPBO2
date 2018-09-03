/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg175314127_pbo2_20181;

/**
 *
 * @author Alexander Adam
 */
public class Pasien {
 /**
 *Deklarasi variabel noRekammedis,nama,alamat,tempatLahir dengan tipe String dan
 * TanggalLahir,BulanLahir,TahunLahir bertipe interger
 */
   private String noRekamMedis; 
   private String nama,alamat;
   private String TempatLahir;
   private int TanggalLahir;
   private int BulanLahir;
   private int TahunLahir;

   /**
    * Terdapat Getter getNoRekamMedis bertipe String yang berfungsi 
    * mengembalikan nilai objek yang sudah berisi variable noRekamMedis
     * @return 
    */
    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }
/**
 * Terdapat Getter getNama bertipe String yang berfungsi mengembalikan nilai 
 * objek yang sudah berisi variable nama
     * @return 
 */
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
/**
 * Terdapat Getter getAlamat bertipe String yang berfungsi mengembalikan nilai 
 * objek yang sudah berisi variable alamat
 * @return 
 */
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
/**
 * Terdapat Getter getTempatLahir bertipe  String yang berfungsi mengembalikan
 * nilai objek yang sudah berisi variable tempatLahir
 * @return 
 */
    public String getTempatLahir() {
        return TempatLahir;
    }

    public void setTempatLahir(String TempatLahir) {
        this.TempatLahir = TempatLahir;
    }
/**
 * Terdapat Getter getTanggalLahir bertipe Int yang berfungsi mengembalikan 
 * nilai objek yang sudah berisi variable TanggalLahir
 * @return 
 */
    public int getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(int TanggalLahir) throws Exception {
        if (TanggalLahir > 0) {           
            if (TanggalLahir < 32) {
                this.TanggalLahir = TanggalLahir;
            }else{
                throw new Exception("Tanggal Lahir tidak wajar");
            }
        }else{
            throw new Exception("Tanggal Lahir tidak boleh nol");
        }
    }

    /**
     * Terdapat Getter getBulanLahir bertipe int yang berfungsi 
     * mengembalikan nilai objek yang sudah berisi variable BullanLahir
     * @return 
     */
    public int getBulanLahir() {
        return BulanLahir;
    }

    public void setBulanLahir(int BulanLahir) throws Exception {
        if (BulanLahir > 0 ) {
            if (BulanLahir <= 12) {
                this.BulanLahir = BulanLahir;
            }else{
                throw new Exception("Bulan Lahir tidak wajar");
            }
        }else{
            throw new Exception("Bulan Lahir tidak boleh nol");
        }
    }

    /**
     * Terdapat Getter getTahunLahir bertipe int yang berfungsi mengembalikan
     * nilai objek yang sudah berisi variable TahunLahir
     * @return 
     */
    public int getTahunLahir() {
        return TahunLahir;
    }

    public void setTahunLahir(int TahunLahir) throws Exception {
        if (TahunLahir > 0 ) {
            this.TahunLahir = TahunLahir;
        }else{
            throw new Exception("Tahun Lahir tidak boleh nol");
        }
    }
   
   
}
