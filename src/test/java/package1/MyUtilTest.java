package package1;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName(value = "Myustil test")
public class MyUtilTest {

    @Test
    @Tag(value = "dev")
    @DisplayName(value = "test 1")
    void test1(){
        System.out.println("Test 1 calisti");
    }
    @Test
    @Tag(value = "dev")
    @DisplayName(value = "test 2")
    void test2(){
        System.out.println("Test 2 calisti");
    }
    @Test
    @Tag(value = "dev")
    @DisplayName(value = "test 3")
    void test3(){
        System.out.println("Test 3 calisti");
    }
    @Test
    @Tag(value = "myTag")
    @DisplayName(value = "test 4")
    void test4(){
        System.out.println("Test 4 calisti");
    }

}
