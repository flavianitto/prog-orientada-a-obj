public class Onibus {
    private int codigo;
    private String modelo;
    private int anoFabricacao;
    private String marca;
    private String nomeMotorista;
    private double km;
    private int cnhMot;
    private int assentos[][] = new int [4][10]; //onibus com 40 assentos
    
    public int getCodigo() {
        return codigo;
    }
    public String getNomeMotorista() {
        return nomeMotorista;
    }
    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }
    public int getCnhMot() {
        return cnhMot;
    }
    public void setCnhMot(int cnhMot) {
        this.cnhMot = cnhMot;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }    
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }    
    public double getKm() {
        return km;
    }
    public void setKm(double km) {
        this.km = km;
    }
    public int[][] getAssentos() {
        return assentos;
    }
    public void setAssentos(int[][] assentos) {
        this.assentos = assentos;
    }    

    //iniciando todos os assentos com 0 - não reservados
    public void iniciaAssento() {
        int i;
        int j;
        for(i=0; i<assentos.length; i++) {
            for(j=0; j<assentos[i].length; j++) {
                assentos[i][j] = 0;
            }
        }
    }
    public void reservaAssento(int n) {
        int i, j;
        int lin, col;
        lin = (n-1)/10;
        col = (n-1)%10;

        for(i=0; i<assentos.length; i++) {
            for(j=0; j<assentos[i].length; j++) {
                if(i==lin && j==col) {
                    if(assentos[i][j]==1) {
                        System.out.println("Assento ocupado!");
                    }
                    else {
                        assentos[i][j] = 1;
                    }
                }
            }
        }
    }

    public void cancelaAssento(int n) {
        int i, j;
        int lin, col;
        lin = (n-1)/10;
        col = (n-1)%10;

        for(i=0; i<assentos.length; i++) {
            for(j=0; j<assentos[i].length; j++) {
                if(i==lin && j==col) {
                    if(assentos[i][j]==0) {
                        System.out.println("Assento livre!");
                    }
                    else {
                        assentos[i][j] = 0;
                    }
                }
            }
        }
    }

    public void mostraAssentos01() {
        int i;
        int j;
        System.out.println("Assentos reservados (0-Nao / 1-Sim): ");
        for(i=0; i<assentos.length; i++) {
            for(j=0; j<assentos[i].length; j++) {
                System.out.printf("[ " + assentos[i][j] + " ]");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }

    public void mostraAssentosNum() {
        int i;
        int j;
        int cont=0;
        System.out.println("\nAssentos numerados: ");
        for(i=0; i<assentos.length; i++) {
            for(j=0; j<assentos[i].length; j++) {
                if(cont<9) {
                    System.out.printf("[ " + 0+(cont+1) + " ]");
                    cont++;
                }
                else {
                    System.out.printf("[ " + (cont+1) + " ]");
                    cont++;
                }
            }
            System.out.printf("\n");
        }    
        System.out.printf("\n");
    }

    public Onibus() {} //construtor vazio

    public Onibus(int codigo, String modelo, int anoFabricacao, String marca, double km, int cnhMot, int[][] assentos) {
        setCodigo(codigo);
        setModelo(modelo);
        setAnoFabricacao(anoFabricacao);
        setMarca(marca);
        setKm(km);
        setCnhMot(cnhMot);
        setAssentos(assentos);
    }
    
}
