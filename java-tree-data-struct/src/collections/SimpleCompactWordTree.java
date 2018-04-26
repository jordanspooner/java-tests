package collections;

import collections.exceptions.InvalidWordException;
import java.util.ArrayList;
import java.util.List;

public class SimpleCompactWordTree implements CompactWordsSet {

  private char c;
  private SimpleCompactWordTree[] children = new SimpleCompactWordTree[26];
  private int wordCount = 0;
  private boolean isAWord = false;

  public SimpleCompactWordTree() {
    this('.'); // Root node
  }

  public SimpleCompactWordTree(char c) {
    this.c = c;
  }

  @Override
  public boolean add(String word) throws InvalidWordException {
    CompactWordsSet.checkIfWordIsValid(word);
    char charToAdd = word.charAt(0);
    int charIndex  = charToAdd - 'a';
    if (children[charIndex] == null) {
      children[charIndex] = new SimpleCompactWordTree(charToAdd);
    }
    if (word.length() == 1) {
      if (!children[charIndex].isAWord) {
        children[charIndex].isAWord = true;
        wordCount++;
        return true;
      }
      return false;
    }
    boolean wordAdded = children[charIndex].add(word.substring(1));
    if (wordAdded) {
      wordCount ++;
    }
    return wordAdded;
  }

  @Override
  public boolean remove(String word) throws InvalidWordException {
    CompactWordsSet.checkIfWordIsValid(word);
    char charToRemove = word.charAt(0);
    int charIndex = charToRemove - 'a';
    if (children[charIndex] == null) {
      return false;
    }
    if (word.length() == 1) {
      if (children[charIndex].isAWord) {
        children[charIndex].isAWord = false;
        wordCount--;
        return true;
      }
      return false;
    }
    boolean wordRemoved = children[charIndex].remove(word.substring(1));
    if (wordRemoved) {
      wordCount--;
    }
    return wordRemoved;
  }

  @Override
  public boolean contains(String word) throws InvalidWordException {
    CompactWordsSet.checkIfWordIsValid(word);
    char charToCheck = word.charAt(0);
    int charIndex = charToCheck - 'a';
    if (children[charIndex] == null) {
      return false;
    } else if (word.length() == 1) {
      return true;
    }
    return children[charIndex].contains(word.substring(1));
  }

  @Override
  public int size() {
    return wordCount;
  }

  @Override
  public List<String> uniqueWordsInAlphabeticOrder() {
    List<String> res = new ArrayList<>();
    for (SimpleCompactWordTree child : children) {
      if (child != null) {
        wordBuilder(child, "", res);
      }
    }
    return res;
  }

  private List<String> wordBuilder(SimpleCompactWordTree tree, String s, List<String> acc) {
    s += tree.c;
    if (tree.isAWord) {
      acc.add(s);
    }
    for (SimpleCompactWordTree child : tree.children) {
      if (child != null) {
        wordBuilder(child, s, acc);
      }
    }
    return acc;
  }
}
