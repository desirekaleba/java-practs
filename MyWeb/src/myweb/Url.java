/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Url {
    public Url(){}
   public static void main(String[] args) {
      try {
         String siteWeb = "http://search.oracle.com//search/search";
         URL url = new URL(siteWeb);
         System.out.println("Authority : " + url.getAuthority());
         System.out.println("Default port : " + url.getDefaultPort());
         System.out.println("Host : " + url.getHost());
         System.out.println("Port : " + url.getPort());
         System.out.println("Protocol : " + url.getProtocol());
         
         try {
            //Nous nous connectons au site en question
            URLConnection urlConn = url.openConnection();
            System.out.println(urlConn.getContentType());

            String content = "", line = null;
            //Nous récupérons un flux en retour de connexion
            BufferedReader buf = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            //Nous stockons les informations retournées dans une chaîne de caractères
            while((line = buf.readLine()) != null){
               content += line + "\n";
            }
            
            //Nous instancions notre objet pour afficher le contenu
            Browser  browser = new Browser("Google",content);
            
            //Et nous faisons une recherche sur ce même site
            String result = makeSearch(siteWeb, "java");
            
            //Nous mettons à jour notre page
            browser.setContent(result);
            
            //Et nous faisons une recherche sur ce même site
            result = makeSearch(siteWeb, "java.net package & RMI");
            
            //Nous mettons à jour notre page
            browser.setContent(result);
            
         } catch (IOException e) {
            e.printStackTrace();
         }
         
      } catch (MalformedURLException e) {
         e.printStackTrace();
      }
   }
   
   public static String makeSearch(String url, String search){

      //Une petite pause
      try {
         Thread.sleep(5000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      
      String resultat = "";
      HttpURLConnection con = null;
      try {
         
         //Cette classe permet d'encoder les caractères spéciaux  
         //pour qu'ils soient interprétables dans une URL
         //Nous devons fournir la chaîne à encoder et le type d'encodage, ici UTF-8
         String recherche = URLEncoder.encode("q", "UTF-8") + "=";
         recherche += URLEncoder.encode(search, "UTF-8");
         
         //Nous nous connectons, via un objet HTTPUrlConnection
         //à la nouvelle URL, la recherche se faisant en GET, 
         //les paramètres sont dans l'URL
         System.out.println("URL de recherche : " + url + "?" + recherche);
         con = (HttpURLConnection) new URL(url + "?" + recherche).openConnection();
         
         //Comme la recherche précédente, nous récupérons un flux que nous allons stocker
         BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
         String line;
         while ((line = rd.readLine()) != null) {
            resultat += line + "\n";
         }         
      } catch (MalformedURLException e) {
         e.printStackTrace();
      } catch (ProtocolException e) {
         e.printStackTrace();
      } catch (UnsupportedEncodingException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }

      return resultat;
   }   
}

