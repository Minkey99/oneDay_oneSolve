#include <stdio.h>
#include <string.h>

int main(void)
{
	char num[1000000] = { '0','0', };
	int i = 0, len = 0;

	scanf("%s", num+2);

	len = strlen(num);

	for (i = len % 3; i < len; i += 3)
	{
		printf("%d", (num[i]-'0') * 4 + (num[i+1] - '0') * 2 + (num[i+2] - '0') * 1); // 2진수 8진수로 변환 과정
	}

	return 0;
}