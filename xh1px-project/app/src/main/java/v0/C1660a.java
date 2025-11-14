package v0;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import t0.C1536c;
import x5.i;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1660a {

    /* renamed from: c, reason: collision with root package name */
    public static final i f15482c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f15483d = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f15484a;

    /* renamed from: b, reason: collision with root package name */
    public final C1536c f15485b;

    public C1660a(String str, boolean z8) {
        ReentrantLock reentrantLock;
        C1536c c1536c;
        synchronized (f15482c) {
            try {
                LinkedHashMap linkedHashMap = f15483d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15484a = reentrantLock;
        if (z8) {
            c1536c = new C1536c(str);
        } else {
            c1536c = null;
        }
        this.f15485b = c1536c;
    }
}
