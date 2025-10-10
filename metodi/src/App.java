import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int input = 0;
        System.out.println("Anna minulle luku, jonka kerron tuhannella.");
        input = Integer.parseInt(in.nextLine());

        ekaMetodi();
        tokaMetodi(input);// Teht 3 done
        int p = 0;
        int l = 0;
        System.out.println("Kerro minulle pituus: ");
        p = Integer.parseInt(in.nextLine());
        System.out.println("Kerro minulle leveys: ");
        l = Integer.parseInt(in.nextLine());

        neljMetodi(p,l);

    } // End of main
    public static void ekaMetodi() 
    {
        System.out.println("Metodi-Harjoituksia");
    } // Teht 1 metodi
    public static void tokaMetodi(int tulo)
    {
        int kertoma = tulo * 1000;
        System.out.println("Tulos on: " + kertoma);
    } // Teht 2 metodi 
    public static void neljMetodi(int pituus, int leveys)
    {
        int pintaala = pituus * leveys;
        System.out.println("Pintaala on: " + pintaala);
    }
}
