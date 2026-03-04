package DVDteca;

import java.util.ArrayList;
import java.util.List;

public class mockDiscos {

    public static List<Disco> discos = new ArrayList<Disco>();

    public static void mockDiscosMejorado() {
        String[] autores = {"Metallica", "Iron Maiden", "Pink Floyd", "The Beatles", "Daft Punk", "Queen", "Nirvana", "Radiohead", "AC/DC", "Led Zeppelin"};
        String[] generos = {"Heavy Metal", "Rock", "Progressive Rock", "Pop", "Electronic", "Grunge", "Alternative Rock", "Hard Rock"};
        String[] adjetivos = {"Greatest", "Ultimate", "Dark", "Blue", "Eternal", "Lost", "Golden", "Silent", "Wild", "Electric"};
        String[] sustantivos = {"Hits", "Journey", "Moon", "Symphony", "Echoes", "Shadows", "Waves", "Night", "Legacy", "Dreams"};

        for (int i = 1; i <= 90; i++) {
            // Generar código único (ej: D001, D002...)
            String codigo = String.format("D%03d", i);
            
            // Selección aleatoria de datos
            String autor = autores[i % autores.length];
            String genero = generos[i % generos.length];
            String titulo = adjetivos[(i * 3) % adjetivos.length] + " " + sustantivos[(i * 7) % sustantivos.length] + " Vol." + i;
            
            // Duración entre 30 y 80 minutos
            int duracion = 30 + (i % 51);

            discos.add(new Disco(codigo, autor, titulo, genero, duracion));
        }
        System.out.println("Se han cargado 90 discos de prueba.");
    } 
    //solo que la IA me lo ha dado por fascículos y se mete todo modo sopa
    //en lugar de una lista con 100 discos distintos
    public static void mockDiscosTocho() {
        discos.add(new Disco("D01", "The Beatles", "Abbey Road", "Rock", 47));
        discos.add(new Disco("D02", "Pink Floyd", "The Dark Side of the Moon", "Progressive Rock", 42));
        discos.add(new Disco("D03", "Led Zeppelin", "Led Zeppelin IV", "Hard Rock", 42));
        discos.add(new Disco("D04", "Queen", "A Night at the Opera", "Rock", 43));
        discos.add(new Disco("D05", "Nirvana", "Nevermind", "Grunge", 42));
        discos.add(new Disco("D06", "AC/DC", "Back in Black", "Hard Rock", 42));
        discos.add(new Disco("D07", "Metallica", "Master of Puppets", "Thrash Metal", 54));
        discos.add(new Disco("D08", "Radiohead", "OK Computer", "Alternative Rock", 53));
        discos.add(new Disco("D09", "The Doors", "The Doors", "Psychedelic Rock", 44));
        discos.add(new Disco("D10", "Daft Punk", "Discovery", "Electronic", 61));
        discos.add(new Disco("D11", "Iron Maiden", "The Number of the Beast", "Heavy Metal", 40));
        discos.add(new Disco("D12", "Bob Marley", "Legend", "Reggae", 50));
        discos.add(new Disco("D13", "David Bowie", "The Rise and Fall of Ziggy Stardust", "Glam Rock", 38));
        discos.add(new Disco("D14", "Deep Purple", "Machine Head", "Hard Rock", 37));
        discos.add(new Disco("D15", "Guns N' Roses", "Appetite for Destruction", "Hard Rock", 53));
        discos.add(new Disco("D16", "Fleetwood Mac", "Rumours", "Soft Rock", 40));
        discos.add(new Disco("D17", "Black Sabbath", "Paranoid", "Heavy Metal", 42));
        discos.add(new Disco("D18", "The Rolling Stones", "Let It Bleed", "Rock", 42));
        discos.add(new Disco("D19", "Michael Jackson", "Thriller", "Pop", 42));
        discos.add(new Disco("D20", "U2", "The Joshua Tree", "Rock", 50));
        discos.add(new Disco("D21", "The Clash", "London Calling", "Punk Rock", 65));
        discos.add(new Disco("D22", "Pearl Jam", "Ten", "Grunge", 53));
        discos.add(new Disco("D23", "Arctic Monkeys", "AM", "Indie Rock", 41));
        discos.add(new Disco("D24", "Oasis", "(What's the Story) Morning Glory?", "Britpop", 50));
        discos.add(new Disco("D25", "The Police", "Synchronicity", "New Wave", 44));
        discos.add(new Disco("D26", "Judas Priest", "British Steel", "Heavy Metal", 36));
        discos.add(new Disco("D27", "Dire Straits", "Brothers in Arms", "Rock", 55));
        discos.add(new Disco("D28", "Linkin Park", "Hybrid Theory", "Nu Metal", 37));
        discos.add(new Disco("D29", "Red Hot Chili Peppers", "Californication", "Funk Rock", 56));
        discos.add(new Disco("D30", "Ramones", "Ramones", "Punk Rock", 29));
        discos.add(new Disco("D31", "Slayer", "Reign in Blood", "Thrash Metal", 29));
        discos.add(new Disco("D32", "Megadeth", "Rust in Peace", "Thrash Metal", 40));
        discos.add(new Disco("D33", "Pantera", "Vulgar Display of Power", "Groove Metal", 52));
        discos.add(new Disco("D34", "The Cure", "Disintegration", "Gothic Rock", 72));
        discos.add(new Disco("D35", "Joy Division", "Unknown Pleasures", "Post-Punk", 39));
        discos.add(new Disco("D36", "The Smiths", "The Queen Is Dead", "Indie Pop", 37));
        discos.add(new Disco("D37", "Depeche Mode", "Violator", "Synth-pop", 47));
        discos.add(new Disco("D38", "New Order", "Power, Corruption & Lies", "Synth-pop", 42));
        discos.add(new Disco("D39", "R.E.M.", "Automatic for the People", "Alternative Rock", 48));
        discos.add(new Disco("D40", "Soundgarden", "Superunknown", "Grunge", 70));
        discos.add(new Disco("D41", "Alice in Chains", "Dirt", "Grunge", 57));
        discos.add(new Disco("D42", "The Who", "Who's Next", "Rock", 43));
        discos.add(new Disco("D43", "Cream", "Disraeli Gears", "Psychedelic Rock", 33));
        discos.add(new Disco("D44", "King Crimson", "In the Court of the Crimson King", "Progressive Rock", 43));
        discos.add(new Disco("D45", "Genesis", "Selling England by the Pound", "Progressive Rock", 53));
        discos.add(new Disco("D46", "Yes", "Fragile", "Progressive Rock", 41));
        discos.add(new Disco("D47", "Rush", "Moving Pictures", "Progressive Rock", 40));
        discos.add(new Disco("D48", "Jethro Tull", "Aqualung", "Progressive Rock", 42));
        discos.add(new Disco("D49", "The Kinks", "The Village Green Preservation Society", "Rock", 39));
        discos.add(new Disco("D50", "The Velvet Underground", "The Velvet Underground & Nico", "Art Rock", 48));
        discos.add(new Disco("D51", "Iggy Pop", "The Idiot", "Art Rock", 38));
        discos.add(new Disco("D52", "T. Rex", "Electric Warrior", "Glam Rock", 39));
        discos.add(new Disco("D53", "Motörhead", "Ace of Spades", "Heavy Metal", 36));
        discos.add(new Disco("D54", "Scorpions", "Blackout", "Hard Rock", 36));
        discos.add(new Disco("D55", "Bon Jovi", "Slippery When Wet", "Hard Rock", 43));
        discos.add(new Disco("D56", "Van Halen", "1984", "Hard Rock", 33));
        discos.add(new Disco("D57", "Whitesnake", "1987", "Hard Rock", 42));
        discos.add(new Disco("D58", "Def Leppard", "Hysteria", "Hard Rock", 62));
        discos.add(new Disco("D59", "Mötley Crüe", "Dr. Feelgood", "Glam Metal", 45));
        discos.add(new Disco("D60", "Poison", "Look What the Cat Dragged In", "Glam Metal", 33));
        discos.add(new Disco("D61", "Skid Row", "Slave to the Grind", "Heavy Metal", 48));
        discos.add(new Disco("D62", "Sepultura", "Roots", "Groove Metal", 72));
        discos.add(new Disco("D63", "Mastodon", "Crack the Skye", "Progressive Metal", 50));
        discos.add(new Disco("D64", "Gojira", "From Mars to Sirius", "Death Metal", 66));
        discos.add(new Disco("D65", "Tool", "Lateralus", "Progressive Metal", 78));
        discos.add(new Disco("D66", "Opeth", "Blackwater Park", "Progressive Metal", 67));
        discos.add(new Disco("D67", "Dream Theater", "Images and Words", "Progressive Metal", 57));
        discos.add(new Disco("D68", "Avenged Sevenfold", "City of Evil", "Heavy Metal", 74));
        discos.add(new Disco("D69", "Slipknot", "Iowa", "Nu Metal", 66));
        discos.add(new Disco("D70", "Korn", "Follow the Leader", "Nu Metal", 70));
        discos.add(new Disco("D71", "System of a Down", "Toxicity", "Alternative Metal", 44));
        discos.add(new Disco("D72", "Deftones", "White Pony", "Alternative Metal", 48));
        discos.add(new Disco("D73", "Foo Fighters", "The Colour and the Shape", "Alternative Rock", 46));
        discos.add(new Disco("D74", "Green Day", "Dookie", "Pop Punk", 39));
        discos.add(new Disco("D75", "The Offspring", "Smash", "Punk Rock", 46));
        discos.add(new Disco("D76", "Blink-182", "Enema of the State", "Pop Punk", 35));
        discos.add(new Disco("D77", "Sum 41", "All Killer No Filler", "Pop Punk", 32));
        discos.add(new Disco("D78", "My Chemical Romance", "The Black Parade", "Emo", 51));
        discos.add(new Disco("D79", "Fall Out Boy", "From Under the Cork Tree", "Pop Punk", 43));
        discos.add(new Disco("D80", "Paramore", "Riot!", "Pop Rock", 38));
        discos.add(new Disco("D81", "Muse", "Origin of Symmetry", "Space Rock", 51));
        discos.add(new Disco("D82", "Placebo", "Without You I'm Nothing", "Alternative Rock", 50));
        discos.add(new Disco("D83", "Gorillaz", "Demon Days", "Alternative Rock", 50));
        discos.add(new Disco("D84", "The Strokes", "Is This It", "Indie Rock", 36));
        discos.add(new Disco("D85", "The Killers", "Hot Fuss", "Indie Rock", 45));
        discos.add(new Disco("D86", "Interpol", "Turn on the Bright Lights", "Post-Punk", 49));
        discos.add(new Disco("D87", "Bloc Party", "Silent Alarm", "Indie Rock", 51));
        discos.add(new Disco("D88", "Franz Ferdinand", "Franz Ferdinand", "Indie Rock", 38));
        discos.add(new Disco("D89", "Kings of Leon", "Only by the Night", "Arena Rock", 42));
        discos.add(new Disco("D90", "The White Stripes", "Elephant", "Garage Rock", 49));
    }
}