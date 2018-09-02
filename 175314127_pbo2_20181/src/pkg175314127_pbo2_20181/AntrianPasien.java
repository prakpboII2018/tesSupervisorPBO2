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
public class AntrianPasien {
    private int TanggalAntrian;
    private int BulanAntrian;
    private int TahunAntrian;
    private Klinik klinik;
    private Pasien[] daftarPasien;

    public int getTanggalAntrian() {
        return TanggalAntrian;
    }

    public void setTanggalAntrian(int TanggalAntrian) throws Exception{
        if (TanggalAntrian > 0 ) {
            if (TanggalAntrian < 32) {
                this.TanggalAntrian = TanggalAntrian;
            }else{
                System.out.println("Tanggal Antrian tidak Sesuai");
            }
        }else{
            System.out.println("Tanggal Antrian tidak boleh nol");
        }
    }

    public int getBulanAntrian() {
        return BulanAntrian;
    }

    public void setBulanAntrian(int BulanAntrian)throws Exception {
        if (BulanAntrian > 0) {
            if (BulanAntrian < 13) {
                this.BulanAntrian = BulanAntrian;
            }else  {
                System.out.println("Bulan Antrian tidak wajar");
            }
        }else{
            System.out.println("Bulan Antrian tidak boleh nol");
        }
    }

    public int getTahunAntrian() {
        return TahunAntrian;
    }

    public void setTahunAntrian(int TahunAntrian)throws Exception {
        if (TahunAntrian > 0 ) {
            this.TahunAntrian = TahunAntrian;
        }else{
            System.out.println("tahun tidak boleh nol");
        }
    }

    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public Pasien[] getDaftarPasien() {
        return daftarPasien;
    }

    public void setDaftarPasien(Pasien[] daftarPasien) {
        this.daftarPasien = daftarPasien;
    }
    
    
}
