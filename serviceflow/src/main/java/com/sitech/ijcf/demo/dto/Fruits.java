/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 *
 * @author: wangqiang
 * @Date: 2018/4/24 14:20
 */
package com.sitech.ijcf.demo.dto;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 * @Title Fruit
 * @Project ijcfdemo_3_1_5
 * @Description TODO
 * @author wangqiang
 * @date 2018/4/24 14:20
 */
public class Fruits implements Serializable {

	@JSONField(name="APPLES")
	private String apple;
	@JSONField(name="BANANAS")
	private String banana;
	@JSONField(name="PEARS")
	private String pear;

	public String getApple() {
		return apple;
	}

	public void setApple(String apple) {
		this.apple = apple;
	}

	public String getBanana() {
		return banana;
	}

	public void setBanana(String banana) {
		this.banana = banana;
	}

	public String getPear() {
		return pear;
	}

	public void setPear(String pear) {
		this.pear = pear;
	}

	@Override
	public String toString() {
		return "Fruits{" +
				"apple='" + apple + '\'' +
				", banana='" + banana + '\'' +
				", pear='" + pear + '\'' +
				'}';
	}

}
