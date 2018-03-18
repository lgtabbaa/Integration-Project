
public class StringManip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String text = "Hola me llamo Laila";
		 
				boolean start = text.startsWith("Hola");
				boolean end = text.endsWith("Laila");
				
				boolean start_case = text.startsWith("hOLA");
				boolean end_case = text.endsWith("lAILA");
		 
				System.out.println("true - the content is available in the string");
				System.out.println("false - the content is not available in the string\n");
				
				System.out.println(start);
				System.out.println(end);
				
				System.out.println(start_case);
				System.out.println(end_case);
			}
	}
