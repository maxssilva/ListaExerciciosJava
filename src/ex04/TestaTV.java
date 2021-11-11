package ex04;

public class TestaTV {
    public static void main(String[] args) {
        Televisao t1 = new Televisao();
        t1.aumentaVolume();
        t1.aumentaCanal();
        t1.aumentaVolume();
        t1.aumentaVolume();
        t1.consultaStatusTv();
        t1.diminuiVolume();
        t1.diminuiVolume();
        t1.diminuiVolume();
        t1.trocaCanal(5);
        t1.trocaCanal(99);
        t1.consultaStatusTv();
        t1.trocaCanal(000);

        t1.consultaStatusTv();
        t1.diminuiVolume();
        t1.diminuiVolume();
        t1.diminuiVolume();
        t1.diminuiVolume();
        t1.diminuiVolume();
        t1.consultaStatusTv();
        t1.aumentaVolume();
        t1.aumentaVolume();
        t1.aumentaVolume();
        t1.aumentaCanal();
        t1.aumentaVolume();
        t1.diminuiCanal();
        t1.trocaCanal(12);
        t1.consultaStatusTv();
    }}