package ru.n.myshkin.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
class SpringTestService {
    private final Map<String, SpringTestMessagePackagerAPI> messagePackagersMap;
    private final ObjectMapper objectMapper;

    Map<String, String> generateRandomTestMessage(String htmlName) {
        return convertToMap(
                messagePackagersMap.get(htmlName).get()
        );
    }

    Map<String, String> convertRequestToMap(SpringTestAbstractRequest request) {
        return convertToMap(request);
    }

    private Map<String, String> convertToMap(Object request) {
        return objectMapper.convertValue(
                request,
                Map.class
        );
    }
}
