package com.sitech.demo.inter;

import com.sitech.demo.domain.Fruit;
import com.sitech.demo.dto.FruitsDto;
import com.sitech.demo.dto.VegetablesDto;
import com.sitech.ijcf.message6.dt.in.InDTO;

import java.util.Map;

/**
 * Copyright @ 2018北京思特奇信息技术股份有限公司。 All rights reserved.
 *
 * @author: wangqiang
 * @Date: 2018/4/24 11:55
 */
public interface ICustInfoAo {
 public Map testDtoBind(InDTO<FruitsDto> fruitsDtoInDTO);

 public Map testDtoValidate(InDTO<VegetablesDto> vegetablesDtoInDTO);

 public Fruit qryFruit(int id);

 public String qryTest(int id);

 public Map insertFruit(InDTO<FruitsDto> fruitsDtoInDTO);

 public Map updateFruit(InDTO<FruitsDto> fruitsDtoInDTO);

 public Map deleteFruit(InDTO<FruitsDto> fruitsDtoInDTO);
}
