package zad1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import zad1.SuffixTree.Node;
import static zad1.SuffixTree.buildSuffixTree;

public class zad1 {

    
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Ścieżka pliku:");
        z1(s.nextLine().replace("\"", ""));
    }

    public static void z1(String path) throws IOException {
        List<String> stringList;
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            stringList = lines.collect(Collectors.toList());
        }
        
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        for (String s : stringList) {
            sb.append(s + ".");
        }
        sb.deleteCharAt(sb.lastIndexOf("."));
        sb.append("$");
        String chain = sb.toString();
        Node tree = buildSuffixTree(chain);
        int cnt = 0;
        for (String s : stringList) {
            if (search(tree, s, 0, chain)) {
                cnt++;
                System.out.println(s + ": znalezione");
            } else {
                System.out.println(s + ": nie znalezione");
            }
        }
    }

    public static boolean search(Node tree, String substr, int index, String chain) {
        if (index >= substr.length()) {
            boolean notNull = false;
            for (Node n : tree.children) {
                if (n != null) {
                    notNull = true;
                }
            }
            return notNull;
        }
        boolean found = false;
        for (Node n : tree.children) {
            if (n == null || index == substr.length()) {
                continue;
            }
            if (chain.charAt(n.begin) == substr.charAt(index)) {
                int keyLength = n.end - n.begin;
                found = search(n, substr, index + keyLength, chain);
            }
        }
        return found;
    }

}
