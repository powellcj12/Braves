public class LinePrinter {
	private String string;

	public LinePrinter(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
	
	public void multiPrint(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println(string);
			for (int j = 0; j < string.length(); j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
}
