package com.parking.lot.vehicle.records.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.parking.lot.vehicle.records.model.ChargesPerHourDB; 

@Controller
public class ChargesPerHourExcecutor {
	private final static Logger LOGGER =  
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	@Autowired
    private ChargesPerHourService chargesPerHourService;
	
	@GetMapping("/showCharges")
	//@RequestMapping(value={"/showCharges"}, method = RequestMethod.GET)
	public String showCharges(Model model) {

        var charges = (List<ChargesPerHourDB>) chargesPerHourService.findAll();
        LOGGER.log(Level.INFO, "here::\n"+charges);

        model.addAttribute("charges", charges);

        return "showCharges";
    }
	
	public List<ChargesPerHourDB> getCharges() {
		List<ChargesPerHourDB> chargesDB = chargesPerHourService.findAll();
        return chargesDB;
    }
	
}