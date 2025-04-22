class goodstring {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            int len =sb.length();
            if(!sb.isEmpty() && Math.abs(sb.charAt(len-1)-c) ==32 ){
                sb.deleteCharAt(len-1);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}