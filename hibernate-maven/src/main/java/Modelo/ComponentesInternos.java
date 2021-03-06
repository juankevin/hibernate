package Modelo;
// Generated 26/10/2016 09:36:35 PM by Hibernate Tools 3.6.0



/**
 * ComponentesInternos generated by hbm2java
 */
public class ComponentesInternos  implements java.io.Serializable {


     private Integer idComponentesInternos;
     private String nombreInterno;
     private int idVehiculo;

    public ComponentesInternos() {
    }

    public ComponentesInternos(String nombreInterno, int idVehiculo) {
       this.nombreInterno = nombreInterno;
       this.idVehiculo = idVehiculo;
    }
   
    public Integer getIdComponentesInternos() {
        return this.idComponentesInternos;
    }
    
    public void setIdComponentesInternos(Integer idComponentesInternos) {
        this.idComponentesInternos = idComponentesInternos;
    }
    public String getNombreInterno() {
        return this.nombreInterno;
    }
    
    public void setNombreInterno(String nombreInterno) {
        this.nombreInterno = nombreInterno;
    }
    public int getIdVehiculo() {
        return this.idVehiculo;
    }
    
    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    @Override
    public String toString() {
        return "ComponentesInternos{" + "idComponentesInternos=" + idComponentesInternos + ", nombreInterno=" + nombreInterno + ", idVehiculo=" + idVehiculo + '}';
    }




}


