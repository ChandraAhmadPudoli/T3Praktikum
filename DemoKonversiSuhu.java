public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();
        double celcius = 100;
        double fahrenheit = konversi.celciusToFahrenheit(celcius);
        double reamur = konversi.celciusToFahrenheit(celcius);
        double fahrenheitToReamur = konversi.fahrenheitToReamur(fahrenheit);

        System.out.println("Celcius: " + celcius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Reamur: " + reamur);
        System.out.println("Fahrenheit to Reamur: " + fahrenheitToReamur);
    }
}
