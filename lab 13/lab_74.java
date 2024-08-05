 public void twohalves() {
        if (first == null || first == last) {
            System.out.println("the linkedlist is empty");
            return;
        }
        Linkeof list1 = new Linkeof();
        Linkeof list2 = new Linkeof();
        Node temp = first;
        for (int i = 1; i < Math.ceil(size / 2.0); i++) {
            list1.insertAtLast(temp.data);
            System.out.print(temp.data+"_");
            temp = temp.link;

        }
        System.out.println();
        while (temp != first) {
            list2.insertAtLast(temp.data);

            System.out.print(temp.data+"_");

            temp = temp.link;
        }
        list2.insertAtLast(temp.data);
        System.out.println("first half is this ===");
        list1.display();
        System.out.println("Seond half is this ===");
        list2.display();
    }
}
