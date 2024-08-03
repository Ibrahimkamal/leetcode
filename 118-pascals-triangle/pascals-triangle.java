class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i && i > 1; j++) {
                System.out.println(j + " " + i);
                int val = output.get(i - 1).get(j-1) + output.get(i - 1).get(j);
                temp.add(val);
            }
            if (i >= 1)
                    temp.add(1);
            output.add(temp);
        }
        return output;
    }
}