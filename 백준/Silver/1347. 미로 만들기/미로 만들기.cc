#include <iostream>
#include <vector>

#define endl "\n"
#define size 101

using namespace std;

/* 가야하는 지도와, 이동 횟수 */
int map[size][size], N;
/* 동서남북 추가해주는 arry */
int dx[] = { 0,0,1,-1 };
int dy[] = { 1,-1,0,0 };

vector<char> v;
pair<int, int> start;

int changeDir(int dir, char cmd) {
	if (cmd == 'R') {
		if (dir == 0) return 2;
		if (dir == 1) return 3;
		if (dir == 2) return 1;
		if (dir == 3) return 0;
	}
	if (cmd == 'L') {
		if (dir == 0) return 3;
		if (dir == 1) return 2;
		if (dir == 2) return 0;
		if (dir == 3) return 1;
	}
}

void solution() {
	int x = start.first;
	int y = start.second;
	int dir = 2; // 남쪽 방향

	map[x][y] = 1;
	char temp;

	for (int i=0; i < N; i++) {
		temp = v[i];
		if (v[i] == 'R' || v[i] == 'L') dir = changeDir(dir, temp);
		else if (v[i] == 'F')
		{
			x += dx[dir];
			y += dy[dir];
			map[x][y] = 1;
		}
	}

	/* 최소 최대 x,y 좌표 찾는 루프 */
	int sx, sy, ex, ey;
	sx = sy = size;
	ex = ey = 0;
	for (int i = 0; i < size; i++)
	{
		for (int j = 0; j < size; j++)
		{
			if (map[i][j] == 1)
			{
				if (i < sx) sx = i;
				if (j < sy) sy = j;
				if (i > ex) ex = i;
				if (j > ey) ey = j;
			}
		}
	}

	/* 출력하는 루프 */
	for (int i = sx; i <= ex; i++)
	{
		for (int j = sy; j <= ey; j++)
		{
			if (map[i][j] == 1) cout << ".";
			else cout << "#";
		}
		cout << endl;
	}

}

int main(void) {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);

	char status;
	std::cin >> N;
	/*  방향 입력 받는 for loop */
	for (int i = 0; i < N; i++) {
		std::cin >> status;
		v.push_back(status);
	}
	start.first = start.second = 50;

	solution();

	return 0;
}