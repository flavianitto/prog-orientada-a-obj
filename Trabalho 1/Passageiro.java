public class Passageiro {
		private String nome;
		private String doc;
		private String cidade;
		private String rua;
		private int numero;
		private int numAssento;
		private int codRota;
		
		Data data = new Data();
		
		public String getDoc() {
			return doc;
		}

		public int getCodRota() {
			return codRota;
		}

		public void setCodRota(int codRota) {
			this.codRota = codRota;
		}

		public int getNumAssento() {
			return numAssento;
		}

		public void setNumAssento(int numAssento) {
			this.numAssento = numAssento;
		}

		public void setDoc(String doc) {
			this.doc = doc;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getRua() {
			return rua;
		}

		public void setRua(String rua) {
			this.rua = rua;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}
	
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getEnd(){
			return ("Endereço: Rua "+rua+", N°: "+numero+" - "+cidade);
		}

		public void setDataP(int diaP, int mesP, int anoP) {
			data.setDia(diaP);
			data.setMes(mesP);
			data.setAno(anoP);
		}
		
		public Passageiro(){} //Construtor vazio

		public Passageiro(String nome, String doc, String cidade, String rua, int numero, int numAssento, int diaP, int mesP, int anoP) {
			setNome(nome);
			setDoc(doc);
			setCidade(cidade);
			setRua(rua);
			setNumero(numero);
			setNumAssento(numAssento);
			data.setDia(diaP);
			data.setMes(mesP);
			data.setAno(anoP);
		}
	}

