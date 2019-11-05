package com.monster.cargo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.monster.cargo.model.SuperCargoInfoDo;
import com.monster.cargo.service.cargoinfo.CargoInfoService;

@RestController
public class TestController {

	@Autowired
	private CargoInfoService CargoInfoService;
	
	@RequestMapping("/index")
	public String index(ModelMap modelMap , HttpServletResponse response) {
		SuperCargoInfoDo selCargoInfoDo = new SuperCargoInfoDo();
		selCargoInfoDo.setCargoId("1");
		selCargoInfoDo.setCargoTypeId("2");
		SuperCargoInfoDo superCargoInfoDo = CargoInfoService.querySuperCargoInfos(selCargoInfoDo);
		if(null != superCargoInfoDo) {
			System.out.println(superCargoInfoDo.getCargoDate());
		}
		return "index";
	}
	
}
