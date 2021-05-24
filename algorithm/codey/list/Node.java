package cs.algorithm.codey.list;

public class Node {

  public String data;
  private Node next;
  private Node previous;

  public Node(String data) {
    this.data = data;
    this.next = null;
  }

  public void setNextNode(Node node) {
    this.next = node;
  }

  public Node getNextNode() {
    return this.next;
  }

  public void setPreviousNode(Node node) {
    this.previous = node;
  }

  public Node getPreviousNode() {
    return this.previous;
  }

  public static void main(String[] args) {
    Node strawberry = new Node("Berry Tasty");
    Node banana =  new Node("Banana-rama");
    Node coconut = new Node("Nuts for Coconut");

    strawberry.setNextNode(banana);
    banana.setNextNode(coconut);
    Node currentNode = strawberry;
    while(currentNode != null){
      System.out.println(currentNode.data);
      currentNode = currentNode.getNextNode();
    }
  }

}