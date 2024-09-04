package miPrincipal;

public class Cuenta_Cheques {
   //coloca el codigo faltante
   private String NombreCuenta;
   private String NombreCliente; 
   private String Sucursal;
   private float Saldo;
   
   public Cuenta_Cheques(String nombreCuenta, String nombreCliente, String sucursal, float saldo) {
      NombreCuenta = nombreCuenta;
      NombreCliente = nombreCliente;
      Sucursal = sucursal;
      Saldo = saldo;
   }


   
   public String getNombreCuenta() {
      return NombreCuenta;
   }
  public Cuenta_Cheques(String nombreCuenta, String nombreCliente, String sucursal) {
   NombreCuenta = nombreCuenta;
   NombreCliente = nombreCliente;
   Sucursal = sucursal;
}


 public void setNombreCuenta(String nombreCuenta) {
      NombreCuenta = nombreCuenta;
   }
   public String getNombreCliente() {
      return NombreCliente;
   }
   public void setNombreCliente(String nombreCliente) {
      NombreCliente = nombreCliente;
   }
   public String getSucursal() {
      return Sucursal;
   }
   public void setSucursal(String sucursal) {
      Sucursal = sucursal;
   }
   public float getSaldo() {
      return Saldo;
   }
   public void setSaldo(float saldo) {
      Saldo = saldo;
   }
   
    }
    

