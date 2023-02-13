#include <iostream>
#include <algorithm>
using namespace std;

bool compare(int a, int b) {
	return a > b;
}

int main(void)
{
	int N = 0, i = 0;
	int* weight = new int[100000];

	std::cin >> N; /* 로프의 갯수 */

	for (i = 0; i < N; i++) { /* 무게 입력 받는 루프 */
		std::cin >> weight[i];
	}

	sort(weight, weight + N, compare);

	for (i = 1; i < N+1; i++) {
		weight[i - 1] = weight[i - 1] * i;
	}

	sort(weight, weight + N, compare);

	cout << weight[0];

	return 0;
}