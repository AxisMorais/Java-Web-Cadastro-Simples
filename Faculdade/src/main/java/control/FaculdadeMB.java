package control;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import model.Faculdade;  

@Named("faculdadeMB")
@RequestScoped
public class FaculdadeMB {
    
    //
    private Faculdade fac = new Faculdade();  
    
    
    public String getCodigo() {
        return String.valueOf(fac.getId());  
    }
    
    public void setCodigo(String codigo) {
        fac.setId(Integer.parseInt(codigo));  
    }
    
    public String getNomeC() {
        return fac.getNomeCompleto();  
    }
    
    public void setNomeC(String nomeC) {
        fac.setNomeCompleto(nomeC);  
    }
    
    public String getNomeF() {
        return fac.getNomeFantasia();  
    }
    
    public void setNomeF(String nomeF) {
        fac.setNomeFantasia(nomeF);  
    }
}