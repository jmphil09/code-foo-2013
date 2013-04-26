object highscore_sort {
  type Score = Float
  type Name = String
  type highscore = (Score, Name);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(954); 

  def selectionSort(scorelist: List[highscore]): List[highscore] = {
    //Helper function to find the minimum element of the list
    def findmin(list: List[highscore], minscore: highscore): highscore = {
      if (list.isEmpty) minscore
      else if (list.head._1 < minscore._1) findmin(list.tail, list.head)
      else findmin(list.tail, minscore)
    }
    //Helper function which recursively calls the selectionSort algorithm on the tail of the list to be sorted.
    def selectionhelper(scorelisthelp: List[highscore], resultlist: List[highscore]): List[highscore] = {
      if (scorelisthelp.isEmpty) resultlist
      else {
        selectionhelper(scorelisthelp -- List(findmin(scorelisthelp.tail, scorelisthelp.head)), List(findmin(scorelisthelp.tail, scorelisthelp.head)) ++ resultlist)
      }
    }
    selectionhelper(scorelist, List())
  };System.out.println("""selectionSort: (scorelist: List[(highscore_sort.Score, highscore_sort.Name)])List[(highscore_sort.Score, highscore_sort.Name)]""");$skip(972); 



/* I used a selection sort algorithm.
 *
 * This algorithm scales on the order of n^2. More precisely it scales as O(n^2) for runtime and linear for memory.
 *
 *
 * Yes, time and space complexity can be reduced for this problem using one of the many search algorithms available.
 * For a problem like this, I would write an algorithm using a built-in sorting method such as:
 *
 * def sortingAlgorithm(scorelist: List[highscore]): List[highscore] = scorelist.sortBy(_._1).reverse
 *
 * If necessary, I would implement a method that operates on nLog(n) time, but I do not think it is necessary for this particular
 * problem because I would assume that most high score lists contain less than one million entries. If this algorithm was to be
 * implemented into an MMORPG such as WoW which could have tens of millions of entries, it might be necessary to optimize this algorithm further.
 */

  
  
  
  
  
  
  
  
  //TESTS
  val score1 = new highscore(100, "Joey");System.out.println("""score1  : (highscore_sort.Score, highscore_sort.Name) = """ + $show(score1 ));$skip(43); 
  val score2 = new highscore(200, "Homer");System.out.println("""score2  : (highscore_sort.Score, highscore_sort.Name) = """ + $show(score2 ));$skip(41); 
  val score3 = new highscore(50, "Bart");System.out.println("""score3  : (highscore_sort.Score, highscore_sort.Name) = """ + $show(score3 ));$skip(43); 
  val score4 = new highscore(100, "James");System.out.println("""score4  : (highscore_sort.Score, highscore_sort.Name) = """ + $show(score4 ));$skip(42); 
  val score5 = new highscore(150, "Bart");System.out.println("""score5  : (highscore_sort.Score, highscore_sort.Name) = """ + $show(score5 ));$skip(65); 
  
  val testlist = List(score1, score2, score3, score4, score5);System.out.println("""testlist  : List[(Float, java.lang.String)] = """ + $show(testlist ));$skip(104); 
  
  def sortingAlgorithm(scorelist: List[highscore]): List[highscore] = scorelist.sortBy(_._1).reverse;System.out.println("""sortingAlgorithm: (scorelist: List[(highscore_sort.Score, highscore_sort.Name)])List[(highscore_sort.Score, highscore_sort.Name)]""");$skip(40); 
  assert(selectionSort(List())==List());$skip(52); 
  assert(selectionSort(List(score1))==List(score1));$skip(80); 
  assert(selectionSort(testlist)==List(score2, score5, score4, score1, score3));$skip(64); 
  assert(selectionSort(testlist) == sortingAlgorithm(testlist))}
}