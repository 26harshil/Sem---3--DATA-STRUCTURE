public void sort(Linked l1) {
            Linked s = l1;
            Stack<Integer> s1 = new Stack<>();
            if (first == null) {
                System.out.println("the linkedlist is empty");
                return;
            } else if (first.link == null) {
                System.out.println(first.data + "there is only one element");
                return;
            }
            Node temp = first;
            int a[] = new int[size];
            int i = 0;

            while (temp != null) {
                a[i] = temp.data;
                i++;
                temp = temp.link;

            }

            Arrays.sort(a);

            int j = 0;
            Node flag = first;
            while (j < size && flag != null) {
                s1.push(a[j]);
                flag.data = s1.pop();
                flag = flag.link;
                j++;

            }


        }
