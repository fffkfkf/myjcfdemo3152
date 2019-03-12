/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 *
 * @author: wangqiang
 * @Date: 2018/4/25 9:31
 */
package com.sitech.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sitech.demo.domain.Vegetables;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 * @Title VegetablesDto
 * @Project ijcfdemo_3_1_5
 * @Description TODO
 * @author wangqiang
 * @date 2018/4/25 9:31
 */
public class VegetablesDto {

	@JsonProperty("VEGETABLES")
	@NotNull
	private List<Vegetables> VegetablesList;

	public List<Vegetables> getVegetablesList() {
		return VegetablesList;
	}

	public void setVegetablesList(List<Vegetables> vegetablesList) {
		VegetablesList = VegetablesList;
	}

	@Override
	public String toString() {
		return "VegetablesDto{" +
				"VegetablesList=" + VegetablesList +
				'}';
	}

}
