public class Kat extends Dier {
    private String soort;

    public Kat(String naam, int leeftijd, String soort) {
        super(naam, leeftijd);
        this.soort = soort;
    }

    @Override
    public void maakGeluid() {
        System.out.println(naam + " de kat zegt: Miauw!");
    }

    public String getSoort() {
        return soort;
    }
}
