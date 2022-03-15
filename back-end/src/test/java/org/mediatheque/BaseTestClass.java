package org.mediatheque;


import org.junit.jupiter.api.BeforeEach;
import org.openapitools.api.MediaApiController;
import org.openapitools.api.UsersApiController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@DirtiesContext
@AutoConfigureMessageVerifier
public class BaseTestClass {

    @Autowired
    private MediaApiController mediaController;
    
    @Autowired
    UsersApiController userApiController;

    
    @BeforeEach
    public void setup() {
        StandaloneMockMvcBuilder standaloneMockMvcBuilder 
          = MockMvcBuilders.standaloneSetup(mediaController, userApiController);
        RestAssuredMockMvc.standaloneSetup(standaloneMockMvcBuilder);
    }
}
