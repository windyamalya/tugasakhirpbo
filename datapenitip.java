package windi;

import java.util.Scanner;

public class datapenitip extends penitipan implements titip{
    Scanner a = new Scanner(System.in);

    @Override
    public void datapenitip() {
        System.out.println("ID PENITIPAN = ");
        idpenitip = a.next();
        System.out.println("NAMA = ");
        nama = a.next();
        System.out.println("ALAMAT = ");
        alamat = a.next();
        System.out.println("NO HP = ");
        nohp = a.next();
        System.out.println("JENIS KELAMIN = ");
        jk  = a.next();
    }

    @Override
    public void petugas() {

    }

    @Override
    public void motor() {

    }


    public void output(){
        System.out.println("NAMA PENITIP  = "+nama);
        System.out.println("ID PENITIP    = "+idpenitip);
        System.out.println("ALAMAT        = "+alamat);
        System.out.println("NO HP         = "+nohp);
        System.out.println("JENIS KELAMIN = "+jk);
    }

    public void id() {
    }
}
