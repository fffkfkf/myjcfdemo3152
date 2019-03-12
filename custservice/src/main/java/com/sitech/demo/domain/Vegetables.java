/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 *
 * @author: wangqiang
 * @Date: 2018/4/25 9:36
 */
package com.sitech.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 * @Title Vegetables
 * @Project ijcfdemo_3_1_5
 * @Description TODO
 * @author wangqiang
 * @date 2018/4/25 9:36
 */
public class Vegetables {

	private Tomato tomatoes;

	@NotNull(message="土豆不能少！")
	@JsonProperty("PATATOES")
	private String potato;

	public Tomato getTomatoes() {
		return tomatoes;
	}

	public void setTomatoes(Tomato tomatoes) {
		this.tomatoes = tomatoes;
	}

	public String getPotato() {
		return potato;
	}

	public void setPotato(String potato) {
		this.potato = potato;
	}

	@Override
	public String toString() {
		return "Vegetables{" +
				"tomatoes=" + tomatoes +
				", potato='" + potato + '\'' +
				'}';
	}
}
