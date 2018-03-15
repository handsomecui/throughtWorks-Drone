package cn.hbc.work.impl;


import cn.hbc.work.util.Commonutil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuijunyong on 2018/3/15.
 */
public class Arguments {
  private static final Logger log = LoggerFactory.getLogger(Arguments.class);

  public static List<Pair<String, Coordinate>> readInput(){
    List<Pair<String, Coordinate>> pairs = new ArrayList<>();
    try {
      InputStreamReader in = new InputStreamReader(new FileInputStream("input.txt"));
      BufferedReader br = new BufferedReader(in);
      String buf = "";
      while((buf = br.readLine()) != null){
        Pair<String, Coordinate> stringListPair = handleLine(buf);
        if(stringListPair != null){
          pairs.add(stringListPair);
        }
      }
    } catch (Exception e) {
      log.error("读取文件失败:" + e.toString());
    }
    return pairs;
  }

  public static Pair<String, Coordinate> handleLine(String line){
    log.debug("获取行为：" + line);
    if(Commonutil.isBlank(line)){
      log.error("读取行为空！");
      return null;
    }
    String[] cols = line.split(" ");
    List<String> realCols = new ArrayList<>();

    if (cols.length < 2){
      log.error("列空格分割的长度为:" + cols.length + " 格式错误");
      return new Pair<>(cols[0].trim(), null);
    }

    if(cols.length == 2){
      log.debug("列空格分割的长度为2");
      //可能是逗号隔开
      realCols.add(cols[0]);
      String[] split = cols[1].split(",");
      for(String e : split){
        if(!Commonutil.isBlank(e)){
          realCols.add(e.trim());
        }
      }
    }else{
      for(String e : cols){
        if(!Commonutil.isBlank(e)){
          realCols.add(e.trim());
        }
      }
    }


    if(realCols.size() != 4 && realCols.size() != 7){
      log.error("读取行格式有误，行为：" + line);
      return new Pair<>(cols[0].trim(), null);
    }

    String droneId;
    droneId = realCols.get(0);
    Coordinate coordinate = null;
    try {
      coordinate = Commonutil.getCoordinate(realCols);
    } catch (Exception e) {
      log.error("参数格式错误：" + e.toString());
    }
    Pair<String, Coordinate> pair = new Pair<>(droneId, coordinate);
    return pair;
  }



}
