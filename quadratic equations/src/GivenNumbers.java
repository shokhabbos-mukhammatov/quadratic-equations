
public class GivenNumbers {
public int A;
public int B;
public int C;

public String toString() {
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
	return sb.toString();
}
public String solution() {
	
	double discr =(B*B)-(4*A*C);

	String result;
if(discr>0) {
	result = "x1 = "+String.format("%.2f",(-B+Math.sqrt(discr)));
	result +="\nx2 = "+String.format("%.2f",(-B-Math.sqrt(discr)));
}
else if(discr==0) {
	result = "x = "+String.format("%.2f",(-B+Math.sqrt(discr)));
}
else {
	result = "there is not solution";
}
return result;
}
}
