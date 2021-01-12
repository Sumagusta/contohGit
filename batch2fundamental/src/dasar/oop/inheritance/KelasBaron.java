package dasar.oop.inheritance;

public class KelasBaron extends KelasWilliam {

	public static void main(String[] args) {
		KelasBaron kb = new KelasBaron();
		kb.berlari();
		kb.melukis();
		int height = kb.tinggi;
		String pekerjaan = kb.status;
		
		KelasWilliam kw = new KelasWilliam();
		int h = kw.tinggi;
		String p = kw.status;
		
		System.out.println(h);
		System.out.println(p);
	}

}
