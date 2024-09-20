#include <stdio.h>

int main() {
    char table[40], *p, *p2, *q;
    
    p = &table[0]; // Address of the first element of the array
    p2 = table;    // Starting address of the array (address of the first element)
    q = &table[1]; // Address of the second element of the array
    
    printf("Address of p: %d\n", p);
    printf("Address of p2: %d\n", p2);
    printf("Address of q: %d\n", q);
    
    p++; // Increments to the next element (address of the second element)
    printf("New address of p: %d\n", p);
    printf("Address of the third element of the array: %d\n", p2 + 2);
    
    return 0;
}

