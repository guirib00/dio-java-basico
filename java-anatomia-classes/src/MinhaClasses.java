public class MinhaClasses {

    public static void main(String[] args) {
        String primeiroNome = "Guilherme";
        String segundoNome = "Ribeiro";

        int anoFabricacao = 2023;

        boolean verdadeira = false;

        int numero1 = 10;
        int numero2 = 20;

        int somaNumeros = somar(numero1, numero2);

        System.out.println(somaNumeros);
        System.out.println(nomeCompleto(primeiroNome, segundoNome));

    }

    public static int somar(int n1, int n2){
        int soma = n1+n2;
        
        return soma;
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }

}