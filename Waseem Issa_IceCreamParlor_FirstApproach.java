    //Using Two For Loops
    public static int[] icecreamParlor(int m, int[] cost){
        
        int[] result = new int[2];
        
        for(int i = 0; i< cost.length; i++){
            for(int j = i+1; j< cost.length; j++){
            if(cost[i]+cost[j]==m){
                if(cost[i] < cost[j]){
                    result[0] = cost[i];
                    result[1] = cost[j];
                }
                else{
                    result[0] = cost[j];
                    result[1] = cost[i];
                }
            }
            }
        }
        return result;
    }
