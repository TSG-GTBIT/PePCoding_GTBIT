#include <iostream>
#include <conio.h>
using namespace std;

int getGCD(int num1, int num2){
	int gcd;
	for(int i=1 ; i<=num1-num2; i++){
		if(num1%i==0 && num2%i==0){
			gcd=i;
		}
	}
	return gcd;
}

int getLCM(int num1, int num2){
	return num1*num2/getGCD(num1, num2);
}

int main(int argc, char const *argv[])
{
	int num1, num2, GCD, LCM;
	cout<<"Enter First Number.\n";
	cin>>num1;
	cout<<"Enter Second Number.\n";
	cin>>num2;
	if(num1>num2){
		GCD=getGCD(num1, num2);
		LCM=getLCM(num1, num2);
	} else if(num2>num1){
		GCD=getGCD(num2, num1);
		LCM=getLCM(num2, num1);
	}else{			// when both numbers are same 
		GCD=num1;
		LCM=num1;
	}
	cout<<GCD<<" is GCD\n";
	cout<<LCM<<" is LCM\n";
	return 0;
}