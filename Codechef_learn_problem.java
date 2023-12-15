//Currently there are courses for 4 languages, and hence there are 8 courses in this section. But suppose there are courses for 
//N languages, what will be the total number of courses in this section?



public class Codechef_learn_problem {
    	public static void main (String[] args) throws java.lang.Exception
	{
		int Language1 = 4;
		int Language1_total = 8;
		Scanner sc = new Scanner(System.in);
		int language2 = sc.nextInt();
		int language2_total = (language2 * 8) / 4 ;
		System.out.println(language2_total);
    
}
