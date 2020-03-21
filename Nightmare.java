/*
 * 
	In: 123     Out: 132
	In: 132     Out: 213
	In: 123621     Out: 126123
	In: 135976421     Out: 136124579
 */
public class Nightmare {
	public static void main(String[] args) {
		String str = "135976421";
		char[] c = str.toCharArray();
		char tmp = ' ';
		char[] newArr = new char[c.length];
		int count = 0;
		
		for (int i = c.length - 1, j = 0;  i > 0 && j < newArr.length; i--, j++) {
			if (c[i] < c[i - 1]) {
				newArr[j] = c[i];
			} else {
				newArr[j] = c[i];
				System.out.println(c[i - 1]);
				for (int k = 0; k < newArr.length - 1; k++) {
					if(newArr[k] < newArr[k+1] && newArr[k] > c[i - 1]) {
						tmp = newArr[k];
						newArr[k] = c[i - 1];
						c[i - 1] = tmp;
						break;
					}
				}
				System.out.println(c[i - 1]);	
				
				
				break;
			}
		}

		System.out.println(newArr);
		System.out.println(c);
	}
}
