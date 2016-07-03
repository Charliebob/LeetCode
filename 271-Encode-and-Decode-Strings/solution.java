public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s.length()).append('/').append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new LinkedList<String>();
        int index = 0;
        while(index<s.length()){
            int slash = s.indexOf('/',index) //first occurence of '/'
            int size = Integer.valueOf(s.substring(index,slash));
            result.add(s.substring(slash+1, slash+size+1));
            index=slash+size+1;
        }
        return result;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));
