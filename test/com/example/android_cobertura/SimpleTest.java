package com.example.android_cobertura;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;


@RunWith(RobolectricTestRunner.class)
public class SimpleTest {
	
	@Test
	public void simple(){
		MainActivity ma = Robolectric.buildActivity(MainActivity.class).create().get();
		assertNotNull(ma);
	}
}
