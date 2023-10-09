
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class MyUtility {
    public static int generateRandomNumber(Random random, int maxRange){
        return random.nextInt(maxRange);
    }
}
