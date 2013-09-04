/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package libros.de.iva;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.*;
import jxl.write.*;

/**
 * @author Agus Venturi     
 */
public class InformeVentas {
    private Venta[] ventas = new Venta[200];
    
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
    
    public void buildExcel(int cantFilas, String nombre, String año) throws WriteException {
//      Mesa de trabajo o cuaderno (archivo en si)
        WritableWorkbook workbook = null;
        try {
            workbook = Workbook.createWorkbook(new File("IVA Ventas"+"-"+nombre+"-"+año+".xls"));
        } catch (IOException ex) {
            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: " + ex);
        }
//      Hoja de calculo
        WritableSheet sheet = workbook.createSheet("Hoja 1", 0);
        SheetSettings settings = sheet.getSettings();
        settings.setVerticalFreeze(3);
        settings.setHorizontalFreeze(7);
//      Formato para centrar palabras
        WritableCellFormat centreFormat = new WritableCellFormat();
        centreFormat.setAlignment(Alignment.CENTRE);
        centreFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
//      Coloco las columnas que van a estar fusionadas y coloco lo que va a estar siempre
        try {
            sheet.mergeCells(0, 0, 2, 1);
            Label merge = new Label(0, 0, "Fecha de\nEmisión",centreFormat);
            sheet.addCell(merge);
        } catch (WriteException ex) {
            Logger.getLogger(InformeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sheet.mergeCells(3,0,4,1);
            Label merge = new Label(3, 0, "Comprobante",centreFormat);
            sheet.addCell(merge);
        } catch (WriteException ex) {
            Logger.getLogger(InformeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sheet.mergeCells(5,0,6,1);
            Label merge = new Label(5, 0, "Comprador",centreFormat);
            sheet.addCell(merge);
        } catch (WriteException ex) {
            Logger.getLogger(InformeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sheet.mergeCells(7,0,7,2);
            Label merge = new Label(7, 0, "Importe\nc/IVA",centreFormat);
            sheet.addCell(merge);
        } catch (WriteException ex) {
            Logger.getLogger(InformeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sheet.mergeCells(8,0,9,1);
            Label merge = new Label(8, 0, "Importes que no\nintegran PNG",centreFormat);
            sheet.addCell(merge);
            sheet.setColumnView(8, 25);
        } catch (WriteException ex) {
            Logger.getLogger(InformeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sheet.mergeCells(10,0,10,2);
            Label merge = new Label(10 ,0, "IVA 21%",centreFormat);
            sheet.addCell(merge);
        } catch (WriteException ex) {
            Logger.getLogger(InformeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sheet.mergeCells(11,0,11,2);
            Label merge = new Label(11, 0, "Neto Gravado\n21%",centreFormat);
            sheet.addCell(merge);
            sheet.setColumnView(11, 13);
        } catch (WriteException ex) {
            Logger.getLogger(InformeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sheet.mergeCells(12,0,12,2);
            Label merge = new Label(12, 0, "Percepciones",centreFormat);
            sheet.addCell(merge);
            sheet.setColumnView(12, 13);
        } catch (WriteException ex) {
            Logger.getLogger(InformeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Label lbl = new Label(0, 2, "D",centreFormat);
            sheet.addCell(lbl);
            sheet.setColumnView(0, 3);
        } catch (WriteException ex) {
            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Label lbl = new Label(1, 2, "M",centreFormat);
            sheet.addCell(lbl);
            sheet.setColumnView(1, 3);
        } catch (WriteException ex) {
            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Label lbl = new Label(2, 2, "A",centreFormat);
            sheet.addCell(lbl);
            sheet.setColumnView(2, 5);
        } catch (WriteException ex) {
            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Label lbl = new Label(3, 2, "Tipo",centreFormat);
            sheet.addCell(lbl);
            sheet.setColumnView(3, 10);
        } catch (WriteException ex) {
            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Label lbl = new Label(4, 2, "Número",centreFormat);
            sheet.addCell(lbl);
            sheet.setColumnView(4, 15);
        } catch (WriteException ex) {
            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Label lbl = new Label(5, 2, "Denominación",centreFormat);
            sheet.addCell(lbl);
            sheet.setColumnView(5, 20);
        } catch (WriteException ex) {
            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Label lbl = new Label(6, 2, "C.U.I.T.",centreFormat);
            sheet.addCell(lbl);
            sheet.setColumnView(6, 15);
        } catch (WriteException ex) {
            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Label lbl = new Label(8, 2, "Concepto",centreFormat);
            sheet.addCell(lbl);
            sheet.setColumnView(8, 10);
        } catch (WriteException ex) {
            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Label lbl = new Label(9, 2, "Importe",centreFormat);
            sheet.addCell(lbl);
            sheet.setColumnView(9, 10);
        } catch (WriteException ex) {
            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
//      Formato para limite de decimales luego de la coma
        NumberFormat dosDecimales = new NumberFormat("#.##"); 
        WritableCellFormat dosDecimalesFormat = new WritableCellFormat(dosDecimales);
//      Formatea la tabla, uso un for que va recorriendo las columnas y otro adentro del anterior que recorre las filas y les agrega
//      los datos correspondientes a cada columna
        for (int col = 0; col < 13; col++) {

            for (int row = 1; row < cantFilas+1; row++) {
                Venta venta = ventas[row-1];
                Label label = null;
                jxl.write.Number number = null;
                switch (col) {
                    case 0:
                        number = new jxl.write.Number(col, row+2, venta.getDia());
                        try {
                            sheet.addCell(number);
                        } catch (WriteException ex) {
                            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 1:
                        number = new jxl.write.Number(col, row+2, venta.getMes());
                        try {
                            sheet.addCell(number);
                        } catch (WriteException ex) {
                            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 2:
                        number = new jxl.write.Number(col, row+2, venta.getAño());
                        try {
                            sheet.addCell(number);
                        } catch (WriteException ex) {
                            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 3:
                        label = new Label(col, row+2, venta.getTipoComp());
                        try {
                            sheet.addCell(label);
                        } catch (WriteException ex) {
                            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.println("Error: " + ex);
                        }
                        break;
                    case 4:
                        label = new Label(col, row+2, venta.getNumComp());
                        try {
                            sheet.addCell(label);
                        } catch (WriteException ex) {
                            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.println("Error: " + ex);
                        }
                        break;
                    case 5:
                        label = new Label(col, row+2, venta.getNomComprador());
                        try {
                            sheet.addCell(label);
                        } catch (WriteException ex) {
                            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.println("Error: " + ex);
                        }
                        break;
                    case 6:
                        label = new Label(col, row+2, venta.getCuitComprador());
                        try {
                            sheet.addCell(label);
                        } catch (WriteException ex) {
                            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.println("Error: " + ex);
                        }
                        break;
                    case 7:
                        number = new jxl.write.Number(col, row+2, venta.getImpIva(), dosDecimalesFormat);
                        try {
                            sheet.addCell(number);
                        } catch (WriteException ex) {
                            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 8:
                        label = new Label(col, row+2, venta.getConceptoFueraNetoGravado());
                        try {
                            sheet.addCell(label);
                        } catch (WriteException ex) {
                            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 9:
                        number = new jxl.write.Number(col, row+2, venta.getImpFueraNetoGravado(), dosDecimalesFormat);
                        try {
                            sheet.addCell(number);
                        } catch (WriteException ex) {
                            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 10:
                        number = new jxl.write.Number(col, row+2, venta.getImpIva(), dosDecimalesFormat);
                        try {
                            sheet.addCell(number);
                        } catch (WriteException ex) {
                            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 11:
                        number = new jxl.write.Number(col, row+2, venta.getImpIvaFacturado(), dosDecimalesFormat);
                        try {
                            sheet.addCell(number);
                        } catch (WriteException ex) {
                            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 12:
                        number = new jxl.write.Number(col, row+2, venta.getNetoGravado(), dosDecimalesFormat);
                        try {
                            sheet.addCell(number);
                        } catch (WriteException ex) {
                            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    case 13:
                        label = new Label(col, row+2, venta.getPercepciones());
                        try {
                            sheet.addCell(label);
                        } catch (WriteException ex) {
                            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
                            System.out.println("Error: " + ex);
                        }
                        break;
                }
            }
        }
        try {
            workbook.write();
        } catch (IOException ex) {
            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            workbook.close();
        } catch (IOException | WriteException ex) {
            Logger.getLogger(InformeVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}