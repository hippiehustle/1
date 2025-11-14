package L7;

/* loaded from: classes.dex */
public final class J implements U {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3179d;

    public J(boolean z8) {
        this.f3179d = z8;
    }

    @Override // L7.U
    public final boolean a() {
        return this.f3179d;
    }

    @Override // L7.U
    public final f0 d() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f3179d) {
            str = "Active";
        } else {
            str = "New";
        }
        return A.j.q(sb, str, '}');
    }
}
