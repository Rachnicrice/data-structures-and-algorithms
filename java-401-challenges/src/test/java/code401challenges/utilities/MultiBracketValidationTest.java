package code401challenges.utilities;

import code401challenges.stacksAndQueues.Stack;
import org.junit.Assert;
import org.junit.Test;

import static code401challenges.utilities.MultiBracketValidation.multiBracketValidation;

public class MultiBracketValidationTest {

    @Test
    public void testMultiBracketValidation_True () {
        Assert.assertTrue(multiBracketValidation("(){}[()]"));
    }

    @Test
    public void testMultiBracketValidation_False () {
        Assert.assertFalse(multiBracketValidation("({]})"));
    }

    @Test
    public void testMultiBracketValidation_WithExtraCharacters () {
        Assert.assertTrue(multiBracketValidation("[(This is totally okay{})]"));
    }

    @Test
    public void testMultiBracketValidation_SingleCharacter () {
        Assert.assertFalse(multiBracketValidation("("));
    }

    @Test
    public void testMultiBracketValidation_NonMatchingBrackets () {
        Assert.assertFalse(multiBracketValidation("(}"));
    }

}
