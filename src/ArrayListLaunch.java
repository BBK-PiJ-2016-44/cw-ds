public class ArrayListLaunch{ 

	public static void main(String[] args) { 
		ArrayListLaunch test = new ArrayListLaunch();
		test.launch();
	}
		
		
	public void launch() { 
		List myList = new ArrayList();
		
		if (myList.isEmpty()) { 
			System.out.println("List is empty");
		} else { 
			System.out.println("List is not empty");
		}
		
		System.out.println("The list size is " + myList.size());
		System.out.println("");
		System.out.println("Let's add an item to the list");
		
		String name = "Nick";
		myList.add(name);
		
		if (myList.isEmpty()) { 
			System.out.println("List is empty");
		} else { 
			System.out.println("List is not empty");
		}
	
	
	
	
	}
}