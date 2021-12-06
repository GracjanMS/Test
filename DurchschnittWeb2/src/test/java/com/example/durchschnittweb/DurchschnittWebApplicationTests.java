package com.example.durchschnittweb;

import com.example.durchschnittweb.durchschnittRechner.controller.DurchschnittController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class DurchschnittWebApplicationTests {


    @Autowired
    private DurchschnittController durchschnittController;


    @Test
    void testController() {

        durchschnittController.fügeNote(2, "Deutsch");
        durchschnittController.fügeNote(1, "Mathe");
        durchschnittController.fügeNote(3, "Bio");

       assertThat(durchschnittController.testGibAvg()).isEqualTo(2);
    }

}


