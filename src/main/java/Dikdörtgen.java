public class Dikdörtgen extends Sekil {

    private double uzunKenarUzunlugu;
    private double kisaKenarUzunlugu;

    public Dikdörtgen(double uzunKenarUzunlugu, double kisaKenarUzunlugu){
        this.uzunKenarUzunlugu = uzunKenarUzunlugu;
        this.kisaKenarUzunlugu = kisaKenarUzunlugu;
    }
    public double alanHesapla() {
        return this.kisaKenarUzunlugu;
    }

    public double getUzunKenarUzunlugu() {
        return uzunKenarUzunlugu;
    }

    public void setUzunKenarUzunlugu(double uzunKenarUzunlugu) {
        this.uzunKenarUzunlugu = uzunKenarUzunlugu;
    }

    public double getKisaKenarUzunlugu() {
        return kisaKenarUzunlugu;
    }

    public void setKisaKenarUzunlugu(double kisaKenarUzunlugu) {
        this.kisaKenarUzunlugu = kisaKenarUzunlugu;
    }

    public double cevreHesapla() {
        return 2* (kisaKenarUzunlugu * uzunKenarUzunlugu);
    }
}
