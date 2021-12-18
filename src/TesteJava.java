
public class TesteJava {
	
	public static void main(String[] args) {
		
	Prioridade pMin= Prioridade.MIN;
	
	Prioridade pMax= Prioridade.MAX;
	
	System.out.println(pMin.name());
	System.out.println(pMax.name());
	
	System.out.println(pMin.ordinal()); //a ordem que foi definida no enum nesse caso o enum prioridade tem tres itens
	System.out.println(pMax.ordinal());
	
	System.out.println(pMin.getValor());
	System.out.println(pMax.getValor());
	
	}
	



}
