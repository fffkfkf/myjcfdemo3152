package com.sitech.demo.dto;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

public class FruitsDto implements Serializable {

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
