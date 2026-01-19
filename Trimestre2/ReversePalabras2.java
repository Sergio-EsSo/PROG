package Trimestre2;

public class ReversePalabras2 {

    public static void main(String[] args) {
        
        String frase = "Hola, me llamo Luca, soy una persona algo tímida y vivo en el piso dos.";
        String[] reverso = frase.split(" "); //se trocea
        int largo = reverso.length;
        // System.out.println(largo); // 15 si se hace bien
        String[] limpio = new String[largo];

        for(int i=largo-1; i>=0; i--){
            limpio[i] = reverso[i].replaceAll("[ .,]", "");
            System.out.print(limpio[i]+" "); //Luca interpreta al Maestro Yoda
        }
    }
}