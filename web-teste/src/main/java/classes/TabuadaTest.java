package classes;

public class TabuadaTest {

    public static void main(String[] args) {
        Tabuada tabuada = new Tabuada();
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada.calcular(i));
        }
        

    }

}
