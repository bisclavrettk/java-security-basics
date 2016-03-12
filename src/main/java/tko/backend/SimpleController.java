/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tko.backend;

import org.springframework.stereotype.Controller;
import org.springframework.util.MimeType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author tomek
 */

@Controller
public class SimpleController {
    
    @RequestMapping(value="/", produces = "application/json")
    @ResponseBody
    public String hello() {
        return "hi";
    }
}
