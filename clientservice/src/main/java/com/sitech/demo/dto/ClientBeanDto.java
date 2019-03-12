/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 *
 * @author: wangqiang
 * @Date: 2018/4/27 15:14
 */
package com.sitech.demo.dto;

import java.io.Serializable;

/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 * @Title ClientBean
 * @Project ijcfdemo_3_1_5
 * @Description TODO
 * @author wangqiang
 * @date 2018/4/27 15:14
 */
public class ClientBeanDto implements Serializable {
	private String clientA;
	private String clientB;

	public String getClientA() {
		return clientA;
	}

	public void setClientA(String clientA) {
		this.clientA = clientA;
	}

	public String getClientB() {
		return clientB;
	}

	public void setClientB(String clientB) {
		this.clientB = clientB;
	}
}
