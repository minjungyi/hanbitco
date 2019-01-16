package com.han.exam.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.han.exam.domain.Result;
import com.han.exam.domain.StockMarket;
import com.han.exam.service.ExamService;

import io.swagger.annotations.ApiOperation;

@RestController
public class ExamController{

	@Autowired
	ExamService examService;

	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/api/v1/data/currency", method = RequestMethod.GET)
	public Result<Map> getAllData() {

		Result<Map> result = new Result<>();
		try {
			result.setStatus("success");
			result.setData(examService.findAll());
		}catch(Exception e){
			e.printStackTrace();
			result.setStatus("fail");
			result.setData(null);
		}
		return result;
	}

	@ApiOperation(value="BTC 데이터를 가지고 온다 ")
	@RequestMapping(value="/api/v1/data/currency/{coin}", method = RequestMethod.GET)
	public Result<StockMarket> getBTCData(@PathVariable String coin) {

		Result<StockMarket> result = new Result<>();
		try {
			result.setStatus("success");
			result.setData(examService.findOne(coin));
		}catch(Exception e){
			e.printStackTrace();
			result.setStatus("fail");
			result.setData(null);
		}
		return result;
	}
}
