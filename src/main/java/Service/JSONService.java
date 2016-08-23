package Service;

import Model.Staff;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public class JSONService {

    public ObjectMapper mapper;
    public File file;

    public JSONService() throws IOException {
        mapper = new ObjectMapper();
        file = new File("/Users/Marcin/Desktop/JSONv2/src/main/resources/object.json");

        if(!file.exists()){
            mapper.writeValue(file,createDummyObject());
        }

    }

    private Staff createDummyObject() {
        Staff staff = new Staff();
        staff.setName("mkyong");
        staff.setAge(33);
        staff.setPosition("Developer");
        staff.setSalary(new BigDecimal("7500"));
        List<String> skills = new ArrayList<String>();
        skills.add("java");
        skills.add("python");
        staff.setSkills(skills);

        return staff;
    }

    public void updateJSON(Staff staff){
        try {
            mapper.writeValue(file,staff);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Staff getObjectFromJSON(){
        Staff staff = new Staff();
        try {
             staff = mapper.readValue(file,Staff.class);
        } catch (UnrecognizedPropertyException e){
            System.out.println("Niepoprawny format JSON");
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return staff;
    }
}
