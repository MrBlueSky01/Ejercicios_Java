
		          System.out.println("\nLISTADO");
		          System.out.println("=======");
		          
		          for(i = 0; i < N; i++) {
		            if (!gestisimal[i].getCodigo().equals("LIBRE")) {
		              System.out.println(gestisimal[i]);
		            }
		          }
		  
		          break;
		          
		      case 2:
		          System.out.println("\nNUEVO ARTÍCULO");
		          System.out.println("==============");
		          
		          primeraLibre = 0;
		          codigo = [primeraLibre].getCodigo();
		          while ((primeraLibre < N) && (!(codigo.equals("LIBRE")))) {
		            primeraLibre++;
		            if (primeraLibre < N) {
		              codigo = gestisimal[primeraLibre].getCodigo();
		            }
		          }
		          
		          if (primeraLibre == N) {
		              System.out.println("Lo siento, a base de datos está llena.");
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
		                     System.out.println("Ese código ya existe en la base de datos.");
		                     System.out.print("Introduzca otro código: ");
		                   }
		                 }
		                 
		                 articulo[primeraLibre].setCodigo(codigoIntroducido);
		                 
		                 System.out.print("Descripcion: ");
		                 descripcionIntroducida = System.console().readLine();
		                 gestisimal[primeraLibre].setDescripcion(descripcionIntroducida);
		                 
		                 System.out.print("Precio de compra: ");
		                 precioDeCompraIntroducido = Double.parseDouble(System.console().readLine());
		                 gestisimal[primeraLibre].setPrecioDeCompra(precioDeCompraIntroducido);
		                 
		                 System.out.print("Precio de venta: ");
		                 precioDeVentaIntroducido = Double.parseDouble(System.console().readLine());
		                 gestisimal[primeraLibre].setPrecioDeVenta(precioDeVentaIntroducido);
		                 
		                 System.out.print("Stock: ");
		                 stockIntroducido = Integer.parseInt(System.console().readLine());
		                 gestisimal[primeraLibre].setStock(stockIntroducido);
		               }
		               
		               break;
		            	
		            }
		          
		      }