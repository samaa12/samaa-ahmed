package finalproject;


import java.util.Scanner;

public class liberary {
	
	//private static final String target = null;

	//static int i=1;
	static Book[] book  = new Book[1000];

    static Scanner scanner = new Scanner(System.in);
	static member mem[]=new member[100000];

	public static void main(String[] args) {
		
		Display();
		int num=scanner.nextInt();
		
		if (num==1) {readbooks(5);}
        else if (num==2) {readmember(5);}
        else if (num==3) {searchabook ();}
        else if (num==4) {searchbook ();}
        else if (num==5) {membership(5);}
        else if (num==6) {removebook ();}
        else if (num==7) {removeuser ();}
        
    		

	}
	 public static void Display() {
	        System.out.println("welcome Mr:Admin");
	        System.out.println("which one of the following operation would you like to do?"
	                + "please press: ");
	        System.out.print("\n 1 to insert the books in the library" +"\n 2 to insert the member of the library" +"\n 3 to to find a book by its auther " + "\n 4 to find a book by its title" + "\n  5 to chek the membership of a user" + " \n 6 to remove abook" + "\n 7 to remove a user"  );
	        System.out.println("\n press -1 to exit");
	    }
	public static Book[] readbooks(int i) {
		Scanner scanner=new Scanner(System.in);
		 
		System.out.println("please enter no.of total books");
		int noofbooks=scanner.nextInt();
		Book book[]=new Book [noofbooks];
		for( i=0;i<book.length;i++) {
			book[i]=readbookinfo();
			
		}
	 return book;	
	}
	public static Book readbookinfo() {
		Scanner scanner=new Scanner(System.in);
		Book book=new Book();
		System.out.println("please enter the auther of the book " );
		book.auther =scanner.nextLine();
		System.out.println("please enter the title of the book ");
		book.title =scanner.nextLine();
		System.out.println("please enter the date of publishing book ");
		book.date =scanner.nextInt();
		System.out.println("please enter no.of cobies of the book ");
		book.cobies =scanner.nextInt();
		//i++;

		return null;
		
	}
	public static member[] readmember(int i) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter no.of total members");
		int noofmembers=scanner.nextInt();
		member mem[]=new member [noofmembers];
		for( i=0;i<noofmembers;i++) {
			mem[i]=readmemberinfo();
			
		}
	 return mem;	
	}
	public static member readmemberinfo() {
		Scanner scanner=new Scanner(System.in);
		member mem=new member();
		System.out.println("please enter the name of the member " );
		mem.name =scanner.nextLine();
		System.out.println("please enter the id of the member ");
		mem.id =scanner.nextInt();
		System.out.println("please enter the borrowbook of the member ");
		mem.borrowbook=scanner.nextLine();
		//i++;

		return null;
		
	}
	
	public static Book searchabook () {
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the auther of the book that you are looking for");
		String target=scanner.nextLine();
		int i=0;
		while (target==book[i].auther) {
			target=book[i].auther;
			System.out.println("the book you searched is founded at index"+(i+1));
			i++;
			System.out.println("the book you searched isnot founded ");
			i++;

		}
		return null;
		
	}
	public static Book searchbook () {
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the title of the book tha you are looking for");
		String target=scanner.nextLine();
		int i=0;
		for(int j=0;j<book.length;j++) {
			if(book[j].title==null) {
				System.out.println("the book you searched isnot founded ");

   continue;}
			if(book[j].title==target) 
				return book[j];
			System.out.println("the book you searched is founded at index"+(i+1));
			

			
		}
		
		
	   return null;
		
	}
	
	public static Book removebook () {
		Scanner scanner=new Scanner(System.in);

		//book[1]=book[book.length-1];
		Book [] newbook =new Book [book.length-1];
		System.out.println("please enter the index of the book that you want to remove");
		int index =scanner.nextInt();

		for (int i=0; i<newbook.length;i++) {
			if (i==index) {
				continue;
			}else {			newbook [i]=book [i];

			}
		}
		for (int k=0;k==index;k++) {
			String target =book[index].title;
		}
		
		System.out.println("the book of title("+book[index]+")");
		return null;
		
	}
	public static Book removeuser () {
		Scanner scanner=new Scanner(System.in);

		//book[1]=book[book.length-1];
		member [] newbook =new member [mem.length-1];
		System.out.println("please enter the index of the member that you want to remove");
		int index =scanner.nextInt();

		for (int i=0; i<newbook.length;i++) {
			if (i==index) {
				continue;
			}else {			newbook [i]=mem [i];

			}
		}
		for (int k=0;k==index;k++) {
			String target =mem[index].name;
		}
		
		System.out.println("the book of title("+mem[index]+")");
		return null;
		
	}
	public static void membership(int i) {
		Scanner scanner=new Scanner(System.in); 
		System.out.println("please enter the id of the member to chek the membership ");
		int num =scanner.nextInt();
		for (i=0;i<mem.length;i++) {
			if (num==mem[i].id) {
				System.out.println("this user is a member of the liberary");
			}
			else {
				System.out.println("this user isnot a member of the liberary");

			}
		}
		

		
 
		
	}
	
	
	
	

}
