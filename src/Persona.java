import java.text.SimpleDateFormat;
import java.util.*;

public class Persona {
	 String nombre="N";
	 String apellido="N";
	 int edad;
	 int DNI;
	 char sexo='f';
	 double peso=1;
	 double altura=1;
	 Calendar fechaNacimiento= new GregorianCalendar(2000,0,1);//default 1 de enero del 2000
	 Calendar fechaActual = Calendar.getInstance();
	 
	 public Persona(int DNI){
		 
		 this.DNI = DNI;

	 }
	 public Persona(int DNI, String nombre, String apellido){
		 
		 this.DNI = DNI;
		 this.nombre=nombre;
		 this.apellido=apellido;

	 }
	 public Persona(int DNI, String nombre, String apellido, int theYear, int theMonth, int theDay){
		 this.DNI = DNI;
		 this.nombre=nombre;
		 this.apellido=apellido;
		 this.fechaNacimiento = new GregorianCalendar(theYear, theMonth, theDay);

	 }
	 public Persona(int DNI, String nombre, String apellido, int theYear, int theMonth, int theDay,int edad){
		 this.DNI = DNI;
		 this.nombre=nombre;
		 this.apellido=apellido;
		 this.fechaNacimiento = new GregorianCalendar(theYear, theMonth, theDay);
		 this.edad=edad;
	 }
	 public Persona(int DNI, String nombre, String apellido, int theYear, int theMonth, int theDay,int edad,char sexo){
		 this.DNI = DNI;
		 this.nombre=nombre;
		 this.apellido=apellido;
		 this.fechaNacimiento = new GregorianCalendar(theYear, theMonth, theDay);
		 this.edad=edad;
		 this.sexo=Character.toLowerCase(sexo);
	 }
	 public Persona(int DNI, String nombre, String apellido, int theYear, int theMonth, int theDay,int edad,char sexo,double peso, double altura){
		 this.DNI = DNI;
		 this.nombre=nombre;
		 this.apellido=apellido;
		 this.fechaNacimiento = new GregorianCalendar(theYear, theMonth, theDay);
		 this.edad=edad;
		 this.sexo=Character.toLowerCase(sexo);
		 this.peso=peso;
		 this.altura=altura;
	 }
	 private double indiceMasaCorporal(){
		 return (this.peso/(this.altura/this.altura));
	 }
	 private boolean esSaludable(){
		 double min=18.5;
		 double max=25;
		 double imc=indiceMasaCorporal();
		 if((imc >= min) && (imc <= max)){
			 return true;
		 }
		 return false;
	 }
	 private boolean esCumpleanios(){
		 if (this.fechaNacimiento.get(Calendar.MONTH)== this.fechaActual.get(Calendar.MONTH)){
			 if (this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)== this.fechaActual.get(Calendar.DAY_OF_MONTH)){
				 return true;
			 }
		 }
		 return false;
	 }
	 private boolean esMayor(){
		 int mayor=18;
		 int dia=this.fechaActual.get(Calendar.DAY_OF_MONTH);
		 int mes=this.fechaActual.get(Calendar.MONTH);
		 int anio =this.fechaActual.get(Calendar.YEAR);
		 if (esEdadConsistente() && (anio-this.fechaNacimiento.get(Calendar.YEAR))>=mayor){
			 return true;
		 }
		 return false;
	 }
	 private boolean edadParaVotar(){
		 int minRequerido=16;
		 int dia=this.fechaActual.get(Calendar.DAY_OF_MONTH);
		 int mes=this.fechaActual.get(Calendar.MONTH);
		 int anio =this.fechaActual.get(Calendar.YEAR);
		 if (esEdadConsistente() && (anio-this.fechaNacimiento.get(Calendar.YEAR))>=minRequerido){
			 return true;
		 }
		 return false;
	 }
	 private boolean esEdadConsistente(){
		 if ((fechaActual.get(Calendar.YEAR) - this.fechaNacimiento.get(Calendar.YEAR))==this.edad){
			 return true;
		 }
		 return false;
	 }
	 
	 public String informacion(){
		 String info;
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
		 info="EL DNI de "+this.apellido+", "+this.nombre+" es: "+this.DNI+". Fecha de nacimiento: "+sdf.format(this.fechaNacimiento.getTime())+". Edad:"+this.edad;
		 info+=". Sexo: "+this.sexo+". Peso: "+this.peso+". Altura: "+this.altura;
		 if(esCumpleanios()){
			 info+=" -Hoy es el cumpleanios de "+this.nombre+"-";
		 }
		 if(esMayor()){
			 info+=" -Es mayor de edad- ";
		 }else{info+=" -No Es mayor de edad- ";}
		 if(esSaludable()){
			 info+=" -Es saludable- ";
		 }else{info+=" -No Es saludable- ";}
		 if(edadParaVotar()){
			 info+=" -Tiene edad para votar- ";
		 }else{info+=" -No tiene edad para votar- ";}
		 if(esEdadConsistente()){
			 info+=" -La edad concuerda con la fecha de nacimiento- ";
		 }else{info+=" -La edad no concuerda con la fecha de nacimiento- ";}
		 
		 return info;
	 }
	 public void getInfo(){
		 System.out.println(informacion());
	 }
	 public void setNombre(String nombre){
		 this.nombre=nombre;
	 }
	 public void setApellido(String apellido){
		 this.apellido=apellido;
	 }
	 public void setEdad(int edad){
		 this.edad=edad;
	 }
	 public void setFechaNacimiento(int anio,int mes, int dia){
		 Calendar setFN=new GregorianCalendar(anio, mes, dia);
		 this.fechaNacimiento=setFN;
	 }
	 public void setSexo(char sexo){
		 this.sexo=sexo;
	 }
	 public void setPeso(double peso){
		 this.peso=peso;
	 }
	 public void setAltura(double altura){
		 this.altura=altura;
	 }


	public static void main(String[] args) {
		int DNI=32907055;
		String nombre="Juan";
		String apellido="Rodriguez";
		int anio=1987;
		int mes=02;//mes=0 enero,mes=1 febrero, ...
		int dia=11;
		int edad=29;
		Persona p1 = new Persona(DNI,nombre, apellido,anio,mes,dia,edad);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
		System.out.println("#1. " + sdf.format(p1.fechaNacimiento.getTime())+" DNI: "+p1.DNI);
		Calendar fechaA = Calendar.getInstance();
		System.out.println(" sarasa "+fechaA.get(Calendar.YEAR));
		System.out.println(" fecha de nacimiento "+p1.fechaNacimiento.get(Calendar.YEAR));
		p1.getInfo();
	}

}
