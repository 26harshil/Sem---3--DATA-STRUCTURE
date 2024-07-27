 public Linked copyOfLinkedList() {
        Linked newLinked = new Linked();
        if (first == null) {
            return newLinked;
        }
        Node temp = first;
        while (temp != null) {
            newLinked.insertAtLast(temp.data);
            temp = temp.link;
        }
        return newLinked;
    }
