package windi;
import java.util.Scanner;

public class petugas extends penitipan implements titip{
    @Override
    public void datapenitip() {

    }

    @Override
    public void petugas() {
        Scanner b = new Scanner(System.in);
        System.out.println("ID PETUGAS   = ");
        idptgs = b.nextInt();
        System.out.println("NAMA PETUGAS = ");
        nmptgs = b.next();
        System.out.println("NO HP PETUGAS = ");
        nohp_petugas = b.next();
    }

    @Override
    public void motor() {

    }

    public void output(){
        System.out.println("NAMA PETUGAS = "+nmptgs);
        System.out.println("ID PETUGAS   = "+idptgs);
        System.out.println("NO HP PETUGAS= "+nohp_petugas);
    }
}
