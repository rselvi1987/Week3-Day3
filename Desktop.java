package week3.Day2;

public class Desktop implements Hardware , Software {

	public void desktopmodel() {
		
	System.out.println("Desktop model is HP Elite");	


	}

	@Override
	public void hardwareResources() {
		System.out.println("Hardware Resources");
		
	}

	@Override
	public void softwareResources() {
		System.out.println("Software Resources");
	}
	
	public static void main(String[] args) {
		
		Desktop obj = new Desktop();
		obj.desktopmodel();
		obj.hardwareResources();
		obj.softwareResources();
	}

}


