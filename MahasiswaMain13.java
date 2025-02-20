public class MahasiswaMain13 {  

    String nama;  
    String nim;  
    String kelas;  
    double ipk;  

    public MahasiswaMain13() {
    }

    public MahasiswaMain13(String nama, String nim, double ipk, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kelas;
    }

    void tampilkanInformasi() {  
        System.out.println("Nama: " + nama);  
        System.out.println("NIM: " + nim);  
        System.out.println("IPK: " + ipk);  
        System.out.println("Kelas: " + kelas);  
    }  
 
    void ubahKelas(String kelasBaru) {  
        kelas = kelasBaru;  
    }  

    void updateIPK(double ipkBaru) {  
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {  
            ipk = ipkBaru;  
        } else {  
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");  
        }  
    }  
 
    String nilaiKinerja() {  
        if (ipk >= 3.5) {  
            return "Kinerja sangat baik";  
        } else if (ipk >= 3.0) {  
            return "Kinerja baik";  
        } else if (ipk >= 2.0) {  
            return "Kinerja cukup";  
        } else {  
            return "Kinerja kurang";  
        }  
    }  

    public static void main(String[] args) {  
         
        MahasiswaMain13 mhs1 = new MahasiswaMain13();  
        mhs1.nama = "Muhammad Ali Farhan";  
        mhs1.nim = "2241720117";  
        mhs1.kelas = "SI 2J";  
        mhs1.ipk = 3.55;  
 
        mhs1.tampilkanInformasi();  
        mhs1.ubahKelas("SI 2K");  
        mhs1.updateIPK(3.60);  
        mhs1.tampilkanInformasi();  

        MahasiswaMain13 mhs2 = new MahasiswaMain13("Annisa Nabila","2141720160", 3.25,"TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();
         
    }  
}