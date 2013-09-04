/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package libros.de.iva;

/**
 * @author Agus Venturi
 */
public class Venta {
/*
 *Clase que me permite instanciar un objeto "Venta (representa a un recibo en la vida real)" 
 *el cual representa una fila en el archivo .xls final
 */
//Declaro las variables usadas para crear una "Venta"
    public int dia,mes,año,id;
    public double impIva,impFueraNetoGravado,impIvaFacturado,netoGravado;
    public String tipoComp,conceptoFueraNetoGravado,numComp,nomComprador,cuitComprador,percepciones;

//Constructor del objeto "Venta"
    public Venta(int dia, int mes, int año, int id, double impIva, String conceptoFueraNetoGravado, double impFueraNetoGravado
            , String tipoComp, String numComp, String nomComprador, String cuitComprador, String percepciones) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.impIva = impIva;
        this.conceptoFueraNetoGravado = conceptoFueraNetoGravado;
        this.impFueraNetoGravado = impFueraNetoGravado;
        this.tipoComp = tipoComp;
        this.numComp = numComp;
        this.nomComprador = nomComprador;
        this.cuitComprador = cuitComprador;
        this.percepciones = percepciones;
        this.id = id;
    }
//Metodos que muestran(get) o editan(set) atributos del objeto ya instanciado
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getImpIva() {
        return impIva;
    }

    public void setImpIva(double impIva) {
        this.impIva = impIva;
    }

    public String getConceptoFueraNetoGravado() {
        return conceptoFueraNetoGravado;
    }

    public void setConceptoFueraNetoGravado(String conceptoFueraNetoGravado) {
        this.conceptoFueraNetoGravado = conceptoFueraNetoGravado;
    }

    public double getImpFueraNetoGravado() {
        return impFueraNetoGravado;
    }

    public void setImpFueraNetoGravado(double impFueraNetoGravado) {
        this.impFueraNetoGravado = impFueraNetoGravado;
    }
//Metodo que calcula un importe con el IVA del 21% aplicado
    public double getImpIvaFacturado() {
        return impIva/1.21*0.21;
    }

    public void setImpIvaFacturado(double impIvaFacturado) {
        this.impIvaFacturado = impIvaFacturado;
    }
//Metodo que calcula el Neto Gravado de un importe
    public double getNetoGravado() {
        return impIva/1.21;
    }

    public void setNetoGravado(double netoGravado) {
        this.netoGravado = netoGravado;
    }

    public String getTipoComp() {
        return tipoComp;
    }

    public void setTipoComp(String tipoComp) {
        this.tipoComp = tipoComp;
    }

    public String getNumComp() {
        return numComp;
    }

    public void setNumComp(String numComp) {
        this.numComp = numComp;
    }

    public String getNomComprador() {
        return nomComprador;
    }

    public void setNomComprador(String nomComprador) {
        this.nomComprador = nomComprador;
    }

    public String getCuitComprador() {
        return cuitComprador;
    }

    public void setCuitComprador(String cuitComprador) {
        this.cuitComprador = cuitComprador;
    }

    public String getPercepciones() {
        return percepciones;
    }

    public void setPercepciones(String percepciones) {
        this.percepciones = percepciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}