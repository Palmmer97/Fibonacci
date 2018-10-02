/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;


public class fibonacci2 {

    private long cont = 0;

//recursivo 
    public long calcularFibonacciR (long n){
         
       
        System.out.println( ++cont );
        if (n>1)
    return calcularFibonacciR(n-1)+ calcularFibonacciR(n-2);
        else
    if(n==0)
        return 0;
     else
    if(n==1)
        return 1;
   
    return calcularFibonacciR(n-1)+ calcularFibonacciR(n-2);

    }
    

//iterativo 
public long calcularFibonacciI (long n){
   

    if(n==0)
return 0;
    
long fn=1,f1=1,f2=0,i;
for(i=1;i<n;i++){
fn=f1+f2;
f2=f1;
f1=fn;
}

return fn;
}
}
