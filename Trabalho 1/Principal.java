import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operacoes operacao = new Operacoes();
        int aux=0;

        System.out.println("\n-----Bem vindo ao Sistema Rodoviário da Viação Asteróide!-----");
        System.out.println("\nSISTEMA: Comece inserindo alguns dados!");
        try { Thread.sleep (500); } catch (InterruptedException ex) {}

        System.out.printf("-Insira quantos motoristas existirão: ");
        aux=sc.nextInt();
        sc.nextLine();
        for (int z=0; z<aux; z++){
            System.out.printf("\n------Cadastro do "+(z+1)+"° motorista------");
            operacao.cadastroMotorista();
        }
        aux=0;
        
        System.out.printf("-Insira quantos ônibus existirão: ");
        aux=sc.nextInt();
        sc.nextLine();
        for (int z=0; z<aux; z++){
            System.out.printf("\n------Cadastro do "+(z+1)+"° ônibus------");
            operacao.cadastroOnibus();
        }
        aux=0;
        
        System.out.printf("-Insira quantas rotas existirão (1-5): ");
        aux=sc.nextInt();
        sc.nextLine();
        for (int z=0; z<aux; z++){
            System.out.printf("\n------Cadastro da "+(z+1)+"° rota------");
            operacao.cadastroRota();
        }
        System.out.println("----Obrigado, tenha um bom dia de trabalho!----");
        try { Thread.sleep (1000); } catch (InterruptedException ex) {}       


        int op=-1;
        while(op != 0) {
            System.out.println("\n-----Bem vindo ao Sistema Rodoviário da Aviação Asteróide!-----");
            System.out.println("\nSISTEMA: Insira uma das opções que deseja abaixo:");
            System.out.println("1- Cadastrar passageiro"); 
            System.out.println("2- Alterar passageiro"); 
            System.out.println("3- Excluir passageiro"); 
            System.out.println("4- Cadastrar ônibus"); 
            System.out.println("5- Alterar ônibus"); 
            System.out.println("6- Excluir ônibus"); 
            System.out.println("7- Cadastrar motorista"); 
            System.out.println("8- Alterar motorista"); 
            System.out.println("9- Excluir motorista"); 
            System.out.println("10- Cadastrar rota");
            System.out.println("11- Alterar rota");
            System.out.println("12- Excluir rota");        
            System.out.println("13- Comprar passagem");
            System.out.println("14- Cancelar passagem");            
            System.out.println("0- Sair do programa");
            System.out.printf("Opção: ");
            op = sc.nextInt();
            sc.nextLine();      
            switch(op) {
                case 1: {
                    //Cadastrar passageiro
                    operacao.cadastroPassageiro();

                }break;

                case 2: {
                    //Alterar passageiro
                    operacao.editaPassageiro();

                }break;

                case 3: {
                    //Excluir passageiro
                    operacao.removePassageiro();
                    operacao.mostraPassageiro();
                }break;

                case 4: {
                    //Cadastrar onibus
                    operacao.cadastroOnibus();
                }break;
                
                case 5: {
                    //Alterar onibus
                    operacao.editaOnibus();
                }break;

                case 6: {
                    //Excluir onibus
                    int codigo;
                    if(operacao.temElem("onibus")) {
                        operacao.mostraOnibus();
                        System.out.printf("\nDigite o cógigo do onibus: ");
                        codigo = sc.nextInt();
                        sc.nextLine();
                        operacao.removeOnibus(codigo);
                    }
                    else {
                        System.out.println("\n---Lista está vazia!---");
                        try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                    }                    
                }break;
                
                case 7: {
                    //Cadastrar motorista
                    operacao.cadastroMotorista();
                }break;

                case 8: {
                    //Alterar motorista
                    operacao.editaMotorista();
                }break;
                
                case 9: {
                    //Excluir motorista
                    int numCNH;
                    if(operacao.temElem("motoristas")) {
                        operacao.mostraMotorista();
                        System.out.printf("\nDigite o numero da CNH do motorista: ");
                        numCNH = sc.nextInt();
                        sc.nextLine();
                        operacao.removeMotorista(numCNH);
                        System.out.printf("\nMotorista removido com sucesso!");
                        try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                    }
                    else {
                        System.out.println("\n---Lista está vazia!---");
                        try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                    }

                }break;

                case 10: {
                    //Cadastrar rota
                    operacao.cadastroRota();
                }break;
                
                case 11: {
                    //Alterar rota
                    operacao.editaRota();
                }break;

                case 12: {
                    //Excluir rota
                    int codigo;
                    if(operacao.temElem("rotas")) {
                        operacao.mostraRota();
                        System.out.printf("\nDigite o cógigo da rota: ");
                        codigo = sc.nextInt();
                        sc.nextLine();
                        operacao.removeRota(codigo);
                    }
                    else {
                        System.out.println("\n---Lista está vazia!---");
                        try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                    } 
                }break;  

                case 13: {
                    //Comprar passagem
                    operacao.compraPassagem();
                }break;

                case 14: {
                    //Cancelar passagem
                    operacao.cancelaPassagem();
                }break;

                default: System.out.println("\nFechando o sistema da rodoviária...");
                try { Thread.sleep (1500); } catch (InterruptedException ex) {} break;
            }
        }
    }
}
