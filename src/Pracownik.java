public class Pracownik {
    private String imie;
    private String nazwisko;
    private char plec;
    private int nr_dzialu;
    private float placa;
    private int wiek;
    private int dzieci;
    private boolean stan_cywilny;

    public void wyswietl() {

    }

    public void wyswietlINP() {

    }

    public void wyswietlIN() {

    }

    public boolean czyPensjaPowyzej(float pensja) {
        return true;
    }

    public void podwyzka(int procent) {

    }

    public Pracownik() {
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public char getPlec() {
        return plec;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public int getNr_dzialu() {
        return nr_dzialu;
    }

    public void setNr_dzialu(int nr_dzialu) {
        this.nr_dzialu = nr_dzialu;
    }

    public float getPlaca() {
        return placa;
    }

    public void setPlaca(float placa) {
        this.placa = placa;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getDzieci() {
        return dzieci;
    }

    public void setDzieci(int dzieci) {
        this.dzieci = dzieci;
    }

    public boolean isStan_cywilny() {
        return stan_cywilny;
    }

    public void setStan_cywilny(boolean stan_cywilny) {
        this.stan_cywilny = stan_cywilny;
    }
}
