/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog.conectores;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author Antonio
 */
public class XmlReader {

    private Document document;
    
    public XmlReader(String dir){
        init(dir);
    }
    
    private boolean init(String dir){
        try{
           File file = new File(dir);
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            this.document = documentBuilder.parse(file);
            return true;
        }
        catch(ParserConfigurationException | SAXException | IOException | DOMException e){
            System.out.println(e);
            return false;
        }
    }
    
    public String read(String label){
        String usr = "";
        try{
            for (int i = 0; i < this.document.getElementsByTagName(label).getLength();i++){
                //System.out.println(this.document.getElementsByTagName(label).item(i).getTextContent());
                usr += this.document.getElementsByTagName(label).item(i).getTextContent()+"\n";
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return usr;
    }
}