package cn.hbc.work.impl;

/**
 * Created by cuijunyong on 2018/3/15.
 */
public class Coordinate {
  private Integer x;
  private Integer y;
  private Integer z;
  private boolean isSuper = true;
  private boolean isError = false;

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


  public boolean isError() {
    return isError;
  }

  public void setIsError(boolean isError) {
    this.isError = isError;
  }

  public Coordinate(boolean isError){
    this.isError = isError;
  }

  public Coordinate(Integer x, Integer y, Integer z, boolean... isSuper) {
    this.x = x;
    this.y = y;
    this.z = z;
    if(isSuper.length > 0){
      this.isSuper = isSuper[0];
    }

  }

  //返回当前飞机的状态
  public String display(String planeId, int i){
    if(isError){
      return "Error: " + i;
    }else{
      return planeId + " " + i + " " + x + " " + y + " " + z;
    }
  }

  public boolean equals(Coordinate obj) {
    if(x == obj.getX() && y == obj.getY() && z == obj.getZ()){
      return true;
    }
    return false;
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
