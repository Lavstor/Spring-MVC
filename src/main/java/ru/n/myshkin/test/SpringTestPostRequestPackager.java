package ru.n.myshkin.test;

import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;

@SpringTestMessagePackager("testPOST")
@RequiredArgsConstructor
class SpringTestPostRequestPackager implements SpringTestMessagePackagerAPI{
    private final Faker faker;

    @Override
    public SpringTestMessageInfo get() {
        return  new SpringTestDefaultMessage(faker.book().author());
    }
}
