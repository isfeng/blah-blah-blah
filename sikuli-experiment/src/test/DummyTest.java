package test;

import static org.junit.Assert.*;

import java.io.File;
import java.net.URL;

import org.junit.Test;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.Target;

public class DummyTest {

	@Test
	public void testFileExist() {
		URL url = ClassLoader.getSystemResource("resources/bonus.jpg");
		assertNotNull(url);

		Target imageTarget = new ImageTarget(url);
		assertNotNull(imageTarget);
	}

}
