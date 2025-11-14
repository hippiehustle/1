package A6;

import t7.C1594d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* JADX INFO: Fake field, exist only in values array */
    d EF5;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d[] f398e = {new Enum("Function", 0), new Enum("SuspendFunction", 1), new Enum("KFunction", 2), new Enum("KSuspendFunction", 3), new Enum("UNKNOWN", 4)};

    /* renamed from: d, reason: collision with root package name */
    public static final C1594d f397d = new Object();

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f398e.clone();
    }
}
