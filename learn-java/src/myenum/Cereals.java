package myenum;

public enum Cereals {
    CAPTAIN_CRUNCH(10),
    FROOT_LOOPS(20),
    REESES_PUFFS(30),
    COCOA_PUFFS(40);
    final int levelOfDeliciousness;

    Cereals(int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }
}
