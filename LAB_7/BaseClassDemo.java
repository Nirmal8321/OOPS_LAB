// LAB_7 Q5 - Base class; all project classes inherit from it (same debug interface)
class BaseClass {
    void debug() {
        System.out.println("Debug: " + getClass().getSimpleName());
    }
}

class ModuleA extends BaseClass { }
class ModuleB extends BaseClass { }
class ModuleC extends BaseClass { }

public class BaseClassDemo {
    public static void main(String[] args) {
        BaseClass[] all = { new ModuleA(), new ModuleB(), new ModuleC() };
        for (BaseClass obj : all)
            obj.debug();
    }
}
