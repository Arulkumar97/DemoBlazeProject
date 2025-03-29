package org.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.test.JunitMethod01;
import org.test.JunitMethod02;

@RunWith(Suite.class)
@SuiteClasses({
	JunitMethod01.class,
	JunitMethod02.class,
})
public class SuiteClasss {

}
