package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStreamReader stream = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(stream);
		
		int i;
		Fabricante proveedor1 = new Fabricante();
		Fabricante proveedor2 = new Fabricante();
		Televisor teleProveedor1 = new Televisor();
		Televisor teleProveedor2 = new Televisor();
		AireAcondicionado aire1 = new AireAcondicionado();
		AireAcondicionado aire2 = new AireAcondicionado();
		
		for(i=0; i < 2; i++)
		{
			System.out.println("Ingrese nombre del Fabricante: ");
			if(i==0) proveedor1.setNombre(buffer.readLine());
			else proveedor2.setNombre(buffer.readLine());
				
			System.out.println("Ingrese telefono del Fabricante: ");
			if(i==0) proveedor1.setTelefono(buffer.readLine());
			else proveedor2.setTelefono(buffer.readLine());
	
			System.out.println("Ingrese direccion del Fabricante: ");
			if(i==0) proveedor1.setDireccion(buffer.readLine());
			else proveedor2.setDireccion(buffer.readLine());
			
		}
		
		for(i=0; i< 2; i++)
		{
			if(i == 0) {
				System.out.println("Ingrese un televisor del proveedor 1");
				teleProveedor1.setTipo(proveedor1);
				}
			else {
				System.out.println("Ingrese un televisor del proveedor 2");
				teleProveedor2.setTipo(proveedor2);
				}
			
			System.out.println("Ingrese modelo");
			if(i==0) teleProveedor1.setModelo(buffer.readLine());
			else teleProveedor2.setModelo(buffer.readLine());	
			
			System.out.println("Ingrese precio");
			if(i==0) teleProveedor1.setPrecio(buffer.readLine());
			else teleProveedor2.setPrecio(buffer.readLine());
			
			System.out.println("Ingrese stock");
			if(i==0) teleProveedor1.setStock(buffer.readLine());
			else teleProveedor2.setStock(buffer.readLine());
			
			System.out.println("Ingrese pulgadas");
			if(i==0) teleProveedor1.setPulgadas(buffer.readLine());
			else teleProveedor2.setPulgadas(buffer.readLine());
			
			System.out.println("Ingrese si posee HDMI ( S / N )");
			
			//teleProveedor2.setPoseeHDMI(Boolean.getBoolean(buffer.readLine()));
			String e = buffer.readLine();
			
			if(e.equals("S") || e.equals("s") ) teleProveedor1.setPoseeHDMI(true);
			else teleProveedor2.setPoseeHDMI(false);
			
		}
		
		for(i=0; i< 2; i++)
		{
			if(i == 0) {
				System.out.println("Ingrese un aire acondicionado del proveedor 1");
				aire1.setTipo(proveedor1);
				}
			else {
				System.out.println("Ingrese un aire acondicionado del proveedor 2");
				aire2.setTipo(proveedor2);
				}
			
			System.out.println("Ingrese modelo");
			if(i==0) aire1.setModelo(buffer.readLine());
			else aire2.setModelo(buffer.readLine());	
			
			System.out.println("Ingrese precio");
			if(i==0) aire1.setPrecio(buffer.readLine());
			else aire2.setPrecio(buffer.readLine());
			
			System.out.println("Ingrese stock");
			if(i==0) aire1.setStock(buffer.readLine());
			else aire2.setStock(buffer.readLine());
			
			System.out.println("Ingrese frigorias");
			if(i==0) aire1.setFrigorias(buffer.readLine());
			else aire2.setFrigorias(buffer.readLine());
			
				
			
		}
		
		System.out.println("  ");	
		System.out.println("MODELO " + teleProveedor1.getModelo());
		System.out.println("PRECIO " + teleProveedor1.getPrecio());
		System.out.println("STOCK " + teleProveedor1.getStock());
		System.out.println("FABRICANTE " + teleProveedor1.getTipo());
		System.out.println("PULGADAS " + teleProveedor1.getPulgadas());
		if(teleProveedor1.getPoseeHDMI()) System.out.println("TIENE HDMI");
		else System.out.println("NO TIENE HDMI");
		
		System.out.println("  ");
		System.out.println("MODELO " + teleProveedor2.getModelo());
		System.out.println("PRECIO " + teleProveedor2.getPrecio());
		System.out.println("STOCK " + teleProveedor2.getStock());
		System.out.println("FABRICANTE " + teleProveedor2.getTipo());
		System.out.println("PULGADAS " + teleProveedor2.getPulgadas());
		if(teleProveedor1.getPoseeHDMI()) System.out.println("TIENE HDMI");
		else System.out.println("NO TIENE HDMI");
		
		System.out.println("  ");
		System.out.println("MODELO " + aire1.getModelo());
		System.out.println("PRECIO " + aire1.getPrecio());
		System.out.println("STOCK "+ aire1.getStock());
		System.out.println("FABRICANTE " + aire1.getTipo());
		System.out.println("FRIGORIAS " + aire1.getFrigorias());
		
		System.out.println("  ");
		System.out.println("MODELO " + aire2.getModelo());
		System.out.println("PRECIO " + aire2.getPrecio());
		System.out.println("STOCK " + aire2.getStock());
		System.out.println("FABRICANTE " + aire2.getTipo());
		System.out.println("FRIGORIAS " + aire2.getFrigorias());

		
	}

}
