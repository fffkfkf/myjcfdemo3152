/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 *
 * @author: wangqiang
 * @Date: 2018/4/27 9:06
 */
package com.sitech.demo.service;

import com.sitech.demo.inter.IClientService;
import com.sitech.ijcf.message6.dt.in.InDTO;
import com.sitech.ijcf.message6.dt.support.MBean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 * @Title ClientService
 * @Project ijcfdemo_3_1_5
 * @Description TODO
 * @author wangqiang
 * @date 2018/4/27 9:06
 */
@Service("clientService")
public class ClientService implements IClientService
{
	/**
	 * demo
	 * 本例依赖的是电信的starter，这边出入参则是电信格式
	 * 入参：
	 * {
		 "contractRoot": {
	 		"tcpCont": {
			 "svcCode": "40400400060001",
			 "appKey": "CRM-Portal",
			 "dstSysId": "MktResCenter ",
			 "transactionId": "1001000101201602021234567890",
			 "reqTime": null,
			 "sign": "xxxxxxxxxxxxx",
			 "version": "1.0"
		 },
		 "svcCont": {
		 "authenticationInfo": {
		 "sysUserId": "10001",
		 "sysUserPostId": "20001"
		 },
		 "requestObject": {
		 "FRUITS" : [{
			 "clientA":"C"

		 }]
	 }
	 }
	 }
	 }
		http://localhost:8889/testClient
	 * @param
	 * @return
	 */
	/*@Override
	@RequestMapping("testClient")
	@ResponseBody
	public String testClient(@RequestBody InDTO<ClientBeanDto> clientInfo) {

		String clientName = clientInfo.getBody().getClientA();
		System.out.println("it's client:"+clientInfo.getBody().toString());
		System.out.println("=====================================================");

		return clientName;
	}*/

	@Override
 @RequestMapping("testClient")
 @ResponseBody
	public String testClient(@RequestBody InDTO inDTO1) {
  System.out.println("testClient的入参："+inDTO1.getBody());
  System.out.println("=====================================================");
		return "test1成功了";
	}

//进行postman测试时，url是：http://localhost:8889/testClient1
	//作为服务进行发布时，url是： http://clientService/testClient1
 @Override
 @RequestMapping("testClient1")
 @ResponseBody
 public String test1(@RequestBody String s) {
  System.out.println("test1的出参"+s);
  return s;
 }


}
