
public class Sensor {
	String zona="None";
	boolean activada=false;
	
	public Sensor(String zona){
		this.zona=zona;
	}
	public void setZona(String zona){
		this.zona=zona;
	}
	public void setActivada(){
		this.activada=!this.activada;
	}
	public String getZona(){
		return "La zona "+this.zona;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
