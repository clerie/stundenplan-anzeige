package stundenplan;

public class stundenplan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tage [] [];
		tage = new String [5] [6];
		
		String namen [];
		namen = new String [5];
		
		namen[0] = "Mo";
		namen[1] = "Di";
		namen[2] = "Mi";
		namen[3] = "Do";
		namen[4] = "Fr";
		
		tage[0][0] = "Sp"; tage[1][0] = "Sp"; tage[2][0] = "Sp"; tage[3][0] = "Sp"; tage[4][0] = "Sp";
		tage[0][1] = "Sp"; tage[1][1] = "Sp"; tage[2][1] = "Sp"; tage[3][1] = "Sp"; tage[4][1] = "Sp";
		tage[0][2] = "Sp"; tage[1][2] = "Sp"; tage[2][2] = "Sp"; tage[3][2] = "Sp"; tage[4][2] = "Sp";
		tage[0][3] = "Sp"; tage[1][3] = "Sp"; tage[2][3] = "Sp"; tage[3][3] = "Sp"; tage[4][3] = "Sp";
		tage[0][4] = "Sp"; tage[1][4] = "Sp"; tage[2][4] = "Sp"; tage[3][4] = "Sp"; tage[4][4] = "Sp";
		tage[0][5] = "Sp"; tage[1][5] = "Sp"; tage[2][5] = "Sp"; tage[3][5] = "Sp"; tage[4][5] = "Sp";
		
		System.out.print("         Aktueller Stundenplan          \n");
		
		for(int h=0; h<5; h++) {
			System.out.print(namen[h]+"\t");
		}
		System.out.print("\n");
		
		System.out.print("----------------------------------------\n");
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(tage[j][i]+"\t");
			}
			System.out.print("\n");
		}
		
	}

}
