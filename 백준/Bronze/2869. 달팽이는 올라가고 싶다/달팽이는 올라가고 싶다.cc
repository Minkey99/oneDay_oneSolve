#include <stdio.h>

int main(void)
{
	int A = 0, B = 0, V = 0, res=0;
	scanf("%d %d %d", &A, &B, &V);

	res = (V - B -1) / (A - B) + 1;

	printf("%d", res);

	return 0;
}