#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

int main(void)
{
	int i = 0, j = 0;

	scanf("%d %d", &i, &j);

	printf("%d\n", i * j - 1);

	return 0;
}