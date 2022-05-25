package info.cheerfish.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author Masker                    -
 * @description TODO entry class function .....
 * @date 2022/5/25 10:54
 */

@SpringBootApplication
@EnableTask
@EnableScheduling
public class TaskStarter {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(TaskStarter.class, args);
        while (true) {
            Thread.sleep(1000);
        }
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return new HelloWorldCommandLineRunner();
    }


    @Autowired
    @Scheduled(cron = "1/5 * * * * *")
    public void test() throws Exception {
        System.out.println("---------");
    }

    public static class HelloWorldCommandLineRunner implements CommandLineRunner {

        @Override
        public void run(String... strings) throws Exception {

            System.out.println("Hello, World!");
        }
    }
}
