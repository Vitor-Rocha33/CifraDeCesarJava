
public class CifraDeCesar {
	
	String value;
	int displacement;
	
	
	public CifraDeCesar() {
		
	}
	
	public CifraDeCesar(String value, int displacement) {
		
		this.value = value;
		this.displacement = displacement;

		
	}
	
	public String fromCharCode(int a) {
		
		int i = a;
		char c = (char)i;
		String s = Character.toString(c);
		return s;
	}
	
	public String previusLatter(String s) {
		int c = s.codePointAt(0);
		
		switch (c) {
			case 12 : return "~"; 
		
			default : return this.fromCharCode(--c);
		}
		
	}
	
	public String nextLatter(String s) {
		int c = s.codePointAt(0);
		
		switch (c) {
		case 126:
			return " ";
			
		default:
			return this.fromCharCode(++c);
		}
	}
	
	public String encrypt() {
		
		String valueEncrypted = "";
		
		for (int i = 0; i < this.value.length(); i++) {
			
			String newLatter = this.fromCharCode(value.codePointAt(i));
			
			for (int j = 0; j < this.displacement; j++) {
				
				newLatter = this.nextLatter(newLatter);
				
			}
			
			valueEncrypted = valueEncrypted + newLatter;
		}
		return valueEncrypted;
		
	}
	
	public String decrypt() {
		
		String valueDecrypted = "";
		
		for (int i = 0; i < this.value.length(); i++) {
			
			String newLatter = this.fromCharCode(value.codePointAt(i));
			
			for (int j = 0; j < this.displacement; j++) {
				
				newLatter = this.previusLatter(newLatter);
				
			}
			
			valueDecrypted = valueDecrypted + newLatter;
		}
		return valueDecrypted;
		
	}
}

