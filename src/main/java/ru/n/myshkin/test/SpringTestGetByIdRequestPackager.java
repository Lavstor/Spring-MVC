package ru.n.myshkin.test;

import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;

@SpringTestMessagePackager("testGET_by_id")
@RequiredArgsConstructor
class SpringTestGetByIdRequestPackager implements SpringTestMessagePackagerAPI {
    private final Faker faker;

    @Override
    public SpringTestMessageInfo get() {
        return new SpringTestDefaultMessage(faker.address().city());
    }
}

