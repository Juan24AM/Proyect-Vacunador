package Source;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.net.URL;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import org.json.JSONArray;
import org.json.JSONObject;

public class Http {
    //Atributos
    private String Nombres;
    
    //Constructor
    public Http() {
        this.Nombres = Nombres;
    }
   
    //Metodos
    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }
    
    
    public String getDatosDNI(String DNI){
        // Realizar Peticion
        //String link = ("http://190.108.89.83/cas/cas/get_datos?dni="+DNI);
        
        String link = ("https://eap.osce.gob.pe/fut-vent/1.0/validar/reniec?dni="+DNI);
        
        try {
        URL url = new URL(link);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        
        //Comprobar peticion
        int responseCode = conn.getResponseCode();
        
        if (responseCode != 200) {
            throw new RuntimeException("Ocurrio un error " + responseCode);
        } else {
            //Abrir Scanner, leer respuesta
            StringBuilder informationString = new StringBuilder();
            Scanner nscanner = new Scanner(url.openStream());
            
            while(nscanner.hasNext()) {
                informationString.append(nscanner.nextLine());
            }
            
            nscanner.close();
            //Imprimir Informacion
            //System.out.println(informationString);
            /*JSONArray jsonArray = new JSONArray(informationString.toString());
            JSONObject jsonObject = jsonArray.getJSONObject(0);*/
            
            JSONObject jsonObject = new JSONObject(informationString.toString());
            //JSONArray jsonArray = jsonObject.getJSONArray("Nombres");
            
            //String Nombre = jsonObject.getString("Nombres");
            //String Paterno = jsonObject.getString("Paterno");
            //String Materno = jsonObject.getString("Materno");
            
            //String Nombres = Paterno + " " + Materno + "," + " " + Nombre;
                
            String Nombres = jsonObject.getString("nombre");
            setNombres(Nombres);

        }
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "RENIEC: El DNI consultado es inválido. Por favor registre manualmente los datos del DNI digitado");
            //e.printStackTrace();
        }
        return getNombres();
    }
}
