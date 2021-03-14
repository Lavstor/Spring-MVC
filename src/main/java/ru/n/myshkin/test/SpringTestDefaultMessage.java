package ru.n.myshkin.test;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
class SpringTestDefaultMessage extends SpringTestMessageInfo{
    String testMessage;
}
