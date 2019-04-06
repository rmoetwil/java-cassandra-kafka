package nl.wilron.jck.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sample Controller.
 *
 * @author Ronald Moetwil
 */
@RestController
public class MessageController {

    @RequestMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public String helloWorld() {
        return "Hello Amy";
    }
}