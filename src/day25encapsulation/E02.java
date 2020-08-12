package day25encapsulation;

public class E02 {

	public static void main(String[] args) {
		E01 obj = new E01();
		System.out.println(obj.getSifre());//1234
		System.out.println(obj.getIsim());//Ali Can
		System.out.println(obj.getChr());//F

		obj.setSifre(98765);
		System.out.println(obj.getSifre());
		obj.setIsim("Veli Kan");
		System.out.println(obj.getIsim());
		//degistirmek icin set, okumak icin get
		
		
		E03 ob = new E03();
		System.out.println(ob.getIsim());//Kemal dogru
		System.out.println(ob.getYas());//23
		ob.setBorc(2300.24f);// bor degisti ama okuyamiyorum. cunku getter yok
		
		ob.setYas((byte) 25);
		System.out.println(ob.getYas());
		
		
	}

}
