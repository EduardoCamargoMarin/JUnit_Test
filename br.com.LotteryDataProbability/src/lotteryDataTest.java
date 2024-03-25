import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class lotteryDataTest {
    @Test
    public void  lotteryTest() {
        for (int i = 1; i <= 55; i++) {
            for (int j = i + 1; j <= 56; j++) {
                for (int k = j + 1; k <= 57; k++) {
                    for (int l = k + 1; l <= 58; l++) {
                        for (int m = l + 1; m <= 59; m++) {
                            for (int n = m + 1; n <= 60; n++) {
                               List<Integer> possibleCombination = new ArrayList<>();
                               possibleCombination.add(i);
                               possibleCombination.add(j);
                               possibleCombination.add(k);
                               possibleCombination.add(l);
                               possibleCombination.add(m);
                               possibleCombination.add(n);

                                System.out.println(possibleCombination);
                            }
                        }
                    }
                }
            }
        }
    }
}
