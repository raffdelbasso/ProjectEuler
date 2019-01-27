#include <stdio.h>
int main(){
	int y=28;
	int n=8;
	int trovato = 0;
	int nDiv;
	int i;
	while(trovato == 0){
		y=y+n;
		nDiv=0;
		for (i=1; i<=y; i++) {
			if (y%i==0) {
				nDiv++;
			}
		}
		if (nDiv>500) {
			trovato=1;
		}
		n++;
	}
	printf("%d", y);
	return 0;
}