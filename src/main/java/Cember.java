public class Cember extends Sekil {

    private double yaricap;

    public Cember(double yaricap){
        this.yaricap = yaricap;
    }
    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }


    @Override
    public double alanHesapla() {
        double alan = Util.PI_SAYİSİ * yaricap * yaricap;
        return alan;
    }

    @Override
    public double cevreHesapla(){
        double cevre = 2*Util.PI_SAYİSİ * yaricap;
        return cevre;
    }
}
