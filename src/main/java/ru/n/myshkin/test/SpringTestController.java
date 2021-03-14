package ru.n.myshkin.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
@RequiredArgsConstructor
class SpringTestController implements SpringTestAPI {
    private final SpringTestService springTestService;

    @Override
    public String getTestPage(Model model) {
        model.addAllAttributes(
                springTestService.generateRandomTestMessage("testGET")
        );

        return "testGET";
    }

    @Override
    public String getTestPageById(Long id, Model model) {
        model.addAllAttributes(
                springTestService.generateRandomTestMessage("testGET_by_id")
        );

        return "testGET_by_id_" + id;
    }

    @Override
    public String getTestPageWithPost(SpringTestRequestBody requestBody, Model model) {
        model.addAllAttributes(
                springTestService.generateRandomTestMessage("testPOST")
        );

        model.addAttribute(Map.of(

        ));

        return "testPOST";
    }
}
