package net.lebit.robotdd;

import android.os.Build;

import net.lebit.robotdd.fragments.AppStateFragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.TestCase.assertNotNull;
/**
 * Created by ataeschner on 29.04.2016.
 */
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class AppStateFragmentTest {

    private AppStateFragment fragment;
    @Before
    public void setUp() throws Exception {
        fragment = new AppStateFragment();
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(fragment);
    }
}


