package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline feline;

    @Test
    public void getSoundReturnVoice() {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Вернулось не верное значение", "Мяу", cat.getSound());
    }

    @Test
    public void getFoodReturnEat() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        when(cat.getFood()).thenReturn(expectedFood);
        Assert.assertEquals(expectedFood, cat.getFood());
    }
}