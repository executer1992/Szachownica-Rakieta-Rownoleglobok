public class Szachownica
{
    public static void main(String[] args)
    {
        
        int szerokosc;
        int wysokosc;
        int liczbaWPoziomie;
        int liczbaWPionie;
        try
        {
            szerokosc = Integer.parseInt(args[0]);
            wysokosc  = Integer.parseInt(args[1]);
            liczbaWPoziomie = Integer.parseInt(args[2]);
            liczbaWPionie   = Integer.parseInt(args[3]);
        }
        catch(NumberFormatException e)
        {
            szerokosc = 1;
            wysokosc  = 1;
            liczbaWPoziomie = 1;
            liczbaWPionie   = 1;
            System.exit(0);
        }
        String znakBialy = args[4];
        String znakCzarny = args[5];
        boolean zmianaZnaku = false;
       
        if((szerokosc > 0 && szerokosc <= 15) && (wysokosc > 0 && wysokosc <= 15)&&(liczbaWPoziomie > 0 && liczbaWPoziomie <= 15) && (liczbaWPionie > 0 && liczbaWPionie <= 15))
        {
        for(int i = 0;i<liczbaWPionie;i++)
        {
            if(zmianaZnaku == true)
                {
                    zmianaZnaku = false;
                }
            else
                {
                    zmianaZnaku = true;
                }
            for(int z = 0;z<wysokosc;z++)
            {
                for(int j = 0;j<liczbaWPoziomie;j++)
                {
                    for(int k = 0;k<szerokosc;k++)
                    {
                        if(zmianaZnaku == true)
                        {
                            System.out.print(znakBialy);
                        }
                        else
                        {
                           System.out.print(znakCzarny); 
                        }
                    }
                    if(zmianaZnaku == true)
                    {
                    zmianaZnaku = false;
                    }
                    else
                    {
                    zmianaZnaku = true;
                    }
                }
                System.out.println();
            }    
        }
        }
        else
        {
            System.exit(0);
        }
    }
}
