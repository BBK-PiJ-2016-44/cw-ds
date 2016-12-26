public class ArrayListLaunch{ 

	public static void main(String[] args) { 
		ArrayListLaunch test = new ArrayListLaunch();
		test.launch();
	}
		
		
	public void launch() { 
		List myList = new ArrayList();
		
		System.out.println("List is empty: " + myList.isEmpty());
		
		System.out.println("The list size is " + myList.size());
		System.out.println("");
		System.out.println("Let's add 3 items to the list...");
		
		String name1 = "Nick";
		myList.add(name1);
		
		System.out.println("List is empty: " + myList.isEmpty());
		
		String name2 = "Chris";
		myList.add(name2);
		
		String name3 = "Juliet"; 
		myList.add(name3);
		
		System.out.println("The list size is " + myList.size());
		System.out.println("");
		
		System.out.println("Now lets add a name to the middle of the list");
		String name4 = "Carol";
		myList.add(1, name4);
		System.out.println("The list size is " + myList.size());
		
		System.out.println("");
		
		System.out.println("..and removing an item..");
		myList.remove(2);
		System.out.println("The list size is " + myList.size());
		
		System.out.println(myList.get(3));
	
		
	
	}
}