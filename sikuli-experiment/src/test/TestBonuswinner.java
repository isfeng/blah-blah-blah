package test;

import static org.sikuli.api.API.browse;

import java.net.MalformedURLException;
import java.net.URL;

import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopMouse;

public class TestBonuswinner {

	public static void main(String[] args) throws MalformedURLException {
		
		long start = System.currentTimeMillis();
		
		// go to facebook
		browse(new URL("https://www.facebook.com/"));

		ScreenRegion s = new DesktopScreenRegion();
		Mouse mouse = new DesktopMouse();
		
		//click bonuswinner link
		URL url = ClassLoader.getSystemResource("resources/bonus.jpg");
		Target imageTarget = new ImageTarget(url);
		ScreenRegion r = s.wait(imageTarget, 1000 * 60);
		mouse.click(r.getCenter());

		// clik big 2 icon 
		URL big2url = ClassLoader.getSystemResource("resources/big2.jpg");
		Target big2imageTarget = new ImageTarget(big2url);
		r = s.wait(big2imageTarget, 1000 * 60);
		mouse.click(r.getCenter());

		//click big red button
		URL redurl = ClassLoader.getSystemResource("resources/100713_092014_AM.jpg");
		Target redTarget = new ImageTarget(redurl);
		r = s.wait(redTarget, 1000 * 60);
		mouse.click(r.getCenter());
		
		// 開始配桌
		URL starturl = ClassLoader.getSystemResource("resources/100713_092216_AM.jpg");
		Target startTarget = new ImageTarget(starturl);
		r = s.wait(startTarget, 1000 * 60);
		
		long end = System.currentTimeMillis();
		
		System.out.println((end-start)/1000);
		
	}

}
