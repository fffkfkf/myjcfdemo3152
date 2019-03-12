/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 *
 * @author: wangqiang
 * @Date: 2018/4/24 14:14
 */
package com.sitech.demo.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.sitech.demo.domain.Fruits;

import java.util.List;

/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 * @Title AppleDto
 * @Project ijcfdemo_3_1_5
 * @Description TODO
 * @author wangqiang
 * @date 2018/4/24 14:14
 */
public class FruitsDto {

	@JSONField(name = "FRUITS")
	private List<Fruits> fruitsList;

	public List<Fruits> getFruitsList() {
		return fruitsList;
	}

	public void setFruitsList(List<Fruits> fruitsList) {
		this.fruitsList = fruitsList;
	}

	@Override
	public String toString() {
		return "FruitsDto{" +
			"fruitsList=" + fruitsList +
			'}';
	}
}
