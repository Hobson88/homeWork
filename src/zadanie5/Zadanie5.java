package zadanie5;
//Autor: Robert Krawczak
public class Zadanie5 {
    public static void main(String[] args) {

        int amplituda = 20;
        int ileKrokowNaPelnyKat = 20;
        int liczbaWierszy = 60;


        //zaklęcie :)
        for (int i = 0; i < liczbaWierszy; i++) {
            //   Math.sin(90*Math.PI/180)=1.0   ;
            int j = (int) (amplituda * Math.sin((360 / ileKrokowNaPelnyKat) * i * Math.PI / 180) + amplituda+1);
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
