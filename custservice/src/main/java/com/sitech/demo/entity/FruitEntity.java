package com.sitech.demo.entity;

import com.sitech.demo.domain.Fruit;
import com.sitech.demo.domain.Fruits;
import com.sitech.demo.dto.FruitsDto;
import com.sitech.demo.mapper.FruitMapper;
import com.sitech.ijcf.message6.dt.in.InDTO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class FruitEntity {

 @Resource
 private FruitMapper fr;

 public List<Fruit> findById(int id){
  List<Fruit> list = fr.findById(id);

  return list;
 }

 public int insertFruit(InDTO<FruitsDto> fruitsDtoInDTO) {

  FruitsDto fbody = fruitsDtoInDTO.getBody();
  List<Fruits> fruitsList = fbody.getFruitsList();
  Fruit fruit = new Fruit();
  int ret=0;
  for (int i = 0; i < fruitsList.size(); i++) {
   //这里根据数据库的记录来定,注意id.
   fruit.setId(i+6);
   fruit.setApple(fruitsList.get(i).getApple());
   fruit.setPear(fruitsList.get(i).getPear());
   fruit.setBanana(fruitsList.get(i).getBanana());
   ret = fr.insertFruit(fruit);
  }
  System.out.println("返回值是:" + ret);
  return ret;
 }


 public int updateFruit(InDTO<FruitsDto> fruitsDtoInDTO) {
  FruitsDto fbody = fruitsDtoInDTO.getBody();
  List<Fruits> fruitsList = fbody.getFruitsList();
  Fruit fruit = new Fruit();
  int ret=0;
  for (int i = 0; i < fruitsList.size(); i++) {
   //这里根据数据库的记录来定,注意id.
   fruit.setId(i+6);
   fruit.setApple(fruitsList.get(i).getApple());
   fruit.setPear(fruitsList.get(i).getPear());
   fruit.setBanana(fruitsList.get(i).getBanana());
   ret = fr.updateFruit(fruit);
  }
  System.out.println("返回值是:" + ret);
  return ret;

 }

 public int deleteFruit(InDTO<FruitsDto> fruitsDtoInDTO) {
  FruitsDto fbody = fruitsDtoInDTO.getBody();
  List<Fruits> fruitsList = fbody.getFruitsList();
  Fruit fruit = new Fruit();
  int ret=0;
  for (int i = 0; i < fruitsList.size(); i++) {
   //这里根据数据库的记录来定,注意id.
   fruit.setId(i+6);
   fruit.setApple(fruitsList.get(i).getApple());
   fruit.setPear(fruitsList.get(i).getPear());
   fruit.setBanana(fruitsList.get(i).getBanana());
   ret = fr.deleteFruit(fruit);
  }
  System.out.println("返回值是:" + ret);
  return ret;
 }


}
