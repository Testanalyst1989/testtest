package stepDefinition;
import static stepDefinition.ConfigFileReader.prop;
public class Mainclass {


    public static void main(String[] args) {

          ConfigFileReader cfr = new ConfigFileReader();
        System.out.println(prop.getProperty("facebookURL"));
        System.out.println(prop.getProperty("googleURL"));
        System.out.println(prop.getProperty("santanderURL"));
    }




}
