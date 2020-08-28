/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
//import java.awt.Image;
import com.itextpdf.text.Image;
import java.awt.Desktop;
//archivos
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
//librerias ajenas a itext
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*import sun.tools.jar.Main;*/

/**
 * @web http://jc-mouse.blogspot.com/
 * @author Mouse
 */
public class ArchPdf {

    private File ruta_destino;

    public ArchPdf(){
        ruta_destino=null;
    }

    
    public void crear_PDF(Corte corte, DefaultTableModel tallas, DefaultTableModel colores) throws BadElementException, IOException{
        File archivo = new File("D:\\Administrador y Contador Textil PDF'S\\Corte # " + corte.getIdentificacion() +".pdf");
        ruta_destino = archivo;
        
            try {
                // se crea instancia del documento
                Document mipdf = new Document();
                // se establece una instancia a un documento pdf
                PdfWriter.getInstance(mipdf, new FileOutputStream(archivo));
                mipdf.open();// se abre el documento
                //"C:\\Users\\jesicaalejandra\\Documents\\Administrador y Contador Textil\\IMG_20180220_091211.jpg"
                Image image = Image.getInstance("C:\\Users\\YO\\Pictures\\IMG_20180220_091211.jpg");
                mipdf.addTitle("Datos del Corte " + corte.getIdentificacion()); // se añade el titulo
                
                mipdf.add(new Paragraph("                                                                                 FICHA TECNICA"));
                mipdf.add(new Paragraph("ID: " + corte.getIdentificacion()+"\n"));
                mipdf.add(new Paragraph("Modelo: " + corte.getModeloId().getNombre()+"\n"));
                mipdf.add(new Paragraph("Fecha: " + corte.getFechaEnvio()+"\n"));
                mipdf.add(new Paragraph("Cantidad: " + corte.getCantidad()+"\n\n                                                  Tallas \n\n"));
                
                PdfPTable tabla = new PdfPTable(tallas.getColumnCount());
               
                tabla.setWidths(new int[]{7,7});
                for(int i=0; i<tallas.getColumnCount(); i++)
                {
                    tabla.addCell(tallas.getColumnName(i));
                }
                
                for(int i=0; i<tallas.getRowCount(); i++)
                {
                    for(int j=0; j<tallas.getColumnCount(); j++)
                    {
                        tabla.addCell(tallas.getValueAt(i, j).toString());
                    }
                }
                
                mipdf.add(tabla);
                
                mipdf.add(new Paragraph("\n\n                                                  Colores\n\n"));
                
                PdfPTable tabla2 = new PdfPTable(colores.getColumnCount());
               
                tabla.setWidths(new int[]{7,7});
                for(int i=0; i<colores.getColumnCount(); i++)
                {
                    tabla2.addCell(colores.getColumnName(i));
                }
                
                for(int i=0; i<colores.getRowCount(); i++)
                {
                    for(int j=0; j<colores.getColumnCount(); j++)
                    {
                        tabla2.addCell(colores.getValueAt(i, j).toString());
                    }
                }
                
                mipdf.add(tabla2);
                
                mipdf.add(image);
                
                mipdf.close(); //se cierra el PDF&
                JOptionPane.showMessageDialog(null,"Documento PDF creado");
            } catch (DocumentException ex) {
                JOptionPane.showMessageDialog(null, "Error " + ex);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Archivo en Uso: " + ex);
            }
    }
    
    public void crear_PDFSueldoOperario(Operario operario, DefaultTableModel modelo){
        //abre ventana de dialogo "guardar"
        Colocar_Destino();
        //si destino es diferente de null
        if(this.ruta_destino!=null){
            try {
                // se crea instancia del documento
                Document mipdf = new Document();
                // se establece una instancia a un documento pdf
                PdfWriter.getInstance(mipdf, new FileOutputStream(this.ruta_destino + ".pdf"));
                mipdf.open();// se abre el documento
                mipdf.addTitle("Datos"); // se añade el titulo
                
                mipdf.add(new Paragraph("                                                                       Pago"));
                mipdf.add(new Paragraph("ID: " + operario.getIdentificacion()+"\n"));
                mipdf.add(new Paragraph("Nombre : " + operario.getNombre()+"\n\n"));
                
                
                PdfPTable tabla = new PdfPTable(modelo.getColumnCount());
               
                //tabla.setWidths(new int[]{5,8});
                for(int i=0; i<modelo.getColumnCount(); i++)
                {
                    tabla.addCell(modelo.getColumnName(i));
                }
                
                for(int i=0; i<modelo.getRowCount(); i++)
                {
                    for(int j=0; j<modelo.getColumnCount(); j++)
                    {
                        tabla.addCell(modelo.getValueAt(i, j).toString());
                    }
                }                
                
                mipdf.add(tabla);
                
               mipdf.add(new Paragraph("\n\nSueldo: " + operario.getSueldo()));
                
                mipdf.close(); //se cierra el PDF&
                JOptionPane.showMessageDialog(null,"Documento PDF creado");
            } catch (DocumentException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Archivo Esta en Uso");
            }
            
        }
    }
    
    public void crear_PDFNomina(LinkedList<Operario> operarios, int corteA, int corteB){
        //abre ventana de dialogo "guardar"
        CorteDAO nomina = new CorteDAO();
        
        Colocar_Destino();
        //si destino es diferente de null
        if(this.ruta_destino!=null){
            try {
                // se crea instancia del documento
                Document mipdf = new Document();
                // se establece una instancia a un documento pdf
                PdfWriter.getInstance(mipdf, new FileOutputStream(this.ruta_destino + ".pdf"));
                mipdf.open();// se abre el documento
                mipdf.addTitle("Datos Autor"); // se añade el titulo
                
                
                mipdf.add(new Paragraph("                                                                       NOMINA  "));
                    
                for(int i=0; i<operarios.size(); i++)
                {
                    DefaultTableModel modelo = nomina.GeneralNomina(Integer.parseInt(operarios.get(i).getIdentificacion()), corteA, corteB);
                    
                    PdfPTable tabla = new PdfPTable(modelo.getColumnCount());
                    
                    mipdf.add(new Paragraph("ID: " + operarios.get(i).getIdentificacion()));
                    mipdf.add(new Paragraph("Nombre : " + operarios.get(i).getNombre()+"\n\n"));
                    
                    for(int j=0; j<modelo.getColumnCount(); j++)
                    {
                        tabla.addCell(modelo.getColumnName(j));
                    }

                    for(int k=0; k<modelo.getRowCount(); k++)
                    {
                        for(int l=0; l<modelo.getColumnCount(); l++)
                        {
                            tabla.addCell(modelo.getValueAt(k, l).toString());
                        }
                    }                
                    
                    mipdf.add(tabla);
                    
                    mipdf.add(new Paragraph("\nSueldo: " + operarios.get(i).getSueldo()));
                    
                    mipdf.add(new Paragraph("\n ************************************************************************************************************"));
                }
                
                //mipdf.add(new Paragraph("Nomina Total: " + ));
                //tabla.setWidths(new int[]{5,8});
                
                mipdf.close(); //se cierra el PDF&
                JOptionPane.showMessageDialog(null,"Documento PDF creado");
            } catch (DocumentException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Archivo Esta en Uso");
            }
            
        }
    }
    
    public void crear_PDFNominaC(LinkedList<Operario> operarios, LinkedList<Corte> cortes, DefaultTableModel ganancias) {
        //abre ventana de dialogo "guardar"
        CorteDAO nomina = new CorteDAO();
        
        String pagoNJ =  "" , pagoNB = "";
        
        
        Colocar_Destino();
        //si destino es diferente de null
        if(this.ruta_destino!=null){
            try {
                // se crea instancia del documento
                Document mipdf = new Document();
                // se establece una instancia a un documento pdf
                PdfWriter.getInstance(mipdf, new FileOutputStream(this.ruta_destino + ".pdf"));
                mipdf.open();// se abre el documento
                mipdf.addTitle("Datos Autor"); // se añade el titulo
                
                mipdf.add(new Paragraph("                                                                       NOMINA  "));
                
                String operariosya = "";
                
                for(int i=0; i<operarios.size(); i++)
                {
                    if(!(operariosya.contains(operarios.get(i).getIdentificacion())))
                    {
                        DefaultTableModel modelo = nomina.GeneralNominaC(Integer.parseInt(operarios.get(i).getIdentificacion()), cortes);
                    
                        PdfPTable tabla = new PdfPTable(modelo.getColumnCount());

                        mipdf.add(new Paragraph("ID: " + operarios.get(i).getIdentificacion()));
                        mipdf.add(new Paragraph("Nombre : " + operarios.get(i).getNombre()+"\n\n"));

                        for(int j=0; j<modelo.getColumnCount(); j++)
                        {
                            tabla.addCell(modelo.getColumnName(j));
                        }

                        for(int k=0; k<modelo.getRowCount(); k++)
                        {
                            for(int l=0; l<modelo.getColumnCount(); l++)
                            {
                                tabla.addCell(modelo.getValueAt(k, l).toString());
                            }
                        }                

                        if(operarios.get(i).getIdentificacion().equals("1008"))
                        {
                            pagoNJ = nomina.pagoNeto(Integer.parseInt(operarios.get(i).getIdentificacion()), cortes);
                        }

                        if(operarios.get(i).getIdentificacion().equals("52374111"))
                        {
                            pagoNB = nomina.pagoNeto(Integer.parseInt(operarios.get(i).getIdentificacion()), cortes);
                        }
                        
                        mipdf.add(tabla);

                        mipdf.add(new Paragraph("\nSueldo: " + operarios.get(i).getSueldo()));

                        
                        mipdf.add(new Paragraph("\n ************************************************************************************************************\n"));
                    }
                    operariosya += operarios.get(i).getIdentificacion() + " ";
                }
                
                PdfPTable tabla = new PdfPTable(ganancias.getColumnCount());
                
                for(int i=0; i<ganancias.getColumnCount(); i++)
                {
                    tabla.addCell(ganancias.getColumnName(i));
                }
                
                for(int i=0; i<ganancias.getRowCount(); i++)
                {
                    for(int j=0; j<ganancias.getColumnCount(); j++)
                    {
                        tabla.addCell(ganancias.getValueAt(i, j).toString());
                    }
                }
                
                //int gananciasMitad = (int) nomina.gananciasC(cortes)/2;
                int gananciasMitad = (int) Double.parseDouble(ganancias.getValueAt(0, 4).toString());
                
                if (pagoNB.equals("")) {
                    pagoNB = "0";
                }
                
                if(pagoNJ.equals(""))
                {
                    pagoNJ = "0";
                }

                int pagoTJ = Integer.parseInt(pagoNJ)+gananciasMitad;
                int pagoTB = Integer.parseInt(pagoNB)+gananciasMitad;
                
                mipdf.add(new Paragraph("\n                                                                       GANANCIAS\n\n"));

                mipdf.add(tabla);
                                
                mipdf.add(new Paragraph("Sueldos:"));
                mipdf.add(new Paragraph("Jessica: " + pagoTJ));
                mipdf.add(new Paragraph("Blanca: " + pagoTB));
                
                mipdf.close(); //se cierra el PDF&
                JOptionPane.showMessageDialog(null,"Documento PDF creado");
            } catch (DocumentException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Archivo Esta en Uso");
            }
            
        }
    }
    
    public void fichaTecnica(LinkedList<Corte> cortes) {
        //abre ventana de dialogo "guardar"
        CorteDAO ficha = new CorteDAO();
        
        File archivo = new File("D:\\Administrador y Contador Textil PDF'S\\Corte # " + cortes.get(0).getIdentificacion() +".pdf");
        ruta_destino = archivo;
        
            try {
                // se crea instancia del documento
                Document mipdf = new Document();
                // se establece una instancia a un documento pdf
                PdfWriter.getInstance(mipdf, new FileOutputStream(archivo));
                mipdf.open();// se abre el documento
                mipdf.addTitle("Datos Autor"); // se añade el titulo
                
                
                mipdf.add(new Paragraph("                                                                       Ficha Tecnica  "));
                
                int total =0;
                
                for(int i=0; i<cortes.size(); i++)
                {
                    ficha.setCorteid(cortes.get(i));
                    cortes.get(i).setCantidad(ficha.obtenerCantidadTotal());
                    mipdf.add(new Paragraph("ID: " + cortes.get(i).getIdentificacion()+"\n"));
                    mipdf.add(new Paragraph("Modelo: " + cortes.get(i).getModeloId().getNombre()+"\n"));
                    mipdf.add(new Paragraph("Fecha: " + cortes.get(i).getFechaEnvio()+"\n"));
                    mipdf.add(new Paragraph("Cantidad: " + cortes.get(i).getCantidad()+"\n\n                                                  Tallas \n\n"));

                    
                    DefaultTableModel tallas = ficha.SeleccionarTallas(cortes.get(i).getIdentificacion(), cortes.get(i).getIdentificacion());
                    
                    PdfPTable tabla = new PdfPTable(tallas.getColumnCount());

                    tabla.setWidths(new int[]{7,7,7});
                    
                    for(int j=0; j<tallas.getColumnCount(); j++)
                    {
                        tabla.addCell(tallas.getColumnName(j));
                    }

                    for(int j=0; j<tallas.getRowCount(); j++)
                    {
                        for(int k=0; k<tallas.getColumnCount(); k++)
                        {
                            tabla.addCell(tallas.getValueAt(j, k).toString());
                        }
                    }

                    mipdf.add(tabla);

                    DefaultTableModel colores = ficha.SeleccionarColores(cortes.get(i).getIdentificacion());
                    
                    mipdf.add(new Paragraph("\n\n                                                  Colores\n\n"));

                    PdfPTable tabla2 = new PdfPTable(colores.getColumnCount());

                    tabla.setWidths(new int[]{7,7,7});
                    for(int j=0; j<colores.getColumnCount(); j++)
                    {
                        tabla2.addCell(colores.getColumnName(j));
                    }

                    for(int j=0; j<colores.getRowCount(); j++)
                    {
                        for(int k=0; k<colores.getColumnCount(); k++)
                        {
                            tabla2.addCell(colores.getValueAt(j, k).toString());
                        }
                    }

                    mipdf.add(tabla2);
                    
                    mipdf.add(new Paragraph("\n ************************************************************************************************************"));
                    
                    total += cortes.get(i).getCantidad();
                }
                
                mipdf.add(new Paragraph("Cantidad Total: " + total));
                mipdf.add(new Paragraph("Pago Estimado: " + ficha.pagoTotal(cortes)));
                
                mipdf.close(); //se cierra el PDF&
                JOptionPane.showMessageDialog(null,"Documento PDF creado");
            } catch (DocumentException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Archivo Esta en Uso");
            }
            
    }
    
    /* abre la ventana de dialogo GUARDAR*/
    public void Colocar_Destino(){
       JFileChooser fileChooser = new JFileChooser();
       int result = fileChooser.showSaveDialog(null);
       if ( result == JFileChooser.APPROVE_OPTION ){
           this.ruta_destino = fileChooser.getSelectedFile().getAbsoluteFile();
        }
    }

    public void abrir()
    {
        /*FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo PDF","pdf","PDF");
        JFileChooser fileChooser = new JFileChooser();
       
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(null);
        if ( result == JFileChooser.APPROVE_OPTION )
        {*/
        File fichero = new File(this.ruta_destino + ".pdf");
        //JOptionPane.showMessageDialog(null, this.ruta_destino + ".pdf");
            try
            {
                Desktop.getDesktop().open(fichero);
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
        //}
        
    }
    
    public void abrirA()
    {
        /*FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo PDF","pdf","PDF");
        JFileChooser fileChooser = new JFileChooser();
       
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(null);
        if ( result == JFileChooser.APPROVE_OPTION )
        {*/
            try
            {
                Desktop.getDesktop().open(ruta_destino);
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
        //}
        
    }
    
    public File getRuta_destino() {
        return ruta_destino;
    }

    public void setRuta_destino(File ruta_destino) {
        this.ruta_destino = ruta_destino;
    }
    
}