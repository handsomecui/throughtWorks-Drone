package cn.hbc.work;

import cn.hbc.work.impl.Arguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by cuijunyong on 2018/3/15.
 */
@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    new SpringApplicationBuilder(Application.class).web(false).run(args);
  }

  @Component
  public static class Startup implements CommandLineRunner{

    @Override
    public void run(String... strings) throws Exception {
      Arguments.readInput();
    }
  }

}
