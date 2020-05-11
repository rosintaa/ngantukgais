import static java.lang.Math.*;


public class Bumi extends Bola implements Runnable{
double kala_rotasi = 23.93;
double kala_revolusi = 8740.672;
double panjang_orbit = 937.0*1000000;
public double kec_rotasi(){
return super.getKeliling()/kala_rotasi;
}
public double kec_revolusi() {
return panjang_orbit/kala_revolusi;
}
public void run(){
super.setJari_jari(6371);//jari jari bumi
System.out.println("==================BUMI===============");
System.out.println("Panjang Lintasan Rotasi Bumi : " + super.getKeliling());
System.out.println("Luas Permukaan Bumi : "+super.getLuas_permukaan());
System.out.println("Volume planet Bumi : "+super.getVolume());
System.out.println ("Kecepatan Rotasi Bumi :" + kec_rotasi());
System.out.println ("Kecepatan Revolusi Bumi :" + kec_revolusi());
}
}