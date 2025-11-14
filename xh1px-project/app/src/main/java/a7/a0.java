package a7;

import g7.AbstractC0793b;
import g7.AbstractC0801j;
import g7.AbstractC0802k;
import g7.C0797f;
import g7.C0799h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes.dex */
public final class a0 extends AbstractC0802k {

    /* renamed from: g, reason: collision with root package name */
    public int f8001g;

    /* renamed from: h, reason: collision with root package name */
    public int f8002h;

    /* renamed from: i, reason: collision with root package name */
    public int f8003i;
    public T j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public T f8004l;

    /* renamed from: m, reason: collision with root package name */
    public int f8005m;

    /* renamed from: n, reason: collision with root package name */
    public List f8006n;

    /* renamed from: o, reason: collision with root package name */
    public C0444e f8007o;

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.k, a7.a0] */
    public static a0 h() {
        ?? abstractC0802k = new AbstractC0802k();
        T t8 = T.f7932w;
        abstractC0802k.j = t8;
        abstractC0802k.f8004l = t8;
        abstractC0802k.f8006n = Collections.EMPTY_LIST;
        abstractC0802k.f8007o = C0444e.f8057s;
        return abstractC0802k;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        b0 g8 = g();
        if (g8.b()) {
            return g8;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        a0 h8 = h();
        h8.i(g());
        return h8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        b0 b0Var = null;
        try {
            try {
                b0.f8013r.getClass();
                i(new b0(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                b0 b0Var2 = (b0) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    b0Var = b0Var2;
                    if (b0Var != null) {
                        i(b0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (b0Var != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        i((b0) oVar);
        return this;
    }

    public final b0 g() {
        b0 b0Var = new b0(this);
        int i4 = this.f8001g;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        b0Var.f8016g = this.f8002h;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        b0Var.f8017h = this.f8003i;
        if ((i4 & 4) == 4) {
            i8 |= 4;
        }
        b0Var.f8018i = this.j;
        if ((i4 & 8) == 8) {
            i8 |= 8;
        }
        b0Var.j = this.k;
        if ((i4 & 16) == 16) {
            i8 |= 16;
        }
        b0Var.k = this.f8004l;
        if ((i4 & 32) == 32) {
            i8 |= 32;
        }
        b0Var.f8019l = this.f8005m;
        if ((i4 & 64) == 64) {
            this.f8006n = Collections.unmodifiableList(this.f8006n);
            this.f8001g &= -65;
        }
        b0Var.f8020m = this.f8006n;
        if ((i4 & 128) == 128) {
            i8 |= 64;
        }
        b0Var.f8021n = this.f8007o;
        b0Var.f8015f = i8;
        return b0Var;
    }

    public final void i(b0 b0Var) {
        C0444e c0444e;
        T t8;
        T t9;
        if (b0Var == b0.f8012q) {
            return;
        }
        int i4 = b0Var.f8015f;
        if ((i4 & 1) == 1) {
            int i8 = b0Var.f8016g;
            this.f8001g = 1 | this.f8001g;
            this.f8002h = i8;
        }
        if ((i4 & 2) == 2) {
            int i9 = b0Var.f8017h;
            this.f8001g = 2 | this.f8001g;
            this.f8003i = i9;
        }
        if ((i4 & 4) == 4) {
            T t10 = b0Var.f8018i;
            if ((this.f8001g & 4) == 4 && (t9 = this.j) != T.f7932w) {
                S r8 = T.r(t9);
                r8.i(t10);
                this.j = r8.g();
            } else {
                this.j = t10;
            }
            this.f8001g |= 4;
        }
        int i10 = b0Var.f8015f;
        if ((i10 & 8) == 8) {
            int i11 = b0Var.j;
            this.f8001g = 8 | this.f8001g;
            this.k = i11;
        }
        if ((i10 & 16) == 16) {
            T t11 = b0Var.k;
            if ((this.f8001g & 16) == 16 && (t8 = this.f8004l) != T.f7932w) {
                S r9 = T.r(t8);
                r9.i(t11);
                this.f8004l = r9.g();
            } else {
                this.f8004l = t11;
            }
            this.f8001g |= 16;
        }
        if ((b0Var.f8015f & 32) == 32) {
            int i12 = b0Var.f8019l;
            this.f8001g = 32 | this.f8001g;
            this.f8005m = i12;
        }
        if (!b0Var.f8020m.isEmpty()) {
            if (this.f8006n.isEmpty()) {
                this.f8006n = b0Var.f8020m;
                this.f8001g &= -65;
            } else {
                if ((this.f8001g & 64) != 64) {
                    this.f8006n = new ArrayList(this.f8006n);
                    this.f8001g |= 64;
                }
                this.f8006n.addAll(b0Var.f8020m);
            }
        }
        if ((b0Var.f8015f & 64) == 64) {
            C0444e c0444e2 = b0Var.f8021n;
            if ((this.f8001g & 128) == 128 && (c0444e = this.f8007o) != C0444e.f8057s) {
                C0442c j = C0444e.j(c0444e);
                j.h(c0444e2);
                this.f8007o = j.f();
            } else {
                this.f8007o = c0444e2;
            }
            this.f8001g |= 128;
        }
        f(b0Var);
        this.f11240d = this.f11240d.h(b0Var.f8014e);
    }
}
