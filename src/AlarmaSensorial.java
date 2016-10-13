import java.util.*;

public class AlarmaSensorial extends Alarma{
	Timbre timbre;
	Luz luz;
	public AlarmaSensorial(){
		timbre=new Timbre();
		luz=new Luz();
	}
	public String comprobar(){
		String zonasActivadas="";
		for(int i=0;i<sensores.size();i++){
			if(sensores.elementAt(i).activada){
				zonasActivadas+=sensores.elementAt(i).getZona()+" "+this.timbre.hacerSonar()+" y "+this.luz.encender();
			}
		}
		return zonasActivadas;
	}
}
