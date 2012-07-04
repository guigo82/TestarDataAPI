package teste.com.bairos;

/**
 *
 * @author Rodrigo Bairos
 */
import api.com.bairos.Datas;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        //Teste metodo getDateFlexLocale(data, Linguagem, Local)
        System.out.println("Test1- Type a date to convert:");
        String data = teclado.next();
        System.out.println("Test1- Type a encoding ISO to language:");
        String Linguagem = teclado.next();
        System.out.println("Test1- Type a encoding ISO to country:");
        String Local = teclado.next();
        String Resultado = new Datas().getDateFlexLocale(data, Linguagem, Local);
        System.out.println("Result of test1: "+Resultado);

        //Teste metodo getExtensiveDateFlexLocale(data, Linguagem, Local)
        System.out.println("Test2- Type a date to convert in extense format:");
        String data2 = teclado.next();
        System.out.println("Test2- Type a encoding ISO to language:");
        String Linguagem2 = teclado.next();
        System.out.println("Test2- Type a encoding ISO to country:");
        String Local2 = teclado.next();
        String Resultado2 = new Datas().getExtensiveDateFlexLocale(data2, Linguagem2, Local2);
        System.out.println("Result of test2: "+Resultado2);

        //Teste metodo getDateFlexLocale(data, Linguagem, Local)
        System.out.println("Test3- Type a date to convert:");
        String data3 = teclado.next();
        System.out.println("Test3- Type a preset locale:");
        String Loc3 = teclado.next();
        Locale Local3 = new Locale(Loc3);
        String Resultado3 = new Datas().getDatePresetLocale(data3, Local3);
        System.out.println("Result of test3: "+Resultado);

        //Teste metodo getExtensiveDateFlexLocale(data, Linguagem, Local)
        System.out.println("Test4- Type a date to convert in extense format:");
        String data4 = teclado.next();
        System.out.println("Test4- Type a preset locale:");
        String Loc4 = teclado.next();
        Locale Local4 = new Locale(Loc4);
        String Resultado4 = new Datas().getExtensiveDatePresetLocale(data4, Local4);
        System.out.println("Result of test4: "+Resultado2);
    }
}
