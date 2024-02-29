import java.util.Scanner;

public class Estudante {
    float cp1;
    float cp2;
    float cp3;
    float cpGeral;
    float gs;
    float gsTotal;
    float faltas;
    float cp1Seg;
    float cp2Seg;
    float cp3Seg;
    float cpGeral2;
    float gsSeg;
    float gsSegTotal;
    float faltasSeg;
    float ms1;
    float ms2;
    float anual;

    public Estudante() {
        this.cpGeral = 0.0f;
        this.cpGeral2 = 0.0f;
        this.gs = 0.0f;
        this.gsSeg = 0.0f;
        this.ms1 = 0.0f;
        this.ms2 = 0.0f;
        this.anual = 0.0f;
    }

    public float calculadoraCp(float cp1, float cp2, float cp3){
        return (((cp1 + cp2 + cp3) / 3) * 0.4f);
    }

    public float calcularGs(float gs){
        return gs * 0.6f;
    }

    public float calcularMediaSemestral(float cpGeral, float gsTotal){
        return cpGeral + gsTotal;
    }

    public float calcularMediaAnual(float ms1, float ms2){
        return (ms1 * 0.4f) + (ms2 * 0.6f);
    }

    void lerNotasDoEstudantes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Semestre 1");
        System.out.println("Checkpoint 1: ");
        this.cp1 = scanner.nextFloat();
        System.out.println("Checkpoint 2: ");
        this.cp2 = scanner.nextFloat();
        System.out.println("Checkpoint 3: ");
        this.cp3 = scanner.nextFloat();
        System.out.println("Quanto você tirou na Global Solution: ");
        this.gs = scanner.nextFloat();

        this.cpGeral = calculadoraCp(cp1, cp2, cp3);
        this.gsTotal = calcularGs(gs);
        this.ms1 = calcularMediaSemestral(cpGeral, gsTotal);

        System.out.println("Sua média dos CheckPoints foi: " + cpGeral);
        System.out.println("Sua média das Global Solutions foi: " + gsTotal);
        System.out.println("Sua média Semestral no primeiro semestre foi de: " + ms1);

        System.out.println("Semestre 2");
        System.out.println("Checkpoint 1: ");
        this.cp1Seg = scanner.nextFloat();
        System.out.println("Checkpoint 2: ");
        this.cp2Seg = scanner.nextFloat();
        System.out.println("Checkpoint 3: ");
        this.cp3Seg = scanner.nextFloat();
        System.out.println("Quanto você tirou na Global Solution: ");
        this.gsSeg = scanner.nextFloat();

        this.cpGeral2 = calculadoraCp(cp1Seg, cp2Seg, cp3Seg);
        this.gsSegTotal = calcularGs(gsSeg);
        this.ms2 = calcularMediaSemestral(cpGeral2, gsSegTotal);
        this.anual = calcularMediaAnual(ms1, ms2);

        System.out.println("Sua média dos CheckPoints foi: " + cpGeral);
        System.out.println("Sua média das Global Solutions foi: " + gsTotal);
        System.out.println("Sua média Semestral no primeiro semestre foi de: " + ms1);

        System.out.println("Sua média dos CheckPoints2 foi: " + cpGeral2);
        System.out.println("Sua média das Global Solutions2 foi: " + gsSegTotal);
        System.out.println("Sua média Semestral no segundo semestre foi de: " + ms2);

        System.out.println("Sua média anual foi de: " + anual);

    }
}