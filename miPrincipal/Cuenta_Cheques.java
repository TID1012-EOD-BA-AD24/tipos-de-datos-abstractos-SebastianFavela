package miPrincipal;

public class Cuenta_Cheques {
   private String NombreCuenta;
   private String NombreCliente;
   private String Sucursal;
   private float Saldo;
  
   public Cuenta_Cheques(){
   }

   public Cuenta_Cheques(String nombreCuenta, String nombreCliente, String sucursal,float Saldo) {
      this.NombreCuenta = nombreCuenta;
      this.NombreCliente = nombreCliente;
      this.Sucursal = sucursal;
      this.Saldo = Saldo;
   }
   public Cuenta_Cheques(String nombreCuenta, String nombreCliente, String sucursal) {
      this.NombreCuenta = nombreCuenta;
      this.NombreCliente = nombreCliente;
      this.Sucursal = sucursal;
   }
   public float getSaldo() {
      return Saldo;
   }
   public float deposito(float cantidad){
      if(cantidad>0){
         this.Saldo+= cantidad;
      }
      return this.Saldo;
   }
   public float retiro(float cantidad){
      if(cantidad>0&&cantidad<=this.Saldo){
         this.Saldo-=cantidad;
      }
      return this.Saldo;
   }
   public float muestra_saldo(){
      return this.Saldo;
   }

   public String getNombreCliente() {
      return NombreCliente;
   }

   public void setNombreCliente(String nombreCliente) {
      NombreCliente = nombreCliente;
   }

   public String getNombreCuenta() {
      return NombreCuenta;
   }

   public void setNombreCuenta(String nombreCuenta) {
      NombreCuenta = nombreCuenta;
   }

   public String getSucursal() {
      return Sucursal;
   }

   public void setSucursal(String sucursal) {
      Sucursal = sucursal;
   }
    
}

