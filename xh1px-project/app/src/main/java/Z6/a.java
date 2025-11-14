package Z6;

import a6.x;
import java.util.LinkedHashMap;
import t7.C1594d;

/* loaded from: classes.dex */
public enum a {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);


    /* renamed from: e, reason: collision with root package name */
    public static final C1594d f7509e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final LinkedHashMap f7510f;

    /* renamed from: d, reason: collision with root package name */
    public final int f7516d;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t7.d] */
    static {
        a[] values = values();
        int N02 = x.N0(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(N02 < 16 ? 16 : N02);
        for (a aVar : values) {
            linkedHashMap.put(Integer.valueOf(aVar.f7516d), aVar);
        }
        f7510f = linkedHashMap;
    }

    a(int i4) {
        this.f7516d = i4;
    }
}
