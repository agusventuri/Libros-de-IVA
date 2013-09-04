/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package libros.de.iva;

/**
 * @author Agus Venturi
 */
public class Compra {
/*
 *Clase que me permite instanciar un objeto "Compra (representa a un recibo en la vida real)" 
 *el cual representa una fila en el archivo .xls final
 */
//Declaro las variables usadas para crear una "Compra"
    public int dia,mes,año;
    public double impIva,impFueraNetoGravado,retenImpGcias,retenPercepIva,retenIngBrutos,retenMpal;
    public String tipoComp,conceptoFueraNetoGravado,numComp,nomVendedor,cuitVendedor;

//Constructor del objeto "Compra"
    public Compra(int dia, int mes, int año, double impIva, String conceptoFueraNetoGravado, double impFueraNetoGravado, double retenImpGcias, double retenPercepIva, double retenIngBrutos, double retenMpal, String tipoComp, String numComp, String nomVendedor, String cuitVendedor) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.impIva = impIva;
        this.conceptoFueraNetoGravado = conceptoFueraNetoGravado;
        this.impFueraNetoGravado = impFueraNetoGravado;
        this.retenImpGcias = retenImpGcias;
        this.retenPercepIva = retenPercepIva;
        this.retenIngBrutos = retenIngBrutos;
        this.retenMpal = retenMpal;
        this.tipoComp = tipoComp;
        this.numComp = numComp;
        this.nomVendedor = nomVendedor;
        this.cuitVendedor = cuitVendedor;
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
    
    public double getRetenImpGcias() {
        return retenImpGcias;
    }

    public void setRetenImpGcias(double retenImpGcias) {
        this.retenImpGcias = retenImpGcias;
    }

    public double getRetenPercepIva() {
        return retenPercepIva;
    }

    public void setRetenPercepIva(double retenPercepIva) {
        this.retenPercepIva = retenPercepIva;
    }

    public double getRetenIngBrutos() {
        return retenIngBrutos;
    }

    public void setRetenIngBrutos(double retenIngBrutos) {
        this.retenIngBrutos = retenIngBrutos;
    }

    public double getRetenMpal() {
        return retenMpal;
    }

    public void setRetenMpal(double retenMpal) {
        this.retenMpal = retenMpal;
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

    public String getNomVendedor() {
        return nomVendedor;
    }

    public void setNomVendedor(String nomVendedor) {
        this.nomVendedor = nomVendedor;
    }

    public String getCuitVendedor() {
        return cuitVendedor;
    }

    public void setCuitVendedor(String cuitVendedor) {
        this.cuitVendedor = cuitVendedor;
    }
//Metodo que calcula un importe con el IVA del 21% aplicado
    public double getImpIva21() {
        return impIva/1.21*0.21;
    }
//Metodo que calcula un importe con el IVA del 27% aplicado
    public double getImpIva27() {
        return impIva/1.27*0.27;
    }
//Metodo que calcula un importe con el IVA del 10,5% aplicado
    public double getImpIva105() {
        return impIva/1.105*0.105;
    }
//Metodo que calcula el Neto Gravado de un importe
    public double getNetoGravado21() {
        return impIva/1.21;
    }
}
