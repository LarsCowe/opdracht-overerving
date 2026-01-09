public class main {
    public static void main(String[] args) {
        Dier mijnDier = new Dier("Onbekend", 5);
        mijnDier.maakGeluid();

        Kat mijnKat = new Kat("Felix", 3, "Siamees");
        mijnKat.maakGeluid();
        System.out.println("De soort van " + mijnKat.naam + " is " + mijnKat.getSoort());
    }
}
