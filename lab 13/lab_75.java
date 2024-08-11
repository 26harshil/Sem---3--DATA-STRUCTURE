//. Write a program to simulate music player application using suitable data
//structure. There is no estimation about number of music files to be managed by
//the music player. Your program should support all the basic music player
//operations to play and manage the playlist.
import java.util.Scanner;

public class music {

    class Dbl {
        Node head = null;
        Node tail = null;
        Node current = null;
        int count = 0;

        class Node {
            String songTitle;
            Node lptr;
            Node rptr;

            public Node(String songTitle) {
                this.songTitle = songTitle;
                this.lptr = null;
                this.rptr = null;
            }
        }

        public void insertSong(String songTitle, int idx) {
            if (idx < 0 || idx > count) {
                System.out.println("INVALID INDEX NUMBER");
                return;
            }

            Node newNode = new Node(songTitle);

            if (idx == 0) {
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                    current = newNode;
                } else {
                    newNode.rptr = head;
                    head.lptr = newNode;
                    head = newNode;
                }
            } else if (idx == count) {
                if (tail == null) {
                    head = newNode;
                    tail = newNode;
                    current = newNode;
                } else {
                    tail.rptr = newNode;
                    newNode.lptr = tail;
                    tail = newNode;
                }
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.rptr;
                }

                newNode.rptr = temp.rptr;
                newNode.lptr = temp;
                if (temp.rptr != null) {
                    temp.rptr.lptr = newNode;
                }
                temp.rptr = newNode;
            }
            count++;
        }

        public void deleteAtAnyIndex(int idx) {
            if (idx < 0 || idx >= count) {
                System.out.println("INVALID INDEX NUMBER");
                return;
            }

            if (idx == 0) {
                if (head == tail) {
                    head = null;
                    tail = null;
                    current = null;
                } else {
                    if (current == head) {
                        current = head.rptr;
                    }
                    head = head.rptr;
                    head.lptr = null;
                }
                count--;
                return;
            }

            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.rptr;
            }

            if (temp.lptr != null)
                temp.lptr.rptr = temp.rptr;

            if (temp.rptr != null)
                temp.rptr.lptr = temp.lptr;

            if (temp == tail)
                tail = temp.lptr;


            if (current == temp) {
                if(temp.rptr != null)
                    current=temp.rptr ;
                else
                    current=  temp.lptr;
            }

            count--;
        }

        public void nextSong() {
            if (current == null) {
                System.out.println("There is no song to play.");
                return;
            }

            if (current.rptr != null) {
                current = current.rptr;
            } else {
                current = head;
            }

            System.out.println("Now playing: " + current.songTitle);
        }

        public void previousSong() {
            if (current == null) {
                System.out.println("There is no song to play.");
                return;
            }

            if (current.lptr != null) {
                current = current.lptr;
            } else {
                current = tail;
            }

            System.out.println("Now playing: " + current.songTitle);
        }

        public void display() {
            if (head == null) {
                System.out.println("Playlist is empty.");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.songTitle + " -> ");
                temp = temp.rptr;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        music m = new music();
        Dbl playlist = m.new Dbl();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMusic Player Menu:");
            System.out.println("1. Add a song to the playlist");
            System.out.println("2. Delete a song from the playlist");
            System.out.println("3. Play next song");
            System.out.println("4. Play previous song");
            System.out.println("5. Display playlist");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the song title: ");
                    String songTitle = scanner.nextLine();
                    System.out.print("Enter the position to insert the song: ");
                    int position = scanner.nextInt();
                    playlist.insertSong(songTitle, position);
                    break;
                case 2:
                    System.out.print("Enter the position of the song to delete: ");
                    int deletePosition = scanner.nextInt();
                    playlist.deleteAtAnyIndex(deletePosition);
                    break;
                case 3:
                    playlist.nextSong();
                    break;
                case 4:
                    playlist.previousSong();
                    break;
                case 5:
                    playlist.display();
                    break;
                case 6:
                    System.out.println("Exiting music player...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
