public class Motorista {
    private int numCNH;
    private String nomeMotorista;

    Data data = new Data();

    public int getNumCNH() {
        return numCNH;
    }
    public void setNumCNH(int numCNH) {
        this.numCNH = numCNH;
    }
    public String getNomeMotorista() {
        return nomeMotorista;
    }
    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public Motorista() {} //construtor vazio

    public Motorista(int numCNH, int dia, int mes, int ano, String nomeMotorista) {
        setNumCNH(numCNH);
        data.setData(dia, mes, ano);
        setNomeMotorista(nomeMotorista);
    }
}
