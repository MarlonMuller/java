import java.io.FileInputStream;

public class ExemploPilhaChamadas {
    public static void main(String[] args) {
        System.out.println("Inicio método main");
//        try{
            metodo1();
//        } catch (ArithmeticException e){
            System.out.println("Houve um erro ao calcular 10 / 0");
//        }

        System.out.println("Fim método main");
    }

    private static void metodo1() {
        System.out.println("Inicio método 1");
        metodo2();
        System.out.println("Fim método 1");
    }

    private static void metodo2() {
        System.out.println("Inicio método 2");
        System.out.println(10/0);
        System.out.println("Fim método 2");

        //FileInputStream input = new FileInputStream("C/users/");
    }
}
