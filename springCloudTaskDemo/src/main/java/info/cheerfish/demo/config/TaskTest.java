package info.cheerfish.demo.config;

import org.springframework.cloud.task.listener.annotation.AfterTask;
import org.springframework.cloud.task.listener.annotation.BeforeTask;
import org.springframework.cloud.task.listener.annotation.FailedTask;
import org.springframework.cloud.task.repository.TaskExecution;
import org.springframework.stereotype.Service;

/**
 * @author Masker                    -
 * @description TODO entry class function .....
 * @date 2022/5/25 14:58
 */

@Service
public class TaskTest {
    @BeforeTask
    public void methodA(TaskExecution taskExecution) {
        System.out.println("-------------BeforeTask");
    }

    @AfterTask
    public void methodB(TaskExecution taskExecution) {
        System.out.println("-------------AfterTask");
    }

    @FailedTask
    public void methodC(TaskExecution taskExecution, Throwable throwable) {
        System.out.println("-------------FailedTask");
    }
}
