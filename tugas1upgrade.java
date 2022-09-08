import java.util.Scanner;

public class tugas1upgrade {
    public static void main(String[] args) {
        Scanner topo = new Scanner(System.in);

        //Memori
        String nama, nim, jurusan, angkatan, grade;
        int nilaiPres, nilaiTugas, nilaiUts, nilaiUas;
        double nilaiAkhir;

        //Input Data
        System.out.println("------------------------------------------------");
        System.out.println("                  Input Data");
        System.out.println("------------------------------------------------");
        System.out.print("Masukkan NIM anda : ");
        nim = topo.nextLine();
        System.out.print("Masukkan Nama anda : ");
        nama = topo.nextLine();
        System.out.println(" ");
        System.out.println("Masukkan nilai tugas mata kuliah pemrograman berorientasi objek : ");
        System.out.print("1. Nilai Prensensi : ");
        nilaiPres = topo.nextInt();
        System.out.print("2. Nilai Tugas : ");
        nilaiTugas = topo.nextInt();
        System.out.print("3. Nilai UTS : ");
        nilaiUts = topo.nextInt();
        System.out.print("4. Nilai UAS : ");
        nilaiUas = topo.nextInt();

        //Pengoperasian nilai
        nilaiAkhir = (0.1 * nilaiPres) + (0.2 * nilaiTugas) + (0.3 * nilaiUts) + (0.4 * nilaiUas);
        angkatan = nim.substring(0, 4);
        if (nim.substring(4,6).equals("07")) {
            jurusan = "Informatika";
        }else {
            jurusan = "Tidak ada";
        }

        //Hasil Output Data
        System.out.println("------------------------------------------------");
        System.out.println("Nilai Mata kuliah pemrograman berorientas objek:");
        System.out.println("------------------------------------------------");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan : "+ jurusan);
        System.out.println("Angkatan : " + angkatan);
        System.out.println(" ");
        System.out.println("1. Nilai Presensi: " + nilaiPres);
        System.out.println("2. Nilai Tugas: " + nilaiTugas);
        System.out.println("3. Nilai UTS: " + nilaiUts);
        System.out.println("4. Nilai UAS: " + nilaiUas);
        System.out.printf("5. Nilai Akhir: " + nilaiAkhir);

        System.out.println(" ");
        if (nilaiAkhir >= 80) {
            grade = "A";
        } else if (nilaiAkhir >= 70) {
            grade = "B";
        } else if (nilaiAkhir >= 60) {
            grade = "C";
        } else if (nilaiAkhir >= 50) {
            grade = "D";
        }else {
            grade = "E";
        }
        System.out.println("Grade : " + grade);
    }
}
