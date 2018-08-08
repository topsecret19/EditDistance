
public class EditDistance {
public static int ed(String str1, String str2) {
	char[] one = str1.toCharArray();
	char[] two = str2.toCharArray();
	int[][] db = new int[str1.length()+1][str2.length()+1];
	for(int i=str1.length(); i>=0; i--) {
		for(int j=str2.length(); j>=0; j--) {
			if(i==str1.length()) db[i][j]=0;
			if(j==str2.length()) db[i][j]=0;
			if(i!=str1.length()&&j!=str2.length()) {
				if(one[i]==two[j]) {
					db[i][j]=Math.max(db[i+1][j], db[i][j+1])+1;
				}else {
					db[i][j]=Math.max(db[i+1][j], db[i][j+1]);
				}
				
			}
			}
	}
	return db[0][0];
}
public static void main(String[] args) {
	String s1= "abc";
	String s2= "bcd";
	System.out.println(ed(s1,s2));
}
}