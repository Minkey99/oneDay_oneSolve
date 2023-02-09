#include <iostream>
#include <algorithm>
#define siz 1000

using namespace std;

bool compare(int a, int b)
{
	return a > b;
}

int main(void)
{
	int N = 0, M = 0, i =0, P[siz] ={0, }, MP[siz] = {0, };
	cin >> N >> M;

	for (i = 0; i < M; i++)
		cin >> P[i];

	sort(P, P+M, compare); /* 내림차순 정렬 */

	if (N < M)
	{
		for (i = 1; i < N + 1; i++) /* 1부터 N+1까지 곱셈 */
			MP[i - 1] = P[i-1] * i;
	}
	else
	{
		for (i = 1; i < M + 1; i++) /* 1부터 N+1까지 곱셈 */
			MP[i - 1] = P[i-1] * i;
	}

	sort(MP, MP + M, compare);

	for (i = 1; i < M + 1; i++)
	{
		if (MP[0] == P[i - 1] * i)
			break;
	}

	cout << P[i-1] << " " << MP[0];

	return 0;
}