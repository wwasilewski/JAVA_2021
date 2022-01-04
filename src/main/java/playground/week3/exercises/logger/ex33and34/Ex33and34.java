package playground.week3.exercises.logger.ex33and34;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class Ex33and34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        log.info("starting logger");
        System.out.println("provide a name: ");
        log.info(sc.nextLine());
        log.info("closing logger");
        log.debug("debug test");
        log.error("error test");
    }
}
