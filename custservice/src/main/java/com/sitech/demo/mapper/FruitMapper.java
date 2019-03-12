package com.sitech.demo.mapper;

import com.sitech.demo.domain.Fruit;
import com.sitech.demo.domain.FruitExample;
import com.sitech.demo.dto.FruitsDto;
import com.sitech.ijcf.message6.dt.in.InDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FruitMapper {

    long countByExample(FruitExample example);

    int deleteByExample(FruitExample example);

    int insert(Fruit record);

    int insertSelective(Fruit record);

    List<Fruit> selectByExample(FruitExample example);

    int updateByExampleSelective(@Param("record") Fruit record, @Param("example") FruitExample example);

    int updateByExample(@Param("record") Fruit record, @Param("example") FruitExample example);

    List<Fruit> findById(int id);

    int insertFruit(Fruit fruit);

    int updateFruit(Fruit fruit);

    int deleteFruit(Fruit fruit);
}