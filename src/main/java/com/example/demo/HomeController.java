package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomeController {
    @Autowired
    FlightRepository flightRepository;

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("flights",flightRepository.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String add_flight(Model model){
        model.addAttribute("flight",new Flight());
        return "flightform";
    }
    @RequestMapping("/detail/{id}")
    public String show_detail(@PathVariable("id") long id,Model model){
        model.addAttribute("flight",flightRepository.findById(id).get());
        return "show";
    }

    @RequestMapping("/delete/{id}")
    public String delete_fligt(@PathVariable("id") long id){
        flightRepository.deleteById(id);
        return "redirect:/";
    }
    @RequestMapping("/update/{id}")
    public String update_detail(@PathVariable("id") long id,Model model){
        model.addAttribute("flight",flightRepository.findById(id).get());
        return "show";
    }

    @PostMapping("/processflight")
    public String processForm(@ModelAttribute Flight flight,@RequestParam(name="leaving_date") String leaving_date){
        String pattern = "yyyy-MM-dd";
        try {
            String formattedDate = leaving_date.substring(1,leaving_date.length()-1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            Date realDate = simpleDateFormat.parse(formattedDate);
            flight.setLeaving_date(realDate);
        }
        catch (java.text.ParseException e){
            e.printStackTrace();
        }
        flightRepository.save(flight);
        return "redirect:/";
    }



    @PostMapping("/processsearch")
    public String searchResult(Model model,@RequestParam(name="search") String search) {
        model.addAttribute("flights", flightRepository.findByAirline(search));
        return "searchlist";
    }
}
