import java.util.*;

public class GESTISIMAL {

	static int N = 100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		int primeraLibre;
		int i;
		int stockIntroducido;
		double precioDeCompraIntroducido;
		double precioDeVentaIntroducido;
		String codigo;
		String codigoIntroducido = "";
		String descripcionIntroducida;
		String precioDeCompraIntroducidoString;
		String precioDeVentaIntroducidoString;
		String stokIntroducidoString;
		boolean existeCodigo;
		
		Articulo[] articulo = new Articulo[N];

		for (i = 0; i < N; i++) {
			articulo[i] = new Articulo();
		}
		
		do {
		      System.out.println("1. Listado");
		      System.out.println("2. Alta");
		      System.out.println("3. Baja");
		      System.out.println("4. Modificación");
		      System.out.println("5. Entrada de mercancía");
		      System.out.println("6. Salida de mercancía");
		      System.out.println("7. Salir");
		      System.out.print("Introduce una opción: ");
		      opcion = sc.nextInt();

		      switch (opcion) {
		      
		      case 1:
		    	  System.out.println("\nListado");
		    	  System.out.println("_______");
		    	  
		    	  for (i = 0; i < N; i++) {
		    		  if (!articulo[i].getCodigo().equals("LIBRE")) {
			              System.out.println(articulo[i]);
		    		  }
		    	  } 
		    	  break;
		    	  
		      case 2:
		    	  System.out.println("\nAlta");
		    	  System.out.println("_______");
		    	  
		    	  primeraLibre = 0;
		          codigo = articulo[primeraLibre].getCodigo();
		          while ((primeraLibre < N) && (!(codigo.equals("LIBRE")))) {
		            primeraLibre++;
		            if (primeraLibre < N) {
		              codigo = articulo[primeraLibre].getCodigo();
		            }
		          }
		          
		          if (primeraLibre == N) {
		            System.out.println("La base de datos está llena, lo sentimos.");
		          } else {
		        	  System.out.println("Por favor, introduzca los datos del artículo.");  
		              System.out.print("Código: ");
		              existeCodigo = true;
		              while (existeCodigo) {
		                existeCodigo = false;
		                codigoIntroducido = System.console().readLine();
		                for (i = 0; i < N; i++) {
		                  if (codigoIntroducido.equals(articulo[i].getCodigo())) {
		                    existeCodigo = true;
		                  }
		                }
		              if (existeCodigo) {
		            	  System.out.println("Este codigo ya existe");
		            	  System.out.println("Introduce otro codigo: ");
		              }  
		              }
		              articulo[primeraLibre].setCodigo(codigoIntroducido);
		              System.out.println("Descripción: ");
		              descripcionIntroducida = sc.nextLine();
		              articulo[primeraLibre].setDescripcion(descripcionIntroducida);
		              System.out.println("Precio de compra: ");
		              precioDeCompraIntroducido = sc.nextDouble();
		              articulo[primeraLibre].setPrecioDeCompra(precioDeCompraIntroducido);
		              System.out.println("Precio de venta: ");
		              precioDeVentaIntroducido = sc.nextDouble();
		              articulo[primeraLibre].setPrecioDeVenta(precioDeVentaIntroducido);
		              System.out.println("Stock: ");
		              stockIntroducido = sc.nextInt();
		              articulo[primeraLibre].setStock(stockIntroducido);
		          }
		          break;
		          
		      case 3:
		    	  System.out.println("\nBaja: ");
		    	  System.out.println("_______");
		    	  System.out.println("Introduzca el codigo del articulo que quiera dar de baja");
		    	  codigoIntroducido = sc.nextLine();
		    	  
		    	  i = -1;
		    	  codigo = "";
		    	  do {
		    		  i++;
		    		  if(1<N) {
		    			  codigo = articulo[i].getCodigo();
		    		  }
		    	  }while(!(codigo.equals(codigoIntroducido)) && (i<N));
		    	  
		    	  if(i==N) {
		    		  System.out.println("El codigo no existe");
		    	  }else {
		    		  articulo[i].setCodigo("LIBRE");
		    		  System.out.println("Articulo borrado");
		    	  }
		    	  
		      case 4:
		    	  System.out.println("\nModificacio: ");
		    	  System.out.println("_____________");
		          System.out.println("Introduzca los nuevos datos del articulo a modificar: ");
		          codigoIntroducido = sc.nextLine();
		          
		          i = -1;
		          do {
		    		  i++;
		          } while (!((articulo[i].getCodigo()).equals(codigoIntroducido)));
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
		          
