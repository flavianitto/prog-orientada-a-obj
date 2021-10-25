import java.util.Scanner;
import java.util.ArrayList;

public class Operacoes {
    Scanner sc = new Scanner(System.in);
    ArrayList<Motorista> motoristas = new ArrayList<>();
    ArrayList<Passageiro> passageiros = new ArrayList<>();
    ArrayList<Onibus> onibus = new ArrayList<>();
    ArrayList<Rota> rotas = new ArrayList<>();

    Motorista motorista;
    Passageiro passageiroi;
    Onibus onibusO = new Onibus();
    Rota rota = new Rota();
    Data data = new Data();

    public void compraPassagem() {
        int codRota;
        int numAssento;
        String doc;
        System.out.printf("\nConfirme seu RG: ");
        doc = sc.nextLine();
        for(int j=0; j<passageiros.size(); j++) {
            if(passageiros.get(j).getDoc().equals(doc)) {
                System.out.println("Passageiro " + passageiros.get(j).getNome() + " autenticado!");

                System.out.printf("\nMostrando rotas disponíveis...");
                mostraRota();
                System.out.printf("\nInsira o código da rota que deseja reservar: ");
                codRota = sc.nextInt();
                sc.nextLine();
                passageiroi.setCodRota(codRota);
                
                for(int i=0; i<rotas.size(); i++) {
                    if(rotas.get(i).getCodigo() == codRota) {
                        System.out.println("Selecione o lugar que deseja no ônibus "+rotas.get(i).getCodbus());
                        onibusO.mostraAssentos01();
                        onibusO.mostraAssentosNum();
                        
                        System.out.printf("Assento: ");
                        numAssento = sc.nextInt();
                        sc.nextLine();
                        passageiroi.setNumAssento(numAssento);

                        onibusO.reservaAssento(numAssento);
                        onibusO.mostraAssentos01();
                        
                        System.out.println("SISTEMA: Passagem reservada!\n");

                        try { Thread.sleep (1000); } catch (InterruptedException ex) {}     
                    }
                }
            }
            else {
                System.out.println("\nPassageiro não encontrado!\nPara comprar uma passagem se cadastre primeiro");
            }
        }
    }
    public void cancelaPassagem() {
        int op=-1;
        String doc;
        System.out.printf("\nConfirme seu RG: ");
        doc = sc.nextLine();
        for(int j=0; j<passageiros.size(); j++) {
            if(passageiros.get(j).getDoc().equals(doc)) {
                System.out.println("Passageiro " + passageiros.get(j).getNome() + " autenticado!");

                System.out.println("\nINFORMAÇÕES:\nVocê comprou uma passagem na rota " + passageiroi.getCodRota());
                System.out.println("Assento reservado: " + passageiroi.getNumAssento());
                System.out.printf("\nSISTEMA: Deseja mesmo cancelar sua passagem? (1-Sim / 0-Não): ");
                op = sc.nextInt();
                sc.nextLine();
                
                if(op==1) {
                    onibusO.cancelaAssento(passageiroi.getNumAssento());
                    onibusO.mostraAssentos01();
                    
                    System.out.println("SISTEMA: Passagem cancelada com sucesso!\n");
                    try { Thread.sleep (1000); } catch (InterruptedException ex) {}   
                }
                else {
                    System.out.println("SISTEMA: Passagem não foi cancelada!\n");
                }
            }
            else {
                System.out.println("\nPassageiro não encontrado!\nPara comprar uma passagem se cadastre primeiro");
            }
        }
    }

    public void cadastroMotorista() {
        int numCNH;
        int diaM,  mesM,  anoM;
        String nomeMotorista;
        System.out.println("\n---Cadastro do motorista---");
        System.out.printf("Número da CNH: ");
        numCNH = sc.nextInt();
        sc.nextLine();
        System.out.printf("Data de admissão (dd mm aaaa): ");
        diaM = sc.nextInt();
        mesM = sc.nextInt();
        anoM = sc.nextInt();
        sc.nextLine();
        System.out.printf("Nome motorista: ");
        nomeMotorista = sc.nextLine();

        motorista = new Motorista(numCNH, diaM, mesM, anoM, nomeMotorista);
        motoristas.add(motorista);
        mostraMotorista();
        try { Thread.sleep (1000); } catch (InterruptedException ex) {}
    }
    public void editaMotorista() {
        int i;
        int op=-1;
        int numCNH;
        System.out.printf("\nDigite o número CNH a ser editado: ");
        numCNH = sc.nextInt();
        sc.nextLine();
        for(i=0; i<motoristas.size(); i++) {
            if(motoristas.get(i).getNumCNH() == numCNH) {
                while(op!=0) {
                    System.out.println("\n---Editar motorista---");
                    System.out.println("1- Editar número CNH");
                    System.out.println("2- Editar data de admissão");
                    System.out.println("3- Editar nome motorista");  
                    System.out.println("0- Voltar para o menu");
                    System.out.printf("Opção: ");
                    op = sc.nextInt();  
                    sc.nextLine();    
                    switch(op) {               
                        case 1: {
                            int novoCNH;
                            System.out.printf("\nDigite o novo número CNH: ");
                            novoCNH = sc.nextInt();  
                            sc.nextLine();
                            motoristas.get(i).setNumCNH(novoCNH);
                            mostraMotorista();
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                        }break;

                        case 2: {
                            int novoD, novoM, novoA;
                            System.out.printf("\nDigite a nova data (dd mm aaaa): ");
                            novoD = sc.nextInt();
                            novoM = sc.nextInt();
                            novoA = sc.nextInt();
                            sc.nextLine();
                            motoristas.get(i).data.setData(novoD, novoM, novoA);
                            mostraMotorista();
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                        }break;

                        case 3: {
                            String novoNome;
                            System.out.printf("\nDigite o novo nome: ");
                            novoNome = sc.nextLine();
                            motoristas.get(i).setNomeMotorista(novoNome);
                            mostraMotorista();
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                        }break;

                        default: System.out.println("\nVoltando para o menu...");
                        try { Thread.sleep (1000); } catch (InterruptedException ex) {} break;
                    }                      
                }
            }
        }
    }
    public void removeMotorista(int numCNH) {
        int indice=-1;
        int i;
        if(motoristas.isEmpty()) {
            System.out.println("\n---Lista está vazia!---");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
        else {
            for(i=0; i<motoristas.size(); i++) {
                if(motoristas.get(i).getNumCNH() == numCNH) {
                    indice = i;
                    System.out.println("Excluindo motorista " + motoristas.get(i).getNomeMotorista() + "...");
                    try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                    motoristas.remove(indice);
                    mostraMotorista();
                    try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                }
            }
        }
    }
    public void mostraMotorista() {
        int i;
        if(motoristas.isEmpty()) {
            System.out.println("\n---Lista está vazia!---");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
        else {
            System.out.println("\n---Mostrando lista completa---");
            for(i=0; i<motoristas.size(); i++) {
                System.out.println("Numero CNH: " + motoristas.get(i).getNumCNH());
                System.out.println("Data admissão: " + motoristas.get(i).data.getData());
                System.out.println("Nome motorista: " + motoristas.get(i).getNomeMotorista() + "\n");
            }
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
    }
    public boolean temElem(String classe) {
        if(classe.equals("motoristas")) {
            if(motoristas.isEmpty()) {
                return false;
            }
            else {
                return true;
            }            
        }
        else if(classe.equals("passageiros")) {
            if(passageiros.isEmpty()) {
                return false;
            }
            else {
                return true;
            }  
        }
        else if(classe.equals("onibus")) {
            if(onibus.isEmpty()) {
                return false;
            }
            else {
                return true;
            }  
        }
        else if(classe.equals("rotas")) {
            if(rotas.isEmpty()) {
                return false;
            }
            else {
                return true;
            }  
        }
        else {
            System.out.println("\nArray não encontrado!");
            return false;
        }
    }

    public void cadastroPassageiro() {
        int dia, mes, ano;
        int op=-1;

		passageiroi = new Passageiro();
        System.out.println("\n--Cadastro do passageiro---");
		System.out.printf("Nome do passageiro: ");
		passageiroi.setNome(sc.nextLine());
        System.out.printf("Data de nascimento (dd mm aaaa): ");
        dia = sc.nextInt();
        mes = sc.nextInt();
        ano = sc.nextInt();
        sc.nextLine();
        passageiroi.data.setData(dia, mes, ano);

		System.out.printf("RG do passageiro "+ passageiroi.getNome()+": ");
		passageiroi.setDoc(sc.nextLine());
		System.out.printf("Cidade que o passageiro "+passageiroi.getNome()+" reside: ");
		passageiroi.setCidade(sc.nextLine());
		System.out.printf("Rua que o passageiro "+passageiroi.getNome()+" reside: ");
		passageiroi.setRua(sc.nextLine());
		System.out.printf("Número da casa que o passageiro "+passageiroi.getNome()+" reside: ");
		passageiroi.setNumero(sc.nextInt());
		sc.nextLine();

        System.out.println("SISTEMA: Passageiro cadastrado com sucesso!\n");
        passageiros.add(passageiroi);
          
		System.out.printf("\nDeseja reservar uma passagem? (1-Sim / 0-Não)\nOpção: ");
        op = sc.nextInt();
        sc.nextLine();
        if(op==1) {
            compraPassagem();
        }
        else {
            System.out.println("\nSISTEMA: Passageiro cadastrado com sucesso!\n");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
	}
    public void editaPassageiro() {
		String nomec, nome;
		int i;
        int op=-1;
        int num;
        if(passageiros.isEmpty()){
            System.out.println("\tNão existem passageiros cadastrados.\n");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
        else{
            System.out.print("\nInsira o nome do passageiro que deseja alterar algum dado: ");
            nome = sc.nextLine();
            for(i=0;i<passageiros.size();i++){
                if(passageiros.get(i).getNome().equals(nome)){
                    while(op!=0){
                    
                    System.out.printf("\n\nInsira a opção para o item que deseja alterar:\n1- Para alterar o nome;\n2- Para alterar o RG;\n3- Para alterar a cidade;\n4- Para alterar o nome da rua;\n5- Para alterar o número da casa;\n6- Para alterar a data de nascimento;\n0- Para encerrar a alteração.\nOpção: ");
                    op=sc.nextInt();
                    sc.nextLine();

                    switch (op){
                        case 0: 
                        System.out.println("\nVoltando ao menu...");
                        break;

                        case 1:
                        System.out.printf("Insira o nome do passageiro corrigido: ");
                        nomec=sc.nextLine();
                        passageiros.get(i).setNome(nomec);
                        System.out.println("\tNome do passageiro alterado com sucesso!\n");
                        mostraPassageiro();
                        try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                        break;

                        case 2:
                        System.out.printf("Insira o RG do passageiro "+nome+" corrigido: ");
                        nomec=sc.nextLine();
                        passageiros.get(i).setDoc(nomec);
                        System.out.println("\tRG do passageiro alterado com sucesso\n");
                        mostraPassageiro();
                        try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                        break;
                        
                        case 3:
                        System.out.printf("Insira o nome da cidade corrigido: ");
                        passageiros.get(i).setCidade(sc.nextLine());
                        System.out.println("\tNome da cidade alterado com sucesso!\n");
                        mostraPassageiro();
                        try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                        break;

                        case 4:
                        System.out.printf("Insira o nome da rua corrigido: ");
                        nomec=sc.nextLine();
                        passageiros.get(i).setRua(nomec);
                        System.out.println("\tNome da rua alterado com sucesso\n");
                        mostraPassageiro();
                        try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                        break;
                    
                        case 5:
                        System.out.printf("Insira o número do número corrigido: ");
                        num=sc.nextInt();
                        sc.nextLine();
                        passageiros.get(i).setNumero(num);
                        System.out.println("\tNúmero da rua alterado com sucesso\n");
                        mostraPassageiro();
                        try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                        break;
                        
                        case 6:
                        int dma;
                        System.out.printf("\tSelecione a opção que deseja alterar na data:\n1- Para alterar o dia;\n2- Para alterar o mês\n3- Para alterar o ano;\nOpção: ");
                        dma=sc.nextInt();
                        sc.nextLine();
                        switch (dma){ 
        
                        case 1:
                            System.out.printf("Insira dia de nascimento corrigido: ");
                            num=sc.nextInt();
                            sc.nextLine();
                            passageiros.get(i).data.setDia(num);
                            System.out.println("\tDia de nascimento alterado com sucesso!\n");
                            mostraPassageiro();
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                            break;
                        
                        case 2:
                            System.out.printf("Insira o mês de nascimento corrigido: ");
                            passageiros.get(i).data.setMes(sc.nextInt());
                            sc.nextLine();
                            System.out.println("\tMês de nascimento alterado com sucesso!\n");
                            mostraPassageiro();
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                            break;
                            
                        case 3:
                            System.out.printf("Insira o ano de nascimento corrigido: ");
                            passageiros.get(i).data.setAno(sc.nextInt());
                            sc.nextLine();
                            System.out.println("\tAno de nascimento alterado com sucesso!\n");
                            mostraPassageiro();
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                            break;
                        }
                        break;
                        
                        default:
                        System.out.println("\tOpção inválida\n");
                        break;
                    }
                }
            }
        }
            if(i==passageiros.size() && i>1){
                System.out.println("\tPassageiro não encontrado!\n\n");
                try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                //break;
            }
        }
	}
    public void mostraPassageiro() {
		int m;
        if(passageiros.isEmpty()) {
            System.out.println("\n---Lista está vazia!---");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
        else {
            System.out.println("\n---Mostrando lista completa---");
            for(m=0; m<passageiros.size(); m++) {
                System.out.println("Nome: " + passageiros.get(m).getNome());
                System.out.println("Data de nascimento: " + passageiros.get(m).data.getData());
                System.out.println("RG: " + passageiros.get(m).getDoc());
                System.out.println(passageiros.get(m).getEnd());
                System.out.println("Numero do assento: " + passageiros.get(m).getNumAssento() + "\n");
                try { Thread.sleep (1000); } catch (InterruptedException ex) {}
            }
	    }
	}
    public void removePassageiro() {
		String aux;
		int j;
		if(passageiros.isEmpty()){
            System.out.println("\tNão é possivel remover, pois não possuem passageiros cadastrados.\n\n");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
		else {
            System.out.printf("Insira o nome do passageiro que deseja remover: ");
            aux=sc.nextLine();
            for(j=0;j<passageiros.size();j++){
                if(passageiros.get(j).getNome().equals(aux)){
                    passageiros.remove(j);
                    System.out.println("\tPassageiro removido com sucesso!\n");
                    mostraPassageiro();
                    try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                    break;
                }
            }
            if(j==passageiros.size() && j>1){
                System.out.println("\tPassageiro não encontrado\n\n");
                try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                //break;
            }
		}
	}
    
    public void cadastroOnibus() {
        int codigo;
        String modelo;
        int anoFabricacao;
        String marca;
        double km;
        int cnhMot;
        String aux;
        int[][] assentos = new int[4][10];

        System.out.println("\n---Cadastro do Onibus---");
        System.out.printf("Código: ");
        codigo = sc.nextInt();
        sc.nextLine();
        System.out.printf("Modelo: ");
        modelo = sc.nextLine();
        System.out.printf("Ano de fabricação: ");
        anoFabricacao = sc.nextInt();
        sc.nextLine();
        System.out.printf("Marca do onibus: ");
        marca = sc.nextLine();
        System.out.printf("Quilometragem total: ");
        km = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Número da CNH do motorista: ");
        cnhMot = sc.nextInt();
        sc.nextLine();

        onibusO.mostraAssentosNum();
        onibusO.iniciaAssento();

        onibusO = new Onibus(codigo, modelo, anoFabricacao, marca, km, cnhMot, assentos);
        onibus.add(onibusO);

        //Fazendo o set do nome do motorista usando o numero da CNH - nao funcionou
        String nome;
        for(int i=0; i<motoristas.size(); i++) {
            if(motoristas.get(i).getNumCNH() == cnhMot) {
                nome = onibus.get(i).getNomeMotorista();
                onibus.get(i).setNomeMotorista(nome);
            }          
        }
        mostraOnibus();
        try { Thread.sleep (1000); } catch (InterruptedException ex) {}
    }
    public void editaOnibus() {
        int i;
        int op=-1;
        int codigo;
        System.out.printf("\nDigite o código do onibus: ");
        codigo = sc.nextInt();
        sc.nextLine();
        for(i=0; i<onibus.size(); i++) {
            if(onibus.get(i).getCodigo() == codigo) {
                while(op!=0) {
                    System.out.println("\n---Editar onibus---");
                    System.out.println("1- Editar código");
                    System.out.println("2- Editar modelo");
                    System.out.println("3- Editar ano de fabricação");  
                    System.out.println("4- Editar marca");
                    System.out.println("5- Editar quilometragem");
                    System.out.println("6- Editar CNH do motorista");
                    System.out.println("0- Voltar para o menu");
                    System.out.printf("Opção: ");
                    op = sc.nextInt();      
                    switch(op) { 
                        case 1: {
                            int novoCod;
                            System.out.printf("\nDigite o novo código: ");
                            novoCod = sc.nextInt();
                            sc.nextLine();
                            onibus.get(i).setCodigo(novoCod);
                            mostraOnibus();
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                        }break;

                        case 2: {
                            String novoModelo;
                            System.out.printf("\nDigite o novo modelo: ");
                            novoModelo = sc.nextLine();
                            onibus.get(i).setModelo(novoModelo);
                            mostraOnibus();
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                        }break;

                        case 3: {
                            int novoAno;
                            System.out.printf("\nDigite o novo ano de fabricação: ");
                            novoAno = sc.nextInt();
                            sc.nextLine();
                            onibus.get(i).setAnoFabricacao(novoAno);
                            mostraOnibus();
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                        }break;

                        case 4: {
                            String novoMarca;
                            System.out.printf("\nDigite a nova marca: ");
                            novoMarca = sc.nextLine();
                            onibus.get(i).setMarca(novoMarca);
                            mostraOnibus();
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                        }break;

                        case 5: {
                            double novoKm;
                            System.out.printf("\nDigite a nova quilometragem: ");
                            novoKm = sc.nextDouble();
                            sc.nextLine();
                            onibus.get(i).setKm(novoKm);
                            mostraOnibus();
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                        }break;
                        
                        case 6:{
                            int ceeneaga;
                            System.out.printf("\nDigite o novo número da CNH: ");
                            ceeneaga=sc.nextInt();
                            sc.nextLine();
                            onibus.get(i).setCnhMot(ceeneaga);
                            mostraOnibus();
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                        }break;

                        default: System.out.println("\nVoltando para o menu...");
                        try { Thread.sleep (1000); } catch (InterruptedException ex) {} break;
                    }  
                }
            }
        }

    }
    public void removeOnibus(int codigo) {
        int indice=-1;
        int i;
        if(onibus.isEmpty()) {
            System.out.println("\n---Lista está vazia!---");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
        else {
            for(i=0; i<onibus.size(); i++) {
                if(onibus.get(i).getCodigo() == codigo) {
                    indice = i;
                    System.out.println("Excluindo onibus com registro " + onibus.get(i).getCodigo() + "...");
                    try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                    onibus.remove(indice);
                    mostraOnibus();
                    try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                }
            }
        }
    }

    public void mostraOnibus() {
        int i;
        if(onibus.isEmpty()) {
            System.out.println("\n---Lista está vazia!---");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
        else {
            System.out.println("\n---Mostrando lista completa---");
            for(i=0; i<onibus.size(); i++) {
                System.out.println("Código: " + onibus.get(i).getCodigo());
                System.out.println("Modelo: " + onibus.get(i).getModelo());
                System.out.println("Ano de fabricação: " + onibus.get(i).getAnoFabricacao());
                System.out.println("Marca: " + onibus.get(i).getMarca());
                System.out.println("Quilometragem: " + onibus.get(i).getKm());
                System.out.println("CNH do motorista: " + onibus.get(i).getCnhMot() + "\n");
                ///System.out.println("Nome do motorista: " + onibus.get(i).getNomeMotorista() + "\n");
            }      
        }
    }    

    public void cadastroRota() {
        String origem;
        String destino;
        int qtdParadas, codigo;
        int codBus;
        ArrayList<String> paradas = new ArrayList<>();
        int diaS, mesS, anoS, horaS, minS;
        int diaC, mesC, anoC, horaC, minC;
        double precoCheio;
        System.out.println("\n---Cadastro de rota---");
        System.out.printf("Codigo rota: ");
        codigo = sc.nextInt();
        sc.nextLine();
        System.out.printf("Origem: ");
        origem = sc.nextLine();
        System.out.printf("Destino: ");
        destino = sc.nextLine();
        System.out.printf("Data de saída (dd mm aaaa): ");
        diaS = sc.nextInt();
        mesS = sc.nextInt();
        anoS = sc.nextInt();
        sc.nextLine();
        while(diaS>=31 || mesS>=12 || anoS<2021) {
            if(diaS>31 || diaS<0) {
                System.out.println("Formato de dia inválido!"); 
                System.out.printf("Insira um dia válido (<=31): ");
                diaS = sc.nextInt();
                sc.nextLine();                
            }
            else if(mesS>31 || mesS<0) {
                System.out.println("Formato de mes inválido!"); 
                System.out.printf("Insira um mes válido (<=12): ");
                mesS = sc.nextInt();
                sc.nextLine();                
            }
            else if(anoS<2021) {
                System.out.println("Formato de ano inválido!"); 
                System.out.printf("Insira um ano válido (>=2021): ");
                anoS = sc.nextInt();
                sc.nextLine();                
            }            
        } 
        System.out.printf("Horario de saída (hh mm): ");
        horaS = sc.nextInt();
        minS = sc.nextInt();
        sc.nextLine();        
        while(horaS>24 || minS>60) {
            if(horaS>24 || horaS<0) {
                System.out.println("Formato de hora inválido!"); 
                System.out.printf("Insira uma hora válida (<=24): ");
                horaS = sc.nextInt();
                sc.nextLine();   
            }
            else if(minS>60 || minS<0){
                System.out.println("Formato de minuto inválido!"); 
                System.out.printf("Insira um minuto válido (<60): ");
                minS = sc.nextInt();
                sc.nextLine(); 
            }
        }
        System.out.printf("Data de chegada (dd mm aaaa): ");
        diaC = sc.nextInt();
        mesC = sc.nextInt();
        anoC = sc.nextInt();
        sc.nextLine();
        while(diaC>31 || mesC>12 || anoC<2021) {
            System.out.println("Formato de data inválido!");
            if(diaC>31 || diaC<0) {
                System.out.println("Formato de dia inválido!"); 
                System.out.printf("Insira um dia válido (<=31): ");
                diaC = sc.nextInt();
                sc.nextLine();                
            }
            else if(mesC>12 || mesC<0) {
                System.out.println("Formato de mes inválido!"); 
                System.out.printf("Insira um mes válido (<=12): ");
                mesC = sc.nextInt();
                sc.nextLine();                
            }
            else if(anoC<2021) {
                System.out.println("Formato de ano inválido!"); 
                System.out.printf("Insira um ano válido (>=2021): ");
                anoC = sc.nextInt();
                sc.nextLine();                
            }           
        }
        System.out.printf("Horario de chegada (hh mm): ");
        horaC = sc.nextInt();
        minC = sc.nextInt();  
        while(horaC>24 || minC>=60) {
            if(horaC>24 || horaC<0) {
                System.out.println("Formato de hora inválido!"); 
                System.out.printf("Insira uma hora válida (<=24): ");
                horaC = sc.nextInt();
                sc.nextLine();   
            }
            else if(minC>60 || minC<0){
                System.out.println("Formato de minuto inválido!"); 
                System.out.printf("Insira um minuto válido (<60): ");
                minC = sc.nextInt();
                sc.nextLine(); 
            }
        }
        sc.nextLine();     
        System.out.printf("Preço cheio da passagem (sem paradas): ");
        precoCheio = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Insira o código do ônibus que traçará a rota: ");
        codBus = sc.nextInt();
        sc.nextLine();

        System.out.printf("Quantidade de paradas (0~3): ");
        qtdParadas = sc.nextInt();
        sc.nextLine();
        rota = new Rota(codigo, origem, destino, paradas, codBus, diaS, mesS, anoS, horaS, minS, diaC, mesC, anoC, horaC, minC);
        rota.setPreco(precoCheio, qtdParadas);
        rota.setCodbus(codBus);
        rota.cadastraParadas(qtdParadas);    
        rotas.add(rota);

        //Fazendo o set do nome do motorista usando o codigo do onibus - nao funcionou
        String nome;
        for(int i=0; i<onibus.size(); i++) {
            if(onibus.get(i).getCodigo() == codBus) {
                nome = rotas.get(i).getMotoristaRota();
                rotas.get(i).setMotoristaRota(nome);
            }          
        }
        mostraRota();
    }
    public void editaRota() {
        int i;
        int op=-1;
        int codigo;
        System.out.printf("\nDigite o codigo da rota: ");
        codigo = sc.nextInt();
        sc.nextLine();
        for(i=0; i<rotas.size(); i++) {
            if(rotas.get(i).getCodigo() == codigo) {
                while(op!=0) {
                    System.out.println("\n---Editar rota---");
                    System.out.println("1- Editar codigo da rota");
                    System.out.println("2- Editar origem");
                    System.out.println("3- Editar destino");  
                    System.out.println("4- Editar data de saída");  
                    System.out.println("5- Editar horario de saída");  
                    System.out.println("6- Editar data de chegada");  
                    System.out.println("7- Editar horario de chegada"); 
                    System.out.println("8- Editar paradas"); 
                    System.out.println("9- Editar código do ônibus");
                    System.out.println("0- Voltar para o menu");
                    System.out.printf("Opção: ");
                    op = sc.nextInt();      
                    sc.nextLine();
                    switch(op) { 
                        case 1: {
                            int novoCodigo;
                            System.out.printf("\nDigite o novo código: ");
                            novoCodigo = sc.nextInt();
                            sc.nextLine();
                            rotas.get(i).setCodigo(novoCodigo);
                            mostraRota();
                        }break;
                        
                        case 2: {
                            String origem;
                            System.out.printf("\nDigite a nova origem: ");
                            origem = sc.nextLine();
                            rotas.get(i).setOrigem(origem);
                            mostraRota();
                        }break;
                        
                        case 3: {
                            String destino;
                            System.out.printf("\nDigite o novo destino: ");
                            destino = sc.nextLine();
                            rotas.get(i).setDestino(destino);
                            mostraRota();
                        }break;
                        
                        case 4: {
                            int dia, mes, ano;
                            System.out.printf("\nDigite a nova data de saída (dd mm aaaa): ");
                            dia = sc.nextInt();
                            mes = sc.nextInt();
                            ano = sc.nextInt();
                            sc.nextLine();
                            rotas.get(i).dataS.setData(dia, mes, ano);;
                            mostraRota();
                        }break;
                                                
                        case 5: {
                            int hora, min;
                            System.out.printf("\nDigite o novo horário de saída (hh mm): ");
                            hora = sc.nextInt();
                            min = sc.nextInt();
                            sc.nextLine();
                            rotas.get(i).dataS.setHorario(hora, min);
                            mostraRota();
                        }break;
                        
                        case 6: {
                            int dia, mes, ano;
                            System.out.printf("\nDigite a nova data de chegada (dd mm aaaa): ");
                            dia = sc.nextInt();
                            mes = sc.nextInt();
                            ano = sc.nextInt();
                            sc.nextLine();
                            rotas.get(i).dataC.setData(dia, mes, ano);;
                            mostraRota();
                        }break;
                                                
                        case 7: {
                            int hora, min;
                            System.out.printf("\nDigite o novo horário de chegada (hh mm): ");
                            hora = sc.nextInt();
                            min = sc.nextInt();
                            sc.nextLine();
                            rotas.get(i).dataC.setHorario(hora, min);
                            mostraRota();
                        }break;
                                                                        
                        case 8: {
                            int qtdParadas;
                            System.out.printf("\nDigite a nova quantidade de paradas (0~3): ");
                            qtdParadas = sc.nextInt(); 
                            sc.nextLine();
                            rota.editaParadas(qtdParadas);
                            mostraRota();
                        }break;
                        
                        case 9: {
                            int nuevocod;
                            System.out.printf("\nDigite o novo código do ônibus: ");
                            nuevocod=sc.nextInt();
                            sc.nextLine();
                            rotas.get(i).setCodbus(nuevocod);
                            mostraRota();
                        }break;
                        default: System.out.println("\nVoltando para o menu...");
                        try { Thread.sleep (1000); } catch (InterruptedException ex) {} break;
                    }
                }
            }
        }
    }
    public void removeRota(int codigo) {
        int indice=-1;
        int i;
        if(rotas.isEmpty()) {
            System.out.println("\n---Lista está vazia!---");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
        else {
            for(i=0; i<rotas.size(); i++) {
                if(rotas.get(i).getCodigo() == codigo) {
                    indice = i;
                    System.out.println("Excluindo rota com registro " + rotas.get(i).getCodigo() + "...");
                    try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                    rotas.remove(indice);
                    mostraRota();
                    try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                }
            }
        }
    }

    public void mostraRota() {
        int i;
        if(rotas.isEmpty()) {
            System.out.println("\n---Lista está vazia!");
        }
        else {
            System.out.println("\n---Mostrando lista completa---");
            for(i=0; i<rotas.size(); i++) {
                System.out.println("Código da rota: "+ rotas.get(i).getCodigo());
                System.out.println("Código do ônibus: "+ rotas.get(i).getCodbus());
                ///System.out.println("Motorista do ônibus: "+ rotas.get(i).getMotoristaRota());  
                System.out.println("Origem: " + rotas.get(i).getOrigem());
                System.out.println("Destino: " + rotas.get(i).getDestino());
                System.out.println("Data saída: " + rotas.get(i).dataS.getData());
                System.out.println("Horario saída: " + rotas.get(i).dataS.getHorario());
                System.out.println("Data chegada: " + rotas.get(i).dataC.getData());
                System.out.println("Horario chegada: " + rotas.get(i).dataC.getHorario());
                System.out.println("Paradas: " + rotas.get(i).getParadas());
                System.out.println("Preço da passagem: R$" + rotas.get(i).getPreco() + "\n");
            }
        }
    }
}