package Junit_SuYeounLee;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ YourPurchasesTest.class, YourPurchasesTest2.class })
public class AllTests {

}
