package app.service;

import app.model.EGarantPolicy;
import app.model.Vehicle2;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;

import java.util.Scanner;

@Service
public class KafkaService {

    private final KafkaTemplate<Long, EGarantPolicy> kafkaTemplate;
    private final KafkaTemplate<Long, Vehicle2> kafkaTemplate2;
    private final ObjectMapper objectMapper;

    @Autowired
    public KafkaService(KafkaTemplate<Long, EGarantPolicy> kafkaTemplate,
                        KafkaTemplate<Long, Vehicle2> kafkaTemplate2,
                        ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
        this.kafkaTemplate2 = kafkaTemplate2;
    }

    @PostConstruct
    public void produce() throws IOException {
        EGarantPolicy policy = objectMapper.readValue(new StringReader(readFile("ContractResponseModified.json")), EGarantPolicy.class);
        System.out.println("<= sending " + writeValueAsString(policy));
        kafkaTemplate.send("egarant.test", policy);
    }

//    @PostConstruct
//    public void produce() throws IOException {
//        Vehicle2 policy = objectMapper.readValue(new StringReader(readFile("Vehicle.json")), Vehicle2.class);
//        System.out.println("<= sending " + writeValueAsString(policy));
//        kafkaTemplate2.send("egarant.test", policy);
//    }

    private String readFile(String path) {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(path);
        Scanner s = new Scanner(is, "UTF-8").useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

    private String writeValueAsString(Object dto) {
        try {
            return objectMapper.writeValueAsString(dto);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("Writing value to JSON failed: " + dto.toString());
        }
    }
}