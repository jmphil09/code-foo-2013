object family_tree {
  //Create a tree structure where each node has a name associated with it, as well as a list of children. The list of children is a list of nodes.
//In this tree, a Fork will have a list of children, and a Node will be an only child.
  abstract class FTree
  case class Fork(childlist: List[FTree], name: String) extends FTree
  case class Node(name: String) extends FTree;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(626); 
  
  //This function compares whether two names or generations are the same.
  def compare(name1: String, gen1: Int, name2: String, gen2: Int): List[String] = {
    if ((name1==name2) || (gen1==gen2)) List(name2)
    else List()
  };System.out.println("""compare: (name1: String, gen1: Int, name2: String, gen2: Int)List[String]""");$skip(377); 
  //Helper function for the findmatches function. This function recursively calls the findmatches function on each child in a list of children.
  def findhelper(name: String, comparegen: Int, gen: Int, flist: List[FTree]): List[String] = {
  	if (flist.isEmpty) List()
  	else findmatches(name, comparegen, gen, flist.head) ++ findhelper(name, comparegen, gen, flist.tail)
  };System.out.println("""findhelper: (name: String, comparegen: Int, gen: Int, flist: List[family_tree.FTree])List[String]""");$skip(362); 
  //This function finds name and generation matches in a tree.
  def findmatches(name: String, comparegen: Int, gen: Int, tree: FTree): List[String] = tree match{
    case Node(nodename) => compare(name, comparegen, nodename, gen)
    case Fork(children, forkname) => compare(name, comparegen, forkname, gen) ++ findhelper(name, comparegen, gen+1, children)
  };System.out.println("""findmatches: (name: String, comparegen: Int, gen: Int, tree: family_tree.FTree)List[String]""");$skip(166); 
  //This is the main function
  def treeMatch(name: String, generation: Int, familytree: FTree): List[String] = {
  	findmatches(name, generation, 1, familytree)
  };System.out.println("""treeMatch: (name: String, generation: Int, familytree: family_tree.FTree)List[String]""");$skip(782); 
  
/*
	As for the scaling of this algorithm, because it compares the names and the generations for each node in the tree,
	this is equivalent to searching through a linked list and will scale on the order of n.
	If we only needed to search the names OR the generations, it would be easier to get close to O(logn) by requiring that the tree be balanced.
*/
     
     

  
/* The following tree will be tested
									   Larry
									 /|      |\
									/ |      | \
								 /  |      |  \
								/   |      |   \
               /    |      |    \
              /     |      |     \
         Kramer  Jerry  Elaine   George
                / \        |
               /   \       |
              /     \      |
            Homer   Bart  Joe
*/
  val kramer = new Node("Kramer");System.out.println("""kramer  : family_tree.Node = """ + $show(kramer ));$skip(34); 
  val george = new Node("George");System.out.println("""george  : family_tree.Node = """ + $show(george ));$skip(32); 
  val homer = new Node("Homer");System.out.println("""homer  : family_tree.Node = """ + $show(homer ));$skip(30); 
  val bart = new Node("Bart");System.out.println("""bart  : family_tree.Node = """ + $show(bart ));$skip(28); 
  val joe = new Node("Joe");System.out.println("""joe  : family_tree.Node = """ + $show(joe ));$skip(51); 
  val jerry = new Fork(List(homer, bart), "Jerry");System.out.println("""jerry  : family_tree.Fork = """ + $show(jerry ));$skip(45); 
  val elaine = new Fork(List(joe), "Elaine");System.out.println("""elaine  : family_tree.Fork = """ + $show(elaine ));$skip(76); 
  val seinfeldtree = new Fork(List(kramer, jerry, elaine, george), "Larry");System.out.println("""seinfeldtree  : family_tree.Fork = """ + $show(seinfeldtree ));$skip(68); 
  
 assert(treeMatch("Joe", 1, seinfeldtree)==List("Larry", "Joe"));$skip(97); 
 assert(treeMatch("Bart", 2, seinfeldtree)==List("Kramer", "Jerry", "Bart", "Elaine", "George"));$skip(54); 
 assert(treeMatch("James", 14, seinfeldtree)==List());$skip(90); 
 assert(treeMatch("James", 2, seinfeldtree)==List("Kramer", "Jerry", "Elaine", "George"))}
}