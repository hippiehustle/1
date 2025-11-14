package Y5;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f7199c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile c f7200a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f7201b;

    /* JADX WARN: Type inference failed for: r0v1, types: [Y5.a, Y5.c, java.lang.Object] */
    public static c a(c cVar) {
        if (cVar instanceof a) {
            return cVar;
        }
        ?? obj = new Object();
        obj.f7201b = f7199c;
        obj.f7200a = cVar;
        return obj;
    }

    @Override // Y5.c
    public final Object get() {
        Object obj;
        Object obj2 = this.f7201b;
        Object obj3 = f7199c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.f7201b;
                if (obj == obj3) {
                    obj = this.f7200a.get();
                    Object obj4 = this.f7201b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f7201b = obj;
                    this.f7200a = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
