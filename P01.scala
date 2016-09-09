// P01 (*) Find the last element of a list.
//     Example:
//     scala> last(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 8

object P01 {

  def last[A](l: List[A]): A = l.last

  def recursiveLast[A](l: List[A]): A = l match {
    case h :: Nil => h
    case _ :: t => recursiveLast(t)
    case _ => throw new NoSuchElementException
  }

  def betterRecursiveLast[A](l: List[A]): Option[A] = l match {
    case h :: Nil => Some(h)
    case _ :: t => betterRecursiveLast(t)
    case _ => None
  }

}
