package secondpackage;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass{

	@Test(dataProvider="setValue")
	public void getValue(String uname,String age)
	{
		System.out.println(uname+" "+age);
	}
	@DataProvider(name="setValue")
	public Object[][] setValue()
	{
		Object data[][]=new Object[3][2];
		
				data[0][0]="name";
				data[0][1]="age";
				data[1][0]="ram";
				data[1][1]="10";
				data[2][0]="sam";
				data[2][1]=	"20";
				
				return data;
	}

}
/*import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

 // This method takes data as input parameters. The attribute dataprovider is mapped to "getData"
 @Test (dataProvider="getData")
    // Number of columns should match the number of input parameters
 public void loginTest(String Uid, int Pwd){
 System.out.println("UserName is "+ Uid);
 System.out.println("Password is "+ Pwd);
 }

 //If the name is not supplied, the data provider’s name automatically defaults to the method’s name. 
 //A data provider returns an array of objects.
 @DataProvider(name="getData")
 public Object[][] getData(){
 //Object [][] data = new Object [rowCount][colCount];
 Object [][] data = new Object [2][2];

 data [0][0] = "FirstUid";
 data [0][1] = 10;

 data[1][0] = "SecondUid";
 data[1][1] =20;

 return data;

 }
}*/