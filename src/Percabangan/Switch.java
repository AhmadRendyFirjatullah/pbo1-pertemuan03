package Percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs     : \"Terima Kasih Pak\"");
                System.out.println("Mhs     : \"Selamat Ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs     : \"Kenapa ulun kada dapat A, Pak?\"");
                System.out.println("Dosen   : \"!@#$%\"");
                break;
            case 'C':
                System.out.println("Mhs     : \"Ulun turun Full pak ai, tugas Full jua\"");
                System.out.println("Dosen   : \"Tapi bisa lah menjawab ujian?\"");
                System.out.println("Mhs     : \"hihihi...\"");
                break;
            default:
                System.out.println("Mhs     : \"Ulun turun Full pak ai, tugas Full jua\"");
                System.out.println("Dosen   : \"Bujur jua kah?\"");
                System.out.println("Dosen   : \"Memeriksa berkas\"");
                System.out.println("Dosen   : \"Menceleng\"");
                System.out.println("Mhs     : \"kabur...\"");
                break;
        }
    }
}
