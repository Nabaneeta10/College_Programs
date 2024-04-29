#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define max 50
void inf_to_post(char[],char []);
int precedence(char);
void push(char);
char pop();
int isempty();
int isFull();
char stack[max];
int top=-1;
int main()
{
        char infix[max];
        char poxt[max];
        printf("enter a infix expression:");
        scanf("%s",infix);
        inf_to_post(infix,poxt);
        return 0;
}
int precedence(char symbol)
{
        switch(symbol)
        {
                case '^':
                        return 3;
                case '*':
                case '/':
                        return 2;
                case '+':
                case '-':
                        return 1;
                default:
                        return 0;
        }
}
void push (char oper)
{
  if (isFull ())
    printf ("Stack Full");

  else
    {
      top++;
      stack[top] = oper;
    }
}
char pop ()
{

        char ch;
        if (isempty ())
        {
                return -1;
        }
        ch = stack[top];
        top--;
        return ch;
}
int isempty()
{
        return top == -1;
}
int isFull()
{
        return top == max-1;
}
void inf_to_post(char A[],char P[])
{
        int i;
        char symbol,next;
        int j=0;
        for(i=0;i<strlen(A);i++)
        {
                symbol=A[i];
		switch(symbol)
                {
                        case '(' :
                                push(symbol);
                                break;
                        case ')' :

                              while((next=pop())!='(')
                                  P[j++]=next;
                                  break;
                        case '+' :
                        case '-' :
                        case '*' :
                        case '^' :
                        case '/' :
                                  while(!isempty() && precedence(stack[top]) >= precedence(symbol))
                                  P[j++]=pop();
                                  push(symbol);
                                  break;
                        default:
                        P[j++]=symbol;
                }
        }
        while(!isempty())
                P[j++]=pop();
        P[j]='\0' ;
        printf("poxtfix expression will be %s",P);
}


