package com.example.notendurchschnitts;

import com.example.notendurchschnitts.controller.DurchschnittController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class NotendurchschnittsApplicationTests {
    @Autowired
    private DurchschnittController durchschnittController;


    @Test
    void testController() {


        durchschnittController.fügeNote(2);
        durchschnittController.fügeNote(1);
        durchschnittController.fügeNote(3);
        assertThat(durchschnittController.gibDurchschnitt()).isEqualTo(2);
    }

}
