/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desire;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StudentController {

   @RequestMapping(value = "/student", method = RequestMethod.GET)
   public String student(Model model) {
      model.addAttribute("command", new Student());
      return "student";
   }
   
   @RequestMapping(value = "/result", method = RequestMethod.POST)
   public String addStudent(Model model,@ModelAttribute("st") Student std) {
    Student student = new Student();
      model.addAttribute("name", std.getName());
      model.addAttribute("age", std.getAge());
      model.addAttribute("id", std.getId());
      
      return "result";
   }
}
