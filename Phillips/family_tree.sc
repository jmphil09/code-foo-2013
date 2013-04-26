object family_tree {
  //Create a tree structure where each node has a name associated with it, as well as a list of children. The list of children is a list of nodes.
//In this tree, a Fork will have a list of children, and a Node will be an only child.
  abstract class FTree
  case class Fork(childlist: List[FTree], name: String) extends FTree
  case class Node(name: String) extends FTree
  
  //This function compares whether two names or generations are the same.
  def compare(name1: String, gen1: Int, name2: String, gen2: Int): List[String] = {
    if ((name1==name2) || (gen1==gen2)) List(name2)
    else List()
  }                                               //> compare: (name1: String, gen1: Int, name2: String, gen2: Int)List[String]
  //Helper function for the findmatches function. This function recursively calls the findmatches function on each child in a list of children.
  def findhelper(name: String, comparegen: Int, gen: Int, flist: List[FTree]): List[String] = {
  	if (flist.isEmpty) List()
  	else findmatches(name, comparegen, gen, flist.head) ++ findhelper(name, comparegen, gen, flist.tail)
  }                                               //> findhelper: (name: String, comparegen: Int, gen: Int, flist: List[family_tr
                                                  //| ee.FTree])List[String]
  //This function finds name and generation matches in a tree.
  def findmatches(name: String, comparegen: Int, gen: Int, tree: FTree): List[String] = tree match{
    case Node(nodename) => compare(name, comparegen, nodename, gen)
    case Fork(children, forkname) => compare(name, comparegen, forkname, gen) ++ findhelper(name, comparegen, gen+1, children)
  }                                               //> findmatches: (name: String, comparegen: Int, gen: Int, tree: family_tree.FT
                                                  //| ree)List[String]
  //This is the main function
  def treeMatch(name: String, generation: Int, familytree: FTree): List[String] = {
  	findmatches(name, generation, 1, familytree)
  }                                               //> treeMatch: (name: String, generation: Int, familytree: family_tree.FTree)Li
                                                  //| st[String]
  
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
  val kramer = new Node("Kramer")                 //> kramer  : family_tree.Node = Node(Kramer)
  val george = new Node("George")                 //> george  : family_tree.Node = Node(George)
  val homer = new Node("Homer")                   //> homer  : family_tree.Node = Node(Homer)
  val bart = new Node("Bart")                     //> bart  : family_tree.Node = Node(Bart)
  val joe = new Node("Joe")                       //> joe  : family_tree.Node = Node(Joe)
  val jerry = new Fork(List(homer, bart), "Jerry")//> jerry  : family_tree.Fork = Fork(List(Node(Homer), Node(Bart)),Jerry)
  val elaine = new Fork(List(joe), "Elaine")      //> elaine  : family_tree.Fork = Fork(List(Node(Joe)),Elaine)
  val seinfeldtree = new Fork(List(kramer, jerry, elaine, george), "Larry")
                                                  //> seinfeldtree  : family_tree.Fork = Fork(List(Node(Kramer), Fork(List(Node(H
                                                  //| omer), Node(Bart)),Jerry), Fork(List(Node(Joe)),Elaine), Node(George)),Larr
                                                  //| y)
  
 assert(treeMatch("Joe", 1, seinfeldtree)==List("Larry", "Joe"))
 assert(treeMatch("Bart", 2, seinfeldtree)==List("Kramer", "Jerry", "Bart", "Elaine", "George"))
 assert(treeMatch("James", 14, seinfeldtree)==List())
 assert(treeMatch("James", 2, seinfeldtree)==List("Kramer", "Jerry", "Elaine", "George"))
}