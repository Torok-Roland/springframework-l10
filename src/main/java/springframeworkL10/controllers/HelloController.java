package springframeworkL10.controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloController {

    @PostMapping(path = "/test/{name}")
    public String test(@PathVariable String name,
                       @RequestHeader String a,
                       @RequestHeader String b,
                       @RequestHeader String c,
                       @RequestBody String body,
                       HttpServletResponse response) {
        response.addHeader("test", "good");
        return name + " " + a + " " + b + " " + c + " " + body;
    }

    @GetMapping(path = "/all")
    public Map<String, String> all(@RequestHeader Map<String, String> map) {
        return map;
    }

    @GetMapping(path = "/pdf", produces = MediaType.APPLICATION_PDF_VALUE)
    public byte[] file(){
        byte [] file = new byte[100];
        return file;
    }
}
