object word_transform {
	type word = String;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(7156); 
	lazy val dictionary = Array("AAH", "AAL", "AAS", "ABA", "ABO", "ABS", "ABY", "ACE", "ACT", "ADD", "ADO", "ADS", "ADZ", "AFF", "AFT", "AGA", "AGE", "AGO", "AGS", "AHA", "AHI", "AHS", "AID", "AIL", "AIM", "AIN", "AIR", "AIS", "AIT", "ALA", "ALB", "ALE", "ALL", "ALP", "ALS", "ALT", "AMA", "AMI", "AMP", "AMU", "ANA", "AND", "ANE", "ANI", "ANT", "ANY", "APE", "APO", "APP", "APT", "ARB", "ARC", "ARE", "ARF", "ARK", "ARM", "ARS", "ART", "ASH", "ASK", "ASP", "ASS", "ATE", "ATT", "AUK", "AVA", "AVE", "AVO", "AWA", "AWE", "AWL", "AWN", "AXE", "AYE", "AYS", "AZO", "BAA", "BAD", "BAG", "BAH", "BAL", "BAM", "BAN", "BAP", "BAR", "BAS", "BAT", "BAY", "BED", "BEE", "BEG", "BEL", "BEN", "BES", "BET", "BEY", "BIB", "BID", "BIG", "BIN", "BIO", "BIS", "BIT", "BIZ", "BOA", "BOB", "BOD", "BOG", "BOO", "BOP", "BOS", "BOT", "BOW", "BOX", "BOY", "BRA", "BRO", "BRR", "BUB", "BUD", "BUG", "BUM", "BUN", "BUR", "BUS", "BUT", "BUY", "BYE", "BYS", "CAB", "CAD", "CAM", "CAN", "CAP", "CAR", "CAT", "CAW", "CAY", "CEE", "CEL", "CEP", "CHI", "CIG", "CIS", "COB", "COD", "COG", "COL", "CON", "COO", "COP", "COR", "COS", "COT", "COW", "COX", "COY", "COZ", "CRU", "CRY", "CUB", "CUD", "CUE", "CUM", "CUP", "CUR", "CUT", "CWM", "DAB", "DAD", "DAG", "DAH", "DAK", "DAL", "DAM", "DAN", "DAP", "DAW", "DAY", "DEB", "DEE", "DEF", "DEL", "DEN", "DEV", "DEW", "DEX", "DEY", "DIB", "DID", "DIE", "DIF", "DIG", "DIM", "DIN", "DIP", "DIS", "DIT", "DOC", "DOE", "DOG", "DOL", "DOM", "DON", "DOR", "DOS", "DOT", "DOW", "DRY", "DUB", "DUD", "DUE", "DUG", "DUH", "DUI", "DUN", "DUO", "DUP", "DYE", "EAR", "EAT", "EAU", "EBB", "ECU", "EDH", "EDS", "EEK", "EEL", "EFF", "EFS", "EFT", "EGG", "EGO", "EKE", "ELD", "ELF", "ELK", "ELL", "ELM", "ELS", "EME", "EMS", "EMU", "END", "ENG", "ENS", "EON", "ERA", "ERE", "ERG", "ERN", "ERR", "ERS", "ESS", "ETA", "ETH", "EVE", "EWE", "EYE", "FAB", "FAD", "FAG", "FAN", "FAR", "FAS", "FAT", "FAX", "FAY", "FED", "FEE", "FEH", "FEM", "FEN", "FER", "FES", "FET", "FEU", "FEW", "FEY", "FEZ", "FIB", "FID", "FIE", "FIG", "FIL", "FIN", "FIR", "FIT", "FIX", "FIZ", "FLU", "FLY", "FOB", "FOE", "FOG", "FOH", "FON", "FOP", "FOR", "FOU", "FOX", "FOY", "FRO", "FRY", "FUB", "FUD", "FUG", "FUN", "FUR", "GAB", "GAD", "GAE", "GAG", "GAL", "GAM", "GAN", "GAP", "GAR", "GAS", "GAT", "GAY", "GED", "GEE", "GEL", "GEM", "GEN", "GET", "GEY", "GHI", "GIB", "GID", "GIE", "GIG", "GIN", "GIP", "GIT", "GNU", "GOA", "GOB", "GOD", "GOO", "GOR", "GOS", "GOT", "GOX", "GOY", "GUL", "GUM", "GUN", "GUT", "GUV", "GUY", "GYM", "GYP", "HAD", "HAE", "HAG", "HAH", "HAJ", "HAM", "HAO", "HAP", "HAS", "HAT", "HAW", "HAY", "HEH", "HEM", "HEN", "HEP", "HER", "HES", "HET", "HEW", "HEX", "HEY", "HIC", "HID", "HIE", "HIM", "HIN", "HIP", "HIS", "HIT", "HMM", "HOB", "HOD", "HOE", "HOG", "HON", "HOP", "HOT", "HOW", "HOY", "HUB", "HUE", "HUG", "HUH", "HUM", "HUN", "HUP", "HUT", "HYP", "ICE", "ICH", "ICK", "ICY", "IDS", "IFF", "IFS", "IGG", "ILK", "ILL", "IMP", "INK", "INN", "INS", "ION", "IRE", "IRK", "ISM", "ITS", "IVY", "JAB", "JAG", "JAM", "JAR", "JAW", "JAY", "JEE", "JET", "JEU", "JEW", "JIB", "JIG", "JIN", "JOB", "JOE", "JOG", "JOT", "JOW", "JOY", "JUG", "JUN", "JUS", "JUT", "KAB", "KAE", "KAF", "KAS", "KAT", "KAY", "KEA", "KEF", "KEG", "KEN", "KEP", "KEX", "KEY", "KHI", "KID", "KIF", "KIN", "KIP", "KIR", "KIS", "KIT", "KOA", "KOB", "KOI", "KOP", "KOR", "KOS", "KUE", "KYE", "LAB", "LAC", "LAD", "LAG", "LAM", "LAP", "LAR", "LAS", "LAT", "LAV", "LAW", "LAX", "LAY", "LEA", "LED", "LEE", "LEG", "LEI", "LEK", "LET", "LEU", "LEV", "LEX", "LEY", "LEZ", "LIB", "LID", "LIE", "LIN", "LIP", "LIS", "LIT", "LOB", "LOG", "LOO", "LOP", "LOT", "LOW", "LOX", "LUG", "LUM", "LUV", "LUX", "LYE", "MAC", "MAD", "MAE", "MAG", "MAN", "MAP", "MAR", "MAS", "MAT", "MAW", "MAX", "MAY", "MED", "MEG", "MEL", "MEM", "MEN", "MET", "MEW", "MHO", "MIB", "MIC", "MID", "MIG", "MIL", "MIM", "MIR", "MIS", "MIX", "MOA", "MOB", "MOC", "MOD", "MOG", "MOL", "MOM", "MON", "MOO", "MOP", "MOR", "MOS", "MOT", "MOW", "MUD", "MUG", "MUM", "MUN", "MUS", "MUT", "MYC", "NAB", "NAE", "NAG", "NAH", "NAM", "NAN", "NAP", "NAW", "NAY", "NEB", "NEE", "NEG", "NET", "NEW", "NIB", "NIL", "NIM", "NIP", "NIT", "NIX", "NOB", "NOD", "NOG", "NOH", "NOM", "NOO", "NOR", "NOS", "NOT", "NOW", "NTH", "NUB", "NUN", "NUS", "NUT", "OAF", "OAK", "OAR", "OAT", "OBA", "OBE", "OBI", "OCA", "ODA", "ODD", "ODE", "ODS", "OES", "OFF", "OFT", "OHM", "OHO", "OHS", "OIL", "OKA", "OKE", "OLD", "OLE", "OMS", "ONE", "ONO", "ONS", "OOH", "OOT", "OPE", "OPS", "OPT", "ORA", "ORB", "ORC", "ORE", "ORS", "ORT", "OSE", "OUD", "OUR", "OUT", "OVA", "OWE", "OWL", "OWN", "OXO", "OXY", "PAC", "PAD", "PAH", "PAL", "PAM", "PAN", "PAP", "PAR", "PAS", "PAT", "PAW", "PAX", "PAY", "PEA", "PEC", "PED", "PEE", "PEG", "PEH", "PEN", "PEP", "PER", "PES", "PET", "PEW", "PHI", "PHT", "PIA", "PIC", "PIE", "PIG", "PIN", "PIP", "PIS", "PIT", "PIU", "PIX", "PLY", "POD", "POH", "POI", "POL", "POM", "POP", "POT", "POW", "POX", "PRO", "PRY", "PSI", "PST", "PUB", "PUD", "PUG", "PUL", "PUN", "PUP", "PUR", "PUS", "PUT", "PYA", "PYE", "PYX", "QAT", "QIS", "QUA", "RAD", "RAG", "RAH", "RAI", "RAJ", "RAM", "RAN", "RAP", "RAS", "RAT", "RAW", "RAX", "RAY", "REB", "REC", "RED", "REE", "REF", "REG", "REI", "REM", "REP", "RES", "RET", "REV", "REX", "RHO", "RIA", "RIB", "RID", "RIF", "RIG", "RIM", "RIN", "RIP", "ROB", "ROC", "ROD", "ROE", "ROM", "ROT", "ROW", "RUB", "RUE", "RUG", "RUM", "RUN", "RUT", "RYA", "RYE", "SAB", "SAC", "SAD", "SAE", "SAG", "SAL", "SAP", "SAT", "SAU", "SAW", "SAX", "SAY", "SEA", "SEC", "SEE", "SEG", "SEI", "SEL", "SEN", "SER", "SET", "SEW", "SEX", "SHA", "SHE", "SHH", "SHY", "SIB", "SIC", "SIM", "SIN", "SIP", "SIR", "SIS", "SIT", "SIX", "SKA", "SKI", "SKY", "SLY", "SOB", "SOD", "SOL", "SOM", "SON", "SOP", "SOS", "SOT", "SOU", "SOW", "SOX", "SOY", "SPA", "SPY", "SRI", "STY", "SUB", "SUE", "SUK", "SUM", "SUN", "SUP", "SUQ", "SYN", "TAB", "TAD", "TAE", "TAG", "TAJ", "TAM", "TAN", "TAO", "TAP", "TAR", "TAS", "TAT", "TAU", "TAV", "TAW", "TAX", "TEA", "TED", "TEE", "TEG", "TEL", "TEN", "TET", "TEW", "THE", "THO", "THY", "TIC", "TIE", "TIL", "TIN", "TIP", "TIS", "TIT", "TOD", "TOE", "TOG", "TOM", "TON", "TOO", "TOP", "TOR", "TOT", "TOW", "TOY", "TRY", "TSK", "TUB", "TUG", "TUI", "TUN", "TUP", "TUT", "TUX", "TWA", "TWO", "TYE", "UDO", "UGH", "UKE", "ULU", "UMM", "UMP", "UNS", "UPO", "UPS", "URB", "URD", "URN", "URP", "USE", "UTA", "UTE", "UTS", "VAC", "VAN", "VAR", "VAS", "VAT", "VAU", "VAV", "VAW", "VEE", "VEG", "VET", "VEX", "VIA", "VID", "VIE", "VIG", "VIM", "VIS", "VOE", "VOW", "VOX", "VUG", "VUM", "WAB", "WAD", "WAE", "WAG", "WAN", "WAP", "WAR", "WAS", "WAT", "WAW", "WAX", "WAY", "WEB", "WED", "WEE", "WEN", "WET", "WHA", "WHO", "WHY", "WIG", "WIN", "WIS", "WIT", "WIZ", "WOE", "WOG", "WOK", "WON", "WOO", "WOP", "WOS", "WOT", "WOW", "WRY", "WUD", "WYE", "WYN", "XIS", "YAG", "YAH", "YAK", "YAM", "YAP", "YAR", "YAW", "YAY", "YEA", "YEH", "YEN", "YEP", "YES", "YET", "YEW", "YID", "YIN", "YIP", "YOB", "YOD", "YOK", "YOM", "YON", "YOU", "YOW", "YUK", "YUM", "YUP", "ZAG", "ZAP", "ZAS", "ZAX", "ZED", "ZEE", "ZEK", "ZEP", "ZIG", "ZIN", "ZIP", "ZIT", "ZOA", "ZOO", "ZUZ", "ZZZ");System.out.println("""dictionary  : Array[java.lang.String] = <lazy>""");$skip(40); 
  val dictionarylen = dictionary.length;System.out.println("""dictionarylen  : Int = """ + $show(dictionarylen ));$skip(128); 
  val alphabet = Array("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");System.out.println("""alphabet  : Array[java.lang.String] = """ + $show(alphabet ));$skip(1319); 
  //Helper function which finds all words that can be obtained by changing 1 letter from a given word.
  def neighborsWithHistory(word: word, history: List[word]): Stream[(word, List[word])] = {
  	val letter1 = word(0).toString
  	val letter2 = word(1).toString
  	val letter3 = word(2).toString
  	
  	lazy val firstletterwords = for{i <- 0 to 25
												if dictionary.contains(alphabet(i) + letter2 + letter3); if (!history.contains(alphabet(i) + letter2 + letter3))
												}yield alphabet(i) + letter2 + letter3
		lazy val secondletterwords = for{i <- 0 to 25
												if dictionary.contains(letter1 + alphabet(i) + letter3); if (!history.contains(letter1 + alphabet(i) + letter3))
												}yield letter1 + alphabet(i) + letter3
		lazy val thirdletterwords = for{i <- 0 to 25
												if dictionary.contains(letter1 + letter2 + alphabet(i)); if (!history.contains(letter1 + letter2 + alphabet(i)))
												}yield letter1 + letter2 + alphabet(i)
		lazy val newwordlist = firstletterwords.toList ++ secondletterwords.toList ++ thirdletterwords.toList
		
		def outputList(wordlist: List[word]): Stream[(word, List[word])] = {
			if (wordlist.isEmpty) Stream.Empty
			else outputList(wordlist.tail) #::: Stream((wordlist.head, history ++ List(wordlist.head )))
		}
  	outputList(newwordlist)
  };System.out.println("""neighborsWithHistory: (word: word_transform.word, history: List[word_transform.word])Stream[(word_transform.word, List[word_transform.word])]""");$skip(1021); 
	//This is the main function
	def wordTransform(startword: word, endword: word): Int = {
		//Helper function which finds a list from the startword to the endword.
		def findWordTransformList(startword: word, endword: word, neighborhistory: Stream[(word, List[word])]): (word, List[word]) = {
  		lazy val pathtoendword: Stream[(word, List[word])] = for{wpair <- neighborhistory if (wpair._1==endword)}yield wpair
  		lazy val updatedlist: Stream[Stream[(word, List[word])]] = for{wpair <- neighborhistory}yield neighborsWithHistory(wpair._1, wpair._2)
  		if (!pathtoendword.isEmpty) pathtoendword.head
  		else if (neighborhistory.isEmpty || (startword==endword)) throw new Exception("No such transformation exists.")
  		else findWordTransformList(startword, endword, updatedlist.flatten)
		}
	val translistlen = findWordTransformList(startword, endword, neighborsWithHistory(startword, List(startword)))._2.length - 1
	if ( translistlen > 0) translistlen
	else throw new Exception("No such transformation exists.")
	};System.out.println("""wordTransform: (startword: word_transform.word, endword: word_transform.word)Int""");$skip(369); val res$0 = 

  //NOTE: This algorithm runs slow for word pairs which have a transformation of more than 4 letters. However, I have noticed that
  //most transformations for 3 letter words can be done with 3 or 4 letters, so this algorithm works for the cases I have tried.
  //It could definitely be improved in terms of runtime though.
	
	
	
	//TESTS
	wordTransform("DOG", "CAT");System.out.println("""res0: Int = """ + $show(res$0));$skip(29); val res$1 = 
	wordTransform("DOG", "BOG");System.out.println("""res1: Int = """ + $show(res$1));$skip(29); val res$2 = 
	wordTransform("DOG", "BIT");System.out.println("""res2: Int = """ + $show(res$2));$skip(29); val res$3 = 
	wordTransform("DOG", "ZIN");System.out.println("""res3: Int = """ + $show(res$3));$skip(29); val res$4 = 
	wordTransform("DOG", "AWN");System.out.println("""res4: Int = """ + $show(res$4));$skip(29); val res$5 = 
	wordTransform("DOG", "BES");System.out.println("""res5: Int = """ + $show(res$5));$skip(29); val res$6 = 
	wordTransform("BOB", "BYE");System.out.println("""res6: Int = """ + $show(res$6))}
	//wordTransform("DOG", "DOG")   java.lang.Exception: No such transformation exists.
	//wordTransform("ZZZ", "DOG")     java.lang.Exception: No such transformation exists.
}