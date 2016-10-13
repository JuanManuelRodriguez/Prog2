
public class AlarmaLuminosa extends Alarma{
	Luz luz;
	public AlarmaLuminosa(){
		super();
		luz=new Luz();
	};
	public void comprobar(){
		if(this.estaPuertaVentanaAbierta || this.estaVidrioRoto || this.hayMovimiento){
			   timbre.hacerSonar();
			   luz.encender();
		   }
	}
	public static void main(String[] args) {
		AlarmaLuminosa a=new AlarmaLuminosa();
		a.setAlarma("puerta");
		a.comprobar();
	}

}
