package b1;

import android.content.ComponentName;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0522a {

    /* renamed from: a, reason: collision with root package name */
    public static final ComponentName f9049a;

    /* renamed from: b, reason: collision with root package name */
    public static final ComponentName f9050b;

    static {
        ComponentName unflattenFromString = ComponentName.unflattenFromString("com.buzbuz.smartautoclicker/.SmartAutoClickerService");
        if (unflattenFromString != null) {
            f9049a = unflattenFromString;
            ComponentName unflattenFromString2 = ComponentName.unflattenFromString("com.buzbuz.smartautoclicker/.scenarios.ScenarioActivity");
            if (unflattenFromString2 != null) {
                f9050b = unflattenFromString2;
                return;
            }
            throw new IllegalStateException("Invalid component name for scenarioActivity");
        }
        throw new IllegalStateException("Invalid component name for smartAutoClickerService");
    }
}
