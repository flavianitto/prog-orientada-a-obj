import java.util.ArrayList;
import java.util.Scanner;

public class Rota {
    ArrayList<String> paradas;
    private String origem;
    private String destino;
    private int codigo;
    private int codbus;
    private double preco;
    private String motoristaRota;


    Data dataC = new Data();
    Data dataS = new Data();

    Scanner sc = new Scanner(System.in);


    public double getPreco() {
        return preco;
    }

    public String getMotoristaRota() {
        return motoristaRota;
    }

    public void setMotoristaRota(String motoristaRota) {
        this.motoristaRota = motoristaRota;
    }

    public void setPreco(double preco, int quantParadas) {
        this.preco = preco-(quantParadas*0.1*preco); //3 paradas = 30% de desconto
    }

    public String getOrigem() {
        return this.origem;
    }

    public int getCodbus() {
        return this.codbus;
    }

    public void setCodbus(int codbus) {
        this.codbus = codbus;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public ArrayList<String> getParadas() {
        return this.paradas;
    }

    public void setParadas(ArrayList<String> paradas) {
        this.paradas = paradas;
    }

    public void cadastraParadas(int qtdParadas) {
        String parada;
        int i;
        paradas = new ArrayList<>();
        if(qtdParadas > 3 || qtdParadas < 0) {
            System.out.println("\nNúmero inválido de paradas!");
        }
        else {
            for(i=0; i<qtdParadas; i++) {
                System.out.printf("Parada " + (i+1) + ": ");
                parada = sc.nextLine();
                paradas.add(parada);
            }            
        }
    }

    public void editaParadas(int qtdParadas) {
        String parada;
        int i;
        if(qtdParadas > 3 || qtdParadas < 0) {
            System.out.println("\nNúmero inválido de paradas!");
        }
        else {
            for(i=0; i<qtdParadas; i++) {
                System.out.printf("Insira a nova parada " + (i+1) + ": ");
                parada = sc.nextLine();
                paradas.set(i, parada);
            }        
        }
    }

    public Rota() {} //construtor vazio

    public Rota(int codigo, String origem, String destino, ArrayList<String> paradas,int codbus, int diaS, int mesS, int anoS, int horaS, int minS, int diaC, int mesC, int anoC, int horaC, int minC) {
        setCodigo(codigo);
        setOrigem(origem);
        setDestino(destino);
        setParadas(paradas);
        setCodbus(codbus);
        dataS.setData(diaS, mesS, anoS);
        dataS.setHorario(horaS, minS);
        dataC.setData(diaC, mesC, anoC);
        dataC.setHorario(horaC, minC);
    }
}
