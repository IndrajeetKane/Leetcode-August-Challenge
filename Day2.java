class Solution {
    public boolean detectCapitalUse(String word) {
        char[] ch = word.toCharArray();
        if(ch[0]-'A'> 26)
        {
            for(int i = 1;i < word.length();i++)
            {
                if(ch[i] - 'A' <= 26) return false;
            }
            
        }
        else
        {
           if(1<word.length())
           {
               if(ch[1]-'A' > 26)
               {
                   for(int i = 2;i < word.length();i++)
                   {
                        if(ch[i] - 'A' <= 26) return false;
                    }
                
                }
                else
                {
                    for(int i = 2;i < word.length();i++)
                    {
                        if(ch[i] - 'A' > 26) return false;
                    }
                }
           }
            else
            {
                return true;
            }
        }
        return true;
    }
}