import java.util.HashMap;
import java.util.Map;

public class Main {
    String partnumberwhereusedcheck =  (String)getGroup("whereUsed").getAttributeValue( z, "number");
    String partrevisionwhereusedcheck =  (String)getGroup("whereUsed").getAttributeValue( z ,"revision");

    HashMap<String,String> links = new HashMap<String, String>();

    if(links.containsKey(partnumberwhereusedcheck)&&(links.get(partnumberwhereusedcheck) == partrevisionwhereusedcheck)){
        System.out.println("Matched key = " + partnumberwhereusedcheck + " " +partrevisionwhereusedcheck );
    } else{
        System.out.println("Key not matched with ID partnumberwhereusedcheck");
    }
}
