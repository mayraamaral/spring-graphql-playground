package playground.graphql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController {

    @QueryMapping
    public Map<String, String> greet(@Argument String name) {
        Map<String, String> response = new HashMap<>();
        response.put("greeting", "Hello, " + name);

        return response;
    }
}
