/*
 *Copyright 2020 Wind River Systems, Inc.
 */

#include <stdio.h>
#include <unistd.h>

void print_sleep(int i){
	printf("%d..", i);
	fflush(stdout);
	usleep(1000000/i);
}

int main() {
	printf("Hello from the testApp!\n");
	
	int i = 0;
	while(i++ < 25) {
		print_sleep(i);  
	}
	
	printf("\n");
	
	return 0;
}

