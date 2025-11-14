package b8;

import a6.C0433h;
import androidx.datastore.preferences.protobuf.C0471g;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public Object f9255a;

    /* renamed from: b, reason: collision with root package name */
    public int f9256b;

    public c(int i4) {
        switch (i4) {
            case 1:
                this.f9255a = new C0433h();
                return;
            default:
                this.f9255a = new C0433h();
                return;
        }
    }

    public abstract void a(int i4);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i4);

    public abstract int e(int i4);

    public abstract boolean f();

    public abstract C0471g g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i4);

    public void y() {
        int u8;
        do {
            u8 = u();
            if (u8 != 0) {
                int i4 = this.f9256b;
                if (i4 < 100) {
                    this.f9256b = i4 + 1;
                    this.f9256b--;
                } else {
                    throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
            } else {
                return;
            }
        } while (x(u8));
    }
}
