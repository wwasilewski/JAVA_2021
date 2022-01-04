package playground.week3.exercises.logger.ex35;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ex35 {
    public static void main(String[] args) {
        log.trace("trace log");
        log.debug("debug log");
        log.info("info log");
        log.warn("warn log");
        log.error("error log");
    }
}
