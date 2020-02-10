package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
     /* @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "Hello, Spring!";
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye, Spring!";
    }
    @RequestMapping(value="hellogoodbye", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
     public String hellogoodbye(){
      return "this is hellogoodbye";
  }
     @GetMapping("hello")
     @ResponseBody
     public String helloqueryparam(@RequestParam String name){
         return "hello, "+ name+ "!";

     }

     @GetMapping("hello/{name}")

    public String hellowithpathparam(@PathVariable String name){
        return "redirect:/DESIREDPATH";
     }*/

    @GetMapping
    public String helloForm() {
        return "form";
    }

    @GetMapping("hello")
    public String createMessage(@RequestParam String coder, @RequestParam String language, Model model) {
        String greeting=language + " ,"+ coder +"!";
        model.addAttribute("greeting", greeting);
        return "Hello";

    }

}
