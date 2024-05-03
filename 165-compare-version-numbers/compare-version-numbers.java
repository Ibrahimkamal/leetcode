class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        int[] v1_int=new int[v1.length];
        int[] v2_int=new int[v2.length];

        for(int i=0;i<v1.length;i++){
            v1_int[i]=Integer.parseInt(v1[i]);
        }
        for(int i=0;i<v2.length;i++){
            v2_int[i]=Integer.parseInt(v2[i]);
        }
        int min=Math.min(v1_int.length,v2_int.length);
        for(int i=0;i<min;i++){
            if(v1_int[i]<v2_int[i]){
                return -1;
            }else if(v1_int[i]>v2_int[i]){
                return 1;
            }else{
                continue;
            }
        }
        if(v1_int.length==v2_int.length){
            return 0;
        }else if (v1_int.length>min){
            for(int i=min;i<v1_int.length;i++){
                if(v1_int[i]>0)
                    return 1;
            }
            return 0;
            
        }else{
            for(int i=min;i<v2_int.length;i++){
                if(v2_int[i]>0)
                    return -1;
            }
            return 0;
        }



        //[1,1] //[1.1]
    }
}