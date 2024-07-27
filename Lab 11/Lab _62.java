public Node  duplicate() {
            Node temp = first;
            if (temp==null){
                System.out.println("underflow ");
            }else {

                Node temp1 = first;

                while (temp!=null){

                    Node temp2 = first.link;

                    while (temp2 !=null){

                        if(temp1.data ==  temp2.data){

                            
                        }
                        temp2 = temp2.link;
                    }
                    temp1= temp1.link;
                }
            }
