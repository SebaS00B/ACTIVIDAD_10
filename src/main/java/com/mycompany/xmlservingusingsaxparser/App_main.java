
package com.mycompany.xmlservingusingsaxparser;

import java.io.BufferedReader;
import java.net.URL;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class App_main {

    
    public static void main(String[] args){
        App_main oobj_App_main = new App_main();
        oobj_App_main.get_Response();
    }
    
    
    public void get_Response () {
        
        try {
            
        
        String id = "1";
        String firstname = "Anna";
        String lastname = "Lopez";
        String emailID = "a@g.com";
            
        String url = "https://guarded-springs-28309.herokuapp.com/employees";
        URL obj = new URL(url);
        
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        
        int responseCode = con.getResponseCode();
        System.out.println("Response code: " + responseCode);
        BufferedReader in = new BufferedReader(
            new InputStreamReader (con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while((inputLine = in.readLine()) != null){
            response.append(inputLine);
        }
        in.close();
        
            System.out.println(response.toString());
            
        } catch (Exception e) {
            
            System.out.println(e); 
            
        }
    }
    
}
