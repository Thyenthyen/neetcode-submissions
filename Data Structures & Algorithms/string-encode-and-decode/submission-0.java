class Solution {
// example: need code love you 

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String s: strs){
            res.append(s.length()).append('#').append(s);
        }
        return res.toString(); 
        // "4#need4#code4#love3#you" = str 
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>(); 
        int i = 0;
        while (i<str.length()){
            int j = i; // i=j=0
            while(str.charAt(j) != '#'){
                j++; //j=1
            }
            int length = Integer.parseInt(str.substring(i,j)); 
            i = j+1;//i=2, i skip # char = start of word
            j = i+length;// j = ]word
            res.add(str.substring(i,j)); // add the substr 
            i = j; // update i=j=nextword
        }
        return res; 
    }
}
