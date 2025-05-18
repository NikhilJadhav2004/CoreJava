package static_commanmemory;

public class Main {

	public static void main(String[] args) {
		
		// static without object we can acess the data
		System.out.println(Studant.collage);
		Studant.m1();
		Studant studant=new Studant();
		System.out.println(studant.id);
		
		
	}
}
