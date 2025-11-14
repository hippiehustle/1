package c0;

import d0.C0592a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int f9403a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final v f9404b;

    /* renamed from: c, reason: collision with root package name */
    public v f9405c;

    /* renamed from: d, reason: collision with root package name */
    public v f9406d;

    /* renamed from: e, reason: collision with root package name */
    public int f9407e;

    /* renamed from: f, reason: collision with root package name */
    public int f9408f;

    public s(v vVar) {
        this.f9404b = vVar;
        this.f9405c = vVar;
    }

    public final void a() {
        this.f9403a = 1;
        this.f9405c = this.f9404b;
        this.f9408f = 0;
    }

    public final boolean b() {
        C0592a b4 = this.f9405c.f9419b.b();
        int b9 = b4.b(6);
        if ((b9 != 0 && ((ByteBuffer) b4.f4206g).get(b9 + b4.f4203d) != 0) || this.f9407e == 65039) {
            return true;
        }
        return false;
    }
}
