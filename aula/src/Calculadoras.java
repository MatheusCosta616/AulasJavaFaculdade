public class Calculadoras {
    public static int produtoImpar(){
        int produto = 0;
        for (int cont = 0; cont <= 15; cont += 1){
            if (cont % 2 == 1){
                produto = cont % 2;
                System.out.println("O produto de: " + cont + " é " + produto);
            }
        }
        return produto;
    }

    public static int fatorial(){
        for(long i = 1; i <= 20; i++){
            for(long n = 0; n <= i; n++){

            }
            System.out.println(i);
        }
        int j = 0;
        return j;
    }
}
