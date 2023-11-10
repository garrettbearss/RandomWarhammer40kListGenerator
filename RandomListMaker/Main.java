// Random List Maker
// Garrett Bearss
// 8/23/2023
import java.util.Scanner;

public class Datasheet{
  String name;
  int cost;
  Datasheet[] attaches;
  bool warlord;

  public Datasheet(String str, int i, String[] arr1, bool c1, bool c2, bool c3){
    name = str;
    cost = i;
    attaches = arr1;
    warlord = c1;
    epic = c2;
    battleline = c3;
  }
  public int getCost(){
    return cost;
  }
  public String getName(){
    return name;
  }
  public Datasheet getAttache(int i){
    return attaches[i];
  }
}

public class factionData{
  int count = 0;
  Datasheet data[];
  
  public void insert(Datasheet d){
    if(data.length = count){
      Datasheet newData[] = new Datasheet[2 * length];
      for(int i = 0; i < count; i++){
        newData[i] = data[i];
      }
      data = newData;
    }
    data[count++] = d; 
  }
  
}

public class Main {
  public static void main(String args[]){
    System.out.print("\033[H\033[2J");
    String[] factions = {"Aeldari", "Adeptus Custodes", "Adeptus Mechanicus", "Astra Militarum", "Chaos Daemons", "Chaos Knights", "Chaos Space Marines", "Death Guard", "Drukhari", "Genestealer Cults", "Grey Knights", "Imperial Knights", "Leagues of Votann", "Necrons", "Orks", "Sisters of Battle", "T'au Empire", "Thousand Sons", "Tyranids", "World Eaters"};

    String[] list;
    int faction;
    int pointsOptions[] = {1000, 2000};
    Scanner scanner = new Scanner(System.in);
    // FACTION SELECT START
    System.out.println("List of factions: ");
    System.out.println("---------------------------");
    int i = 0;
    for(String fac : factions){
     System.out.println(i++ + ". " + fac);
    }
    System.out.println("---------------------------");
    System.out.print("Enter the faction your name (using the #): ");
    faction = scanner.nextLine();
    if(faction < 0 || faction > 19){
      System.out.println("Invalid faction entered, exitting...");
      exit();
    }
    System.out.print("\033[H\033[2J");
    // FACTION SELECT END

    // LOADING DATASHEETS BASED ON FACTION START
    switch(faction){
      // Aeldari
      case 0:
      Datasheet ae1 = new Datasheet("Corsair Voidreavers", 70, null, false, false, true);
      Datasheet ae2 = new Datasheet("Guardian Defenders", 110, null, false, false, true);
      Datasheet ae3 = new Datasheet("Storm Guardians", 115, null, false, false, true);
      Datasheet ae4 = new Datasheet("Starweaver", 80, null, false, false, true);
      Datasheet ae5 = new Datasheet("Wave Serpent", 120, null, false, false, true);
      Datasheet ae6 = new Datasheet("Cobra", 415, null, false, false, false);
      Datasheet ae7 = new Datasheet("Corsair Voidscarred", 90, null, false, false, false);
      Datasheet ae8 = new Datasheet("Crimson Hunter", 160, null, false, false, false);
      Datasheet ae9 = new Datasheet("Dark Reapers", 75, null, false, false, false);
      Datasheet ae10 = new Datasheet("Dire Avengers", 70, null, false, false, false);
      Datasheet ae11 = new Datasheet("Falcon", 140, null, false, false, false);
      Datasheet ae12 = new Datasheet("Fire Dragons", 85, null, false, false, false);
      Datasheet ae13 = new Datasheet("Fire Prism", 150, null, false, false, false);
      Datasheet ae14 = new Datasheet("Hemlock Wraithfighter", 155, null, false, false, false);
      Datasheet ae15 = new Datasheet("Hornet", 80, null, false, false, false);
      Datasheet ae16 = new Datasheet("Howling Banshees", 85, null, false, false, false);
      Datasheet ae17 = new Datasheet("Lynx", 155, null, false, false, false);
      Datasheet ae18 = new Datasheet("Night Spinner", 170, null, false, false, false);
      Datasheet ae19 = new Datasheet("Nightwing", 150, null, false, false, false);
      Datasheet ae20 = new Datasheet("Phantom Titan", 2100, null, false, false, false);
      Datasheet ae21 = new Datasheet("Rangers", 55, null, false, false, false);
      Datasheet ae22 = new Datasheet("Revenant Titan", 1100, null, false, false, false);
      Datasheet ae23 = new Datasheet("Scorpion", 410, null, false, false, false);
      Datasheet ae24 = new Datasheet("Shadow Spectres", 80, null, false, false, false);
      Datasheet ae25 = new Datasheet("Shining Spears", 120, null, false, false, false);
      Datasheet ae26 = new Datasheet("Shroud Runners", 80, null, false, false, false);
      Datasheet ae27 = new Datasheet("Skathach", 440, null, false, false, false);
      Datasheet ae28 = new Datasheet("Skyweavers", 95, null, false, false, false);
      Datasheet ae29 = new Datasheet("Striking Scorpions", 75, null, false, false, false);
      Datasheet ae30 = new Datasheet("Support Weapons", 105, null, false, false, false);
      Datasheet ae31 = new Datasheet("Swooping Hawks", 75, null, false, false, false);
      Datasheet ae32 = new Datasheet("Troupe", 75, null, false, false, false);
      Datasheet ae33 = new Datasheet("Voidweaver", 100, null, false, false, false);
      Datasheet ae34 = new Datasheet("Vypers", 75, null, false, false, false);
      Datasheet ae35 = new Datasheet("War Walkers", 95, null, false, false, false);
      Datasheet ae36 = new Datasheet("Warlock Conclave", 60, null, false, false, false);
      Datasheet ae37 = new Datasheet("Warlock Skyrunner Conclave", 100, null, false, false, false);
      Datasheet ae38 = new Datasheet("Warp Hunter", 130, null, false, false, false);
      Datasheet ae39 = new Datasheet("Warp Spiders", 100, null, false, false, false);
      Datasheet ae40 = new Datasheet("Webway Gate", 220, null, false, false, false);
      Datasheet ae41 = new Datasheet("Windriders", 80, null, false, false, false);
      Datasheet ae42 = new Datasheet("Wraithblades", 170, null, false, false, false);
      Datasheet ae43 = new Datasheet("Wraithguard", 155, null, false, false, false);
      Datasheet ae44 = new Datasheet("Wraithknight", 475, null, false, false, false);
      Datasheet ae45 = new Datasheet("Wraithlord", 160, null, false, false, false);
      Datasheet ae46 = new Datasheet("Wraithseer", 160, null, false, false, false);
      Datasheet aedr1 = new Datasheet("Court of the Archon", 95, null, false, false, false);
      Datasheet aedr2 = new Datasheet("Hellions", 110, null, false, false, false);
      Datasheet aedr3 = new Datasheet("Incubi", 85, null, false, false, false);
      Datasheet aedr4 = new Datasheet("Kabalite Warriors", 120, null, false, false, false);
      Datasheet aedr5 = new Datasheet("Mandrakes", 70, null, false, false, false);
      Datasheet aedr6 = new Datasheet("Raider", 90, null, false, false, false);
      Datasheet aedr7 = new Datasheet("Ravager", 95, null, false, false, false);
      Datasheet aedr8 = new Datasheet("Razorwing Jetfighter", 170, null, false, false, false);
      Datasheet aedr9 = new Datasheet("Reavers", 75, null, false, false, false);
      Datasheet aedr10 = new Datasheet("Scourges", 120, null, false, false, false);
      Datasheet aedr11 = new Datasheet("Tantalus", 230, null, false, false, false);
      Datasheet aedr12 = new Datasheet("Venom", 80, null, false, false, false);
      Datasheet aedr13 = new Datasheet("Voidraven Bomber", 195, null, false, false, false);
      Datasheet aedr14 = new Datasheet("Wyches", 110, null, false, false, false);
      Datasheet aedr15 = new Datasheet("Archon", 85, new Datasheet[aedr1,aedr4], false, false, false);
      Datasheet aedr16 = new Datasheet("Beastmaster", 120, null, false, false, false);
      Datasheet aedr16 = new Datasheet("Drazhar", 105, new Datasheet[aedr3], false, false, false);
      Datasheet aedr17 = new Datasheet("Lelith Hesperax", 105, new Datasheet[aedr14], false, false, false);
      Datasheet aedr18 = new Datasheet("Succubus", 70, new Datasheet[aedr14], false, false, false);
      Datasheet ae47 = new Datasheet("Asurmen", 120, new Datasheet[ae10], true, true, false);
      Datasheet ae48 = new Datasheet("Autarch", 65, new Datasheet[ae2,ae3], true, false, false);
      Datasheet ae49 = new Datasheet("Autarch Skyrunner", 80, new Datasheet[ae41], true, false, false);
      Datasheet ae50 = new Datasheet("Autarch Wayleaper", 80, null, true, false, false);
      Datasheet ae51 = new Datasheet("Avatar of Khaine", 295, null, true, true, false);
      Datasheet ae52 = new Datasheet("Baharroth", 125, new Datasheet[ae31], true, true, false);
      Datasheet ae53 = new Datasheet("Death Jester", 70, null, true, true, false);
      Datasheet ae54 = new Datasheet("Eldrad Ulthran", 100, new Datasheet[ae2,ae3,ae36], true, true, false);
      Datasheet ae55 = new Datasheet("Farseer", 65, new Datasheet[ae2,ae3,ae36], true, false, false);
      Datasheet ae56 = new Datasheet("Farseer Skyrunner", 75, new Datasheet[ae37,ae41], true, false, false);
      Datasheet ae57 = new Datasheet("Fuegan", 115, new Datasheet[ae12], true, true, false);
      Datasheet ae58 = new Datasheet("Illic Nightspear", 65, new Datasheet[ae21], true, true, false);
      Datasheet ae59 = new Datasheet("Irillyth", 105, new Datasheet[ae24], true, true, false);
      Datasheet ae60 = new Datasheet("Jain Zar", 105, new Datasheet[ae16], true, true, false);
      Datasheet ae61 = new Datasheet("Karandras", 100, new Datasheet[ae29], true, true, false);
      Datasheet ae62 = new Datasheet("Maugan Ra", 130, new Datasheet[ae9], true, true, false);
      Datasheet ae63 = new Datasheet("Prince Yriel", 100, new Datasheet[ae1,ae2,ae3,ae7], true, true, false);
      Datasheet ae64 = new Datasheet("Shadowseer", 60, new Datasheet[ae32], true, false, false);
      Datasheet ae65 = new Datasheet("Solitaire", 115, null, true, true, false);
      Datasheet ae66 = new Datasheet("Spiritseer", 65, new Datasheet[ae42,ae43,ae44], true, false, false);
      Datasheet ae67 = new Datasheet("The Visarch", 90, new Datasheet[ae1,ae2,ae3,ae7,ae32,aedr4,aedr14], true, true, false);
      Datasheet ae68 = new Datasheet("", 0, new Datasheet[], true, false, false);
      Datasheet ae69 = new Datasheet("", 0, new Datasheet[], true, false, false);
      Datasheet ae70 = new Datasheet("", 0, new Datasheet[], true, false, false);
      Datasheet ae71 = new Datasheet("", 0, new Datasheet[], true, false, false);
      Datasheet ae72 = new Datasheet("", 0, new Datasheet[], true, false, false);
      break;
      // Adeptus Custodes
      case 1:

      break;
      // Adeptus Mechanicus
      case 2:
      
      break;
      // Astra Militarum
      case 3:

      break;
      // Chaos Daemons
      case 4:

      break;
      // Chaos Knights
      case 5:

      break;
      // Chaos Space Marines
      case 6:

      break;
      // Death Guard
      case 7:

      break;
      // Drukhari
      case 8:

      break;
      // Genestealer Cults
      case 9:

      break;
      // Grey Knights
      case 10:

      break;
      // Imperial Knights
      case 11:

      break;
      // Leagues of Votann
      case 12:

      break;
      // Necrons
      case 13:

      break;
      // Orks
      case 14:

      break;
      // Sisters of Battle
      case 15:

      break;
      // T'au Emprie
      case 16:

      break;
      // Thousand Sons
      case 17:

      break;
      // Tyranids
      case 18:

      break;
      // World Eaters
      case 19:

      break;
    }
    // LOADING DATASHEETS BASED ON FACTION END

    
    // POINT SELECT START
    System.out.println("List of point limits: ");
    System.out.println("---------------------------");
    i = 0;
    for(int point: pointsOptions){
      System.out.println(i++ + ". " + point);
    }
    System.out.println("---------------------------");
    System.out.print("Enter the point limit (using the #): ");
    faction = scanner.nextLine();
    System.out.print("\033[H\033[2J");
    // POINT SELECT END

    // ENTERING UNITS ON HAND START

    // ENTERING UNITS ON HAND END

    // LIST GENERATING START

    // LIST GENERATING END

    // LIST PRINTOUT START

    // LIST PRINTOUT END
    System.gc();
    scanner.close();
  }
}