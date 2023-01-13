#include <stdio.h>

int main(void)
{
	int arr[1000] = { 0, }, sum = 0, i =0 , n = 0;
	scanf("%d", &n);

	arr[1] = 1;
	arr[2] = 2;

	for (i = 3; i <= n; i++)
	{
		arr[i] = arr[i - 1] + arr[i - 2];
		arr[i] = arr[i] % 10007;
	}

	printf("%d", arr[n]);

	return 0;
}