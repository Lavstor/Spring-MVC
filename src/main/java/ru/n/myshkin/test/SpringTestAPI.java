package ru.n.myshkin.test;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/api", produces = MediaType.TEXT_HTML_VALUE)
interface SpringTestAPI {

    @GetMapping("/page")
    String getTestPage(Model model);

    @GetMapping("/page/{id}")
    String getTestPageById(@PathVariable Long id, Model model);

    @PostMapping("/page")
    String getTestPageWithPost(@RequestBody SpringTestRequestBody requestBody, Model model);
}
