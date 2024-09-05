package velvetresidences.TestCases;



import org.testng.annotations.Test;

import velvetresidences.objectclass.Signup;

public class TC_Register_001 extends Baseclass{

	@Test(enabled = false)
	public void Registerwithvalidetails() throws InterruptedException {
		Signup sp=new Signup(driver);
		Thread.sleep(3000);
	    sp.clicksignintext();
	    Thread.sleep(2000);
		sp.clickregistertext();
		Thread.sleep(2000);
		sp.setusername("abc");
		sp.setemail("abc12@gmail.com");
		sp.setpassword("123abcd@");
		sp.setfname("barun");
		sp.setlname("david");
		sp.setphone("1234567890");
		sp.clickprivacypolicycheckbox();
		sp.clicktermsandconditionscheckbox();
		
		Thread.sleep(5000);
	}
	
	@Test
	public void Registerwithinvalidemailone() throws InterruptedException {
		
		Signup sup=new Signup(driver);
		Thread.sleep(3000);
		sup.clicksignintext();
	    Thread.sleep(2000);
	    sup.clickregistertext();
		Thread.sleep(2000);
		sup.setusername("abc");
		sup.setemail("abc12gmail.com");
		Thread.sleep(5000);
		sup.setpassword("123abcd@");
		sup.setfname("barun");
		sup.setlname("david");
		sup.setphone("1234567890");
		sup.clickprivacypolicycheckbox();
		sup.clicktermsandconditionscheckbox();
		Thread.sleep(5000);
		sup.clickRegisterbutton();
		Thread.sleep(5000);
		
	}
	
	@Test
	public void Registerwithinvalidemailtwo() throws InterruptedException {
		
		Signup sup=new Signup(driver);
		Thread.sleep(3000);
		sup.clicksignintext();
	    Thread.sleep(2000);
	    sup.clickregistertext();
		Thread.sleep(2000);
		sup.setusername("abc");
		sup.setemail("abc12@gmailcom");
		Thread.sleep(5000);
		sup.setpassword("123abcd@");
		sup.setfname("barun");
		sup.setlname("david");
		sup.setphone("1234567890");
		sup.clickprivacypolicycheckbox();
		sup.clicktermsandconditionscheckbox();
		Thread.sleep(5000);
		sup.clickRegisterbutton();
		Thread.sleep(5000);
		
	}
	
	@Test 
	public void registerwithemptyfields() throws InterruptedException {
		

		Signup signup=new Signup(driver);
		Thread.sleep(3000);
		signup.clicksignintext();
	    Thread.sleep(2000);
	    signup.clickregistertext();
	    signup.clickRegisterbutton();
		Thread.sleep(5000);
		
	}
	
	@Test 
	public void registerwithoutacceptingprivacypolicy() throws InterruptedException {
		
		Signup sup=new Signup(driver);
		Thread.sleep(3000);
		sup.clicksignintext();
	    Thread.sleep(2000);
	    sup.clickregistertext();
		Thread.sleep(2000);
		sup.setusername("abc");
		sup.setemail("abc12@gmail.com");
		Thread.sleep(5000);
		sup.setpassword("123abcd@");
		sup.setfname("barun");
		sup.setlname("david");
		sup.setphone("1234567890");
	
		sup.clicktermsandconditionscheckbox();
		Thread.sleep(5000);
		sup.clickRegisterbutton();
		Thread.sleep(5000);
		
	}
	
public void registerwithoutacceptingtermsandconditions() throws InterruptedException {
		
		Signup sup=new Signup(driver);
		Thread.sleep(3000);
		sup.clicksignintext();
	    Thread.sleep(2000);
	    sup.clickregistertext();
		Thread.sleep(2000);
		sup.setusername("abc");
		sup.setemail("abc12@gmail.com");
		Thread.sleep(5000);
		sup.setpassword("123abcd@");
		sup.setfname("barun");
		sup.setlname("david");
		sup.setphone("1234567890");
		sup.clickprivacypolicycheckbox();
	
		Thread.sleep(5000);
		sup.clickRegisterbutton();
		Thread.sleep(5000);
		
	}


public void registerwithexistingemail() throws InterruptedException {
	
	Signup sup=new Signup(driver);
	Thread.sleep(3000);
	sup.clicksignintext();
    Thread.sleep(2000);
    sup.clickregistertext();
	Thread.sleep(2000);
	sup.setusername("abc");
	sup.setemail("abc12@gmail.com");
	Thread.sleep(5000);
	sup.setpassword("123abcd@");
	sup.setfname("barun");
	sup.setlname("david");
	sup.setphone("1234567890");
	sup.clickprivacypolicycheckbox();
	sup.clicktermsandconditionscheckbox();
	Thread.sleep(5000);
	sup.clickRegisterbutton();
	Thread.sleep(5000);
	
}

public void registerwithweakpassword() throws InterruptedException {
	
	Signup sup=new Signup(driver);
	Thread.sleep(3000);
	sup.clicksignintext();
    Thread.sleep(2000);
    sup.clickregistertext();
	Thread.sleep(2000);
	sup.setusername("abc");
	sup.setemail("abc12@gmail.com");
	Thread.sleep(5000);
	sup.setpassword("123");
	sup.setfname("barun");
	sup.setlname("david");
	sup.setphone("1234567890");
	sup.clickprivacypolicycheckbox();
	sup.clicktermsandconditionscheckbox();
	Thread.sleep(5000);
	sup.clickRegisterbutton();
	Thread.sleep(5000);
	
}

public void registerwithstrongpassword() throws InterruptedException {
	
	Signup sup=new Signup(driver);
	Thread.sleep(3000);
	sup.clicksignintext();
    Thread.sleep(2000);
    sup.clickregistertext();
	Thread.sleep(2000);
	sup.setusername("abc");
	sup.setemail("abc12@gmail.com");
	Thread.sleep(5000);
	sup.setpassword("123abcd@#");
	sup.setfname("barun");
	sup.setlname("david");
	sup.setphone("1234567890");
	sup.clickprivacypolicycheckbox();
	sup.clicktermsandconditionscheckbox();
	Thread.sleep(5000);
	sup.clickRegisterbutton();
	Thread.sleep(5000);
	
}
	
}
