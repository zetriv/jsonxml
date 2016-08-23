import Model.Staff;
import Service.JSONService;
import Service.XMLService;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Main {





    public static void main(String [] args) throws IOException, JAXBException {
        JSONService json = new JSONService();
        Staff staff = json.getObjectFromJSON();
        System.out.println(staff);
        staff.setName("JSON");
        json.updateJSON(staff);
        System.out.println(json.getObjectFromJSON());

        XMLService xml = new XMLService();
        System.out.println(xml.getXMLObj());

    }


}
