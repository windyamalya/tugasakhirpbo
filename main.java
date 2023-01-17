package windi;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        datapenitip a = new datapenitip();
        petugas b = new petugas();
        motor c = new motor();

        int menu;
        do {
            System.out.println("-------------------------------------");
            System.out.println("|     PROGRAM PENITIPAN MOTOR        |");
            System.out.println("---------------------------------------");
            System.out.println("1.DATA PENITIP");
            System.out.println("2.DATA MOTOR");
            System.out.println("3.DATA PETUGAS");
            System.out.println("4.DATA YANG TELAH DIINPUT");
            System.out.println("5.STRUK");
            System.out.println("6.EXIT");
            System.out.print("MASUKAN PILIHAN ANDA = ");
            menu = input.nextInt();
            if (menu == 1) {
                System.out.println("============================");
                System.out.println("MASUKAN DATA PENITIP");
                System.out.println("============================");
                a.datapenitip();
            } else if (menu == 2) {
                System.out.println("============================");
                System.out.println("MASUKAN DATA MOTOR");
                System.out.println("============================");
                c.motor();
            } else if (menu == 3) {
                System.out.println("============================");
                System.out.println("MASUKAN DATA PETUGAS");
                System.out.println("============================");
                b.petugas();
            } else if (menu == 4) {
                System.out.println("============================");
                System.out.println("    DATA YANG DIINPUTKAN");
                System.out.println("=============================");
                a.output();
                System.out.println("-----------------------------");
                b.output();
                System.out.println("-----------------------------");
                c.output();
            } else if (menu == 5) {
                try{
                    FileWriter fileWriter = new FileWriter("struk.txt");
                    fileWriter.write("============================\n");
                    fileWriter.write("STRUK PENITIPAN SEPEDA MOTOR\n");
                    fileWriter.write("============================\n");
                    a.id();
                    fileWriter.write("\nNAMA PENITIP    = "+a.nama);
                    fileWriter.write("\nALAMAT PENITIP  = "+a.alamat);
                    fileWriter.write("\nNO HP PENITIP   = "+a.nohp);
                    fileWriter.write("\nJENIS KELAMIN   = "+a.jk);
                    fileWriter.write("\nNAMA PETUGAS    = "+b.nmptgs);
                    fileWriter.write("\nNO HP PETUGAS   = "+b.nohp_petugas);
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("Struk Gagal Dibuat");
                }
            } else if (menu == 6) {
                System.out.println("TERIMAKASIH TELAH BERKUNJUNG");
                break;
            } else {
                System.out.println("DATA EROR 404.!!!!!");
            }
        }while (menu!=7);

    }
}
