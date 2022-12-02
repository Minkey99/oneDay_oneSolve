#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>

int main(){
	int i, j, cnt, idx, err=0,  max[100] = {0, };
	char str[1000000] = {0, };

	scanf("%s", &str);

	for (i = 0; i < 26; i++){
		for (j = 0; j < strlen(str); j++){
			if (str[j] == i + 65 || str[j] == i + 97)
				++max[i];
		}
	}

	cnt = max[0];
	for (i = 0; i < 26; i++)
	{
		if (cnt < max[i]){
			cnt = max[i];
			idx = i;
		}
			
	}

	for (i = 0; i < 26; i++) {
		if (cnt == max[i])
			err++;
	}


	if ( err > 1 )
		printf("?");

	if( err == 1 )
		printf("%c\n", idx + 65);

	

	return 0;
}