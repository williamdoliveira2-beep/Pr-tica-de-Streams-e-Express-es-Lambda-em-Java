import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio {
    public static void main(String[] args){
//        Mutiplica mutiplicar = a -> {
//            if(a <= 1) return false;
//            for(int i = 2; i < Math.sqrt(a); i++){
//                if(a % i == 0) return false;
//            }
//            return true;
//        };
//        System.out.println(mutiplicar.multiplicacao(2));
//        Maiuscula maiuscula = a -> a.toUpperCase();
//        System.out.println(maiuscula.escrever("sei al"));

//        Palindromo palindromo = a -> a.equals(new StringBuilder(a).reverse().toString());
//        System.out.println(palindromo.verificarPalindromo("ovo"));

//        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        lista.replaceAll(l -> l *3);
//        System.out.println(lista);

//        List<String> palavras = Arrays.asList("b","d", "c", "f", "e", "a");
//        palavras.sort((a,b) -> a.compareTo(b));
//        System.out.println(palavras);

        Divisor divisor = ((num1, num2) -> num1 /  num2 );
        try{
            System.out.println(divisor.divide(10, 2));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        //eu quero gastarDinehrio
    }
}
