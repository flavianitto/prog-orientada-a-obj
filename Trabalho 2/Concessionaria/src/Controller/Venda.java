/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Venda extends Operacoes{
    private int vndId;
    private double pgtoValor;
    private String pgtoTipo;
    Data vndData = new Data();
    Hora vndHora = new Hora();
    private String veicNumChassi;
    private String funcRG;
    private String cliCPF;
    private boolean desconto;

    public int getVndId() {
        return vndId;
    }

    public void setVndId(int vndId) {
        this.vndId = vndId;
    }

    public double getPgtoValor() {
        return pgtoValor;
    }

    public void setPgtoValor(double pgtoValor) {
        this.pgtoValor = pgtoValor;
    }

    public String getPgtoTipo() {
        return pgtoTipo;
    }

    public void setPgtoTipo(String pgtoTipo) {
        this.pgtoTipo = pgtoTipo;
    }

    public Data getVndData() {
        return vndData;
    }

    public void setVndData(Data vndData) {
        this.vndData = vndData;
    }

    public Hora getVndHora() {
        return vndHora;
    }

    public void setVndHora(Hora vndHora) {
        this.vndHora = vndHora;
    }

    public String getVeicNumChassi() {
        return veicNumChassi;
    }

    public void setVeicNumChassi(String veicNumChassi) {
        this.veicNumChassi = veicNumChassi;
    }


    public String getFuncRG() {
        return funcRG;
    }

    public void setFuncRG(String funcRG) {
        this.funcRG = funcRG;
    }

    public String getCliCPF() {
        return cliCPF;
    }

    public void setCliCPF(String cliCPF) {
        this.cliCPF = cliCPF;
    }

    public boolean isDesconto() {
        return desconto;
    }

    public void setDesconto(boolean desconto) {
        this.desconto = desconto;
    }
    public Venda(int id) {
        this.vndId = id;
    }
    public Venda(int vndId, double pgtoValor, String pgtoTipo, String veicNumChassi, String funcRG, String cliCPF, boolean desconto) {
        this.vndId = vndId;
        this.pgtoValor = pgtoValor;
        this.pgtoTipo = pgtoTipo;
        this.veicNumChassi = veicNumChassi;
        this.funcRG = funcRG;
        this.cliCPF = cliCPF;
        this.desconto = desconto;
    }

    @Override
    public void cadastrar() {
        try
        {
            File arq = new File(".//src//Model//vendas.txt");
            FileWriter escritor = new FileWriter(arq, true);
            escritor.write(this.getVndId()+ ";" + this.getPgtoValor()+ ";" + this.getPgtoTipo()+ ";" + this.getVeicNumChassi()+ ";" + this.getFuncRG()+ ";" + this.getCliCPF()+ "\n");
            escritor.close();
            
        }
        
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados no arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    @Override
    public void alterar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir() {
       ArrayList <String> salvar = new ArrayList<>();
        boolean flag = false; //indica se achou ou nao numero do chassi
        
        try
        {
            FileReader arq = new FileReader(".//src//Model//vendas.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            while(lerArq.ready())
            {
                String linha = lerArq.readLine();
                String[] dadoSeparado = linha.split(";");
                if(!dadoSeparado[0].equals(this.getVndId()))
                    salvar.add(linha);
                
                else
                    flag = true;
            }
            
            lerArq.close();
            
            if(flag == false)
                JOptionPane.showMessageDialog(null, "Número da venda inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            
            else
            {
                File arq2 = new File(".//src//Model//vendas.txt");
                FileWriter escritor = new FileWriter(arq2, false);
                for(int i = 0; i < salvar.size(); i++)
                {
                   escritor.write(salvar.get(i) + "\n");
                }
                escritor.close();
                
            }
        }
        
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados no arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
