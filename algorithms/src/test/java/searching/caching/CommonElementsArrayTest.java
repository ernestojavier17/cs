/*
 * CommonElementsArrayTest.java
 *
 * Jan 10, 2018
 *
 * Copyright (c) Smartmatic Corp.
 * 1001 Broken Sound Parkway NW, Suite D
 * Boca Raton FL 33487, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and propietary information of
 * Smartmatic Corp. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered
 * into with Smartmatic Corp.
 */
package searching.caching;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Ernesto Olivo   (ernesto.olivo@smartmatic.com).
 * @version 6.0.1.SL (Jan 10, 2018).
 */
public class CommonElementsArrayTest {

    private CommonElementsArray target;

    @Before
    public void setUp() {
        target = new CommonElementsArray();
    }

    @Test
    public void findElementsInCommon_test1() {
        int[] a = {1, 5, 15, 20, 30, 37};
        int[] b = {2, 5, 13, 30, 32, 35, 37, 42};

        int[] r = target.findElementsInCommon(a, b);

        Assert.assertArrayEquals(new int[]{5, 30, 37}, r);
    }

    @Test
    public void findElementsInCommon_test2() {
        int[] a = {1, 2, 4, 5, 6};
        int[] b = {2, 3, 5, 7};

        int[] r = target.findElementsInCommon(a, b);

        Assert.assertArrayEquals(new int[]{2, 5}, r);
    }
}
