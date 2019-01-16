package com.han.exam.util;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.han.exam.domain.Coin;

public class ExamUtil{

	public static Coin parseJson() throws Exception{
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Coin coinDomain = new Coin();
		try {
			coinDomain = objectMapper.readValue(new File("./src/main/tmp/data.json"), Coin.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
			throw e;
		} catch (JsonMappingException e) {
			e.printStackTrace();
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
		return coinDomain;
	}
}
