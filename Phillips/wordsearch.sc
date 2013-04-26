object wordsearch {
  //Some helpful types to use in functions: word represents a word, startindex represents the column and row number
  // of where the words starts, and endindex does the same for where a word ends.
  type word = String
  type startindex = (Int,Int)
  type endindex = (Int,Int)

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
Array('o',	'y',	'o',	'q',	'y',	'a',	'k',	'd',	'j',	'e',	'b',	'l',	'u',	'n',	'd',	'e',	'r',	's',	'c',	'u'))
                                                  //> puzzle  : Array[Array[Char]] = <lazy>
// These values give the number of rows and columns of the puzzle
val puzrowlen = puzzle(0).length                  //> puzrowlen  : Int = 20
val puzcollen = puzzle.length                     //> puzcollen  : Int = 25

//This is the list of words to find in the puzzle
var listofwords = List("health", "score", "zerg", "assassin", "reload", "pylon", "level", "bazooka", "blunderbuss", "killtacular", "heist", "duck", "halo", "mushroom", "horde", "ganondorf", "protoman", "hydralisk", "shepard", "nukacola", "plasmid", "wouldyoukindly", "metroid", "xinzhao")
                                                  //> listofwords  : List[java.lang.String] = List(health, score, zerg, assassin,
                                                  //|  reload, pylon, level, bazooka, blunderbuss, killtacular, heist, duck, halo
                                                  //| , mushroom, horde, ganondorf, protoman, hydralisk, shepard, nukacola, plasm
                                                  //| id, wouldyoukindly, metroid, xinzhao)

def wordfinder(word: word, startind: startindex, endind: endindex, jincr: Int, iincr: Int, lengthcounter: Int, restriction: Boolean): List[(word, startindex, endindex)] = {
	var len = word.length
	val jindex = endind._1
	val iindex = endind._2
	if (lengthcounter==0) List((word, startind, (endind._1 - jincr, endind._2 - iincr)))
	else if (word(len - lengthcounter)== puzzle(jindex)(iindex) && restriction) wordfinder(word, startind, (endind._1 + jincr, endind._2 + iincr),  jincr, iincr, lengthcounter-1, restriction)
  else List()
}                                                 //> wordfinder: (word: wordsearch.word, startind: (Int, Int), endind: (Int, Int
                                                  //| ), jincr: Int, iincr: Int, lengthcounter: Int, restriction: Boolean)List[(w
                                                  //| ordsearch.word, (Int, Int), (Int, Int))]

//This function will be used to remove words from the listofwords once each one is found in order to prevent
//finding duplicates of words(such as metroid in this word search) or palindromes (such as level).
def removewords(wordlist: List[word], removelist: List[(word, startindex, endindex)]): List[word] = {
	if (removelist.isEmpty) wordlist
	else if (wordlist.contains(removelist.head._1)) removewords(wordlist.remove(_ == removelist.head._1), removelist.tail)
	else removewords(wordlist, removelist.tail)
}                                                 //> removewords: (wordlist: List[wordsearch.word], removelist: List[(wordsearch
                                                  //| .word, (Int, Int), (Int, Int))])List[wordsearch.word]
//Now create a list of words found in each direction and update the wordlist to remove them.
lazy val rightwords = (for{ i <- 0 to puzrowlen - 1; j <- 0 to puzcollen - 1; word <- listofwords
      									if wordfinder(word, (j, i), (j, i), 0, 1, word.length, (i + word.length < puzrowlen)) != List()
      									}yield wordfinder(word, (j, i), (j, i), 0, 1, word.length, (i + word.length < puzrowlen))).toList.flatten
                                                  //> rightwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = <lazy>
listofwords = removewords(listofwords, rightwords)

lazy val leftwords = (for{ i <- 0 to puzrowlen - 1; j <- 0 to puzcollen - 1; word <- listofwords
      									if wordfinder(word, (j, i), (j, i), 0, -1, word.length, (i - word.length >= 0)) != List()
      									}yield wordfinder(word, (j, i), (j, i), 0, -1, word.length, (i - word.length >= 0))).toList.flatten
                                                  //> leftwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = <lazy>
listofwords = removewords(listofwords, leftwords)
      									
lazy val upwords = (for{ i <- 0 to puzrowlen - 1; j <- 0 to puzcollen - 1; word <- listofwords
      									if wordfinder(word, (j, i), (j, i), -1, 0, word.length, (j - word.length >= 0)) != List()
      									}yield wordfinder(word, (j, i), (j, i), -1, 0, word.length, (j - word.length >= 0))).toList.flatten
                                                  //> upwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = <lazy>
listofwords = removewords(listofwords, upwords)
      									
lazy val downwords = (for{ i <- 0 to puzrowlen - 1; j <- 0 to puzcollen - 1; word <- listofwords
      									if wordfinder(word, (j, i), (j, i), 1, 0, word.length, (j + word.length < puzcollen)) != List()
      									}yield wordfinder(word, (j, i), (j, i), 1, 0, word.length, (j + word.length < puzcollen))).toList.flatten
                                                  //> downwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = <lazy>
listofwords = removewords(listofwords, downwords)
      									
lazy val diagupleftwords = (for{ i <- 0 to puzrowlen - 1; j <- 0 to puzcollen - 1; word <- listofwords
      									if wordfinder(word, (j, i), (j, i), -1, -1, word.length, ((j - word.length >= 0) && (i - word.length >= 0))) != List()
      									}yield wordfinder(word, (j, i), (j, i), -1, -1, word.length, ((j - word.length >= 0) && (i - word.length >= 0)))).toList.flatten
                                                  //> diagupleftwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = <lazy>
                                                  //| 
listofwords = removewords(listofwords, diagupleftwords)
      									
lazy	val diaguprightwords = (for{ i <- 0 to puzrowlen - 1; j <- 0 to puzcollen - 1; word <- listofwords
      									if wordfinder(word, (j, i), (j, i), -1, 1, word.length, ((j - word.length >= 0) && (i + word.length < puzrowlen))) != List()
      									}yield wordfinder(word, (j, i), (j, i), -1, 1, word.length, ((j - word.length >= 0) && (i + word.length < puzrowlen)))).toList.flatten
                                                  //> diaguprightwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = <lazy
                                                  //| >
listofwords = removewords(listofwords, diaguprightwords)
      									
lazy	val diagdownleftwords = (for{ i <- 0 to puzrowlen - 1; j <- 0 to puzcollen - 1; word <- listofwords
      									if wordfinder(word, (j, i), (j, i), 1, -1, word.length, ((j + word.length < puzcollen) && (i - word.length >= 0))) != List()
      									}yield wordfinder(word, (j, i), (j, i), 1, -1, word.length, ((j + word.length < puzcollen) && (i - word.length >= 0)))).toList.flatten
                                                  //> diagdownleftwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = <laz
                                                  //| y>
listofwords = removewords(listofwords, diagdownleftwords)
      									
lazy	val diagdownrightwords = (for{ i <- 0 to puzrowlen - 1; j <- 0 to puzcollen - 1; word <- listofwords
      									if wordfinder(word, (j, i), (j, i), 1, 1, word.length, ((j + word.length < puzcollen) && (i + word.length < puzrowlen))) != List()
      									}yield wordfinder(word, (j, i), (j, i), 1, 1, word.length, ((j + word.length < puzcollen) && (i + word.length < puzrowlen)))).toList.flatten
                                                  //> diagdownrightwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = <la
                                                  //| zy>
      									
//***************************************************************************************************************************************************************************************************
//	NOTE: the following value of foundwords is probably a good enough solution for this problem, but I will create a new wordsearch below containing only the found words.
//***************************************************************************************************************************************************************************************************
//This is a list of each word in the puzzle with a starting column and row number of where the word begins and an ending column and row number of where the word ends
val foundwords = rightwords ++ leftwords ++ upwords ++ downwords ++ diagupleftwords ++ diaguprightwords ++ diagdownleftwords ++ diagdownrightwords
                                                  //> foundwords  : List[(wordsearch.word, (Int, Int), (Int, Int))] = List((mushr
                                                  //| oom,(17,1),(17,8)), (health,(0,5),(0,10)), (killtacular,(6,6),(6,16)), (nuk
                                                  //| acola,(18,7),(18,14)), (bazooka,(3,10),(3,16)), (protoman,(19,10),(19,17)),
                                                  //|  (level,(10,13),(10,17)), (pylon,(4,7),(4,3)), (wouldyoukindly,(23,14),(23,
                                                  //| 1)), (xinzhao,(21,17),(21,11)), (halo,(1,19),(1,16)), (heist,(6,1),(2,1)), 
                                                  //| (metroid,(17,1),(11,1)), (shepard,(17,3),(23,3)), (blunderbuss,(3,5),(13,5)
                                                  //| ), (ganondorf,(14,7),(22,7)), (reload,(10,9),(15,9)), (assassin,(3,11),(10,
                                                  //| 11)), (horde,(12,12),(16,12)), (hydralisk,(15,16),(23,16)), (score,(4,17),(
                                                  //| 8,17)), (plasmid,(9,18),(15,12)), (duck,(11,1),(14,4)), (zerg,(8,7),(11,10)
                                                  //| ))
  

lazy val blankpuzzle = Array.fill(puzcollen){Array.fill(puzrowlen){' '}}
                                                  //> blankpuzzle  : Array[Array[Char]] = <lazy>
def printwords(foundword: word, index: startindex, jincr: Int, iincr: Int, counter: Int, puzzle: Array[Array[Char]]): Array[Array[Char]] = {
	if (counter==0) puzzle
	else {
	val newindex  = (index._1 + jincr, index._2 + iincr)
	puzzle(index._1)(index._2)=foundword(foundword.length-counter)
	printwords(foundword, newindex, jincr, iincr, counter-1, puzzle)
	}
}                                                 //> printwords: (foundword: wordsearch.word, index: (Int, Int), jincr: Int, iin
                                                  //| cr: Int, counter: Int, puzzle: Array[Array[Char]])Array[Array[Char]]
def printallwords(wordlist: List[(word, startindex, endindex)], jincr: Int, iincr: Int, puzzle: Array[Array[Char]]): Array[Array[Char]] = {
 	if (wordlist.isEmpty) puzzle
 	else {
 		val word = wordlist.head._1
 	  val startind = wordlist.head._2
   	val endind = wordlist.head._3
   	val newpuzzle = printwords(word, startind, jincr, iincr, word.length, puzzle)
   	printallwords(wordlist.tail, jincr, iincr, newpuzzle)
    }
}                                                 //> printallwords: (wordlist: List[(wordsearch.word, (Int, Int), (Int, Int))], 
                                                  //| jincr: Int, iincr: Int, puzzle: Array[Array[Char]])Array[Array[Char]]
lazy val printright = printallwords(rightwords, 0, 1, blankpuzzle)
                                                  //> printright  : Array[Array[Char]] = <lazy>
lazy val printleft = printallwords(leftwords, 0, -1, printright)
                                                  //> printleft  : Array[Array[Char]] = <lazy>
lazy val printup = printallwords(upwords, -1, 0, printleft)
                                                  //> printup  : Array[Array[Char]] = <lazy>
lazy val printdown = printallwords(downwords, 1, 0, printup)
                                                  //> printdown  : Array[Array[Char]] = <lazy>
lazy val printdiagupleft = printallwords(diagupleftwords, -1, -1, printdown)
                                                  //> printdiagupleft  : Array[Array[Char]] = <lazy>
lazy val printdiagupright = printallwords(diaguprightwords, -1, 1, printdiagupleft)
                                                  //> printdiagupright  : Array[Array[Char]] = <lazy>
lazy val printdiagdownleft = printallwords(diagdownleftwords, 1, -1, printdiagupright)
                                                  //> printdiagdownleft  : Array[Array[Char]] = <lazy>
lazy val solution = printallwords(diagdownrightwords, 1, 1, printdiagdownleft)
                                                  //> solution  : Array[Array[Char]] = <lazy>
solution.length                                   //> res0: Int = 25
solution(1).length                                //> res1: Int = 20

//Note: you may need to increase the amound of characters the worksheet will output in
//the Window->Preferences->Scala Worksheet options in order for this to display correctly.
for{i <- 0 to solution.length - 1
}yield println(solution(i).toList)                //> List( ,  ,  ,  ,  , h, e, a, l, t, h,  ,  ,  ,  ,  ,  ,  ,  ,  )
                                                  //| List( ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  , o, l, a, h)
                                                  //| List( , t,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  )
                                                  //| List( , s,  ,  ,  , b,  ,  ,  ,  , b, a, z, o, o, k, a,  ,  ,  )
                                                  //| List( , i,  , n, o, l, y, p,  ,  ,  , s,  ,  ,  ,  ,  , s,  ,  )
                                                  //| List( , e,  ,  ,  , u,  ,  ,  ,  ,  , s,  ,  ,  ,  ,  , c,  ,  )
                                                  //| List( , h,  ,  ,  , n, k, i, l, l, t, a, c, u, l, a, r, o,  ,  )
                                                  //| List( ,  ,  ,  ,  , d,  ,  ,  ,  ,  , s,  ,  ,  ,  ,  , r,  ,  )
                                                  //| List( ,  ,  ,  ,  , e,  , z,  ,  ,  , s,  ,  ,  ,  ,  , e,  ,  )
                                                  //| List( ,  ,  ,  ,  , r,  ,  , e,  ,  , i,  ,  ,  ,  ,  ,  , p,  )
                                                  //| List( ,  ,  ,  ,  , b,  ,  ,  , r,  , n,  , l, e, v, e, l,  ,  )
                                                  //| List( , d,  ,  ,  , u,  ,  ,  , e, g,  ,  ,  ,  ,  , a,  ,  ,  )
                                                  //| List( , i, u,  ,  , s,  ,  ,  , l,  ,  , h,  ,  , s,  ,  ,  ,  )
                                                  //| List( , o,  , c,  , s,  ,  ,  , o,  ,  , o,  , m,  ,  ,  ,  ,  )
                                                  //| List( , r,  ,  , k,  ,  , g,  , a,  ,  , r, i,  ,  ,  ,  ,  ,  )
                                                  //| List( , t,  ,  ,  ,  ,  , a,  , d,  ,  , d,  ,  ,  , h,  ,  ,  )
                                                  //| List( , e,  ,  ,  ,  ,  , n,  ,  ,  ,  , e,  ,  ,  , y,  ,  ,  )
                                                  //| List( , m, u, s, h, r, o, o, m,  ,  ,  ,  ,  ,  ,  , d,  ,  ,  )
                                                  //| List( ,  ,  , h,  ,  ,  , n, u, k, a, c, o, l, a,  , r,  ,  ,  )
                                                  //| List( ,  ,  , e,  ,  ,  , d,  ,  , p, r, o, t, o, m, a, n,  ,  )
                                                  //| List( ,  ,  , p,  ,  ,  , o,  ,  ,  ,  ,  ,  ,  ,  , l,  ,  ,  )
                                                  //| List( ,  ,  , a,  ,  ,  , r,  ,  ,  , o, a, h, z, n, i, x,  ,  )
                                                  //| List( ,  ,  , r,  ,  ,  , f,  ,  ,  ,  ,  ,  ,  ,  , s,  ,  ,  )
                                                  //| List( , y, l, d, n, i, k, u, o, y, d, l, u, o, w,  , k,  ,  ,  )
                                                  //| List( ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  )
                                                  //| res2: scala.collection.immutable.IndexedSeq[Unit] = Vector((), (), (), (),
                                                  //|  (), (), (), (), (), (), (), (), (), (), (), (), (), (), (), (), (), (), (
                                                  //| ), (), ())
}