class NumMenu extends Exception {
    NumMenu (final int comm) {
        super("Нет такого пункта меню!");
    }
    NumMenu () {
        super("Нет такого пункта меню!");
    }
    NumMenu (final String e) {
        System.out.println("Нет такого пункта меню!");
    }
}