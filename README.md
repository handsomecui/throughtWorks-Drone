# 无人机
基于 JDK8 ，使用了如下所述的特性与第三方库：

- Maven
- Spring Boot
- Junit

推荐使用 Intellij IDEA 打开本工程。

## 如何打包

请在工程根目录运行 `mvn clean package` 编译并打包整个工程

## 如何运行

两种方式：

- 使用 IDE 导入工程后，input.txt 文件输入无人机活动信号(空格隔开，坐标信息支持逗号隔开)，直接运行 `cn.hbc.work.Application`，在`请输入消息序号`：后面输入消息序号
- mvn 打包完成后在根目录执行 `java -jar target/drone.jar`
  - 在运行后与 `请输入消息序号` 提示后输入消息序号

## 如何运行单元测试

- 于工程根目录运行 `mvn test` 即可，实际上 `mvn package` 时也会运行单元测试
- 使用 IDE 导入工程，运行 `src/test/java` 目录下的单元测试
