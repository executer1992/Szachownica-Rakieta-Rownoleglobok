public class Kosmolot
{
    public static void rysujZPancerzem(int rozmiarRakiety)
    {
        // Pêtla rysuj¹ca od góry do œrodka w³¹cznie
        for(int i = 1;i <= rozmiarRakiety;i++)
        {
            for(int j = 1;j <=rozmiarRakiety;j++)
            {
                for(int z = 1;z <= i;z++)
                {
                    if( j == 1)
                    {
                        if(z == 1)
                        {
                            System.out.print(">");
                        }
                        if(i != rozmiarRakiety)
                        {
                            if( z != 1 && i <= 2)
                            {
                                System.out.print("\\");
                            }
                            if( z != 1 && i > 2 && z != i)
                            {
                                System.out.print("*");
                            }
                            if(  z!= 1 && i > 2 && z == i)
                            {
                                System.out.print("\\");
                            }
                        }
                        
                    }   
                    if(j > 1 && i != rozmiarRakiety )
                    {
                        if(z >= 1 && i != 1 && z != i)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print("\\");
                        }
                    }
                    if(i == rozmiarRakiety && rozmiarRakiety != 1)
                    {
                       if(j == 1 && z > 1)
                       {
                           System.out.print("*");
                       }
                       if(j > 1 && j < i)
                       {
                           System.out.print("*");
                       }
                       if(j == i && z != i)
                       {
                           System.out.print("*");
                       }
                       if(j == i && z == i)
                       {
                           System.out.print(">");
                       }
                   }
                    
                }
                for(int x = 1;x <= rozmiarRakiety-i;x++)
                {
                    if(i == rozmiarRakiety)
                    {
                        break;
                    }
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //Pêtla rysuj¹ca w dó³ od œrodka
        for(int q = 1;q<rozmiarRakiety;q++)
        {
            for(int w = 1;w<=rozmiarRakiety;w++)
            {
                for(int c = 1;c<=rozmiarRakiety-q;c++)
                {
                    if( w == 1)
                    {
                        if(c == 1)
                        {
                            System.out.print(">");
                        }
                        if( c>1 && c == rozmiarRakiety-q)
                        {
                            System.out.print("/");
                        }
                        if(c>1 && c != rozmiarRakiety-q)
                        {
                            System.out.print("*");
                        }                       
                    }   
                    if(w > 1 )
                    {
                        if(c >= 1 && c == rozmiarRakiety-q)
                        {
                            System.out.print("/");
                        }
                        else
                        {
                            System.out.print("*");
                        }
                    }                
                }
                for(int b=1;b<=q;b++)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void rysujBezPancerza(int rozmiarRakiety)
    {
        for(int i=1;i<=rozmiarRakiety;i++)
        {
            for(int j = 1;j <=rozmiarRakiety;j++)
            {
                for(int z = 1;z <= i;z++)
                {
                    System.out.print("*");
                }
                for(int x = 1;x<=rozmiarRakiety-i;x++)
                {
                    if(i == rozmiarRakiety)
                    {
                        break;
                    }
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int q = 1;q<rozmiarRakiety;q++)
        {
            for(int w = 1;w<=rozmiarRakiety;w++)
            {
                for(int c = 1;c<=rozmiarRakiety-q;c++)
                {
                    System.out.print("*");
                }
                for(int b = 1;b<=q;b++)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        long start = java.util.Calendar.getInstance().getTimeInMillis();
        int rozmiarRakiety;
        try{
            rozmiarRakiety = Integer.parseInt(args[0]);
        }
        catch(NumberFormatException e){
            rozmiarRakiety = 1;
            System.exit(0);
        }
        if(rozmiarRakiety >= 1 && rozmiarRakiety <= 75){
            
            switch (args[1])
            {
                case "N":
                    rysujBezPancerza(rozmiarRakiety);
                    break;
                case "n":
                    rysujBezPancerza(rozmiarRakiety);
                    break;
                case "Y":
                    rysujZPancerzem(rozmiarRakiety);
                    break;
                case "y":
                    rysujZPancerzem(rozmiarRakiety);
                    break;
                default:
                    System.exit(0);
            }
        }
        else
        {
            System.exit(0);
        }
    }
}
