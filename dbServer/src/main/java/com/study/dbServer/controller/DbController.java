package com.study.dbServer.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.dbServer.vo.ResponseTestToWebServerVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@Api(tags = {"DB_SERVER"})
@RequestMapping("dbServer")
public class DbController {

	/**
	 * 함수명: getTest
	 * <pre>
	 * 	dbServer 응답처리 Sample
	 * </pre>
	 * @param param
	 * @return
	 */
	@GetMapping("test")
    @ApiOperation("DbServer - 응답 TEST (GET방식)")
	public ResponseTestToWebServerVO getTest(String firstQueryParam, String secondQueryParam) {
		
        log.info("===========>>># dbController.getTest()");
        log.info(">>># param: " + firstQueryParam, secondQueryParam);
		
		ResponseTestToWebServerVO response = new ResponseTestToWebServerVO();
        response.setFirstSample(firstQueryParam + " <- I received this.");
        response.setSecondSample(secondQueryParam + " <- and more.");
        response.setThirdSample("Are those data you sent to dbServer??");
        response.setFourthSample(new Date());
		
		return response;
	}
}
