class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 1;i<=numRows;i++)
        {
            list.add(pas(i));
        }
        return list;


    }

    public List<Integer> pas(int row)
    {
         long ans = 1;
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        for(int c = 1;c<row;c++)
        {
            ans = ans * (row - c)/c;
            temp.add((int)ans);
        }
        return temp;
    }
}