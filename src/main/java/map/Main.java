package map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URL;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        var objectMapper = new ObjectMapper();
        var ref = new TypeReference<Map<String, String>>() {};
        Map<String, String> map = objectMapper.readValue(new URL("http://country.io/names.json"), ref);
        System.out.println(map);
    }

}
