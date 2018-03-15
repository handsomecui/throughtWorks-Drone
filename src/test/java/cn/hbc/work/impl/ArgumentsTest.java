package cn.hbc.work.impl;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by cuijunyong on 2018/3/15.
 */
public class ArgumentsTest extends TestCase {

  @Test
  public void testReadInput() throws Exception {
    List<Pair<String, Coordinate>> pairs = Arguments.readInput();
    for(Pair pair : pairs){
      String key = (String)pair.getKey();
      Coordinate val = (Coordinate)pair.getValue();
      System.out.println(key + "-->" + val);
    }
  }
}