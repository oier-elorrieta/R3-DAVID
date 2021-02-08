package modelo;

public class Metodos {
	private String[][] proKop;

	public void setproKop(String [] produktuak, String[] prezioak) {
		this.proKop = new String[produktuak.length][3];
		for (int i = 0; i < produktuak.length; i++) {
			this.proKop[i][0]=produktuak[i];
			this.proKop[i][1]="0";
			this.proKop[i][2]= prezioak[i];
			
		}
	}
	public String[][] getprokop(){
		return proKop;
	}
	
	public void addProduktu (String izen) {
		int quant;
		String myString="";
		for (int i = 0; i < proKop.length; i++) {
			if(proKop[i][0].equals(izen)) {
				myString =proKop[i][1];
				quant =  Integer.parseInt(myString)+1;
				proKop[i][1]=quant+"";
			}
		}
	}
	public String accionadoBotonSortu(String eragiketa) {
		String Eragiketa=eragiketa;
		int totala = 0;
		for (int i = 0; i < proKop.length; i++) {
			if(!proKop[i][1].equals("0")) {
				totala= totala +Integer.parseInt(proKop[i][2])*Integer.parseInt(proKop[i][1]);
				Eragiketa=Eragiketa+proKop[i][0]+" : "+(Integer.parseInt(proKop[i][2])*Integer.parseInt(proKop[i][1]))/100+"�\r";
			}
		}
		Eragiketa =Eragiketa+"\r-------------------\rtotala : "+(double)totala/100+"�";
		return Eragiketa;
	}
}
