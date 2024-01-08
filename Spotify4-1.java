import java.util.Scanner;

class Spotify4
{
	String firstName;
	String lastName;
	String emailId;
	String pwd;
	int age;
	String gender;


	Spotify4(String firstName,String lastName,String emailId,String pwd,int age,String gender)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		this.pwd=pwd;
		this.age=age;
		this.gender=gender;
	}


	Spotify4(String firstName,String lastName,String emailId,String pwd)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		this.pwd=pwd;
	}


	Spotify4(String firstName,String lastName,String emailId,String pwd,int age)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		this.pwd=pwd;
		this.age=age;
	}


	Spotify4(String firstName,String lastName,String emailId,String pwd,String gender)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		this.gender=gender;
	}

	public static String checkPwd(String pwd)
	{
		
		int uCount=0;
		int lCount=0;
		int nCount=0;
		int sCount=0;
		
			for(int i=0;i<pwd.length();i++)
			{
				if(pwd.charAt(i)>='A'&& pwd.charAt(i)<='Z')
				{
					uCount++;
				}
				else if(pwd.charAt(i)>='a'&& pwd.charAt(i)<='z')
				{
					lCount++;
				}
				else if(pwd.charAt(i)>='1'&& pwd.charAt(i)<='9')
				{
					nCount++;
				}
				else
				{
					sCount++;
				}
			}
		
		return !(pwd.length()>=6 && pwd.length()<=15)?"Your password should contain minimum of 6 charecters and maximum of 15 charecters":!(pwd.charAt(0)>='A' && pwd.charAt(0)<='Z' || pwd.charAt(0)>='a' && pwd.charAt(0)<='z')?"First letter of the password cannot be number or symbol":uCount==0||lCount==0||nCount==0||sCount==0?"Password should contains atleast 1 Uppercase \n Password should contains atleast 1 Lowercase \n Password should contains atleast 1 Number \n Password should contains atleast 1 Symbol":"Valid";
		
	}

	public static void check(String fName,String lName,String emailId,String pwd)
	{
		Spotify4 s=new Spotify4(fName,lName,emailId,pwd);
		System.out.println("your details are : ");
		System.out.println("Name :"+s.firstName+" "+s.lastName);
		System.out.println("Email :"+s.emailId);
		System.out.println("Password :"+s.pwd);
		String userName=s.firstName+((int)(Math.random()*100));
		System.out.println("\nyour username is :"+userName);
		
	}
	public static void check1(String fName,String lName,String emailId,String pwd,String gender)
	{
		Spotify4 s=new Spotify4(fName,lName,emailId,pwd,gender);
		System.out.println("your details are : ");
		System.out.println("Name :"+s.firstName+" "+s.lastName);
		System.out.println("Email :"+s.emailId);
		System.out.println("Password :"+s.pwd);
		System.out.println("Gender :"+s.gender);
		String userName=s.firstName+((int)(Math.random()*100));
		System.out.println("\nyour username is :"+userName);
	}
	public static void check2(String fName,String lName,String emailId,String pwd,int age)
	{
		Spotify4 s=new Spotify4(fName,lName,emailId,pwd,age);
		System.out.println("your details are : ");
		System.out.println("Name :"+s.firstName+" "+s.lastName);
		System.out.println("Email :"+s.emailId);
		System.out.println("Password :"+s.pwd);
		System.out.println("age :"+s.age);
		String userName=s.firstName+((int)(Math.random()*100));
		System.out.println("\nyour username is :"+userName);
	}
	public static void check3(String fName,String lName,String emailId,String pwd,int age,String gender)
	{
		Spotify4 s=new Spotify4(fName,lName,emailId,pwd,age,gender);
		System.out.println("your details are : ");
		System.out.println("Name :"+s.firstName+" "+s.lastName);
		System.out.println("Email :"+s.emailId);
		System.out.println("Password :"+s.pwd);
		System.out.println("age :"+s.age);
		System.out.println("Gender :"+s.gender);
		String userName=s.firstName+((int)(Math.random()*100));
		System.out.println("\nyour username is :"+userName);
	}

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Spotify");
		System.out.println("\nEnter your FirstName* :");
		String fName=sc.next();
		System.out.println("\nEnter your LastName* :");
		String lName=sc.next();
		System.out.println("\nEnter your E-mail id* :");
		String emailId=sc.next();
		System.out.println("\nEnter your Password* :");
		String pwd=sc.next();
		System.out.println("\nConfirm your Password id* :");
		String confirmPwd=sc.next();
		System.out.println("\nEnter your Age :");
		int age=sc.nextInt();
		System.out.println("\nEnter your Gender :");
		String gender=sc.next();
		

		System.out.println("Press 'S' to submit 'R' to reset 'C' to cancel");
		char ch=sc.next().charAt(0);


		while(ch=='S'||ch=='R'||ch=='C'||ch=='s'||ch=='r'||ch=='c')
		{
			if(ch=='S'||ch=='s')
			{
		
				if(fName==null)
				{
					System.out.println("FirstName field is Mandatory");
					
				}
				else if(lName==null)
				{
					System.out.println("LastName field is Mandatory");
					
				}
				else if(emailId==null)
				{
					System.out.println("E-mail id field is Mandatory");
					
				}
				else if(pwd==null)
				{
					System.out.println("Password field is Mandatory");
					
				}
				else if(confirmPwd==null)
				{
					System.out.println("Please confirm your Password");
				
				}
				else if(!(pwd.equals(confirmPwd)))
				{
					System.out.println("Your password doesnot match");
					
				}
				else if(pwd.equals(confirmPwd))
				{
					String a=checkPwd(pwd);
					if(a.equals("Valid"))
					{
						if(age==0 && gender==null)
						{
							check(fName,lName,emailId,pwd);
						}
						else if(age==0)
						{
							check1(fName,lName,emailId,pwd,gender);
						}
						else if(gender==null)
						{
							check2(fName,lName,emailId,pwd,age);
						}
						else
						{	
							check3(fName,lName,emailId,pwd,age,gender);
						}
					}
					else
					{
						System.out.println(a);
					}
				
				}
				
					break;
			}
			else if(ch=='R'||ch=='r')
			{
				while(ch=='R'||ch=='r')
				{
					System.out.println("Welcome for Spotify");
					System.out.println("\nEnter your FirstName* :");
					fName=sc.next();
					System.out.println("\nEnter your LastName* :");
					lName=sc.next();
					System.out.println("\nEnter your E-mail id* :");
					emailId=sc.next();
					System.out.println("\nEnter your Password* :");
					pwd=sc.next();
					System.out.println("\nConfirm your Password id* :");
					confirmPwd=sc.next();
					System.out.println("\nEnter your Age :");
					age=sc.nextInt();
					System.out.println("\nEnter your Gender :");
					gender=sc.next();

					System.out.println("Press 'S' to submit 'R' to reset 'C' to cancel");
					ch=sc.next().charAt(0);
				}
			}
			else if(ch=='C'||ch=='c')
			{
				break;
			}

			else{
				System.out.println("Wrong command");
			}
			}
		
		
	}

}