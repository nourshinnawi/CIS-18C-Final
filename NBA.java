package nba;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NBA {

    public static void main(String[] args) {

        Coaches coach1;
        Coaches coach2;
        Coaches coach3;
        Coaches coach4;
        Coaches coach5;
        Coaches coach6;
        Coaches coach7;
        Coaches coach8;
        
        coach1 = new Coaches("Brad Stevens", 6);
        coach2 = new Coaches("Frank Vogel", 0);
        coach3 = new Coaches("Quin Snyder", 5);
        coach4 = new Coaches("Dwane Casey", 1);
        coach5 = new Coaches("Gregg Popovich", 23);
        coach6 = new Coaches("Steve Kerr", 5);
        coach7 = new Coaches("Doc Rivers", 6);
        coach8 = new Coaches("Nick Nurse", 1);
        
        Teams Celtics = new Teams("Celtics", 1, "10-2");
        Celtics.setCoach(coach1);
        
        Teams Lakers = new Teams("Lakers", 2, "3-8");
        Lakers.setCoach(coach2);
        
        Teams Jazz = new Teams ("Jazz", 3, "5-5");
        Jazz.setCoach(coach3);
        
        Teams Pistons = new Teams("Pistons", 4, "6-4");
        Pistons.setCoach(coach4);
        
        Teams Spurs = new Teams("Spurs", 5, "7-3");
        Spurs.setCoach(coach5);
        
        Teams Warriors = new Teams("Warriors", 6, "8-2");
        Warriors.setCoach(coach6);
        
        Teams Clippers = new Teams("Clippers", 7, "9-1");
        Clippers.setCoach(coach7);
        
        Teams Raptors = new Teams("Raptors", 8 , "10-0");
        Raptors.setCoach(coach8);
        
        //Celtics players
        Players KyrieIrving = new Players(Celtics, 12, "Point Guard", "Kyrie Irving");
        Players AronBanes = new Players(Celtics, 46, "Forward", "Aron Banes");
        Players JaylenBrown = new Players(Celtics, 7, "Guard", "Jaylen Brown");
        Players PJDozier = new Players(Celtics, 50, "Forward", "PJ Dozier");
        Players GordonHayward = new Players(Celtics, 20, "Forward", "Gordon Hayward");
        Players AlHorford = new Players(Celtics, 42, "Center", "Al Horford");
        Players RJHunter = new Players (Celtics, 28, "Guard", "RJ Hunter");
        Players MarcusMorris = new Players(Celtics, 13, "Forward", "Marcus Morris");
        
        //Lakers players
        Players LonzoBall = new Players(Lakers, 2, "Point Guard", "Lonzo Ball");
        Players ReggieBullock = new Players(Lakers, 35, "Shooting Guard", "Reggie Bullock");
        Players AlexCaruso = new Players(Lakers, 4, "Shooting Guard", "Alex Caruso");
        Players LebronJames = new Players(Lakers, 23, "Small Forward", "Lebron James");
        Players TysonChandler = new Players(Lakers, 5, "Center", "Tyson Chandler");
        Players KyleKuzma = new Players(Lakers, 0, "Power Forward", "Kyle Kuzma");
        Players JoshHart = new Players(Lakers, 3, "Shooting Guard", "Josh Hart");
        Players IsaacBonga = new Players(Lakers, 17, "Point Guard", "Isaac Bonga");
        
        //Spurs players
        Players LamarcusAldridge = new Players(Spurs, 15, "Power Forward", "Lamarcus Alrdidge");
        Players MarcoBelinelli = new Players(Spurs, 18, "Guard Forward", "Marco Belinelli");
        Players DavisBertans = new Players(Spurs, 42, "Forward", "Davis Bertans");
        Players DanteCunniham = new Players(Spurs, 33, "Forward", "Dante Cunningham");
        Players DeMarDeRozan = new Players(Spurs, 10, "Guard" , "DeMar DeRozan");
        Players DrewEubanks = new Players(Spurs, 14, "Forward", "Drew Eubanks");
        Players BenMoore = new Players(Spurs, 26, "Forward", "Ben Moore");
        Players BryanForbes = new Players(Spurs, 11, "Guard", "Bryan Forbes");
        
        //Warriors players
        Players KlayThompson = new Players(Warriors, 11, "Shooting Guard", "Klay Thompson");
        Players DraymondGreen = new Players(Warriors, 23, "Power Forward", "Draymond Green");
        Players DamianJones = new Players(Warriors, 15, "Center", "Damian Jones");
        Players JordanBell = new Players(Warriors, 2, "Center", "Jordan Bell");
        Players StephenCurry = new Players(Warriors, 30, "Point Guard", "Stephen Curry");
        Players AndreIguodala = new Players(Warriors, 9, "Small Forward", "Andre Iguodala");
        Players ShaunLivingston = new Players(Warriors, 34, "Point Guard", "Shaun Livingston");
        Players QuinnCook = new Players(Warriors, 4,"Point Guard", "Quinn Cook");
        
        //Jazz players
        Players GraysonAllen = new Players(Jazz, 24, "Guard", "Grayson Allen");
        Players TonyBradley = new Players(Jazz, 13, "Center", "Tony Bradley");
        Players TylerCavanaugh = new Players(Jazz, 34, "Forward", "Tyler Cavanaugh");
        Players JaeCrowder = new Players(Jazz, 99, "Forward", "Jae Crowder");
        Players DanteExum = new Players(Jazz, 11, "Guard", "Dante Exum");
        Players DerrickFavors = new Players(Jazz, 15, "Center-Foward", "Derrick Favors");
        Players RudyGobert = new Players(Jazz, 27, "Center", "Rudy Gobert");
        Players JoeIngles = new Players(Jazz, 2, "Forward", "Joe Ingles");
        
        //Pistons players
        Players BruceBrown = new Players(Pistons, 6, "Guard", "Bruce Brown");
        Players JoseCalderon = new Players(Pistons, 81, "Guard", "Jose Calderon");
        Players AndreDrummond = new Players(Pistons, 0, "Center" , "Andre Drummond");
        Players WayneEllington = new Players(Pistons, 20, "Guard", "Wayne Ellington");
        Players LangstonGalloway = new Players(Pistons, 9, "Guard", "Langston Galloway");
        Players BlakeGriffin = new Players(Pistons, 23, "Forward", "Blake Griffin");
        Players ReggieJackson = new Players(Pistons, 1, "Guard", "Reggie Jackson");
        Players LukeKennard = new Players(Pistons, 5, "Guard", "Luke Kennard");
        
        //Clippers players
        Players PatrickBeverley = new Players(Clippers, 21, "Guard", "PatrickBeverley");
        Players WilsonChandler = new Players(Clippers, 22, "Forward", "Willson Chandler");
        Players AngelDelgado = new Players(Clippers, 31, "Center", "Angel Delgado");
        Players DaniloGallinari = new Players(Clippers, 8, "Forward", "Danilo Gallinari");
        Players JohnathanMotley = new Players(Clippers, 15, "Forward", "Johnathan Motley");
        Players JeromeRobinson = new Players(Clippers, 10, "Guard", "Jerome Robinson");
        Players LandryShamet = new Players(Clippers, 20, "Guard", "Landry Shamnet");
        Players TyroneWallace = new Players(Clippers, 9, "Guard", "Tyrone Wallace");
        
        //Raptors players
        Players ChrisBoucher = new Players(Raptors, 25, "Forward", "Chris Boucher");
        Players MarcGasol = new Players(Raptors, 33, "Center", "Marc Gasol");
        Players DannyGreen = new Players(Raptors, 14, "Guard-Forward", "Danny Green");
        Players SergeIbaka = new Players(Raptors, 9, "Center-Forward", "Serge Ibaka");
        Players KawhiLeonard = new Players(Raptors, 2, "Forward", "Kawhi Leonard");
        Players JeremyLin = new Players(Raptors, 17, "Guard", "Jeremy Lin");
        Players KyleLowry = new Players(Raptors, 7, "Guard", "Kyle Lowry");
        Players JordanLoyd = new Players(Raptors, 8, "Guard", "Jordan Loyd");
        
        ArrayList<Players> playerArray = new ArrayList(70);
        //Celtics
        playerArray.add(KyrieIrving);
        playerArray.add(AronBanes);
        playerArray.add(PJDozier);
        playerArray.add(GordonHayward);
        playerArray.add(AlHorford);
        playerArray.add(RJHunter);
        playerArray.add(MarcusMorris);
        playerArray.add(JaylenBrown);
        
        //Lakers
        playerArray.add(LonzoBall);
        playerArray.add(ReggieBullock);
        playerArray.add(AlexCaruso);
        playerArray.add(LebronJames);
        playerArray.add(TysonChandler);
        playerArray.add(KyleKuzma);
        playerArray.add(JoshHart);
        playerArray.add(IsaacBonga);
        
        //Spurs
        playerArray.add(LamarcusAldridge);
        playerArray.add(MarcoBelinelli);
        playerArray.add(DavisBertans);
        playerArray.add(DanteCunniham);
        playerArray.add(DeMarDeRozan);
        playerArray.add(DrewEubanks);
        playerArray.add(BenMoore);
        playerArray.add(BryanForbes);
        
        //Warriors
        playerArray.add(KlayThompson);
        playerArray.add(DraymondGreen);
        playerArray.add(DamianJones);
        playerArray.add(JordanBell);
        playerArray.add(StephenCurry);
        playerArray.add(AndreIguodala);
        playerArray.add(ShaunLivingston);
        playerArray.add(QuinnCook);
        
        //Jazz
        playerArray.add(GraysonAllen);
        playerArray.add(TonyBradley);
        playerArray.add(TylerCavanaugh);
        playerArray.add(JaeCrowder);
        playerArray.add(DanteExum);
        playerArray.add(DerrickFavors);
        playerArray.add(RudyGobert);
        playerArray.add(JoeIngles);
        
        //Pistons
        playerArray.add(BruceBrown);
        playerArray.add(JoseCalderon);
        playerArray.add(AndreDrummond);
        playerArray.add(WayneEllington);
        playerArray.add(LangstonGalloway);
        playerArray.add(BlakeGriffin);
        playerArray.add(ReggieJackson);
        playerArray.add(LukeKennard);
        
        //Clippers
        playerArray.add(PatrickBeverley);
        playerArray.add(WilsonChandler);
        playerArray.add(AngelDelgado);
        playerArray.add(DaniloGallinari);
        playerArray.add(JohnathanMotley);
        playerArray.add(JeromeRobinson);
        playerArray.add(LandryShamet);
        playerArray.add(TyroneWallace);
        
        //Raptors
        playerArray.add(ChrisBoucher);
        playerArray.add(MarcGasol);
        playerArray.add(DannyGreen);
        playerArray.add(SergeIbaka);
        playerArray.add(KawhiLeonard);
        playerArray.add(JeremyLin);
        playerArray.add(KyleLowry);
        playerArray.add(JordanLoyd);
        
        
        ArrayList<Coaches> coachArray = new ArrayList(8);
        coachArray.add(coach1);
        coachArray.add(coach2);
        coachArray.add(coach3);
        coachArray.add(coach4);
        coachArray.add(coach5);
        coachArray.add(coach6);
        coachArray.add(coach7);
        coachArray.add(coach8);
        
        HashMap<String, Teams> map = new HashMap<>();
        map.put(Celtics.getName(), Celtics);
        map.put(Lakers.getName(), Lakers);
        map.put(Jazz.getName(), Jazz);
        map.put(Pistons.getName(), Pistons);
        map.put(Spurs.getName(), Spurs);
        map.put(Warriors.getName(), Warriors);
        map.put(Clippers.getName(), Clippers);
        map.put(Raptors.getName(), Raptors);
        
        for (int i = 0; i < 10; i++)
        {
            if (playerArray.get(i).getTeam() == Celtics)
            {
                    Celtics.players.add(playerArray.get(i));            
            }
            else if (playerArray.get(i).getTeam() == Lakers)
            {
                    Lakers.players.add(playerArray.get(i));
            }
            else if (playerArray.get(i).getTeam() == Jazz)
            {
                    Jazz.players.add(playerArray.get(i));
            }
            else if (playerArray.get(i).getTeam() == Pistons)
            {
                    Pistons.players.add(playerArray.get(i));
            }
            else if (playerArray.get(i).getTeam() == Spurs)
            {
                    Spurs.players.add(playerArray.get(i));
            }
            else if (playerArray.get(i).getTeam() == Warriors)
            {
                    Warriors.players.add(playerArray.get(i));
            }
            else if (playerArray.get(i).getTeam() == Clippers)
            {
                    Clippers.players.add(playerArray.get(i));
            }
            else if (playerArray.get(i).getTeam() == Raptors)
            {
                    Raptors.players.add(playerArray.get(i));
            }
        }
        
        Collections.sort(Celtics.players);
        Collections.sort(Lakers.players);
        Collections.sort(Jazz.players);
        Collections.sort(Pistons.players);
        Collections.sort(Spurs.players);
        Collections.sort(Warriors.players);
        Collections.sort(Clippers.players);
        Collections.sort(Raptors.players);
        
        
    String option = JOptionPane.showInputDialog("1. Search by Team \n2. Search by Player\n3. Search by Coach");
    int choice = Integer.parseInt(option);
    
    if (choice == 1)
    {
        String option2 = JOptionPane.showInputDialog("1. Show all Teams \n2. Enter a team name");
        int choice2 = Integer.parseInt(option2);
        {
            if (choice2 == 1)
            {
                String output = map.toString().replace("{", "").replace("}", "").replace(", ", "").replace("= ", "");
                JOptionPane.showMessageDialog(null, output);
            }
            else if (choice2 == 2)
            {
                String option3 = JOptionPane.showInputDialog("Enter team name:");
                if (map.containsKey(option3))
                {
                    Teams a = map.get(option3);
                    String sum = " ";
                    for (int i=0; i<a.players.size(); i++) 
                    {
                        Players b = a.players.get(i);
                        sum += b.toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, sum);
                 } 
            }
        }
    }
    
    else if (choice == 2)
    {
        String option4 = JOptionPane.showInputDialog("1. Search by Player Name \n2. Search by Jersey Number");
        int choice4 = Integer.parseInt(option4);
        if (choice4 == 1)
        {
            String option5 = JOptionPane.showInputDialog("Enter Player's name:");
            //binary search for that name in playerArray
        }
        else if (choice == 2)
        {
            String option6 = JOptionPane.showInputDialog("Enter Player's Jersey Number: ");
            //binary search for that number in playerArray
        }
    }
    
    else if (choice == 3)
    {
        String option6 = JOptionPane.showInputDialog("1. Search by Coach Name\n 2. Display a Team's coach");
        int choice6 = Integer.parseInt(option6);
        if (choice6 == 1)
        {
            String option7 = JOptionPane.showInputDialog("Enter the Coach's Name: ");
            //binary search
        }
        
        else if (choice6 == 2)
        {
            String option8 = JOptionPane.showInputDialog("Enter a Team: ");
            if (map.containsKey(option8))
                {
                    Teams a = map.get(option8); 
                    Coaches b = a.getCoach();
                    JOptionPane.showMessageDialog(null, b.getName() + " - " + b.getRecord() + " years");
                }
        }
    }
  }
    
}