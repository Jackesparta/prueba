package ejerciciojava;
	
import java.io.*;
import java.util.Scanner;

	public class principal {
		
		public static void main(String args[]) throws IOException
		{
			Scanner t = new Scanner (System.in);
			File archivo1= new File("archivo1.txt");
			File archivo2= new File("achivo2.txt");
			int c;
			try
			{
				
				if(archivo1.exists()){
					if(!archivo2.exists()){
						System.out.println("archivo2 no existe y se a creado");
						archivo2.createNewFile();
					}
					
			
					FileInputStream f1 =new FileInputStream(archivo1);
					FileInputStream f2 =new FileInputStream(archivo2);
					FileOutputStream f2w =new FileOutputStream(archivo2);
					
					
					
					while((c=f1.read())!= -1){
						
						f2w.write((char)c);
					}
					
				
					}
					
					
				
				else{
					System.out.println("no se encuentra el archivo de origen");
				}
				
				
				
			}
			catch(FileNotFoundException e){
				System.out.println("el fichero no existe");
				System.out.println("nombre: " +  archivo1.getName());
				System.out.println("ruta absoluta: "+ archivo1.getAbsolutePath());
				
				
			}
		}
		
		
		
	}

