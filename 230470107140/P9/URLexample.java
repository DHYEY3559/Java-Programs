// importing package required 
import java.net.URL;  

class URLexample {  
    public static void main(String[] args) {  
        String url = "https://www.tutorialspoint.com/java/index.htm";  
        // Calling method to get URL info  
        getUrlInfo(url);  
    }  

    static void getUrlInfo(String url_string) {  
        // Creating object of URL class  
        try {  
            URL url = new URL(url_string);  

            System.out.println("Hostname: " + url.getHost());  
            System.out.println("Port Number: " + url.getPort());  
            System.out.println("File name: " + url.getFile());      
            System.out.println("Protocol: " + url.getProtocol());  
        } catch (Exception e) {  
            // Exception handling left empty intentionally  
        }  
    }  
}
