package herencia.MultiniveJerarquica;

public class HerenciaMultinivelJerarquicaMain {

	public static void main(String[] args) {
		
		/*Vehiculo vehiculo = new Vehiculo(12000, "ad454d4f50", "Acme");
		Acuatico acuatico = new Acuatico(12, 12000, "ad454d4f50", "Acme");
		Submarino submarino = new Submarino("Juan", "Militar", 12, 12000, "ad454d4f50", "Acme");
		Barco barco = new Barco("Titanic", "Heiham", "crucero", false, 1500, 12000, "ad454d4f50", "Acme");
		
		barco.encender();
		
		submarino.encender();*/
		
		//Polimorfismo
		
		Vehiculo []vehiculos = new Vehiculo[5]; 
		vehiculos[0] = new Vehiculo(12000,"ad454d4f50","Acme");
		vehiculos[1] = new Submarino("Juan","Militar",12,12000,"ad454d4f50","Acme");
		vehiculos[2] = new Barco("dsdf","Titanic","crucero",false,1500,12000,"ad454d4f50","Acme");
		vehiculos[3] = new Auto("sedan","piel","hibrido",180,150000,"ad454d4f50","Acme");
		vehiculos[4] = new Moto(2,"Deportiva","hibrido",200,150400,"ad454d4f50","Acme");
		//vehiculos[4] = "Hola mundo";
		
		for(int i = 0; i<5; i++) {
			System.out.println("Vehiculo " + i + ": " +vehiculos[i].toString());
		}
		
		/*Terrestre Terrestre = new Terrestre();
		Terrestre.setKilometraje(156154);
		System.out.println(Terrestre.getKilometraje());
		Terrestre.setKilometraje(54515);
		System.out.println(Terrestre.getKilometraje());*/
	}

}
