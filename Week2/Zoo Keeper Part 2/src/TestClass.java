
public class TestClass {
//	Variables and their corresponding Getter and Setter methods
//	Setter methods would only be up here if it is directly changing the value like setName(String)
	private String testName;
	public String getName() { return testName; }
	public void setName(String newName) { testName = newName; }
	
	private int testAge;
	public int getAge() { return testAge; }
	
	
//	All non getter Setter methods or Specific kind of manipulation like getOlder()
	public void displayTestInfo() {
		System.out.printf("%s : %f", testName, testAge);
	}
	
	public void getOlder() {
		testAge++;
	}
	
	
	public TestClass() {
	}

}
