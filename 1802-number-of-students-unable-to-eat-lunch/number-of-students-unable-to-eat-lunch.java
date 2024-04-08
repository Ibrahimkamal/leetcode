class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int round_students=0;
        int square_students=0;
        for(int i=0;i<students.length;i++){
            if(students[i]==0)
                round_students++;
            else{
                square_students++;
            }
        }
        for(int sandwitch:sandwiches){
            if(sandwitch==0 && round_students==0){
                return square_students;
            }
             if(sandwitch==1 && square_students==0){
                return round_students;
            }
            if(sandwitch==0)
                round_students--;
            else
                square_students--;
        }
        
        return 0;
    }
}