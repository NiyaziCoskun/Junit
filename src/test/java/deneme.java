import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class deneme {

    @Test
    @DisplayName("deneme 1")
    void name() {
        boolean  boolead = false;
        Assertions.assertTrue(boolead);
    }

    @DisplayName("parameterized")
    @ParameterizedTest
    @ValueSource(ints = {2,5,7,6,9,10})
    public void s(int a){
        System.out.println(a*10);
    }


    @RepeatedTest(value = 5,name ="asdasdad {currentRepetition} of {totalRepetitions}")
    public void sa(){
        System.out.println("DF");
    }



}
