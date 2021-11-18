    //Using a For and a While Loop
    public static int[] icecreamParlor(int m, int[] cost){
        
        int[] result = new int[2];
        int index = cost.length-1;
        
        for(int i = 0; i< cost.length; i++){
            while(index > i){
            if(cost[i]+cost[index]==m){
                if(cost[i] < cost[index]){
                    result[0] = cost[i];
                    result[1] = cost[index];
                }
                else{
                    result[0] = cost[index];
                    result[1] = cost[i];
                }
            }
            index--;
            }
        }
        return result;
    }