package org.example;

import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cmd, quote, author;

        System.out.println("== 명언 앱 ==");

        int lastId = 0;

        while (true) {
            System.out.printf("명령) ");
            cmd = sc.nextLine().trim();

        if (cmd.equals("종료")) {
            break;
        }
        else if(cmd.equals("등록")){
            System.out.printf("명언 : ");
            quote = sc.nextLine().trim();
            System.out.printf("작가 : ");
            author = sc.nextLine().trim();
            int id = ++lastId;
            System.out.println(id + "번 명언이 등록되었습니다.");

        }

     }
    }

}
