package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParamTest {

    boolean expect;
    String sex;

    @Parameterized.Parameters(name = "{index} sex = {0}")
    public static Object[][] date() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    public LionParamTest(String sex, boolean expect) {
        this.sex = sex;
        this.expect = expect;
    }

    @Test
    public void doesHaveManeReturnTrueFalseParam() throws Exception {
        Lion lion = new Lion(sex, null);
        Assert.assertEquals(expect, lion.doesHaveMane());
    }

}