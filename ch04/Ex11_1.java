package ch04;

public class Ex11_1 {

	public static void main(String[] args) {
		// 1~20사이에 3의 배수와 식과 합을 출력하시오.(continue)
		int sum = 0;
		for (int i = 1; i < 21; i++) {
			if (i%3!=0) {
				continue;
			}else	{
				if(i>3)	{
					System.out.print(" + ");
				}
			}
			sum+=i;
			System.out.print(i + " ");
		}
		System.out.print(" = " + sum);
	}

	}

