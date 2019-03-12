package com.sitech.demo.dto;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class Fruits implements Serializable {

 @JSONField(name="APPLES")
 private String apple;

 private String banana;

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
