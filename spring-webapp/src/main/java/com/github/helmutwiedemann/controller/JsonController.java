package com.github.helmutwiedemann.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.helmutwiedemann.dao.DataDao;
import com.github.helmutwiedemann.model.DummyModel;

@Controller()
public class JsonController {

	@Autowired
	private DataDao dataDao;

	@RequestMapping("/getData")
	public @ResponseBody
	List<Map<String, Object>> getData(Model modelMap, HttpServletRequest request) {
		String userAgent = request.getHeader("user-agent");
		return dataDao.getData(userAgent);
	}

	@RequestMapping(value = "/writeData", method = RequestMethod.POST)
	public void writeConfiguration(@RequestBody DummyModel config) {
		dataDao.saveData(config);
	}

}
