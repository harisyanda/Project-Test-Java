/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Harisyanda
 */
class SetGetMobil {


            String NamaPemilik;
            String MerkMobil;
            String WarnaMobil;
            int TahunPembuatan;
            String PlatNomer;
                SetGetMobil (String nama, String merk, String warna, int tahun){
                NamaPemilik = nama;
                MerkMobil = merk;
                WarnaMobil = warna;
                TahunPembuatan = tahun;

            }
    
    public String getPlatNomer() {
        return PlatNomer;
    }

    public void setPlatNomer(String PlatNomer) {
        this.PlatNomer = PlatNomer;
    }

            
            
}


class HasilSetGet {
    public static void main (String[] args){
        
        SetGetMobil[] m = new SetGetMobil[5]; 
            m[0] = new SetGetMobil("Aceng Fikri","Honda Jazz","Blue Marine",2018);
            m[0].setPlatNomer("B 3429 EAZ");
            
            m[1] = new SetGetMobil("Budi Gunawan","Toyota Avanza","White",2016);
            m[1].setPlatNomer("B 3049 ELX");
            
            m[2] = new SetGetMobil("Cantika Dewi","Daihatsu Agya","Silver",2018);
            m[2].setPlatNomer("B 2018 KAU");
            
            m[3] = new SetGetMobil("Deni Supriadi","Mitsubishi Xpander","Red",2019);
            m[3].setPlatNomer("B 8234 JFW");
            
            m[4] = new SetGetMobil("Endank Soeharto","Nissan Evalia","Black",2016);
            m[4].setPlatNomer("B 2148 QWR");
            
            for(int i = 0;i < m.length;i++)
                        
            
            System.out.println('\n'+ "Nama Pemilik :" + m[i].NamaPemilik + '\n' + 
                               "Merk Mobil :" + m[i].MerkMobil + '\n'+
                               "Warna Mobil :" + m[i].WarnaMobil + '\n' +
                               "Tahun Pembuatan :" + m[i].TahunPembuatan + '\n' +
                               "Plat Nomer :" + m[i].PlatNomer);
    
    }
}