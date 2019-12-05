public class Kare extends Sekil{

    public double kenarUzunlugu;

    public Kare(double kenarUzunlugu){
        this.kenarUzunlugu = kenarUzunlugu;
    }
    @Override
    public double alanHesapla() {
        return this.kenarUzunlugu * this.kenarUzunlugu;
    }

    @Override
    public double cevreHesapla() {
        return  2 * (kenarUzunlugu + kenarUzunlugu);
    }
}
