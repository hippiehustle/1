package F0;

import Z5.n;
import Z5.v;
import android.content.Context;

/* loaded from: classes.dex */
public final class h implements E0.b {

    /* renamed from: d, reason: collision with root package name */
    public final Context f1279d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1280e;

    /* renamed from: f, reason: collision with root package name */
    public final M.i f1281f;

    /* renamed from: g, reason: collision with root package name */
    public final n f1282g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1283h;

    public h(Context context, String str, M.i iVar) {
        o6.j.e(context, "context");
        o6.j.e(iVar, "callback");
        this.f1279d = context;
        this.f1280e = str;
        this.f1281f = iVar;
        this.f1282g = new n(new B0.e(1, this));
    }

    @Override // E0.b
    public final E0.a J() {
        return ((g) this.f1282g.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1282g.f7492e != v.f7503a) {
            ((g) this.f1282g.getValue()).close();
        }
    }

    @Override // E0.b
    public final String getDatabaseName() {
        return this.f1280e;
    }

    @Override // E0.b
    public final void setWriteAheadLoggingEnabled(boolean z8) {
        if (this.f1282g.f7492e != v.f7503a) {
            ((g) this.f1282g.getValue()).setWriteAheadLoggingEnabled(z8);
        }
        this.f1283h = z8;
    }
}
