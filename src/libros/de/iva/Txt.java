/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package libros.de.iva;

import java.io.*;

/**
 *
 * @author agus
 */
abstract class Txt {

    public static void guardar(String texto) {
        /*
         * Metodo usado para guardar un .txt que contenga la lista de los clientes del contador
         */
        File f = new File("ListaDeClientes.txt");

        //Escritura
        try {
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter pw = new PrintWriter(bw);
            pw.write(texto + "\n");//escribimos en el archivo
            pw.close();
            bw.close();
        } catch (IOException e) {
        };
    }

    public static int count(File filename) throws IOException {
        /*
         * Este metodo lo que hace es contar las lineas de un fichero de texto mediante el uso del método readLine() del BufferedReader
         * , lo que nos permite detectar si una línea es null, y en el caso de serlo salir de un bucle contador
         */
        int lNumeroLineas = 0;
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader bf = new BufferedReader(fr);
            String sCadena;
            while ((sCadena = bf.readLine()) != null) {
                lNumeroLineas++;
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: " + fnfe);
        } catch (IOException ioe) {
            System.out.println("Error: " + ioe);
        }
        return lNumeroLineas;
    }
}