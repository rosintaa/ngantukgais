import static java.lang.Math.*;


public class Mars extends Bola implements Runnable{
double kala_rotasi = 24.65;
double kala_revolusi = 16439.91;
double orbit = 937.0*1000000;
public double kec_rotasi(){
return super.getKeliling()/kala_rotasi;
}
public double kec_revolusi() {
return orbit/kala_revolusi;
}
public void run(){
super.setJari_jari(6371);//jari jari 
System.out.println("==================MARS==============");
System.out.println("Panjang Lintasan Rotasi Mars : " + super.getKeliling());
System.out.println("Luas Permukaan Mars : "+super.getLuas_permukaan());
System.out.println("Volume planet Mars : "+super.getVolume());
System.out.println ("Kecepatan Rotasi Mars :" + kec_rotasi());
System.out.println ("Kecepatan Revolusi Mars :" + kec_revolusi());
}
}