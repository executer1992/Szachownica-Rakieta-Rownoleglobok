public class Rownoleglobok 
{
    public static void main(String[] args)
    {
        if(args[0].matches("-?\\d+") && args[1].matches("-?\\d+") && args[2].matches("-?\\d+"))
        {
            int szerokosc = Integer.parseInt(args[0]);
            int wysokosc = Integer.parseInt(args[1]);
            int przesuniecie = Integer.parseInt(args[2]);
            int przesuniecieZastepcze = przesuniecie;
            int dodatniePrzesuniecie = przesuniecie * -1;
        
            if(szerokosc > 0 && wysokosc > 0 && szerokosc <= 100 && wysokosc <= 100 && przesuniecie >= 0 && przesuniecie <= 100)
            {
                for (int i = 0;i<wysokosc; i++)
                {
                    if(i>0)
                    {	
                        for(int b=1;b<=przesuniecieZastepcze;b++)
                        {
                            System.out.print(" ");
                        }
                        przesuniecieZastepcze += przesuniecie;
                    }
                for (int j = 0; j < szerokosc; j++)
                {
                    System.out.print('*');
                }
                    System.out.println();
                }
            }
            if(szerokosc > 0 && wysokosc > 0 && szerokosc <= 100 && wysokosc <= 100 && przesuniecie < 0 && przesuniecie >= -100)
            {          
                for (int i = wysokosc;i>0; i--) 
                {
                    if(i>0)
                    {

                        for(int b = 0;b<=i*dodatniePrzesuniecie-dodatniePrzesuniecie;b++)
                        {
                            System.out.print(" ");
                        }

                    }               
                for (int j = 0; j < szerokosc; j++)
                {

                    System.out.print('*');
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