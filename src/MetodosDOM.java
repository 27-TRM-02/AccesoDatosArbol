
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.File;
import java.io.FileOutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trm
 */
public class MetodosDOM {
    Document doc;
    /**
     * 
     * @param fichero
     * @return 
     */
    public int abrir_XML_DOM(File fichero) {
        // doc representará el árbol DOM
        doc = null;
        try {
            // Se crea un objeto DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            // Indica que el modelo DOM no debe contemplar los comentarios 
            // que tenga el XML.
            factory.setIgnoringComments(true);
            // Ignora los espacios en blanco que tenga el documento
            factory.setIgnoringElementContentWhitespace(true);
            // Creamos objeto para cargar la estructura del arbol del DOM
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Parsea el documento XML y genera el DOM equivalente
            doc = builder.parse(fichero);
            // Nos apunta al arbol DOM listo para ser recorrido 
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }
    
    /**
     * 
     * @param titulo
     * @param autor
     * @param anno
     * @return 
     */
    public int annadirLibroDOM(String titulo, String autor, String anno){
        try {
            // Se crea un nodo tipo Element con nombre Titulo
            Node ntitulo = doc.createElement("Titulo");
            // Nodo texto con el titulo del libro
            Node ntitulo_text = doc.createTextNode(titulo); 
            // Nodo texto como hijo de Titulo
            ntitulo.appendChild(ntitulo_text);
            // Hacemos lo mismo con el Element Autor
            Node nautor = doc.createElement("Autor");
            Node nautor_text = doc.createTextNode(autor); 
            nautor.appendChild(nautor_text);
            // Creamos Nodo Element de Libro
            Node nlibro = doc.createElement("Libro");
            // Al nodo Libro se le añade atributo "publicado_en"
            ((Element)nlibro).setAttribute("publicado_en", anno);
            // Añadimos a libro los nodos Titulo y Autor
            nlibro.appendChild(ntitulo);
            nlibro.appendChild(nautor);
            // Obtenemos primer nodo del doc --> (Libros)
            Node raiz = doc.getFirstChild();
            // añadimos como hijo Libro creado arriba
            raiz.appendChild(nlibro);
            
            return 0;
        } catch (Exception e) {
            System.out.println(e.toString());
            return -1;
        }
    }
    
    /**
     * 
     * @return 
     */
    public String recorrerDOMyMostrar(){
        String salida = "";
        Node node;
        String datos_nodo[]=null;
        // Obtiene el primer nodo del DOM (primer hijo) = LIBROS
        Node raiz = doc.getFirstChild();
        // Obtiene lista de nodos con todos los nodos hijo del raíz = LIBRO * 3
        NodeList nodelist = raiz.getChildNodes();
        // Procesa los nodos hijos
        for (int i=0; i<nodelist.getLength(); i++) {
            node = nodelist.item(i);
            
            if (node.getNodeType()==Node.ELEMENT_NODE){
                // Es un nodo elemento = libro
                datos_nodo = procesarLibro(node);
                salida+= "\n " + "Publicado en: " + datos_nodo[0];
                salida+= "\n " + "El Título es: " + datos_nodo[1];
                salida+= "\n " + "El Autor es: " + datos_nodo[2];
                salida+= "\n ----------------------------------";
            }
        }       
        return salida;
    }
    
    /**
     * 
     * @param n
     * @return 
     */
    private String[] procesarLibro(Node n){ // n= nodo libro
        String datos[] = new String[3];
        Node ntemp = null;
        int contador = 1;
        // Obtiene el valor del primer atributo del nodo.
        // En libros solo hay 1 elem. por eso no hace falta bucle
        datos[0] = n.getAttributes().item(0).getNodeValue(); // = valor del atributo
        // Obtiene los hijos del Libro (titulo y autor)
        NodeList nodos = n.getChildNodes();
        // Recorre todos los nodos de la lista 'nodos'
        for (int i = 0; i < nodos.getLength(); i++) {
            ntemp = nodos.item(i);
            // Comprobamos que es nodo Elemento (titulo y autor)
            if(ntemp.getNodeType() == Node.ELEMENT_NODE){
                datos[contador] = ntemp.getFirstChild().getNodeValue();
                contador++;
            }
        }
        return datos;
    }
    
    /**
     * 
     * @return 
     */
    public int guardarDOMcomoFile(File archivo){
        try {
            // Crea un fichero llamado salida.xml
            // File archivo_xml = new File("salida.xml");
            // Especifica el formato de salidaFile
            if (!archivo.getAbsolutePath().endsWith(".xml")){
                archivo.renameTo(new File(archivo.getAbsolutePath()+".xml"));
            }
            OutputFormat format = new OutputFormat(doc);
            format.setIndenting(true);
            // salida indentada
            format.setIndenting(true);
            // Escribo contenido en el File
            XMLSerializer serializer = new XMLSerializer(new FileOutputStream(archivo), format);
            serializer.serialize(doc);
            // Se ha ejecutado correctamente
            return 0;
        } catch (Exception e) {
      
            return 1;
        }   
    }
    
    public int replaceTitle(){
        
        
        return 0;
    }
    
}
