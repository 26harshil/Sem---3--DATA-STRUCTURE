//    73. WAP to delete alternate nodes of a doubly linked list
    public void deletealternate() {
        if (head == null) {
            System.out.println("the linked list i empty");
            return;
        } else if (head.rptr == null) {
            System.out.println("there is only one node so we can't delete it");
            return;
        }
        Node temp = head;
        while (temp != null && temp.rptr != null) {
            Node temp2 = temp.rptr;
            temp.rptr = temp2.rptr;
   
            //TO CHECK THAT THE THE NEXT NODES RPTR IS NOT NULL 
            if(temp2.rptr !=null){

                temp2.rptr.lptr = temp;
            }

            temp2.lptr = null;

            temp2.rptr = null;

             temp = temp.rptr;
        }
        display();
    }
