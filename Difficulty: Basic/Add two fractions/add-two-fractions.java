/*You are required to complete this function*/
class GfG {
    void addFraction(int num1, int den1, int num2, int den2) {
        // Your code here
     int LCM = lcm(den1,den2);
        
        int numerator1 = num1 * num(num1,den1,LCM);
        int numerator2 = num2 * num(num2,den2,LCM);
        
        int fullnum = (numerator1 + numerator2);
        int denom = lcm(den1,den2);
        System.out.println(fullnum/gcd(fullnum,denom) + "/"+ denom/gcd(fullnum,denom));
        
    }
    
    public static int num (int a,int den,int lcm){
        int ans = 0;
        for(int i = 1;i<=lcm;i++){
            if(den * i == lcm ){
                ans = i;
               
            }
        }
        return ans;
    }
    
    public static int lcm (int a , int b) {
        return (a * b) / gcd(a,b);
    }
    public static int gcd(int a,int b){
        while(a>0 && b>0){
            if(a>b) a = a%b;
            else{
                b = b%a;
            }
            
        }
        if(a == 0) return b;
        else{
        return a; }
    }
}