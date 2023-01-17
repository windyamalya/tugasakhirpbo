package windi;

import java.util.Scanner;

public class motor extends penitipan implements titip{
    @Override
    public void motor() {
        Scanner c = new Scanner(System.in);
        System.out.println("NAMA MOTOR = ");
        jenismtr = c.next();
        System.out.println("WARNA      = ");
        warna = c.next();
        System.out.println("PLAT MOTOR = ");
        idmotor = c.next();

    }
    public void output(){
        System.out.println("NAMA MOTOR   = "+jenismtr);
        System.out.println("PLAT NOMOR   = "+idmotor);
        System.out.println("WARNA        = "+warna);
    }

    @Override
    public void datapenitip() {

    }

    @Override
    public void petugas() {

    }
}
