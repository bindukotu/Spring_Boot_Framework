package com.faang.bindu;

import com.jayway.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;


@SpringApplicationConfiguration(classes = App.class)
@IntegrationTest({"server.port:0",
        "spring.datasource.url:jdbc:h2:mem:SB_Sample1;DB_CLOSE_ON_EXIT=FALSE"})
public class HelloControllerTest {

}