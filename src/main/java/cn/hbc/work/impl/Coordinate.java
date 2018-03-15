package cn.hbc.work.impl;

/**
 * Created by cuijunyong on 2018/3/15.
 */
public class Coordinate {
  private Integer x;
  private Integer y;
  private Integer z;
  private boolean isSuper = true;

  public Integer getX() {
    return x;
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public Integer getY() {
    return y;
  }

  public void setY(Integer y) {
    this.y = y;
  }

  public Integer getZ() {
    return z;
  }

  public void setZ(Integer z) {
    this.z = z;
  }

  public boolean isSuper() {
    return isSuper;
  }

  public Coordinate(Integer x, Integer y, Integer z, boolean... isSuper) {
    this.x = x;
    this.y = y;
    this.z = z;
    if(isSuper.length > 0){
      this.isSuper = isSuper[0];
    }

  }

  @Override
  public String toString() {
    return "Coordinate{" +
            "x=" + x +
            ", y=" + y +
            ", z=" + z +
            ", isSuper=" + isSuper +
            '}';
  }
}
