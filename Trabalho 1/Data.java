public class Data {
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int min;
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		if (hora>23){
			System.out.println("Formato de hora incorreto!");
		}
		else{
		this.hora = hora;
		}
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		if (min>59){
			System.out.println("Formato de minutos incorreto!");
		}
		else{
		this.min = min;
		}
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		if (dia>31){
			System.out.println("Formato de dia incorreto!");
		}
		else{
		this.dia = dia;
		}
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if (mes>12){
			System.out.println("Formato de mês incorreto!");
		}
		else{
		this.mes = mes;
		}
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getData() {
		if(dia<=9 && mes<=9) {
			return (0+dia+ "/" + 0+mes + "/" + ano);
		}
		else if(dia>9 && mes<=9) {
			return (dia + "/" + 0+mes + "/" + ano);
		}
		return (dia + "/" + mes + "/" + ano);
	}
	public void setData(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }
	public void setHorario(int hora, int min) {
		setHora(hora);
		setMin(min);
	}

	public String getHorario() {
		if(hora<=9 && min<=9) {
			return (0+hora + ":" + 0+min);				
		}
		else if(hora>9 && min<=9){
			return (hora + ":" + 0+min);				
		}
		return (hora + ":" + min);				
	}
		
}