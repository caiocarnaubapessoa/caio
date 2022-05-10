
// Online IDE - Code Editor, Compiler, Interpreter

#include<stdio.h>

int main()
{
int x;

printf("Digite um numero");
scanf("%d", &x);

if(x==1){
printf("Dia da semana:domingo");
}
else if(x==2){
printf("Dia da semana:segunda");
}
else if(x==3){
printf("Dia da semana:terca");
}
else if(x==4){
printf("Dia da semana:quarta");
}
else if(x==5){
printf("Dia da semana:quinta");
}
else if(x==6){
printf("Dia da semana:sexta");
}
else if(x==7){
printf("Dia da semana:sabado");
}
else{
printf("valor invalido");
}

return 0;
}

