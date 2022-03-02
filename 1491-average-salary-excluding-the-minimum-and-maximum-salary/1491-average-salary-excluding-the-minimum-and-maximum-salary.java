class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        double count=0;
        for(int i=1; i<=salary.length-2; i++)
        {
            sum += salary[i];
            count++;
        }
        return sum/count;
    }
}