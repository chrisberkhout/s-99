// P01 (*) Find the last element of a list.
//     Example:
//     scala> last(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 8

object P01 {

  def last[A](l: List[A]): A = l.last

  def recursiveLast[A](l: List[A]): A = l match {
    case Nil => throw new java.util.NoSuchElementException()
    case h :: Nil => h
    case h :: t => recursiveLast(t)
  }

  def betterRecursiveLast[A](l: List[A]): Option[A] = l match {
    case Nil => None
    case h :: Nil => Some(h)
    case h :: t => betterRecursiveLast(t)
  }

}
