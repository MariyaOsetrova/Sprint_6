package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParamExceptionTest {
    private static final String EXPECTION_ERROR = "Используйте допустимые значения пола животного - самец или самка";
    String sex;

    @Parameterized.Parameters(name = "{index} sex = {0}")
    public static Object[][] date() {
        return new Object[][]{
                {"ОНО"},
                {null}
        };
    }

    public LionParamExceptionTest(String sex) {
        this.sex = sex;
    }

    @Test
    public void doesHaveManeReturnExceptionErrorParam() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            new Lion(sex, null);
        });
        Assert.assertEquals(EXPECTION_ERROR, exception.getMessage());
    }


}