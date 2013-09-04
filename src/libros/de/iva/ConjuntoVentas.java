/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package libros.de.iva;

/**
 * @author Agus Venturi
 */
public class ConjuntoVentas {
//Esta clase me devuelve los distintos valores de las compras separados en vectores
    private Venta[] ventas = new Venta[200];
//Aca lo que hago es crear un vector de objetos "Compra" para despues pedirle los datos necesarios
    public void setVentas(Venta venta) {
        for (int i = 0; i<200;i++){
            if(ventas[i]==null){
                ventas[i]= venta;
                break;//break porque sino no deja de agregar prpiedades
            }
        }
    }
    
    public Venta[] getVentas() {
        return ventas;
    }
//Pido la lista de las distintas propiedades recorriendo el vector de ventas, el if que dice "if(ventas[i]!=null) pregunta si el 
//objeto venta no es null, y en caso de ser asi pide el valor
    public String[] getListaDias() {
        String[] lista = new String[200];
        for (int i = 0; i<100;i++){
            if(ventas[i]!=null){
                Venta venta = ventas[i];
                String tipo = Integer.toString(venta.getDia());
                lista[i] = tipo;
            }
        }
        return lista;
    }
    
    public String[] getListaMeses() {
        String[] lista = new String[200];
        for (int i = 0; i<100;i++){
            if(ventas[i]!=null){
                Venta venta = ventas[i];
                String tipo = Integer.toString(venta.getMes());
                lista[i] = tipo;
            }
        }
        return lista;
    }
    
    public String[] getListaAños() {
        String[] lista = new String[200];
        for (int i = 0; i<100;i++){
            if(ventas[i]!=null){
                Venta venta = ventas[i];
                String tipo = Integer.toString(venta.getAño());
                lista[i] = tipo;
            }
        }
        return lista;
    }
    
    public String[] getListaTipoComp() {
        String[] lista = new String[200];
        for (int i = 0; i<100;i++){
            if(ventas[i]!=null){
                Venta venta = ventas[i];
                String tipo = venta.getTipoComp();
                lista[i] = tipo;
            }
        }
        return lista;
    }
    
    public String[] getListaNumComp() {
        String[] lista = new String[200];
        for (int i = 0; i<100;i++){
            if(ventas[i]!=null){
                Venta venta = ventas[i];
                String tipo = venta.getNumComp();
                lista[i] = tipo;
            }
        }
        return lista;
    }
    
    public String[] getListaImpIva() {
        String[] lista = new String[200];
        for (int i = 0; i<100;i++){
            if(ventas[i]!=null){
                Venta venta = ventas[i];
                String tipo = Double.toString(venta.getImpIva());
                lista[i] = tipo;
            }
        }
        return lista;
    }
    
    public String[] getListaConceptoFueraNetoGravado() {
        String[] lista = new String[200];
        for (int i = 0; i<100;i++){
            if(ventas[i]!=null){
                Venta venta = ventas[i];
                String tipo = venta.getConceptoFueraNetoGravado();
                lista[i] = tipo;
            }
        }
        return lista;
    }
    
    public String[] getListaImpFueraNetoGravado() {
        String[] lista = new String[200];
        for (int i = 0; i<100;i++){
            if(ventas[i]!=null){
                Venta venta = ventas[i];
                String tipo = Double.toString(venta.getImpFueraNetoGravado());
                lista[i] = tipo;
            }
        }
        return lista;
    }
    
    public String[] getListaImpIvaFacturado() {
        String[] lista = new String[200];
        for (int i = 0; i<100;i++){
            if(ventas[i]!=null){
                Venta venta = ventas[i];
                String tipo = Double.toString(venta.getImpIvaFacturado());
                lista[i] = tipo;
            }
        }
        return lista;
    }
    
    public String[] getListaNetoGravado() {
        String[] lista = new String[200];
        for (int i = 0; i<100;i++){
            if(ventas[i]!=null){
                Venta venta = ventas[i];
                String tipo = Double.toString(venta.getNetoGravado());
                lista[i] = tipo;
            }
        }
        return lista;
    }
    
    public String[] getListaPercepciones() {
        String[] lista = new String[200];
        for (int i = 0; i<100;i++){
            if(ventas[i]!=null){
                Venta venta = ventas[i];
                String tipo = venta.getPercepciones();
                lista[i] = tipo;
            }
        }
        return lista;
    }
}
