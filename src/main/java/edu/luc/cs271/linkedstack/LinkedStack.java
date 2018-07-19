package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;
  private List<E> dataList;
  private int size = 0;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // TODO
    top = new Node<>(obj, top);
    return obj;
  }

  @Override
  public E peek() {
    // TODO
    if(isEmpty()) {
      throw new NoSuchElementException();
    }
    else {
      return top.data;
    }
  }

  @Override
  public E pop() {
    // TODO
    if(isEmpty()) {
      throw new NoSuchElementException();
    }
    else {
      E temp = top.data;
      top = top.next;

      return temp;
    }
  }

  @Override
  public boolean isEmpty() {
    // TODO
    if(top == null) {
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public List<E> asList() {
    final ArrayList<E> result = new ArrayList<>(size);
    populateList(top, result); // TODO replace null with the right reference
    return result;
  }

  private void populateList(final Node<E> curr, final List<E> result) {
    // TODO recursively populate the list in the desired order
    Node<E> temp = top;

    if ( top == null) {
      return;
    }
    else {
      result.add(top.data);
      top = top.next;
      size++;
      populateList(top, result);
    }
    top = temp;
  }

  @Override
  public List<E> asFifoList() {
    final ArrayList<E> result = new ArrayList<>(size);
    populateFifoList(top, result); // TODO replace null with the right reference
    return result;
  }

  private void populateFifoList(final Node<E> curr, final List<E> result) {
    // TODO recursively populate the list in the desired order
    Node<E> temp = top;

    if ( top == null) {
      return;
    }
    else {
      result.add(0, top.data);
      top = top.next;
      size++;
      populateFifoList(top, result);
    }
    top = temp;
  }
}
