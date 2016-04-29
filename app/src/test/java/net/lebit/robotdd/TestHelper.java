package net.lebit.robotdd;

import android.view.View;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
/**
 * Created by ataeschner on 29.04.2016.
 */
public class TestHelper {
    public static void assertViewIsVisible(View view){
        assertNotNull(view);
        assertThat(view.getVisibility(), equalTo(View.VISIBLE));
    }
}
