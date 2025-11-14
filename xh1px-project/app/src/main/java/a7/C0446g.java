package a7;

import g7.AbstractC0793b;
import g7.AbstractC0801j;
import g7.C0797f;
import g7.C0799h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: a7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0446g extends AbstractC0801j implements g7.u {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8093e;

    /* renamed from: f, reason: collision with root package name */
    public int f8094f;

    /* renamed from: g, reason: collision with root package name */
    public List f8095g;

    /* renamed from: h, reason: collision with root package name */
    public int f8096h;

    public /* synthetic */ C0446g(int i4) {
        this.f8093e = i4;
    }

    public static C0446g h() {
        C0446g c0446g = new C0446g(1);
        c0446g.f8095g = Collections.EMPTY_LIST;
        c0446g.f8096h = -1;
        return c0446g;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        switch (this.f8093e) {
            case 0:
                C0447h f8 = f();
                if (f8.b()) {
                    return f8;
                }
                throw new UninitializedMessageException();
            default:
                Z g8 = g();
                if (g8.b()) {
                    return g8;
                }
                throw new UninitializedMessageException();
        }
    }

    public final Object clone() {
        switch (this.f8093e) {
            case 0:
                C0446g c0446g = new C0446g(0);
                c0446g.f8095g = Collections.EMPTY_LIST;
                c0446g.i(f());
                return c0446g;
            default:
                C0446g h8 = h();
                h8.j(g());
                return h8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        switch (this.f8093e) {
            case 0:
                C0447h c0447h = null;
                try {
                    try {
                        i((C0447h) C0447h.k.a(c0797f, c0799h));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (c0447h != null) {
                            i(c0447h);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e9) {
                    C0447h c0447h2 = (C0447h) e9.f12155d;
                    try {
                        throw e9;
                    } catch (Throwable th2) {
                        th = th2;
                        c0447h = c0447h2;
                        if (c0447h != null) {
                        }
                        throw th;
                    }
                }
            default:
                Z z8 = null;
                try {
                    try {
                        Z.k.getClass();
                        j(new Z(c0797f, c0799h));
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Z z9 = (Z) e10.f12155d;
                        try {
                            throw e10;
                        } catch (Throwable th3) {
                            th = th3;
                            z8 = z9;
                            if (z8 != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (z8 != null) {
                        j(z8);
                    }
                    throw th;
                }
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        switch (this.f8093e) {
            case 0:
                i((C0447h) oVar);
                return this;
            default:
                j((Z) oVar);
                return this;
        }
    }

    public C0447h f() {
        C0447h c0447h = new C0447h(this);
        int i4 = this.f8094f;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        c0447h.f8105f = this.f8096h;
        if ((i4 & 2) == 2) {
            this.f8095g = Collections.unmodifiableList(this.f8095g);
            this.f8094f &= -3;
        }
        c0447h.f8106g = this.f8095g;
        c0447h.f8104e = i8;
        return c0447h;
    }

    public Z g() {
        Z z8 = new Z(this);
        int i4 = this.f8094f;
        int i8 = 1;
        if ((i4 & 1) == 1) {
            this.f8095g = Collections.unmodifiableList(this.f8095g);
            this.f8094f &= -2;
        }
        z8.f7996f = this.f8095g;
        if ((i4 & 2) != 2) {
            i8 = 0;
        }
        z8.f7997g = this.f8096h;
        z8.f7995e = i8;
        return z8;
    }

    public void i(C0447h c0447h) {
        if (c0447h == C0447h.j) {
            return;
        }
        if ((c0447h.f8104e & 1) == 1) {
            int i4 = c0447h.f8105f;
            this.f8094f = 1 | this.f8094f;
            this.f8096h = i4;
        }
        if (!c0447h.f8106g.isEmpty()) {
            if (this.f8095g.isEmpty()) {
                this.f8095g = c0447h.f8106g;
                this.f8094f &= -3;
            } else {
                if ((this.f8094f & 2) != 2) {
                    this.f8095g = new ArrayList(this.f8095g);
                    this.f8094f |= 2;
                }
                this.f8095g.addAll(c0447h.f8106g);
            }
        }
        this.f11240d = this.f11240d.h(c0447h.f8103d);
    }

    public void j(Z z8) {
        if (z8 == Z.j) {
            return;
        }
        if (!z8.f7996f.isEmpty()) {
            if (this.f8095g.isEmpty()) {
                this.f8095g = z8.f7996f;
                this.f8094f &= -2;
            } else {
                if ((this.f8094f & 1) != 1) {
                    this.f8095g = new ArrayList(this.f8095g);
                    this.f8094f |= 1;
                }
                this.f8095g.addAll(z8.f7996f);
            }
        }
        if ((z8.f7995e & 1) == 1) {
            int i4 = z8.f7997g;
            this.f8094f |= 2;
            this.f8096h = i4;
        }
        this.f11240d = this.f11240d.h(z8.f7994d);
    }
}
