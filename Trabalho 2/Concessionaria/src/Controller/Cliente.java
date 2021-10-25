/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cliente extends Operacoes{
    private String cliCPF;
    private String cliNome;
    private Data cliDataNasc = new Data();
    private Endereco cliEnd = new Endereco();
    private double cliRenda;
    private int cliDependentes;
    
    public String getCliCPF() {
        return cliCPF;
    }

    public void setCliCPF(String cliCPF) {
        this.cliCPF = cliCPF;
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        this.cliNome = cliNome;
    }

    public Data getCliDataNasc() {
        return cliDataNasc;
    }

    public void setCliDataNasc(Data cliDataNasc) {
        this.cliDataNasc = cliDataNasc;
    }

    public double getCliRenda() {
        return cliRenda;
    }

    public void setCliRenda(double cliRenda) {
        this.cliRenda = cliRenda;
    }

    public int getCliDependentes() {
        return cliDependentes;
    }

    public void setCliDependentes(int cliDependentes) {
        this.cliDependentes = cliDependentes;
    }

    public Endereco getCliEnd() {
        return cliEnd;
    }

    public void setCliEnd(Endereco cliEnd) {
        this.cliEnd = cliEnd;
    }

    public Cliente(String cliCPF, String cliNome, double cliRenda, int cliDependentes, Data cliDataNasc, Endereco cliEnd) {
        this.cliCPF = cliCPF;
        this.cliNome = cliNome;
        this.cliRenda = cliRenda;
        this.cliDependentes = cliDependentes;
        this.cliDataNasc = cliDataNasc;
        this.cliEnd = cliEnd;
    }

    public Cliente(String cliCPF) {
        this.cliCPF = cliCPF;
    }
    
    @Override
    public void cadastrar() 
    {
        try 
        {
            File arq = new File(".//src//Model//clientes.txt");
            FileWriter escritor = new FileWriter(arq, true);
            escritor.write(this.getCliCPF() + ";" + this.getCliNome() + ";" + this.getCliDataNasc().getData() + ";" + this.getCliRenda() + ";" + this.getCliDependentes() + ";" + this.getCliEnd().getEndCidade() + ";" + this.getCliEnd().getEndBairro() + ";" + this.getCliEnd().getEndRua() + ";" + this.getCliEnd().getEndNum() +"\n");
            escritor.close();
        }
        
        catch(IOException e) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados no arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
       
    }

    @Override
    public void excluir() {
        ArrayList <String> salvar = new ArrayList<>();
        boolean flag = false; //indica se achou ou nao CPF do cliente
        
        try
        {
            FileReader arq = new FileReader(".//src//Model//clientes.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            while(lerArq.ready())
            {
                String linha = lerArq.readLine();
                String[] dadoSeparado = linha.split(";");
                if(!dadoSeparado[0].equals(this.getCliCPF()))
                    salvar.add(linha);
                
                else
                    flag = true;
            }
            
            lerArq.close();
            
            if(flag == false)
                JOptionPane.showMessageDialog(null, "CPF inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            
            else
            {
                File arq2 = new File(".//src//Model//clientes.txt");
                FileWriter escritor = new FileWriter(arq2, false);
                for(int i = 0; i < salvar.size(); i++)
                {
                   escritor.write(salvar.get(i) + "\n");
                }
                escritor.close();
                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados no arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void alterar() {
        this.excluir();
        this.cadastrar();
    }
}
