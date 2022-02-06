package package1;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
//import runner.Smoke;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@Execution(ExecutionMode.CONCURRENT)
//@DisplayName(value = "Myustil test")
public class MyUtilTest {

    @Test
//    @Tag(value = "dev")
    //@Category(Smoke.class)
//    @DisplayName(value = "test 1")
    void test1(){
        System.out.println("Test 1 calisti");
    }
    @Test
    @Order(1)
    @Tag(value = "myTag")
    @DisplayName(value = "test 2 burdaydi")
    void test2(){
        Assertions.fail();

        System.out.println("Test 2 calisti");
    }
    @Test
    @Tag(value = "myTag")
    @DisplayName(value = "test 3")
    void test3(){
        System.out.println("Test 3 calisti");
    }
    @Test
    @Order(2)
    @Tag(value = "myTag")
    @DisplayName(value = "test 4")
    void test4(){
        System.out.println("Test 4 calisti");
    }

}
