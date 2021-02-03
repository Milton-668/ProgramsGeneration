package SextoPrograma;

public class ObjConta {

	public static void main(String[] args) 
	{
		ContaBanco login = new ContaBanco ("ITAÚ","MARCOS","0904849072",01340,0245,15000);
		
		System.out.print("BANCO\tNOME\t\tCPF\t\tCONTA\t\tAGENCIA\t\tSALDO\n");
		System.out.print(login.banco+"\t"+login.nome+"\t"+login.cpf+"\t"+login.conta+"\t"+login.agencia+"\t"+login.saldo);

	}

}
