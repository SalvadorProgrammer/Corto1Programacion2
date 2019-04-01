package Clases;

public class Estudiante {
    private String nombre, apellido, carnet;
    
    public Estudiante(String nombre, String apellido, String carnet){
        this.nombre=nombre;
        this.apellido=apellido;
        this.carnet=carnet;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getCarnet(){
        return this.carnet;
    }
    
}
