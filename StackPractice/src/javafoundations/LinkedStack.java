//********************************************************************
//  LinkedStack.java       Java Foundations
//
//  Represents a linked implementation of a stack.
//********************************************************************

package javafoundations;

public class LinkedStack<T> implements Stack<T>
{
   private int count;
   private LinearNode<T> top;

   //-----------------------------------------------------------------
   //  Creates an empty stack using the default capacity.
   //-----------------------------------------------------------------
   public LinkedStack()
   {
      count = 0;
      top = null;
   }
 //-----------------------------------------------------------------
   //  Removes the element at the top of this stack and returns a
   //  reference to it. Throws an EmptyCollectionException if the
   //  stack contains no elements.
   //-----------------------------------------------------------------
   public T pop()
   {
      if (count == 0)
		try {
			throw new EmptyCollectionException ();
		} catch (EmptyCollectionException e) {
			
			e.printStackTrace();
		}

      T result = top.getElement();
      top = top.getNext();
      count--;

      return result;
   }
// Returns a string representation of this stack.
  //-----------------------------------------------------------------
  public String toString()
  {
     String result = "<top of stack>\n";
     LinearNode current = top;

     while (current != null)
     {
        result += current.getElement() + "\n";
        current = current.getNext();
     }

     return result + "<bottom of stack>";
  }

public void push(T element)
{
	
}

public T peek() 
{
	return null;
}

public boolean isEmpty() 
{
	return false;
}

public int size()
{
	return 0;
}

  //-----------------------------------------------------------------
  //  The following methods are left as Programming Projects.
  //-----------------------------------------------------------------
  // public void push () { }
  // public T peek () throws EmptyCollectionException { }
  // public boolean isEmpty() { }
  // public int size() { }
}

