package ru.n.myshkin.test;

import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;

@SpringTestMessagePackager("testGET")
@RequiredArgsConstructor
class SpringTestGetRequestPackager implements SpringTestMessagePackagerAPI{
    private final Faker faker;

    @Override
    public SpringTestMessageInfo get() {
        return new SpringTestDefaultMessage(faker.animal().name());
    }
}
