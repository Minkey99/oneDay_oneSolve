#include <iostream>
#include <vector>
#include <algorithm>
#define endl '\n'

using namespace std;
/* 자연수 입력 1~N까지 M개를 고름 */
int N, M;
int path[9] ,used[9], input[9];

void solution(int lev) {
    /* 종료 조건 그리고 출력 */
    if (M == lev) {
        for (int i = 0; i < M; i++) {
            std::cout << path[i] << ' ';
        }
        cout << endl;
        return;
    }
    int com = 0;
    /* 경우의 수 만드는 루프 */
    for (int i = 1; i <= N; i++) {
        /* 같은 숫자는 출력을 피하기 위함 */
        //if (used[i]) continue;
        if (!used[i] && com != input[i]) {
            path[lev] = input[i];
            used[i] = 1;
            com = path[lev];

            solution(lev + 1);

            /* 경우의 수를 출력하고 새로 경우의 수를 만들기 위한 초기화 과정 */
            used[i] = 0;
        }
        
    }
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);

    std::cin >> N >> M;
    for (int i = 1; i < N+1; i++) std::cin >> input[i];
    sort(input + 1, input + N + 1);

    solution(0);

    return 0;
}