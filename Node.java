class Node {
  public char letter;
  public int frequency;
  public Node child1, child2;

  public Node(char l, int f) {
    letter = l;
    frequency = f;
  }

  public Node(char l, Node c1, Node c2) {
    letter = l;
    frequency = c1.frequency + c2.frequency;
    child1 = c1;
    child2 = c2;
  }

  public void newChild1(Node n) {
    child1 = n;
  }    

  public void newChild2(Node n) {
    child2 = n;
  }    

  public String toString() {
    String c1="";
    String c2="";
    if (child1 != null) {
      c1 = child1.toString();
    }
    if (child2 != null) {
      c2 = child1.toString();
    }
    return letter + "\n" + c1 + " " + c2;
  }

  public void lookFor(char c) {
    if (letter == c) {
      NodeSearch.found = true;
    }
    if (!NodeSearch.found) {
      if (child1 != null) {
         child1.lookFor(c);
         if (NodeSearch.found) {
           NodeSearch.result = NodeSearch.result + "0";
           return;
         }
      }
      if (child2 != null) {
         child2.lookFor(c);
         if (NodeSearch.found) {
           NodeSearch.result = NodeSearch.result + "1";
           return;
         }
      }
    }
  }

  public void toChar(String s) {
    if (NodeSearch.charAt == s.length()) {
      NodeSearch.result = "" + letter;
      NodeSearch.found = true;
    } else {
    if (s.charAt(NodeSearch.charAt) == '0') {
      NodeSearch.charAt++;
      child1.toChar(s);
    } else {
      NodeSearch.charAt++;
      child2.toChar(s);
    }
    }
  }

}
