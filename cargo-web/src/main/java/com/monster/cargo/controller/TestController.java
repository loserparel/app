package com.monster.cargo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.monster.cargo.model.SuperCargoInfoDo;
import com.monster.cargo.service.cargoinfo.CargoInfoService;
import com.monster.cargo.service.vo.SuperCargoInfoVo;
import com.monster.cargo.utils.DateUtils;

@RestController
public class TestController {

	@Autowired
	private CargoInfoService cargoInfoService;
	
	@RequestMapping("/index")
	public String index(ModelMap modelMap , HttpServletResponse response) {
		SuperCargoInfoDo selCargoInfoDo = new SuperCargoInfoDo();
		selCargoInfoDo.setCargoId("1");
		selCargoInfoDo.setCargoTypeId("2");
		SuperCargoInfoDo superCargoInfoDo = cargoInfoService.querySuperCargoInfos(selCargoInfoDo);
		if(null != superCargoInfoDo) {
			System.out.println(superCargoInfoDo.getCargoDate());
		}
		return "index";
	}
	
	@RequestMapping("/add/cargoInfo")
	public JSONObject addCargoInfo(SuperCargoInfoVo superCargoInfoVo, HttpServletResponse response) {
		JSONObject jsonObject = new JSONObject();
		SuperCargoInfoDo addCargoInfoDo = new SuperCargoInfoDo();
		addCargoInfoDo.setCargoDate(DateUtils.getCurrentDate());
		addCargoInfoDo.setCargoTime(DateUtils.getCurrentTime());
		addCargoInfoDo.setCargoId("88880001");
		addCargoInfoDo.setCargoTypeId("1");
		addCargoInfoDo.setCustId("400000520");
		addCargoInfoDo.setStat("N");
		int i = cargoInfoService.insert(addCargoInfoDo);
		System.out.println(i);
		return jsonObject;
	}
}
