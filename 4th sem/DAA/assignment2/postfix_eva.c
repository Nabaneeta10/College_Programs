
#include <stdio.h>

typedef int bool;
#define SIZE 100

bool isFull(int top) {
    return top == SIZE - 1;
}

bool isEmpty(int top) {
    return top == -1;
}

void push(int stk[], int *top, int ele) {
    if (!isFull(*top))
        stk[++(*top)] = ele;
    else
        printf("\nStack Overflow...\n");
}

int pop(int stk[], int *top) {
    if (!isEmpty(*top)) {
        return stk[(*top)--];
    } else {
        printf("\nStack Underflow...\n");
        return 0; // Assuming 0 as an error value
    }
}

void display(int stk[], int top) {
    printf("The Stack is : ");
    for (int i = 0; i <= top; i++)
        printf("%d ", stk[i]);
    printf("\n");
}

int charToDigit(char a) {
    return (int)(a - '0');
}

int PostfixEva(char p[]) {
    int stk[SIZE];
    int top = -1;

    for (int i = 0; p[i] != '\0'; i++) {
        if (p[i] >= '0' && p[i] <= '9') {
            push(stk, &top, charToDigit(p[i]));
        } else if (p[i] == '+' || p[i] == '-' || p[i] == '*' || p[i] == '/') {
            int operand2 = pop(stk, &top);
            int operand1 = pop(stk, &top);

            switch (p[i]) {
                case '+':
                    push(stk, &top, operand1 + operand2);
                    break;
                case '-':
                    push(stk, &top, operand1 - operand2);
                    break;
                case '*':
                    push(stk, &top, operand1 * operand2);
                    break;
                case '/':
                    push(stk, &top, operand1 / operand2);
                    break;
            }
        }
    }

    return pop(stk, &top);
}

int main() {
    char p[100];

    printf("Enter the postfix expression: ");
    scanf(" %[^\n]", p);

    int result = PostfixEva(p);
    printf("The result of the postfix expression is: %d\n", result);

    return 0;
}

