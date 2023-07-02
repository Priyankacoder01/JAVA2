1`class test2{
static int add(){
    return 0;
}  
static int add(int a,int b){
    return a+b;}  
static int add(int a,int b,int c){
    return a+b+c;}  
}  
class adder{
public static void main(String[] args){
System.out.println(add());  
System.out.println(add(11,11));  
System.out.println(add(11,11,11));  
}}  