package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    private Feline felineMock;
    Feline feline = new Feline();

    @Test
    public void eatMeatReturnPredator() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Вернулось не вернная пища", expected, feline.eatMeat());

    }

    @Test
    public void getFamilyReturnFeline() {
        Assert.assertEquals("Кошачьи", feline.getFamily());

    }

    @Test
    public void getKittensReturnCount1() {
        Assert.assertEquals("Вернулось не заданное число", 1, feline.getKittens());
    }

    @Test
    public void testGetKittensReturnWhisParam() {
        felineMock.getKittens(5);
        felineMock.getKittens(0);
        verify(felineMock, times(1)).getKittens(5);
        verify(felineMock, times(1)).getKittens(0);
    }
}