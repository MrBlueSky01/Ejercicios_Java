 case 3:
          System.out.println("\nBAJA");
          System.out.println("====");
          
          System.out.print("Por favor, introduzca el código del artículo que desea dar de baja: ");
          codigoIntroducido = System.console().readLine();
    
          i = -1;
          codigo = "";
          do {
            i++;
            if (i < N) {
              codigo = articulo[i].getCodigo();
            }
          } while (!(codigo.equals(codigoIntroducido)) && (i < N));
      
          if (i == N) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            articulo[i].setCodigo("LIBRE");
            System.out.println("articulo borrado.");  
          }
          
          break;