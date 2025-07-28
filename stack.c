#include<stdio.h>
#include<stdlib.h>
struct stack {
    int data ;
    struct stack *next;
};
void push();
void pop();
void display();
typedef struct stack node;
node *start=NULL;
node *top=NULL;
node *getnode(){
    node *temp;
    temp=(node *)malloc(sizeof(node));
    printf("Enter the data");
    scanf("%d",&temp->data);
    temp->next=NULL;
    return temp;
}
void push(node *newnode){
node *temp;
if(newnode==NULL){
printf("\nStack Overflow");
return;
}
if(start==NULL){
    start=newnode;
    top=newnode;
}
else{
    temp=start;
    while(temp->next!=NULL)
    temp=temp->next;
    temp->next=newnode;
    top=newnode;
}
printf("\n\n\tData pushed into stack");
}
void pop(){
    node *temp;
    if(top==NULL){
        printf("\n\n\tStack Under Flow");
        return;
    }
    temp=start;
    if(start->next==NULL){
        printf("\n\n\t popped element is %d",top->data);
    start=NULL;
    free(top);
    top=NULL;
    }
    else {
        while(temp->next!=top){
            temp=temp->next;
        }
        temp->next=NULL;
    printf("\n\n\t Popped element is %d",top->data);
    free(top);
    top=temp;
    }
}
void display(){
    node *temp;
    if(top==NULL){
        printf("\n\t\tStack is Empty");
    }
    else{
        temp=start;
        printf("\n\n\t\t Element in the stack");
        printf("%5d",temp->data);
        while(temp!=top){
            temp=temp->next;
            printf("%5d",temp->data);
        }
    }
}
void main(){
    node *newnode;
  push(newnode);
  
  push(newnode);
  push(newnode);
  display();
  pop();
  display();

}