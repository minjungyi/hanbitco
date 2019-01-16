package com.han.exam.service;

import java.util.Map;

import com.han.exam.domain.StockMarket;

public interface ExamService{

	Map<String, StockMarket> findAll() throws Exception;
	StockMarket findOne(String coin) throws Exception;
}
