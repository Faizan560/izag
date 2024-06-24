package jdbc;

public class Democonnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Databaseconnection c = new Databaseconnection();
		//c.getconnection();
		 //Students st = new Students();
		 Students stt = new Students(216,"amad","science");
		 
		 Crudoperation cr = new Crudoperation();
		 
		 Crudoperation.insertdata(stt.getEnroll(),stt.getName(),stt.getStream());
		 
		 System.out.println(stt);
		 Crudoperation.getdata();
		 //Crudoperation.deleteData(143);
	}

}
