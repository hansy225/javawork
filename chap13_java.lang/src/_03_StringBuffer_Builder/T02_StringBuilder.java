package _03_StringBuffer_Builder;

public class T02_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("java");
		sb.append(" program study");
		System.out.println(sb);
		
		sb.insert(4, "8");
		System.out.println(sb);
		
		sb.setCharAt(sb.length()-6, '짱');
		System.out.println(sb);
		
		
		

	}

}
