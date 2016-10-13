
public class AlarmaTipo3 extends Alarma{
	Telefono tel;
	public AlarmaTipo3(){
		tel=new Telefono();
	}
	public String comprobar(){
		if(tel.numeroSeguro()){
			return "se activaron los sensores de una o varias zonas, por favor contactese con la central";
		}
		return "La casa esta en orden";
	}
}
