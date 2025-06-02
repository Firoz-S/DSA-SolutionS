             if(num<10) return num;
        else{
            int sum=0;
            int rem=0;
            while(num>0){
                rem=num%10;
                sum=sum+rem;
                num=num/10;
            }
            addDigits(sum);
    }
