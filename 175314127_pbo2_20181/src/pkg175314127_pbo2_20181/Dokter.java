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
public class Dokter {
    private String noPegawai;
    private String nama;
    private String alamat;
    private int TanggalLahir;

    public String getNoPegawai() {
        return noPegawai;
    }

    public void setNoPegawai(String noPegawai) {
        this.noPegawai = noPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(int TanggalLahir) throws Exception {
        if (TanggalLahir > 0) {
            if (TanggalLahir < 32) {
                this.TanggalLahir = TanggalLahir;
            }else{
                System.out.println("Tanggal Lahir tidak wajar");
            }
        }else{
            System.out.println("Tanggal Lahir tidak boleh nol");
        }
    }
    
    
}
