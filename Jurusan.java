/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harisyanda
 */
public class Jurusan extends Sekolah {
       String NamaJurusan;
       int JumlahKelas;
       String KepalaJurusan;
       Jurusan (String NSekolah, String ASekolah,int JJurusan,String TSekolah, String NJurusan, int JKelas){
           super (NSekolah, ASekolah, JJurusan, TSekolah);
           NamaJurusan = NJurusan;
           JumlahKelas = JKelas;
           
       }

    public String getKepalaJurusan() {
        return KepalaJurusan;
    }

    public void setKepalaJurusan(String KepalaJurusan) {
        this.KepalaJurusan = KepalaJurusan;
    }
      
}
