package cn.hbc.work.impl;

import cn.hbc.work.util.Commonutil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by cuijunyong on 2018/3/15.
 */
public class Plane {
  private List<Pair<String, Coordinate>> pairs;
  private Map<String, Coordinate> planes;
  private String[] ans;

  public void init(){
    this.pairs = Arguments.readInput();
    planes = new HashMap<>();
    ans = new String[this.pairs.size()];
  }

  public void work(){
    for(int i = 0; i < pairs.size(); i++){
      Pair<String, Coordinate> pair = pairs.get(i);
      String key = (String)pair.getKey();
      Coordinate value = (Coordinate)pair.getValue();
      Coordinate coordinate = planes.get(key);
      Coordinate cur = getCurCoordinate(key, value, coordinate);
      planes.put(key, cur);
      ans[i] = cur.display(key, i);
    }
    //
    System.out.println("请输入消息序号：");
    int i = new Scanner(System.in).nextInt();
    if(i >= ans.length){
      System.out.println("Cannot find " + i);
    }else{
      System.out.println(ans[i]);
    }

  }


  /**
   * 获取当前坐标
   * @param pid  无人机id
   * @param cur 当前无人机的坐标状态
   * @param coordinate 出现的坐标状态
   * @return
   */
  private Coordinate getCurCoordinate(String pid, Coordinate cur, Coordinate coordinate) {
    if(cur == null){
      //当前为null代表输入格式有问题，属于故障状态
      return new Coordinate(true);
    }else{
      // value不为null
      if(coordinate == null){
        //如果坐标不存在，证明这个飞机第一次出现
        if(cur != null && cur.isSuper()){
          //第一次出现需要是初始位置
          return cur;
        }else{
          return new Coordinate(true);
        }
      }else{
        if(coordinate.isSuper() && !cur.isSuper()){
          //保证原本的是位置信息，当前是位移信息
          if(coordinate.equals(cur)){
            //必须保证位置相等
            OffSetCoordinate c = (OffSetCoordinate)cur;
            Coordinate realCoor = c.getRealCoor();
            return realCoor;
          }
        }
      }

    }

    return new Coordinate(true);
  }

}
