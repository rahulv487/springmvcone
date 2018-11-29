package com.cg.springmvcone.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvcone.dto.Mobile;
import com.cg.springmvcone.service.IMobileService;

@Controller
public class MobileController {

	@Autowired
	IMobileService mobileservice;
	@RequestMapping(value="/home")
	public String getAllMobile(@ModelAttribute("my") Mobile mob,Map<String,Object> model){
		List<String> myList = new ArrayList<>();
		myList.add("Android");
		myList.add("IPhone");
		myList.add("Windows");
		
		model.put("cato", myList);
		return "AddMobile";
	}
	
	@RequestMapping(value = "addData", method = RequestMethod.POST)
	public String addMobileData(@Valid@ModelAttribute("my") Mobile mobile, BindingResult result,Map<String,Object> model){
		if(result.hasErrors()){
			List<String> myList = new ArrayList<>();
			myList.add("Android");
			myList.add("IPhone");
			myList.add("Windows");
			
			model.put("cato", myList);
			return "AddMobile";
		
		}else{
			
		mobileservice.addMobile(mobile);
		//System.out.println("Mobile ID: "+mobile.getMobId() + "\nMobile Name: "+mobile.getMobName()+"\nMobile Price: "+mobile.getMobPrice()+"\nMobile Category: "+mobile.getMobCategory());
		//System.out.println("Online: " + mobile.getchoice());
		
		return "Success";
		}
	}
	@RequestMapping(value="showall",method=RequestMethod.GET)
	public ModelAndView showAllMobileData(){
		List<Mobile> allMobile=mobileservice.showAllMobile();
		System.out.println(allMobile);
		return new ModelAndView("mobileshow", "data", allMobile);
		
	}
	@RequestMapping(value="searchmobile", method=RequestMethod.GET)
	public String searchData(@ModelAttribute("yy") Mobile mob){
		return "searchmobile";
	}
	@RequestMapping(value="mobilesearch",method=RequestMethod.POST)
	public ModelAndView dataSearch(@ModelAttribute("yy") Mobile mob){
		Mobile mobSearch=mobileservice.searchMobile(mob.getMobId());
		//System.out.println(mobSearch);
		return new ModelAndView("showsearch","temp",mobSearch);
		
	}
	@RequestMapping(value="deletemobile",method=RequestMethod.GET)
	public String deleteData(@ModelAttribute("aa") Mobile mob){
		return "deletemobile";
	}@RequestMapping(value="mobiledelete",method=RequestMethod.POST)
	public String datadelete(@ModelAttribute("aa") Mobile mob){
		mobileservice.deleteMobile(mob.getMobId());
		return "successdelete";
		
		
	}@RequestMapping(value="updatemobile",method=RequestMethod.GET)
	public String updateData(@ModelAttribute("bb") Mobile mob){
		return "updatemobile";
		
	}@RequestMapping(value="mobileupdate",method=RequestMethod.POST)
	public String dataupdate(@ModelAttribute("bb")Mobile mob){
		mobileservice.updateMobile(mob.getMobId(), mob.getMobPrice());
		return "successupdate";
		
	}
}
