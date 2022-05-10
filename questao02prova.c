
// Online IDE - Code Editor, Compiler, Interpreter

#include<stdio.h>

int main(){
int x = 0;
char s;

printf("Telefonou para a vítima?");
scanf("%c", &s);
getchar();

if(s=='s'){
x++;
}

printf("Esteve no local do crime?");
scanf("%c", &s);
getchar();

if(s=='s'){
x++;    
}

printf("Mora perto da vítima?");
scanf("%c", &s);
getchar();

if(s=='s'){
x++;    
}

printf("Devia para a vítima?");
scanf("%c", &s);
getchar();

if(s=='s'){
x++;    
}
printf("Já trabalhou com a vítima?");
scanf("%c", &s);
getchar();

if(s=='s'){
x++;    
}


if(x==2){
    printf("Suspeito");
}
else if(x==3||x==4){
    printf("Cumplice");
}


else if(x==5){
    printf("Assassino");
}

else{
printf("inocente");
}


  return 0;
}
