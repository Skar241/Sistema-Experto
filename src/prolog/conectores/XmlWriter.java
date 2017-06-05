/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog.conectores;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Antonio
 */
public class XmlWriter {
    
    private final String file;
    private final Document doc;
    private final Element root;
    
    public XmlWriter(String file) throws ParserConfigurationException{
        this.file = file;
        this.doc = init();
        this.root = this.doc.createElement("usuario");
        this.doc.appendChild(this.root);
    }
    
    private Document init() throws ParserConfigurationException{
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	return docBuilder.newDocument();
    }
    
    public void add(String tag,String value){
        Element tmp = this.doc.createElement(tag);
        tmp.appendChild(doc.createTextNode(value));
        this.root.appendChild(tmp);
    }
    
    public boolean write(){
        try{
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(this.doc);
            StreamResult result = new StreamResult(new File(this.file));
            transformer.transform(source, result);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public static boolean write(Document doc,String file){
        try{
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(file));
            transformer.transform(source, result);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
