package Modelo;
// Generated 26/10/2016 09:36:35 PM by Hibernate Tools 3.6.0



/**
 * Vehiculo generated by hbm2java
 */
public class Vehiculo  implements java.io.Serializable {


     private Integer idVehiculo;
     private String marca;
     private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
       this.marca = marca;
       this.modelo = modelo;
    }
   
    public Integer getIdVehiculo() {
        return this.idVehiculo;
    }
    
    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

 




}


