class Solution {
    public String defangIPaddr(String address) {
        // String address="255.100.50.0";
        String output = "";
        int i=0;
        for(i=0; i<address.length(); i++)
        {
            if(address.contains("."))
            {
                output = address.replace(".","[.]");
            }
        }
        return output;
    }
}