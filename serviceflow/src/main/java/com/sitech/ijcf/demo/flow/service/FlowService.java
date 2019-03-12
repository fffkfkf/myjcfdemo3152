/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 *
 * @author: wangqiang
 * @Date: 2018/4/27 10:25
 */
package com.sitech.ijcf.demo.flow.service;

import com.sitech.ijcf.boot.core.service.ArchitectureType;
import com.sitech.ijcf.boot.core.service.client.IServiceClient;
import com.sitech.ijcf.demo.dto.Fruits;
import com.sitech.ijcf.demo.dto.FruitsDto;
import com.sitech.ijcf.demo.flow.inter.IFlowService;
import com.sitech.ijcf.message6.dt.Header;
import com.sitech.ijcf.message6.dt.in.InDTO;
import com.sitech.ijcf.message6.dt.support.MBean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 *
 * @author wangqiang
 * @Title FlowService
 * @Project ijcfdemo_3_1_5
 * @Description TODO
 * @date 2018/4/27 10:25
 */
@Service("flowService")
public class FlowService implements IFlowService {
 @Resource
 private IServiceClient serviceClient;

 //postman 进行测试：http://localhost:8760/visitClient
 @Override
 @RequestMapping("visitClient")
 @ResponseBody
 public String visitClient() {
  //
  System.out.println("ssssxxxsssss");
  String serviceName = "http://clientService/testClient";
  //想用其他工程的对象,可以用工程进行依赖,或者做成公共工程.例如dto.  clientService
  InDTO<FruitsDto> inDTO1 = new InDTO();
  FruitsDto fd = new FruitsDto();
  List<Fruits> list = new ArrayList();
  Fruits fr = new Fruits();
  Fruits fr2 = new Fruits();
  fr.setApple("an apple");
  fr.setBanana("an banana");
  fr2.setApple("two apples");
  fr2.setBanana("two bananas");
  list.add(fr);
  list.add(fr2);
  fd.setFruitsList(list);
  inDTO1.setBody(fd);
  //eureka的调用方式.
  System.out.println("flowService的indto参数："+inDTO1.getBody().getFruitsList());
  MBean m= new MBean();
  m.setBody("baowenti",inDTO1);
  //入参需要是Mbean的类型（其他的暂时不行），出参可选择，“ArchitectureType”需要写。
  //入参类型是移动的6系报文。
  String rtnStr = serviceClient.callService(serviceName, m.toString(), String.class, ArchitectureType.SPRINGCLOUD);
  System.out.println("flowService类的出参："+rtnStr);
  return rtnStr;
 }

 @Override
 @RequestMapping("visitClient1")
 public String test1(String name) {
  String serviceName = "http://clientService/testClient1";
  String rtnStr = serviceClient.callService(serviceName, serviceName, String.class);
  System.out.println(rtnStr);
  return rtnStr;
 }
}
