public class PainList <E> {
    private Node<E> firstNode;
    private Node<E> lastNode;


    private boolean isFirstInitialization = true;


    public void addLast(E item){
        if (isFirstInitialization){
            firstInitial(item);
            return;
        }
        Node<E>newLastNode = new Node<>();
        newLastNode.item = item;
        newLastNode.previousNode = this.lastNode;
        this.lastNode.nextNode = newLastNode;
        this.lastNode = newLastNode;
    }


    public void addFirst(E item){
        if (isFirstInitialization){
            firstInitial(item);
            return;
        }
        Node<E>newFirstNode = new Node<>();
        newFirstNode.item = item;
        newFirstNode.nextNode = this.firstNode;
        this.firstNode.previousNode = newFirstNode;
        this.firstNode = newFirstNode;
    }


    public E removeLast(){
        if (this.lastNode == null) return null;
        Node<E> node = this.lastNode;
        if (this.lastNode == this.firstNode) {
            this.lastNode = this.firstNode = null;
            isFirstInitialization = true;
        }
        this.lastNode = this.lastNode.previousNode;
        this.lastNode.nextNode = null;
        return node.item;
    }


    public E removeFirst(){
        if(this.firstNode == null) return null;
        Node<E> node = this.firstNode;
        if(this.lastNode == this.firstNode){
            this.lastNode = this.firstNode = null;
            isFirstInitialization = true;
        }
        this.firstNode = this.firstNode.nextNode;
        this.firstNode.previousNode = null;
        return node.item;
    }

    public E getFirst(){
        if (this.firstNode == null) return null;
        return this.firstNode.item;
    }

    public E getLast(){
        if (this.lastNode == null) return null;
        return this.lastNode.item;
    }

    private void firstInitial(E item){
        if(firstNode == null || lastNode == null){
            firstNode = lastNode = new Node<>();
            lastNode.item = item;
            isFirstInitialization = false;
        }
    }


    private class Node<E>{
        public Node previousNode;
        public Node nextNode;
        public E item;
    }
}

