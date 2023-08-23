package in.co.raj.bundle;

import java.util.ResourceBundle;

public class TestBundle {
	public static void main(String[] args) {

		ResourceBundle rb = ResourceBundle.getBundle("in.co.raj.bundle.app");
		
		
		System.out.println(rb.getString("driver"));
		System.out.println(rb.getString("url"));
		System.out.println(rb.getString("user"));
		System.out.println(Integer.parseInt(rb.getString("initial")));
		System.out.println(Integer.parseInt(rb.getString("acquire")));
		System.out.println(Integer.parseInt(rb.getString("maximum")));

	}

}
