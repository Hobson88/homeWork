package zadanie5;

public class Zadanie5 {
    public static void main(String[] args) {
        int amplituda = 10;
        int ileKrokowNaPelnyKat = 40;
        int liczbaWierszy = 80;

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
