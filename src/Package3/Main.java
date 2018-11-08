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
        System.out.println(fhKufsteinTirol);/*Gibt den Wert von String fhKufsteinTirol aus*/

        final String Bezeichner; /*Die Autovervollständigung genutzt und wird mit Str+Leertaste eingeleitet*/
        ;
    }
}
