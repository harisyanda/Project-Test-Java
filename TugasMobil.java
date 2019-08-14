/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Harisyanda
 */
    class Mobil{
 
     
            String NamaPemilik;
            String MerkMobil;
            String WarnaMobil;
            int TahunPembuatan;
            Mobil (String nama, String merk, String warna, int tahun){
                NamaPemilik = nama;
                MerkMobil = merk;
                WarnaMobil = warna;
                TahunPembuatan = tahun;
                
            }
        }

class DataMobil {
    public static void main(String[] args){    
        
    
        

    
            Mobil[] m = new Mobil[5];
            m[0] = new Mobil("Aceng Fikri","Honda Jazz","Blue Marine",2018);
            m[1] = new Mobil("Budi Gunawan","Toyota Avanza","White",2016);
            m[2] = new Mobil("Cantika Dewi","Daihatsu Agya","Silver",2018);
            m[3] = new Mobil("Deni Supriadi","Mitsubishi Xpander","Red",2019);
            m[4] = new Mobil("Endank Soeharto","Nissan Evalia","Black",2016);

            for(int i = 0;i < m.length;i++)
                        
            
            System.out.println('\n'+ "Nama Pemilik :" + m[i].NamaPemilik + '\n' + 
                               "Merk Mobil :" + m[i].MerkMobil + '\n'+
                               "Warna Mobil :" + m[i].WarnaMobil + '\n' +
                               "Tahun Pembuatan :" + m[i].TahunPembuatan);
                
            
            
        }
}

