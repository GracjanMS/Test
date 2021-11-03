package edu.fra.uas;

import edu.fra.uas.service.MessageService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import edu.fra.uas.controller.BeanController;
//import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ControllerTest {
    @Autowired
    private BeanController beanController;

    @Test
    void testController() {
        assertThat(beanController.putMessage("Das ist ein Test"))
                .isEqualTo("Das ist ein Test");
    }

    @Autowired
    private MessageService test;

    @Test
    void testen() {

        for (int i = 0; i < 3; i++) {
            assertThat(test.increment());
        }
        System.out.println(test.increment());

    }


}