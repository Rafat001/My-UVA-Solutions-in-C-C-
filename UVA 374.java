import java.math.*;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		BigInteger base,md,power,ans;
		while(scan.hasNext()) // For scanning until EOF //
		{
			ans=new BigInteger("0");
			base=scan.nextBigInteger();
			power=scan.nextBigInteger();
			md=scan.nextBigInteger();
			ans=base.modPow(power, md); // it means ans=(base^power)%mod //
			System.out.println(ans);
		}
	}
}
