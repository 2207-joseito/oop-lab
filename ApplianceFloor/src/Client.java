import java.util.ArrayList;

import testsystem.AirConditioner;
import testsystem.Appliance;
import testsystem.MixerGrinder;
import testsystem.Television;
import testsystem.Toaster;

public class Client {

	public static void main(String[] args) {
		
		ArrayList<Appliance> convoyerBelt = new ArrayList<Appliance>() {{
			add(new AirConditioner());
			add(new Television(true));
			add(new AirConditioner(true));
			add(new MixerGrinder());
			add(new MixerGrinder());
			add(new Toaster());
		}};
		
		for (Appliance appliance : convoyerBelt)
			appliance.test();
	}

}
