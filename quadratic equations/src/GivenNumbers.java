
public class GivenNumbers {
public int A;
public int B;
public int C;
public void solution(int a, int b, int c) {
	StringBuilder sb = new StringBuilder();
	if(A!=1&&A!=-1) {
		sb.append(A);
		}
	if(A<0){
		sb.append("-");
	}
	sb.append("x^2");
	if(B>0) {
		sb.append("+");
	}
	else {
		sb.append("-");
	}
	if(B!=1&&B!=-1) {
		sb.append(Math.abs(B));
	}
	sb.append("x");
	if(C>0) {
		sb.append("+");
	}
	else {
		sb.append("-");
	}
	sb.append(Math.abs(C)+"=0");
	System.out.println(sb);
if(D(A,B,C)>0) {
	System.out.println("x1 = "+(-B+Math.sqrt(D(A,B,C))));
	System.out.println("x2 = "+(-B-Math.sqrt(D(A,B,C))));
}
else if(D(A,B,C)==0) {
	System.out.println("x = "+(-B+Math.sqrt(D(A,B,C))));
}
else {
	System.out.println("there is not solution");
}
}
public double D(int a, int b, int c) {
	double D=(b*b)-(4*a*c);
	return D;
}

}
