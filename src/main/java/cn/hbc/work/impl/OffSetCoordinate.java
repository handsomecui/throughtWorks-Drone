package cn.hbc.work.impl;

/**
 * Created by cuijunyong on 2018/3/15.
 */
public class OffSetCoordinate extends Coordinate{
  private Integer ofx;
  private Integer ofy;
  private Integer ofz;


  public OffSetCoordinate(Integer x, Integer y, Integer z,
                          Integer ofx, Integer ofy, Integer ofz) {
    super(x, y, z, false);
    this.ofx = ofx;
    this.ofy = ofy;
    this.ofz = ofz;
  }


}
