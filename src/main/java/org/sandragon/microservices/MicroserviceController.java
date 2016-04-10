package org.sandragon.microservices;

import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceController {

    @RequestMapping("/")
    public Map<String, Boolean> getResource() {
    	HashMap<String, Boolean> map = new HashMap<>();
    	map.put("value", true);
        return map;
    }

    @RequestMapping("/health")
    public Map<String, Boolean> checkHealth() {
    	HashMap<String, Boolean> map = new HashMap<>();
    	map.put("healthy", true);
        return map;
    }
}