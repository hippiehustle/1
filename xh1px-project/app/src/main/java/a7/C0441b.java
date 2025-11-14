package a7;

import g7.AbstractC0793b;
import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.C0797f;
import g7.C0799h;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: a7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0441b extends AbstractC0801j implements g7.u {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8008e;

    /* renamed from: f, reason: collision with root package name */
    public int f8009f;

    /* renamed from: g, reason: collision with root package name */
    public int f8010g;

    /* renamed from: h, reason: collision with root package name */
    public Object f8011h;

    public /* synthetic */ C0441b(int i4) {
        this.f8008e = i4;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        switch (this.f8008e) {
            case 0:
                C0445f f8 = f();
                if (f8.b()) {
                    return f8;
                }
                throw new UninitializedMessageException();
            default:
                C0451l g8 = g();
                if (g8.b()) {
                    return g8;
                }
                throw new UninitializedMessageException();
        }
    }

    public final Object clone() {
        switch (this.f8008e) {
            case 0:
                C0441b c0441b = new C0441b(0);
                c0441b.f8011h = C0444e.f8057s;
                c0441b.h(f());
                return c0441b;
            default:
                C0441b c0441b2 = new C0441b(1);
                c0441b2.f8011h = AbstractC0796e.f11223d;
                c0441b2.i(g());
                return c0441b2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        switch (this.f8008e) {
            case 0:
                C0445f c0445f = null;
                try {
                    try {
                        C0445f.k.getClass();
                        h(new C0445f(c0797f, c0799h));
                        return this;
                    } catch (InvalidProtocolBufferException e9) {
                        C0445f c0445f2 = (C0445f) e9.f12155d;
                        try {
                            throw e9;
                        } catch (Throwable th) {
                            th = th;
                            c0445f = c0445f2;
                            if (c0445f != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (c0445f != null) {
                        h(c0445f);
                    }
                    throw th;
                }
            default:
                C0451l c0451l = null;
                try {
                    try {
                        C0451l.k.getClass();
                        i(new C0451l(c0797f));
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        C0451l c0451l2 = (C0451l) e10.f12155d;
                        try {
                            throw e10;
                        } catch (Throwable th3) {
                            th = th3;
                            c0451l = c0451l2;
                            if (c0451l != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (c0451l != null) {
                        i(c0451l);
                    }
                    throw th;
                }
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        switch (this.f8008e) {
            case 0:
                h((C0445f) oVar);
                return this;
            default:
                i((C0451l) oVar);
                return this;
        }
    }

    public C0445f f() {
        C0445f c0445f = new C0445f(this);
        int i4 = this.f8009f;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        c0445f.f8079f = this.f8010g;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        c0445f.f8080g = (C0444e) this.f8011h;
        c0445f.f8078e = i8;
        return c0445f;
    }

    public C0451l g() {
        C0451l c0451l = new C0451l(this);
        int i4 = this.f8009f;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        c0451l.f8179f = this.f8010g;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        c0451l.f8180g = (g7.t) this.f8011h;
        c0451l.f8178e = i8;
        return c0451l;
    }

    public void h(C0445f c0445f) {
        C0444e c0444e;
        if (c0445f == C0445f.j) {
            return;
        }
        int i4 = c0445f.f8078e;
        if ((i4 & 1) == 1) {
            int i8 = c0445f.f8079f;
            this.f8009f = 1 | this.f8009f;
            this.f8010g = i8;
        }
        if ((i4 & 2) == 2) {
            C0444e c0444e2 = c0445f.f8080g;
            if ((this.f8009f & 2) == 2 && (c0444e = (C0444e) this.f8011h) != C0444e.f8057s) {
                C0442c j = C0444e.j(c0444e);
                j.h(c0444e2);
                this.f8011h = j.f();
            } else {
                this.f8011h = c0444e2;
            }
            this.f8009f |= 2;
        }
        this.f11240d = this.f11240d.h(c0445f.f8077d);
    }

    public void i(C0451l c0451l) {
        if (c0451l == C0451l.j) {
            return;
        }
        int i4 = c0451l.f8178e;
        if ((i4 & 1) == 1) {
            int i8 = c0451l.f8179f;
            this.f8009f = 1 | this.f8009f;
            this.f8010g = i8;
        }
        if ((i4 & 2) == 2) {
            g7.t tVar = c0451l.f8180g;
            tVar.getClass();
            this.f8009f = 2 | this.f8009f;
            this.f8011h = tVar;
        }
        this.f11240d = this.f11240d.h(c0451l.f8177d);
    }
}
