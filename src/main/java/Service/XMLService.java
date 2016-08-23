package Service;




import Model.Customer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class XMLService {

    File file;
    JAXBContext jaxbContext;
    Marshaller marshaller;
    Unmarshaller unmarshaller;

    public XMLService() throws IOException, JAXBException {
        Customer customer = new Customer();
        customer.setId(100);
        customer.setName("mkyong");
        customer.setAge(29);

        file = new File("/Users/Marcin/Desktop/JSONv2/src/main/resources/object.xml");
        jaxbContext = JAXBContext.newInstance(Customer.class);
        marshaller = jaxbContext.createMarshaller();
        unmarshaller = jaxbContext.createUnmarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(customer, file);
       // marshaller.marshal(customer, System.out);

    }

    public Customer getXMLObj() throws JAXBException {
        return (Customer) unmarshaller.unmarshal(file);
    }

}
