package Package3;

public class Main {
    private String nachname;

    public static void main(String[] args) {
        String Name = "Dennis Cetin";
        int Alter = 25;

        /*String Fachhochschule Kufstein Tirol = "Fachhochschule Kufstein Tirol" _ hier mache ich eine neue Wertzuweisung*/

        final String FH_KUFSTEIN_TIROL = "Fachhochschule Kufstein Tirol"; /*final verwandelt die Variable in eine Konstante um*/

        System.out.println(Name);/*Gibt den Wert String von Name aus*/
        System.out.println(Alter);/*Gibt den Wert von int Alter aus*/
        System.out.println(FH_KUFSTEIN_TIROL);/*Gibt den Wert von String fhKufsteinTirol aus*/
        System.out.println("Java verwendet für Strings \"doppelte Anführungszeichen\" und einzelne Anführungszeichen wie \'c\' um einzelne " +
                "Zeichen zu definieren"); /* Einen Backslash \ kann ich verwenden um " in einem String auszugeben*/
        System.out.println("Durch Backslash kann man auch den Backslash selbst beliebig oft ausgeben: \\\\");
        System.out.println(" Ich verwende den \b Backspace, die Newline\n und den \tTabulator"); /*Hier werden Befehle mit übergeben für Backspace
        mit b wird am Anfang eine Zeile eingerückt, für Newline mit n wird eine neue Zeile definiert und mit tTabular ein Tab eingefügt*/
        System.out.println("Verwenden Sie nun die Escape Sequenzen \f für den Seitenvorschub und \r für den Wagenrückruf");
        /*Backslash f ist in nicht bemerkbar dar dieser einen Zeilenumbruch in der Konsole bestimmt der Backslash r überschreibt
        * die bestehende Zeile mit allem was NACH r steht*/

        final String Bezeichner; /*Die Autovervollständigung genutzt und wird mit Str+Leertaste eingeleitet*/
        ;

    }

}
