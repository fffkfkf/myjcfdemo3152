/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 *
 * @author: wangqiang
 * @Date: 2018/4/24 15:04
 */
package com.sitech.demo.service;

import com.sitech.demo.domain.Fruit;
import com.sitech.demo.domain.FruitExample;
import com.sitech.demo.dto.FruitsDto;
import com.sitech.demo.dto.VegetablesDto;
import com.sitech.demo.entity.FruitEntity;
import com.sitech.demo.inter.ICustInfoAo;
import com.sitech.demo.mapper.FruitMapper;
import com.sitech.ijcf.message6.dt.in.InDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 * @Title CustInfoService
 * @Project ijcfdemo_3_1_5
 * @Description TODO
 * @author wangqiang
 * @date 2018/4/24 15:04
 */
@Service("custInfoAoServiceSvc")
@Api(description = "客户信息的处理")
public class CustInfoAoService implements ICustInfoAo {
	@Resource
	private FruitMapper fruitMapper;

	@Resource
	private FruitEntity  fe;

	/*
		* demo1
	 * 不入库，用于测试服务入参自动绑定和动态出参
	 * 入参message6格式，出参自动封装成message6格式
	 * 注意：这个demo涉及到的实体类上使用的是@Jsonfeild注解，
	 * 结合配置文件：jcf.core.databind-json-type=fastjson，框架默认使用fastjson解析json
	 * url：http://localhost:8888/rs/com_sitech_demo_inter_ICustInfoAoSvc_testDtoBind（传统jcf服务访问方式）
	 * 入参：
	 * {
		 "ROOT" : {
		 	"BODY" : {
			 "FRUITS" : [{
			 "APPLES" : "one"
			 }]
		 },
	 	"HEADER" : {}
		 }
	 }
	 * @param fruitsDtoInDTO
	 * @return
	 */
	@Override
	public Map testDtoBind(@RequestBody InDTO<FruitsDto> fruitsDtoInDTO) {
		System.out.println("We have those fruits ："+fruitsDtoInDTO.getBody().getFruitsList().toString());
		Map map = new HashMap(16);
		map.put("fruits", "apple");
		return map;
	}

	/**
	 * demo2
	 * 不入库，用于测试服务入参自动绑定和动态出参
	 * 入参message6格式，出参自动封装成message6格式
	 * 注意：这个demo涉及到的实体类上使用的是@JsonProperty注解，
	 * 结合配置文件：jcf.core.databind-json-type=jackjson，框架默认使用jackjson解析json
	 * url：http://localhost:8888/dtoValidate（支持springmvc原生方式访问）
		* 没有RequestMapping时，可以用jcf访问。
		* hsf: http://localhost:8888/rs/com_sitech_demo_inter_ICustInfoAoSvc_testDtoValidate
		*
	 * 入参：
	 * {
		 "ROOT" : {
	 		"BODY" : {
		 	"VEGETABLES" : [{
		 	"Tomato" : {
			 "goodTomatoes" : 1
			 },
			 "PATATOES" : "two"
			 }]
		 },
		 "HEADER" : {}
		 }
	 }
	 *
	 * @param vegetablesDtoInDTO
	 * @return
	 */
	@Override
	@RequestMapping(value = "dtoValidate",method = POST)
	public Map testDtoValidate(@RequestBody @Valid InDTO<VegetablesDto> vegetablesDtoInDTO) {
		System.out.println("11111111");

	System.out.println("We have those fruits ："+vegetablesDtoInDTO.getBody().getVegetablesList());
		System.out.println("2222222");
		Map map = new HashMap(16);

		map.put("Vegetables", "patato");

		return map;
	}

	/**
	 * demo3
	 * 入库操作，依赖mybatis，使用generator的插件生成bean，beanExample，mapper和mapper.xml
	 * 入参支持使用springmvc原生的方式
		* url：http://localhost:8888/qryFruit?id=1
	 * 注：由于项目依赖了message6，出参的时候也会以message6格式出参
	 * 返回：
	 * {
		 "ROOT": {
			 "BODY": {
	 			"RUN_IP": "172.23.11.32",
				 "RUN_PORT": null,
				 "REQUEST_ID": "20180426090544750_13028_73",
				 "RETURN_CODE": "0",
				 "RETURN_MSG": "OK",
				 "USER_MSG": "OK",
				 "DETAIL_MSG": "OK",
			 "OUT_DATA": {
				 "id": 1,
				 "apple": "one",
				 "banana": "two",
				 "pear": "three"
			 },
			 "PROMPT_MSG": ""
			 },
	 	"HEADER": null
		 }
	 }
	 * @param id
	 * @return
	 */
	@Override
	@RequestMapping(value = "qryFruit",method = POST)
	public Fruit qryFruit( int id) {
		FruitExample fruitExample = new FruitExample();
		fruitExample.createCriteria().andIdEqualTo(id);
		List<Fruit> fruitList = fruitMapper.selectByExample(fruitExample);//需要改造mybatis。
		System.out.println("222222222+qryFruit");
		return fruitList.get(0);
		//return null;
	}



	@Override
	@ApiOperation(value = "查询信息",notes = "查询信息2",tags = "查询信息3")
	@RequestMapping(value = "qryTest", method = POST)//http://localhost:8888/qryTest?id=1
	public String qryTest(int id) {
		System.out.println("111111");
		List<Fruit> fruits = fe.findById(id);
		System.out.println(fruits.toString());
		return fruits.get(0).toString();
	}

	/**
		*
		* @param fruitsDtoInDTO
		* @return
		*
	{
	"ROOT" : {
	"BODY" : {
	"FRUITS" : [
	{
	"APPLES" : "one",
	"banana" : "onebanana"
	},
	{
	"APPLES" : "two",
	"banana" : "twobanana"
	}

	]
	},
	"HEADER" : {}
	}
	}
		*
		*http://localhost:8888/rs/com_sitech_demo_inter_ICustInfoAoSvc_insertFruit（传统jcf服务访问方式,get/post）
		*
		*
		*
		*/

	@Override
	public Map insertFruit(@RequestBody InDTO<FruitsDto> fruitsDtoInDTO) {
		System.out.println("We have those fruits ："+fruitsDtoInDTO.getBody().getFruitsList().toString());
	fe.insertFruit(fruitsDtoInDTO);
		Map map = new HashMap(16);
		map.put("fruits", "apple");
		return map;
	}


	/**
		*
		*
		*
		{
		"ROOT" : {
		"BODY" : {
		"FRUITS" : [
		{
		"APPLES" : "3one",
		"banana" : "3onebanana"
		},
		{
		"APPLES" : "3two",
		"banana" : "3twobanana"
		}

		]
		},
		"HEADER" : {}
		}
		}

		*
		*
		*
		*
		*
		*
		* @param fruitsDtoInDTO
		* @return
		*/



	@Override
	public Map updateFruit(@RequestBody InDTO<FruitsDto> fruitsDtoInDTO) {
		System.out.println("We have those fruits ："+fruitsDtoInDTO.getBody().getFruitsList().toString());

		int i = fe.updateFruit(fruitsDtoInDTO);

		Map map = new HashMap(16);

		map.put("fruits", "apple"+i);
		return map;
	}



	@Override
	public Map deleteFruit(@RequestBody InDTO<FruitsDto> fruitsDtoInDTO) {
		System.out.println("We have those fruits ："+fruitsDtoInDTO.getBody().getFruitsList().toString());

		int i = fe.deleteFruit(fruitsDtoInDTO);

		Map map = new HashMap(16);

		map.put("fruits", "apple"+i);
		return map;
	}
}
