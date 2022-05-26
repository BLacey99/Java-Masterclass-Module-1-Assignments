
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator compare = new Comparator();
		
		compare.equalByThreePlaces(-3.1756, -3.175);
		compare.equalByThreePlaces(-3.156, -3.275);
		compare.equalByThreePlaces(750.002, 750.001);
		compare.equalByThreePlaces(92.5432, 92.54381);
		compare.equalByThreePlaces(10000.9813, 10000.9183);
		compare.equalByThreePlaces(1.0, 1.0);
		compare.equalByThreePlaces(2.98, 2.98);
		compare.equalByThreePlaces(2.928, 2.98);
		compare.equalByThreePlaces(2.8, 2.3845);
		compare.equalByThreePlaces(222.8, 2.3845);
		compare.equalByThreePlaces(2312.8, 2.3845);
		compare.equalByThreePlaces(412.832, 412.83231);
	}

}
