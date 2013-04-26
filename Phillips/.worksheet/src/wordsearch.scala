object wordsearch {
  //Some helpful types to use in functions: word represents a word, startindex represents the column and row number
  // of where the words starts, and endindex does the same for where a word ends.
  type word = String
  type startindex = (Int,Int)
  type endindex = (Int,Int);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(3078); 

  //Create an array of an array of characters representing the word search puzzle
lazy val puzzle = Array(Array('x',	'n',	't',	'g',	'j',	'h',	'e',	'a',	'l',	't',	'h',	'u',	's',	'k',	'b',	'w',	'a',	's',	't',	'a'),
Array('s',	'o',	'u',	'j',	'y',	'n',	'z',	'w',	'x',	'b',	't',	'g',	'm',	'v',	'y',	'b',	'o',	'l',	'a',	'h'),
Array('h',	't',	'i',	'l',	't',	's',	'l',	'e',	'q',	'd',	'c',	'r',	'a',	'n',	'd',	'r',	'p',	'x',	'z',	'b'),
Array('p',	's',	'h',	'e',	'p',	'b',	'n',	'o',	'r',	'e',	'b',	'a',	'z',	'o',	'o',	'k',	'a',	's',	'b',	'u'),
Array('l',	'i',	'd',	'n',	'o',	'l',	'y',	'p',	'r',	'v',	'a',	's',	'j',	'p',	'p',	'j',	'o',	's',	'r',	'd'),
Array('i',	'e',	'v',	'y',	'r',	'u',	'm',	'g',	'b',	'e',	'l',	's',	'g',	'r',	'y',	'l',	'h',	'c',	'x',	'z'),
Array('a',	'h',	'm',	'h',	'o',	'n',	'k',	'i',	'l',	'l',	't',	'a',	'c',	'u',	'l',	'a',	'r',	'o',	'b',	'y'),
Array('b',	'o',	'i',	'e',	'q',	'd',	'o',	'n',	's',	'y',	'b',	's',	'o',	't',	'x',	'o',	'g',	'r',	'a',	'p'),
Array('h',	'o',	'w',	'i',	't',	'e',	'u',	'z',	'a',	't',	'y',	's',	'e',	'd',	'o',	'b',	'f',	'e',	'v',	's'),
Array('a',	'i',	's',	'c',	'a',	'r',	'k',	'a',	'e',	'i',	'd',	'i',	's',	'i',	'c',	'h',	'i',	'o',	'p',	't'),
Array('o',	'd',	'b',	'a',	'd',	'b',	'o',	'h',	'd',	'r',	'y',	'n',	'y',	'l',	'e',	'v',	'e',	'l',	'a',	'e'),
Array('l',	'd',	'k',	'u',	'i',	'u',	'j',	'i',	'r',	'e',	'g',	's',	'd',	'a',	's',	'q',	'a',	'b',	'g',	'v'),
Array('d',	'i',	'u',	'c',	'b',	's',	't',	'a',	'd',	'l',	'k',	'l',	'h',	'y',	'a',	's',	'p',	'i',	'l',	'e'),
Array('v',	'o',	'j',	'c',	'i',	's',	'h',	'j',	'g',	'o',	'd',	'y',	'o',	'o',	'm',	'g',	'o',	'l',	'd',	's'),
Array('w',	'r',	'i',	'l',	'k',	'd',	'b',	'g',	'l',	'a',	'y',	'i',	'r',	'i',	's',	't',	'g',	'x',	'g',	'm'),
Array('l',	't',	's',	'c',	'r',	'a',	'g',	'a',	'h',	'd',	'e',	's',	'd',	'q',	'b',	'a',	'h',	'w',	'd',	'o'),
Array('h',	'e',	'a',	'l',	't',	'i',	'r',	'n',	'o',	'f',	'u',	'y',	'e',	'a',	'l',	'w',	'y',	'e',	'h',	'm'),
Array('f',	'm',	'u',	's',	'h',	'r',	'o',	'o',	'm',	'e',	'h',	'a',	'p',	'p',	'i',	'n',	'd',	'r',	't',	'o'),
Array('l',	'h',	'f',	'h',	'p',	'y',	'o',	'n',	'u',	'k',	'a',	'c',	'o',	'l',	'a',	'o',	'r',	'e',	'b',	'v'),
Array('p',	'a',	'r',	'e',	'l',	'z',	'd',	'd',	'k',	'a',	'p',	'r',	'o',	't',	'o',	'm',	'a',	'n',	'p',	'l'),
Array('m',	'j',	'o',	'p',	'o',	'u',	'y',	'o',	'm',	'l',	'q',	'u',	'a',	'l',	'i',	'n',	'l',	'd',	'w',	'y'),
Array('w',	'a',	'p',	'a',	'n',	'y',	'r',	'r',	'r',	'j',	'y',	'o',	'a',	'h',	'z',	'n',	'i',	'x',	'e',	'm'),
Array('m',	'l',	's',	'r',	'i',	'w',	'h',	'f',	't',	'i',	'n',	'o',	'g',	'r',	'o',	'l',	's',	'e',	'y',	's'),
Array('l',	'y',	'l',	'd',	'n',	'i',	'k',	'u',	'o',	'y',	'd',	'l',	'u',	'o',	'w',	'u',	'k',	'd',	'e',	'o'),
Array('o',	'y',	'o',	'q',	'y',	'a',	'k',	'd',	'j',	'e',	'b',	'l',	'u',	'n',	'd',	'e',	'r',	's',	'c',	'u'));System.out.println("""puzzle  : Array[Array[Char]] = <lazy>""");$skip(99); 
// These values give the number of rows and columns of the puzzle
val puzrowlen = puzzle(0).length;System.out.println("""puzrowlen  : Int = """ + $show(puzrowlen ));$skip(30); 
val puzcollen = puzzle.length;System.out.println("""puzcollen  : Int = """ + $show(puzcollen ));$skip(340); 

//This is the list of words to find in the puzzle
var listofwords = List("health", "score", "zerg", "assassin", "reload", "pylon", "level", "bazooka", "blunderbuss", "killtacular", "heist", "duck", "halo", "mushroom", "horde", "ganondorf", "protoman", "hydralisk", "shepard", "nukacola", "plasmid", "wouldyoukindly", "metroid", "xinzhao");System.out.println("""listofwords  : List[java.lang.String] = """ + $show(listofwords ));$skip(536); 

def wordfinder(word: word, startind: startindex, endind: endindex, jincr: Int, iincr: Int, lengthcounter: Int, restriction: Boolean): List[(word, startindex, endindex)] = {
	var len = word.length
	val jindex = endind._1
	val iindex = endind._2
	if (lengthcounter==0) List((word, startind, (endind._1 - jincr, endind._2 - iincr)))
	else if (word(len - lengthcounter)== puzzle(jindex)(iindex) && restriction) wordfinder(word, startind, (endind._1 + jincr, endind._2 + iincr),  jincr, iincr, lengthcounter-1, restriction)
  else List()
};System.out.println("""wordfinder: (word: wordsearch.word, startind: (Int, Int), endind: (Int, Int), jincr: Int, iincr: Int, lengthcounter: Int, restriction: Boolean)List[(wordsearch.word, (Int, Int), (Int, Int))]""");$skip(512); 

//This function will be used to remove words from the listofwords once each one is found in order to prevent
//finding duplicates of words(such as metroid in this word search) or palindromes (such as level).
def removewords(wordlist: List[word], removelist: List[(word, startindex, endindex)]): List[word] = {
	if (removelist.isEmpty) wordlist
	else if (wordlist.contains(removelist.head._1)) removewords(wordlist.remove(_ == removelist.head._1), removelist.tail)
	else removewords(wordlist, removelist.tail)
};System.out.println("""removewords: (wordlist: List[wordsearch.word], removelist: List[(wordsearch.word, (Int, Int), (Int, Int))])List[wordsearch.word]""");$skip(423); 
//Now create a list of words found in each direction and update the wordlist to remove them.
lazy val rightwords = (for{ i <- 0 to puzrowlen - 1; j <- 0 to puzcollen - 1; word <- listofwords
      									if wordfinder(word, (j, i), (j, i), 0, 1, word.length, (i + word.length < puzrowlen)) != List()
      									}yield wordfinder(word, (j, i), (j, i), 0, 1, word.length, (i + word.length < puzrowlen))).toList.flatten;System.out.println("""rightwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = <lazy>""");$skip(51); 
listofwords = removewords(listofwords, rightwords);$skip(318); 

lazy val leftwords = (for{ i <- 0 to puzrowlen - 1; j <- 0 to puzcollen - 1; word <- listofwords
      									if wordfinder(word, (j, i), (j, i), 0, -1, word.length, (i - word.length >= 0)) != List()
      									}yield wordfinder(word, (j, i), (j, i), 0, -1, word.length, (i - word.length >= 0))).toList.flatten;System.out.println("""leftwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = <lazy>""");$skip(50); 
listofwords = removewords(listofwords, leftwords);$skip(331); 
      									
lazy val upwords = (for{ i <- 0 to puzrowlen - 1; j <- 0 to puzcollen - 1; word <- listofwords
      									if wordfinder(word, (j, i), (j, i), -1, 0, word.length, (j - word.length >= 0)) != List()
      									}yield wordfinder(word, (j, i), (j, i), -1, 0, word.length, (j - word.length >= 0))).toList.flatten;System.out.println("""upwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = <lazy>""");$skip(48); 
listofwords = removewords(listofwords, upwords);$skip(345); 
      									
lazy val downwords = (for{ i <- 0 to puzrowlen - 1; j <- 0 to puzcollen - 1; word <- listofwords
      									if wordfinder(word, (j, i), (j, i), 1, 0, word.length, (j + word.length < puzcollen)) != List()
      									}yield wordfinder(word, (j, i), (j, i), 1, 0, word.length, (j + word.length < puzcollen))).toList.flatten;System.out.println("""downwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = <lazy>""");$skip(50); 
listofwords = removewords(listofwords, downwords);$skip(397); 
      									
lazy val diagupleftwords = (for{ i <- 0 to puzrowlen - 1; j <- 0 to puzcollen - 1; word <- listofwords
      									if wordfinder(word, (j, i), (j, i), -1, -1, word.length, ((j - word.length >= 0) && (i - word.length >= 0))) != List()
      									}yield wordfinder(word, (j, i), (j, i), -1, -1, word.length, ((j - word.length >= 0) && (i - word.length >= 0)))).toList.flatten;System.out.println("""diagupleftwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = <lazy>""");$skip(56); 
listofwords = removewords(listofwords, diagupleftwords);$skip(410); 
      									
lazy	val diaguprightwords = (for{ i <- 0 to puzrowlen - 1; j <- 0 to puzcollen - 1; word <- listofwords
      									if wordfinder(word, (j, i), (j, i), -1, 1, word.length, ((j - word.length >= 0) && (i + word.length < puzrowlen))) != List()
      									}yield wordfinder(word, (j, i), (j, i), -1, 1, word.length, ((j - word.length >= 0) && (i + word.length < puzrowlen)))).toList.flatten;System.out.println("""diaguprightwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = <lazy>""");$skip(57); 
listofwords = removewords(listofwords, diaguprightwords);$skip(411); 
      									
lazy	val diagdownleftwords = (for{ i <- 0 to puzrowlen - 1; j <- 0 to puzcollen - 1; word <- listofwords
      									if wordfinder(word, (j, i), (j, i), 1, -1, word.length, ((j + word.length < puzcollen) && (i - word.length >= 0))) != List()
      									}yield wordfinder(word, (j, i), (j, i), 1, -1, word.length, ((j + word.length < puzcollen) && (i - word.length >= 0)))).toList.flatten;System.out.println("""diagdownleftwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = <lazy>""");$skip(58); 
listofwords = removewords(listofwords, diagdownleftwords);$skip(424); 
      									
lazy	val diagdownrightwords = (for{ i <- 0 to puzrowlen - 1; j <- 0 to puzcollen - 1; word <- listofwords
      									if wordfinder(word, (j, i), (j, i), 1, 1, word.length, ((j + word.length < puzcollen) && (i + word.length < puzrowlen))) != List()
      									}yield wordfinder(word, (j, i), (j, i), 1, 1, word.length, ((j + word.length < puzcollen) && (i + word.length < puzrowlen)))).toList.flatten;System.out.println("""diagdownrightwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = <lazy>""");$skip(895); 
      									
//***************************************************************************************************************************************************************************************************
//	NOTE: the following value of foundwords is probably a good enough solution for this problem, but I will create a new wordsearch below containing only the found words.
//***************************************************************************************************************************************************************************************************
//This is a list of each word in the puzzle with a starting column and row number of where the word begins and an ending column and row number of where the word ends
val foundwords = rightwords ++ leftwords ++ upwords ++ downwords ++ diagupleftwords ++ diaguprightwords ++ diagdownleftwords ++ diagdownrightwords;System.out.println("""foundwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = """ + $show(foundwords ));$skip(77); 
  

lazy val blankpuzzle = Array.fill(puzcollen){Array.fill(puzrowlen){' '}};System.out.println("""blankpuzzle  : Array[Array[Char]] = <lazy>""");$skip(362); 
def printwords(foundword: word, index: startindex, jincr: Int, iincr: Int, counter: Int, puzzle: Array[Array[Char]]): Array[Array[Char]] = {
	if (counter==0) puzzle
	else {
	val newindex  = (index._1 + jincr, index._2 + iincr)
	puzzle(index._1)(index._2)=foundword(foundword.length-counter)
	printwords(foundword, newindex, jincr, iincr, counter-1, puzzle)
	}
};System.out.println("""printwords: (foundword: wordsearch.word, index: (Int, Int), jincr: Int, iincr: Int, counter: Int, puzzle: Array[Array[Char]])Array[Array[Char]]""");$skip(429); 
def printallwords(wordlist: List[(word, startindex, endindex)], jincr: Int, iincr: Int, puzzle: Array[Array[Char]]): Array[Array[Char]] = {
 	if (wordlist.isEmpty) puzzle
 	else {
 		val word = wordlist.head._1
 	  val startind = wordlist.head._2
   	val endind = wordlist.head._3
   	val newpuzzle = printwords(word, startind, jincr, iincr, word.length, puzzle)
   	printallwords(wordlist.tail, jincr, iincr, newpuzzle)
    }
};System.out.println("""printallwords: (wordlist: List[(wordsearch.word, (Int, Int), (Int, Int))], jincr: Int, iincr: Int, puzzle: Array[Array[Char]])Array[Array[Char]]""");$skip(67); 
lazy val printright = printallwords(rightwords, 0, 1, blankpuzzle);System.out.println("""printright  : Array[Array[Char]] = <lazy>""");$skip(65); 
lazy val printleft = printallwords(leftwords, 0, -1, printright);System.out.println("""printleft  : Array[Array[Char]] = <lazy>""");$skip(60); 
lazy val printup = printallwords(upwords, -1, 0, printleft);System.out.println("""printup  : Array[Array[Char]] = <lazy>""");$skip(61); 
lazy val printdown = printallwords(downwords, 1, 0, printup);System.out.println("""printdown  : Array[Array[Char]] = <lazy>""");$skip(77); 
lazy val printdiagupleft = printallwords(diagupleftwords, -1, -1, printdown);System.out.println("""printdiagupleft  : Array[Array[Char]] = <lazy>""");$skip(84); 
lazy val printdiagupright = printallwords(diaguprightwords, -1, 1, printdiagupleft);System.out.println("""printdiagupright  : Array[Array[Char]] = <lazy>""");$skip(87); 
lazy val printdiagdownleft = printallwords(diagdownleftwords, 1, -1, printdiagupright);System.out.println("""printdiagdownleft  : Array[Array[Char]] = <lazy>""");$skip(79); 
lazy val solution = printallwords(diagdownrightwords, 1, 1, printdiagdownleft);System.out.println("""solution  : Array[Array[Char]] = <lazy>""");$skip(16); val res$0 = 
solution.length;System.out.println("""res0: Int = """ + $show(res$0));$skip(19); val res$1 = 
solution(1).length;System.out.println("""res1: Int = """ + $show(res$1));$skip(248); val res$2 = 

//Note: you may need to increase the amound of characters the worksheet will output in
//the Window->Preferences->Scala Worksheet options in order for this to display correctly.
for{i <- 0 to solution.length - 1
}yield println(solution(i).toList);System.out.println("""res2: scala.collection.immutable.IndexedSeq[Unit] = """ + $show(res$2))}
}