public class Ucgen extends Sekil{

    public double ucgenBirinciKenar;
    public double tabanKenariUzunlugu;
    public double ucgenUcuncuKenar;

    public double yukseklik;

    public Ucgen(double ucgenBirinciKenar, double tabanKenariUzunlugu, double ucgenUcuncuKenar, double yukseklik){
        this.ucgenBirinciKenar = ucgenBirinciKenar;
        this.tabanKenariUzunlugu = tabanKenariUzunlugu;
        this.ucgenUcuncuKenar = ucgenUcuncuKenar;
        this.yukseklik = yukseklik;
    }

    public double alanHesapla() {
        return this.tabanKenariUzunlugu * this.yukseklik / 2;
    }

    public double cevreHesapla() {
        return ucgenBirinciKenar + tabanKenariUzunlugu + ucgenUcuncuKenar;
    }
}
