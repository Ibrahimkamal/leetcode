



class Solution {
    public String minRemoveToMakeValid(String s) {
        int total_open = 0;
        int total_close = 0;
        int current_open = 0;
        int current_close = 0;

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                total_open++;
            }
            if (s.charAt(i) == ')' && total_close<total_open) {
                total_close++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && current_open >= Math.min(total_open, total_close)) {
                current_open++;
                continue;
            }

            if (s.charAt(i) == ')' && current_close >= Math.min(total_open, total_close)) {
                current_close++;
                continue;
            }
            if (s.charAt(i) == ')' && current_close >= current_open) {
                continue;
            }
            if (s.charAt(i) == '(') {
                current_open++;
            }
            if (s.charAt(i) == ')') {
                current_close++;
            }
            result+=s.charAt(i);
        }
        return result;
    }
}



    


    
    
    

    
    

    
        
    

    
        
        
        
    


    
    

    
        
        
    

    
        
        
    

    
        
    

    
        
    

    
        
    

    
        
    

    
        
        
    

  

    
        
    

    

    
        
    
            
                
                