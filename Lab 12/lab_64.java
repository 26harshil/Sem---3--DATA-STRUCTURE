

        public void reverse(Linked l1) {
            Linked l2 = l1;
            Stack<Integer> s = new Stack<>();
            if (first == null) {
                System.out.println("the linkedlist i empty");
                return;
            }
            if (first.link == null) {
                System.out.println(first.data + "one element only");
                return;
            }
            Node temp = first;

            while (temp != null) {
                s.push(temp.data);
                temp = temp.link;
            }
            Node flag = first;
            while (flag != null) {
                flag.data = s.pop();
                flag = flag.link;
            }


        }
