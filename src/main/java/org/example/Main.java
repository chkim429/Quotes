package org.example;

import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cmd, quote, author;

        System.out.println("== 명언 앱 ==");

        int lastId = 0;
        List<WiseSaying> WiseSayings = new ArrayList<>();

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
            int id = lastId + 1;

            WiseSaying wiseSaying = new WiseSaying(id, quote, author);
            WiseSayings.add(wiseSaying);
            System.out.println(id + "번 명언이 등록되었습니다.");
            lastId = id;
        }
        else if(cmd.equals("목록")){
            System.out.println("번호 / 작가 / 명언");
            System.out.println("----------------------------");
            for ( int i = WiseSayings.size() - 1; i >=0; i--){
                WiseSaying wiseSaying = WiseSayings.get(i);
                System.out.printf("%d / %s / %s\n", wiseSaying.id, wiseSaying.author, wiseSaying.quote);
            }
        }

     }
    }

}
class WiseSaying{
    int id;
    String quote;
    String author;

    public WiseSaying(int id, String quote, String author) {
        this.id = id;
        this.quote = quote;
        this.author = author;
    }
}