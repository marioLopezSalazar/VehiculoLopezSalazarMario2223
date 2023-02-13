
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoLopezSalazarMario2223 miVehiculoLopezSalazarMario2223;
        int stockActual;
        
        miVehiculoLopezSalazarMario2223 = new VehiculoLopezSalazarMario2223("Seat",18000,100);
        operativaVehiculosLopezSalazarMario2223(miVehiculoLopezSalazarMario2223, 50); 
        stockActual = miVehiculoLopezSalazarMario2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosLopezSalazarMario2223(VehiculoLopezSalazarMario2223 miVehiculoLopezSalazarMario2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoLopezSalazarMario2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoLopezSalazarMario2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
