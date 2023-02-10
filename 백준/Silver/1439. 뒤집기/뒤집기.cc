#include <iostream>
#define siz 100
using namespace std;

/*int oppsite(string* str, int i) {
	if (str[i - 1] != str[i])
		return true;
	else
		return false;
}*/

int main(void)
{
	int zero = 0, one = 0, i = 0;
	string str;
	std::cin >> str;

	if (str[i] == '0') /* 초기에 어떤 숫자인지 입력 */
		zero++;
	else if (str[i] == '1')
		one++;

	for (i = 1; i < str.length(); i++) { /* 묶음의 갯수를 카운트 해야함 */
		if (str[i-1] != str[i]) { /* 0에서1로 1로0으로 바껴졌다면 */
			if (str[i] == '0')
				zero++;
			if (str[i] == '1')
				one++;
		}
	}

	/*if (zero > one)
		std::cout << one;
	else if (zero == one)
		std::cout << zero;
	else
		std::cout << zero;*/

	cout << min(zero, one);

	return 0;
}