package tests;
import android.test.ActivityInstrumentationTestCase2;
import com.android.cse110lab3exe.MainActivity;
/**
 * Created by User on 4/13/2016.
 */
public class JUnit_Test extends ActivityInstrumentationTestCase2<MainActivity>
{
    MainActivity mainActivity;
    public JUnit_Test()
    {
        super(MainActivity.class);
    }

    public void testSum()
    {
        mainActivity = getActivity();
        assertEquals( 2.0, mainActivity.sum(1, 1) );
        assertEquals( 3.14, mainActivity.sum(3, 0.14) );
    }
}
