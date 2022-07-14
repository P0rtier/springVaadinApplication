package pl.uzi.springvaadinapplication.service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RectangleApi {

    @GetMapping("/calculate")
    public int calculate(@RequestParam String figure, @RequestParam int a, @RequestParam int b,@RequestParam(required = false) Integer c){
        if(figure.equalsIgnoreCase("RECTANGLE"))
            return 2*a + 2*b;
        else if (figure.equalsIgnoreCase("TRIANGLE")) {
            return a+b+c;
        }
        return -1;
    }
}
