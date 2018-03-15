package cn.hbc.work.util;

import cn.hbc.work.impl.Coordinate;
import cn.hbc.work.impl.OffSetCoordinate;

import java.util.List;

/**
 * Created by cuijunyong on 2018/3/15.
 */
public class Commonutil {

  public static boolean isBlank(String str){
    if(str == null || "".equals(str.trim())){
      return true;
    }
    return false;
  }

  public static Coordinate getCoordinate(List<String> list) throws Exception{
    //将list转化为坐标
    String s1 = list.get(1);
    int i1 = Integer.parseInt(s1);
    String s2 = list.get(2);
    int i2 = Integer.parseInt(s2);
    String s3 = list.get(3);
    int i3 = Integer.parseInt(s3);
    if(list.size() == 4){
      return new Coordinate(i1, i2, i3);
    }else{
      String s4 = list.get(4);
      int i4 = Integer.parseInt(s4);
      String s5 = list.get(5);
      int i5 = Integer.parseInt(s5);
      String s6 = list.get(6);
      int i6 = Integer.parseInt(s6);
      return new OffSetCoordinate(i1, i2, i3, i4, i5, i6);
    }
  }
}
