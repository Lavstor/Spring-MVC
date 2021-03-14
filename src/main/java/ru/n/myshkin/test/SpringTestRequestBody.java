package ru.n.myshkin.test;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
class SpringTestRequestBody extends SpringTestAbstractRequest {
   private Long id;
   private String someInfo;
}
