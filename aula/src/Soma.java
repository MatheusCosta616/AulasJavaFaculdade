public class Soma {
    public static int somando(){
        int soma = 0;

        for(int cont = 1; cont < 100; cont += 1){
            if (cont % 2 == 1) {
                soma += cont;
            };
        }
        return soma;
    }
    public static int umAoVinte(){
        int cont = 1;
        while(cont <= 19){
            System.out.println(cont);
            cont ++;
        }
        return cont;
    }

    public static int umAoVinteFor() {
        int cont;
        for (cont = 1; cont <= 19; cont += 1) {
            System.out.println(cont);
        }
        return cont;
    }
}
