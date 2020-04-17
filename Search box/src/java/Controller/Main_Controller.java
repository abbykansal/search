package Controller;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    public class Main_Controller {
    
    @RequestMapping(value = "/examples")
    public String search(HttpServletRequest request){
        
        return "examples";
    }
    
    @RequestMapping(value = "/page")
    public String search1(HttpServletRequest request){
        System.out.println("helloloooo");
        return "page";
    }
    
    @RequestMapping(value = {"/index","/"})
    public String search3(HttpServletRequest request) throws IOException{
//         
//       URL url = new URL("http://localhost:8080/Search_box/");
//        Scanner sc = new Scanner(url.openStream());
//      StringBuffer sb = new StringBuffer();
//      while(sc.hasNext()) {
//         sb.append(sc.next());
//      }
//      String result = sb.toString();
//      System.out.println(result);
//      result = result.replaceAll("<[^>]*>", "");
//      System.out.println("Contents of the web page: "+result);
       
        return "index";
    }
}
