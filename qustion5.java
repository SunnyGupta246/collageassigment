static int qustion5(int n, int k, int[] ar) {
    int count = 0;
    for(int i=0; i<ar.length; i++){
      for(int j=i+1; j<ar.length; j++){
            if(((ar[i]+ar[j])%k)==0){
                if(i < j)
                   count++;
            }
        }
    }
    return count;
