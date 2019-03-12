/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 *
 * @author: wangqiang
 * @Date: 2018/4/25 9:39
 */
package com.sitech.demo.domain;

/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 * @Title Tomato
 * @Project ijcfdemo_3_1_5
 * @Description TODO
 * @author wangqiang
 * @date 2018/4/25 9:39
 */
public class Tomato {
	private int goodTomatoes;
	private int badeTomatoes;

	public int getGoodTomatoes() {
		return goodTomatoes;
	}

	public void setGoodTomatoes(int goodTomatoes) {
		this.goodTomatoes = goodTomatoes;
	}

	public int getBadeTomatoes() {
		return badeTomatoes;
	}

	public void setBadeTomatoes(int badeTomatoes) {
		this.badeTomatoes = badeTomatoes;
	}

	@Override
	public String toString() {
		return "Tomato{" +
				"goodTomatoes=" + goodTomatoes +
				", badeTomatoes=" + badeTomatoes +
				'}';
	}
}
