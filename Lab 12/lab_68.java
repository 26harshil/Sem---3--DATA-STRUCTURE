
        public void swapclose() {
            // f1 for odd number
            //f2 for the even number
            //swap is main that is the output

            Linked Swap = new Linked();
            Linked f1 = new Linked();
            Linked f2 = new Linked();

            //cheack if this is possible or not

            if (first == null || first.link == null || first.link.link == null)
                return;


            int i = 1;
            Node temp = first;
            while (temp != null) {
                if (i % 2 == 0)
                    //insert into f1
                    f1.insertAtLast(temp.data);
                else
                    //insert into f2
                    f2.insertAtLast(temp.data);
                i++;
                temp = temp.link;
            }
            Node flag = first;
            int j = 0;
            Node tt = f1.first;
            Node ss = f2.first;
            while (flag != null) {
                if (j % 2 == 0) {
                    Swap.insertAtLast(tt.data);
                    tt = tt.link;
                } else {
                    Swap.insertAtLast(ss.data);
                    ss = ss.link;
                }
                j++;
                //if oneof the link will be empty then it will break
                if (tt == null && ss == null) {
                    break;
                }
            }
            System.out.println("it is here");
            Swap.display();


        }
==============================================================================================================================================================
   public void swapAdjacentNodes() {
            if (first == null || first.link == null) {
                // Not enough nodes to swap
                return;
            }

            Node prev = null;
            Node curr = first;

            // Update the head if the first pair is swapped
            first = curr.link;

            while (curr != null && curr.link != null) {
                Node next = curr.link.link; // The next pair of nodes

                // Nodes wanted to swapped
                Node fNode = curr;
                Node sNode = curr.link;


                sNode.link = fNode;
                fNode.link = next;

                // Connect the previous node to the second node if it's not the first pair
                if (prev != null) {
                    prev.link = sNode;
                }

                // Update pointers for the next node  pair
                prev = fNode;
                curr = next;
            }
        }
