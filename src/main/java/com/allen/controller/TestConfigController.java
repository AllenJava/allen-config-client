package com.allen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
* @ClassName: TestConfigController
* @Description: 调用配置中心测试类
* @author chenliqiao
* @date 2018年5月15日 下午3:00:53
*
 */
@RestController
public class TestConfigController {
	
	@Value("${from}")
	private String configCenterValue;
	
	/**
	 * 输出从配置中心获取的值
	 */
	@RequestMapping(value="/getValue")
	public String getValueFromConfigCenter(){
		return this.configCenterValue;
	}

}
