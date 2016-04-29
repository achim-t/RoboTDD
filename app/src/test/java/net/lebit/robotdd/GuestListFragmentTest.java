package net.lebit.robotdd;

import android.os.Build;
import android.widget.ListView;

import net.lebit.robotdd.fragments.GuestListFragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.Shadows;
import org.robolectric.annotation.Config;
import org.robolectric.internal.Shadow;
import org.robolectric.shadows.ShadowListView;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.robolectric.shadows.support.v4.SupportFragmentTestUtil.startFragment;
import static net.lebit.robotdd.TestHelper.assertViewIsVisible;
/**
 * Created by ataeschner on 29.04.2016.
 */
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class GuestListFragmentTest {
    private GuestListFragment fragment;
    private ListView guestListView;

    @Before
    public void setUp() throws Exception {
        fragment = GuestListFragment.newInstance();
        startFragment(fragment);
        guestListView = (ListView) fragment.getView().findViewById(R.id.guestListView);
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(fragment);
    }

    @Test
    public void guestListShouldNotBeNull() throws Exception {
        assertViewIsVisible(guestListView);
        assertNotNull(guestListView.getAdapter());
    }

    @Test
    public void listViewShouldNotBeEmpty() throws Exception {
        assertTrue("Guest List is empty", guestListView.getAdapter().getCount()==0);
        populateListView();
        assertTrue("Guest List is not empty", guestListView.getAdapter().getCount()>0);
    }

    private void populateListView() {
        assertNotNull(guestListView.getAdapter());
        ShadowListView shadowListView = Shadows.shadowOf(guestListView);
        shadowListView.populateItems();
    }
}
