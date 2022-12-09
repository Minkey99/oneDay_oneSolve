#include <stdio.h>

int check(int a, int b, int n)
{
	int result = 0;

	for (int i = 0; i < n; i++)
	{
		a = (a % b) * 10;
		result = a / b;
	}

	return result;
}

int main()
{
	int A = 0, B = 0, N = 0, res = 0;

	
	scanf("%d %d %d", &A, &B, &N);

	res = check(A, B, N);

	printf("%d", res);

	return 0;
}