import com.example.presentation2022.builderpattern.HavAJavaWorker;
import com.example.presentation2022.builderpattern.sandwich.Bagel;
import com.example.presentation2022.builderpattern.sandwich.BagelBuilder;
import com.example.presentation2022.builderpattern.sandwich.toppings.Condiments;
import com.example.presentation2022.builderpattern.sandwich.toppings.Dressing;
import com.example.presentation2022.builderpattern.sandwich.toppings.Meat;
import com.example.presentation2022.builderpattern.sandwich.toppings.Veggies;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.beans.JavaBean;

import static org.junit.jupiter.api.Assertions.*;

class SandwichBuilderTest {
    private BagelBuilder bagelBuilder;

    public void init(){
        this.bagelBuilder = new BagelBuilder();
    }
    @Deprecated
    @Test
    public void canEvaluateVegetarian(){
        //Arrange
        bagelBuilder.setVeggies(Veggies.salad)
                .size(10)
                .setDressing(Dressing.dillDressing)
                .setCondiments(Condiments.pickledRedOnions);
        //Act
        Bagel bagel = bagelBuilder.build();
        //Assert
        assertTrue(bagel.isVegetarian);
    }

    @Test
    public void canEvaluateNonVegetarian(){
        //Arrange
        bagelBuilder.setVeggies(Veggies.salad)
                .size(10)
                .setMeat(Meat.Salmon)
                .setDressing(Dressing.dillDressing)
                .setCondiments(Condiments.pickledRedOnions);
        //Act
        Bagel bagel = bagelBuilder.build();
        //Assert
        assertFalse(bagel.isVegetarian);
    }
}