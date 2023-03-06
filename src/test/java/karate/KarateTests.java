package karate;

import com.daasworld.hellokarate.HelloKarateApplication;
import com.intuit.karate.junit5.Karate;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, classes = {HelloKarateApplication.class})
class KarateTests {

    @Karate.Test
    Karate dummyTest() {
        return Karate.run("classpath:karate/TechMTest.feature");
    }
}