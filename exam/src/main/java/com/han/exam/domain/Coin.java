package com.han.exam.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coin
{
	@JsonProperty("BTC_KRW")
	private StockMarket btcKrw;
	
	@JsonProperty("ETH_KRW")
	private StockMarket ethKrw;
	
	@JsonProperty("EOS_KRW")
	private StockMarket eosKrw;
	
	@JsonProperty("BCH_KRW")
	private StockMarket bchKrw;
	
	@JsonProperty("XRP_KRW")
	private StockMarket xrpKrw;
	
	@JsonProperty("LTC_KRW")
	private StockMarket ltcKrw;
	
	@JsonProperty("BTG_KRW")
	private StockMarket btgKrw;
	
	public StockMarket getBtcKrw() {
		return btcKrw;
	}
	public void setBtcKrw(StockMarket btcKrw) {
		this.btcKrw = btcKrw;
	}
	public StockMarket getEthKrw() {
		return ethKrw;
	}
	public void setEthKrw(StockMarket ethKrw) {
		this.ethKrw = ethKrw;
	}
	public StockMarket getEosKrw() {
		return eosKrw;
	}
	public void setEosKrw(StockMarket eosKrw) {
		this.eosKrw = eosKrw;
	}
	public StockMarket getBchKrw() {
		return bchKrw;
	}
	public void setBchKrw(StockMarket bchKrw) {
		this.bchKrw = bchKrw;
	}
	public StockMarket getXrpKrw() {
		return xrpKrw;
	}
	public void setXrpKrw(StockMarket xrpKrw) {
		this.xrpKrw = xrpKrw;
	}
	public StockMarket getLtcKrw() {
		return ltcKrw;
	}
	public void setLtcKrw(StockMarket ltcKrw) {
		this.ltcKrw = ltcKrw;
	}
	public StockMarket getBtgKrw() {
		return btgKrw;
	}
	public void setBtgKrw(StockMarket btgKrw) {
		this.btgKrw = btgKrw;
	}
}
