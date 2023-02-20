#include <iostream>
#include <string>
#include <deque>

using namespace std;

void print(deque<char>& t) {
	for (deque<char>::iterator itr = t.begin(); itr != t.end(); itr++) std::cout << *itr;

	cout << endl;
}

int main(void) {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	int T = 0, N = 0, i = 0, j = 0;
	char ch = NULL;
	deque<char> dq;

	std::cin >> T;

	for (i = 0; i < T; i++) {
		std::cin >> N;
		std::cin >> ch;
		dq.push_front(ch);

		for (j = 0; j < N - 1; j++) {
			char tch;
			std::cin >> tch;

			/* 먼저 들어온 문자가 우선순위가 더 높다면 */
			if (dq.front() < tch) dq.push_back(tch);

			/* 들어올 문자 우선순위가 더 높다면 앞에 push. */
			else dq.push_front(tch);
			
		}
		print(dq);
		dq.clear();
	}

	return 0;
}