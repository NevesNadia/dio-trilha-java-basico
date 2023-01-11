import javax.lang.model.util.ElementScanner14;

public class Operadores {
    
    public static void main(String[] args){
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        //x repeticao
        numero++;

        System.out.println(numero);

        System.out.println( --  numero);

        boolean variavel = true;

        System.out.println(!variavel);

        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);

        int a,b;

        a=5;
        b=6;

        String resultado = " ";

        if (a==b) {
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        } 
        System.out.println(resultado);    
        
        int c,d;
        c=4;
        d=3;

        String comparação = c>=d ? "Maior" : "Menor";

        System.out.println(comparação);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);
        
    
    
    
    }
}
