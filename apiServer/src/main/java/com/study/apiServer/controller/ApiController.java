package com.study.apiServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.apiServer.vo.ResponseTestToWebServerVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@Api(tags = {"API_SERVER"})
@RequestMapping("apiServer")
public class ApiController {

	/**
	 * 함수명: getTest
	 * <pre>
	 * 	apiServer 응답처리 Sample
	 * </pre>
	 * @param param
	 * @return
	 */
	@GetMapping("test")
    @ApiOperation("ApiServer - 응답 TEST (GET방식)")
	public ResponseTestToWebServerVO getTest(String firstQueryParam) {
		
        log.info("===========>>># apiController.getTest()");
        log.info(">>># data: " + firstQueryParam);
		
        ResponseTestToWebServerVO response = new ResponseTestToWebServerVO();
        
        response.setFirstSample(firstQueryParam + " <- I received this.");
        response.setSecondSample("Is it a data you sent to apiServer??");
		
		return response;
	}
}
