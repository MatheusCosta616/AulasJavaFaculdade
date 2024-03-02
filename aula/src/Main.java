public class Main {
    public static void main(String[] args) {

        Soma soma = new Soma();
        Calculadoras calculadora = new Calculadoras();

        System.out.println("EX 1");
        System.out.println(soma.somando());
        System.out.println("***************************");
        System.out.println("EX 2");
        System.out.println(soma.umAoVinte());
        System.out.println("***************************");
        System.out.println("EX 3");
        System.out.println(soma.umAoVinteFor());
        System.out.println("****************************");

        System.out.println("OUTROS EX");
        System.out.println("EX1");
        System.out.println(calculadora.produtoImpar());
        System.out.println("****************************");
        System.out.println("EX 2");
        System.out.println(calculadora.fatorial());
        System.out.println("****************************");
    }
}