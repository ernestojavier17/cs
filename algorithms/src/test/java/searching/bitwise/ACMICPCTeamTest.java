package searching.bitwise;

import org.junit.Assert;
import org.junit.Before;

public class ACMICPCTeamTest {

    private ACMICPCTeam target;

    @Before
    public void setUp() {
        target = new ACMICPCTeam();
    }

    public void acmTeam_test1() {
        String[] topics = new String[5];
        topics[0] = "10101";
        topics[1] = "11100";
        topics[2] = "11010";
        topics[3] = "00101";

        Assert.assertArrayEquals(new int[]{5, 2}, target.acmTeam(topics));
    }
}
