package com.han.exam.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.han.exam.domain.Coin;
import com.han.exam.domain.StockMarket;
import com.han.exam.util.ExamUtil;

@Service
public class ExamServiceImpl implements ExamService{

	@Override
	public Map<String, StockMarket> findAll() throws Exception{
		Map<String, StockMarket> resultStock = new HashMap<String, StockMarket>();
		Coin data = ExamUtil.parseJson();

		int cnt = 0;
		if(data.getBchKrw() != null && cnt < 5) {
			cnt++;
			resultStock.put("BCH_KRW", data.getBchKrw());
		}
		
		if(data.getBtcKrw() != null && cnt < 5) {
			cnt++;
			resultStock.put("BTC_KRW", data.getBtcKrw());
		}
		
		if(data.getBtgKrw() != null && cnt < 5) {
			cnt++;
			resultStock.put("BTG_KRW", data.getBtgKrw());
		}
		
		if(data.getEosKrw() != null && cnt < 5) {
			cnt++;
			resultStock.put("EOS_KRW", data.getEosKrw());
		}
		
		if(data.getEthKrw() != null && cnt < 5) {
			cnt++;
			resultStock.put("ETH_KRW", data.getEthKrw());
		}
		
		if(data.getLtcKrw() != null && cnt < 5) {
			cnt++;
			resultStock.put("LTC_KRW", data.getLtcKrw());
		}
		
		if(data.getXrpKrw() != null && cnt < 5) {
			cnt++;
			resultStock.put("XRP_KRW", data.getXrpKrw());
		}
		return resultStock;
	};

	@Override
	public StockMarket findOne(String coin) throws Exception{
		StockMarket result = new StockMarket();
		Coin data = ExamUtil.parseJson();

		if(coin.equals("BCH")) {
			result = data.getBchKrw();
		}else if(coin.equals("BTC")){
			result = data.getBtcKrw();
		}else if(coin.equals("BTG")){
			result = data.getBtgKrw();
		}else if(coin.equals("EOS")){
			result = data.getEosKrw();
		}else if(coin.equals("ETH")){
			result = data.getEthKrw();
		}else if(coin.equals("LTC")){
			result = data.getLtcKrw();
		}else if(coin.equals("XRP")){
			result = data.getXrpKrw();
		}else {
			result = null;
		}
		return result;
	};
}
