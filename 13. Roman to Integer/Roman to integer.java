class Solution {
    public int romanToInt(String s) {
         int num=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='I'&&i!=s.length()-1){
                if(s.charAt(i+1)=='V'){
                    num+=4;
                    i++;
                    continue;
                }
                if(s.charAt(i+1)=='X'){
                    num+=9;
                    i++; continue;
                }

            }

            if(ch=='X'&&i!=s.length()-1){
                if( s.charAt(i+1)=='L'){
                    num+=40;
                    i++; continue;
                }
                if(s.charAt(i+1)=='C'){
                    num+=90;
                    i++; continue;
                }
            }

            if(ch=='C'&&i!=s.length()-1){
                if( s.charAt(i+1)=='D'){
                    num+=400;
                    i++;continue;
                }
                if(s.charAt(i+1)=='M'){
                    num+=900;
                    i++; continue;
                }

            }


                switch (ch) {
                    case 'M' -> num += 1000;
                    case 'D' -> num += 500;
                    case 'C' -> num += 100;
                    case 'L' -> num += 50;
                    case 'X' -> num += 10;
                    case 'V' -> num += 5;
                    case 'I' -> num += 1;
                }


        }
        return num;
    }
}