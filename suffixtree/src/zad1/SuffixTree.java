package zad1;


public class SuffixTree {

    static final String ALPHABET = "abc.$";

    public static class Node {

        int begin;
        int end;
        int depth;
        Node parent;
        Node[] children;
        Node suffixLink;
        
        Node(int begin, int end, int depth, Node parent) {
            this.begin = begin;
            this.end = end;
            this.parent = parent;
            this.depth = depth;
            children = new Node[ALPHABET.length()];
        }
    }

    public static Node buildSuffixTree(CharSequence s) {
        int n = s.length();
        byte[] a = new byte[n];
        for (int i = 0; i < n; i++) {
            a[i] = (byte) ALPHABET.indexOf(s.charAt(i));
        }
        Node root = new Node(0, 0, 0, null);
        Node node = root;
        for (int i = 0, tail = 0; i < n; i++, tail++) {
            Node last = null;
            while (tail >= 0) {
                Node ch = node.children[a[i - tail]];
                while (ch != null && tail >= ch.end - ch.begin) {
                    tail -= ch.end - ch.begin;
                    node = ch;
                    ch = ch.children[a[i - tail]];
                }
                if (ch == null) {
                    node.children[a[i]] = new Node(i, n, node.depth + node.end - node.begin, node);
                    if (last != null) {
                        last.suffixLink = node;
                    }
                    last = null;
                } else {
                    byte t = a[ch.begin + tail];
                    
                    if (t == a[i]) {
                        if (last != null) {
                            last.suffixLink = node;
                        }
                        break;
                    } else {
                        Node splitNode = new Node(ch.begin, ch.begin + tail, node.depth + node.end - node.begin, node);
                        splitNode.children[a[i]] = new Node(i, n, ch.depth + tail, splitNode);
                        splitNode.children[t] = ch;
                        ch.begin += tail;
                        ch.depth += tail;
                        ch.parent = splitNode;
                        
                        node.children[a[i - tail]] = splitNode;
                        if (last != null) {
                            last.suffixLink = splitNode;
                        }
                        last = splitNode;
                    }
                }
                if (node == root) {
                    --tail;
                } else {
                    node = node.suffixLink;
                }
            }
        }
        return root;
    }

    private static void print(CharSequence s, int i, int j) {
        for (int k = i; k < j; k++) {
            System.out.print(s.charAt(k));
        }
    }

    public static void printTree ( Node n , CharSequence s , int spaces ) {
        int i ;
        for ( i = 0 ; i < spaces ; i++)
            System.out.print(" ");
            print(s, n.begin, n.end);
            System.out.println(" " + ( n.depth + n.end - n.begin ));
        for (Node child : n.children)
            if ( child != null )
                printTree ( child , s , spaces + 4 ) ;
}

}
