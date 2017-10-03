/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa.pkg10116551;

/**
 *
 * @author  Divian Ajie Permana
 *          10116551
 *          PBO12
 */
class mahasiswa{
    public String nama;
    public String nim;
    private double nQuis;
    private double nUts;
    private double nUas;

    public double getNQuis() {
        return nQuis;
    }

    public void setNQuis(double nQuis) {
        this.nQuis = nQuis;
    }

    public double getNUts() {
        return nUts;
    }

    public void setNUts(double nUts) {
        this.nUts = nUts;
    }

    public double getNUas() {
        return nUas;
    }

    public void setNUas(double nUas) {
        this.nUas = nUas;
    }
    
    public double nAkhir(double nQuis, double nUts, double nUas){
                return (0.2 * nQuis + 0.3 * nUts + 0.5 * nUas );

    }
    
    public void HIndex(double nAkhir){
        char index = 1;
        String keterangan = null;
        if (nAkhir > 80 && nAkhir <= 100) {
            index = 'A';
            keterangan = "Sangat Baik";
        } else if (nAkhir > 68) {
            index = 'B';
            keterangan = "Baik";
        } else if (nAkhir > 56) {
            index = 'C';
            keterangan = "Cukup";
        } else if (nAkhir > 45) {
            index = 'D';
            keterangan = "Kurang";
        } else if (nAkhir <= 45) {
            index = 'E';
            keterangan = "Sangat Kurang";
        }   
        System.out.println("Index = "+index);
        System.out.println("Keterangan = "+keterangan);
    }       
}
public class Nilaimahasiswa10116551 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mahasiswa mhs = new mahasiswa();
        mhs.nama = "Divian Ajie Permana";
        mhs.nim = "10116551";
        mhs.setNQuis(75);
        mhs.setNUts(45);
        mhs.setNUas(34);
        
        for (int i = 1; i < 5; i++) {
            System.out.println("Nama ke " + i + "\t\t= " + mhs.nama);
        }

        for (int j = 8; j >= 1; j--) {
            System.out.println("NIM ke " + j + "\t\t= " + mhs.nim+j);
            
        }
        System.out.println("\nQuiz        = "+mhs.getNQuis());
        System.out.println("UTS         = "+mhs.getNUts());
        System.out.println("UAS         = "+mhs.getNUas());
        
        System.out.println("\nNilai Akhir       = "+mhs.nAkhir(mhs.getNQuis(), mhs.getNUts(), mhs.getNUas()));
        mhs.HIndex(mhs.nAkhir(mhs.getNQuis(), mhs.getNUts(), mhs.getNUas()));
        
        
    }
    
}
