package POO;

public class People {
	//atributo
	private String firstName;
	private String middleName;
	private String finishName;
	
	//construtor
	public People (String first,String middle, String finish)
	{
		firstName=first;
		middleName=middle;
		finishName=finish;
	}
	//metodo
	public String getnameComplete()
	{
		String nameComplete = firstName+" "+middleName+" "+finishName+" ";
		return nameComplete;
	}
	
	
	
	
}
