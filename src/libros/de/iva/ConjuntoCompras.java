/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package libros.de.iva;

/**
 * @author Agus Venturi
 */
public class ConjuntoCompras {
//Esta clase me devuelve los distintos valores de las compras separados en vectores
    private Compra[] compras = new Compra[200];
//Aca lo que hago es crear un vector de objetos "Compra" para despues pedirle los datos necesarios
    public void setCompras(Compra compra) {
        for (int i = 0; i<200;i++){
            if(compras[i]==null){
                compras[i]= compra;
                break;//break porque sino no deja de agregar prpiedades
            }
        }
    }
    
    public Compra[] getCompras() {
        return compras;
    }
//Pido la lista de las distintas propiedades recorriendo el vector de compras, el if que dice "if(compras[i]!=null) pregunta si el 
//objeto compra no es null, y en caso de ser asi pide el valor
    public String[] getListaDias() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = Integer.toString(compra.getDia());
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaMeses() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = Integer.toString(compra.getMes());
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaAños() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = Integer.toString(compra.getAño());
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaTipoComp() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = compra.getTipoComp();
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaNumComp() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = compra.getNumComp();
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaNomVendedor() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = compra.getNomVendedor();
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaCuitVendedor() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = compra.getCuitVendedor();
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaImpIva() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = Double.toString(compra.getImpIva());
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaConceptoFueraNetoGravado() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = compra.getConceptoFueraNetoGravado();
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaImpFueraNetoGravado() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = Double.toString(compra.getImpFueraNetoGravado());
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaImpIva21() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = Double.toString(compra.getImpIva21());
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaImpIva27() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = Double.toString(compra.getImpIva27());
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaImpIva105() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = Double.toString(compra.getImpIva105());
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaNetoGravado() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = Double.toString(compra.getNetoGravado21());
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaRetenImpGcias() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = Double.toString(compra.getRetenImpGcias());
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaRetenPercepIva() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = Double.toString(compra.getRetenPercepIva());
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaRetenIngBrutos() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = Double.toString(compra.getRetenIngBrutos());
                lista[i] = string;
            }
        }
        return lista;
    }
    
    public String[] getListaRetenMpal() {
        String[] lista = new String[200];
        for (int i = 0; i<200;i++){
            if(compras[i]!=null){
                Compra compra = compras[i];
                String string = Double.toString(compra.getRetenMpal());
                lista[i] = string;
            }
        }
        return lista;
    }
}