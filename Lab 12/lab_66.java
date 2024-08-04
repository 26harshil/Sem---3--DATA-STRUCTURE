
        public void insertAtKthNode(int idx) {
            if (first == null) {
                System.out.println("linkedlist is empty");
                return;
            }


            Node temp = first;

            Node temp2 = first;

            for (int i = 0; i != idx; i++) {
                temp = temp.link;
            }
            for (int i = 0; i != size - idx - 1; i++) {
                temp2 = temp2.link;

            }
            int val = temp.data;

            temp.data = temp2.data;
            temp2.data = val;

           

        }
    }
