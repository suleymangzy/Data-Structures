#include <stdio.h>

int main() {
    int a = 10;
    int *p;
    p = &a;

    printf("%d \n", *p);  // Prints the value at the address pointed to by p
    printf("%d \n", p);    // Prints the address of a (content of p)
    printf("%d \n", a);    // Prints the value of a
    printf("%d \n", &a);   // Prints the address of a
    printf("%d \n", &p);   // Prints the address of p
    printf("%d \n", p);    // Prints the address of a (content of p)
    
    p++;                    // Increments p to point to the next integer
    printf("%d \n", p);    // Prints the new value of p (address incremented by size of int)

    return 0;
}

