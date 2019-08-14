/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Harisyanda
 */
public class ExtandJurusan {
        public static void main (String[] args){
        
        Jurusan[] j = new Jurusan[3];
        
               j[0] = new Jurusan("Nusa Bangsa School","Depok",3,"0218005886","Teknik Komputer Jaringan",3);
               j[0].setKepalaJurusan("Haris");
               
               j[1] = new Jurusan("Nusa Bangsa School","Depok",3,"0218005886","Rekayasa Perangkat Lunak",2);
               j[1].setKepalaJurusan("Alfa");
               
               j[2] = new Jurusan("Nusa Bangsa School","Depok",3,"0218005886","Multimedia",3);
               j[2].setKepalaJurusan("Ryan");
               
         
               for(int i = 0;i < j.length;i++)
                 
                        
            
          System.out.println('\n'+ "Nama Sekolah :" + j[i].NamaSekolah + '\n' + 
                               "Alamat Sekolah :" + j[i].AlamatSekolah + '\n'+
                               "Jumlah Jurusan :" + j[i].JumlahJurusan + '\n' +
                               "Nomer Telp Sekolah :" + j[i].NomerTelepon + '\n' +
                               "Nama Jurusan :" + j[i].NamaJurusan + '\n' +
                               "Jumlah Kelas :" + j[i].JumlahKelas + '\n' +
                               "Kepala Jurusan :" + j[i].KepalaJurusan); 
    
    



    }
}