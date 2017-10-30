package gt.edu.url.examen2.problema2;

public class DemostracionLista implements DemoList{

	@Override
	public List<Integer> crearDemoLista() {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(0, 4);
		a.add(0, 3);
		a.add(0, 2);
		a.add(2, 1);
		a.add(1, 5);
		a.add(1, 6);
		a.add(3, 7);
		a.add(0, 8);
		
		return a;
	}

}
