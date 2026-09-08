class Solution {
    public String binaryNextNumber(String s) {
        int size=s.length();//gettting size of string 
                char binary[]=s.toCharArray();//convert to binary string to char aarray
                int i=0;//for poining each location

                for(i=size-1;i>=0;i--){
                    if(binary[i]=='1'){
                        binary[i]='0';
                    }else{
                        binary[i]='1';
                        break;
                    }

                }

                //noe here we wnat to remove leading zeros and if all are 111

                StringBuilder res=new StringBuilder();//create the new string to store result
                //if the current i pointer is less than 0 or all char are 1111
                if(i<0){
                    res.append('1');//append 1 to it
                    for(i=0;i<size;i++){
                        res.append(binary[i]);//and upend all the other zeros or char
                    }
                }else{
                    i=0;//for removing the leading zeros set i to 0
                    while(i<size && binary[i]=='0'){//checking the leading zeros and ignore the leadign zeros
                        i++;
                    }
                    for(i=i;i<size;i++){//and then after removing the leading zeros then start with that current 1 or i and append to string
                        res.append(binary[i]);
                    }
                }

               return res.toString(); 
    }
}