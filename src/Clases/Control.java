package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Control {
    
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    
    public Control(ArrayList listaEstudiantes){
        this.listaEstudiantes=listaEstudiantes;
    }
    
    
    
    public void buscar(String carnet){//METODO PARA BUSCAR UN ESTUDIANTE.
        for(int i=0; i<=listaEstudiantes.size(); i++){
            if(this.listaEstudiantes.get(i).getCarnet().equalsIgnoreCase(carnet)){
                
                
            }
        }
       
    } 
    
    
    public void editar(String carnet){//METODO PARA EDITAR UN ESTUDIANTE.
        for(int i=0; i<=listaEstudiantes.size(); i++){
            if(this.listaEstudiantes.get(i).getCarnet().equalsIgnoreCase(carnet)){
                
            }
        }
    }
    
    public ArrayList eliminar(String carnet){//METODO PARA ELIMINAR UN ESTUDIANTE.
        for(int i=0; i<=listaEstudiantes.size(); i++){
            if(this.listaEstudiantes.get(i).getCarnet().equalsIgnoreCase(carnet)){
                this.listaEstudiantes.remove(i);
                JOptionPane.showMessageDialog(null, "C guardo");
            }
        }
        return this.listaEstudiantes;
    }
    
    public ArrayList agregar(Estudiante estudiante){//METODO PARA AGREGAR UN ESTUDIATE.
        this.listaEstudiantes.add(estudiante);
        return this.listaEstudiantes;
    }
    
    public void ordenar(String carnet){
        
    }
            
    
}
