#include <iostream>

using namespace std;

int main(void)
{
	int n = 0, cnt = 0;

	cin >> n;

	if (n < 0) /* 음수일때 모두 카운트 */
	{
		cout << 32;
	}
	if (n == 0) /* 0일때는 1개만 카운트 */
	{
		cout << 1;
	}
	else if(n > 0)
	{
		while (n != 0)
		{
			n = n / 2;
			cnt++;
		}
		cout << cnt;
	}

	return 0;
}