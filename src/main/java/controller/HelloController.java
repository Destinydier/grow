package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jyt
 * @date 2018/6/12 下午2:12
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello()
    {
        Map<String,String> map = new HashMap<String, String>();
        return "hello";
    }
}
