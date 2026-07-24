class Solution {
   public String toBinary(int num, int bits) {
        StringBuilder sb = new StringBuilder();
        for(int i = bits-1; i >= 0; i--) {
            int mask = 1 << i;
            sb.append((num & mask) != 0 ? '1' : '0');
        }
        return sb.toString();
    }

    public String twosComplement(int num, int bits) {
        int val = Math.abs(num);
        char[] bin = toBinary(val, bits).toCharArray();

        // invert
        for(int i=0; i<bin.length; i++)
            bin[i] = (bin[i]=='0') ? '1' : '0';

        // add 1
        for(int i=bin.length-1; i>=0; i--) {
            if(bin[i]=='0') { bin[i]='1'; break; }
            else bin[i]='0';
        }
        return new String(bin);
    }

    public String toHex(int num) {
        if(num == 0) return "0";

        StringBuilder sb = new StringBuilder();
        long n = num & 0xffffffffL; // treat as unsigned 32-bit

        while(n != 0){
            int rem = (int)(n % 16);
            if(rem < 10){
                sb.append((char)(rem + '0'));
            } else {
                sb.append((char)(rem - 10 + 'a'));
            }
            n /= 16;
        }
        return sb.reverse().toString();
    }
}