package com.staragile.oops;

interface WebDriverDemo {
	void get(String url);

	void close();

	String getTitle();

	void quit();
}

class EdgeDriverDemo implements WebDriverDemo {
	
	public void onlyEdge()
	{
		
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("close edge");
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub

	}

}

class ChromeDriverDemo implements WebDriverDemo {

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("chrome close");
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	
}

public class BrowserTest {
	public static void main(String[] args) {
		
		WebDriverDemo driver=new EdgeDriverDemo(); 
		//the method to be called is resolved during runtime based on the object created
		//runtimepolymphosism
		
		driver.close();
		
		
	}
}
