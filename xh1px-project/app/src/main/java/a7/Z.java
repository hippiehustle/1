package a7;

import g7.AbstractC0793b;
import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.C0795d;
import g7.C0797f;
import g7.C0799h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes.dex */
public final class Z extends g7.o {
    public static final Z j;
    public static final C0440a k = new C0440a(21);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f7994d;

    /* renamed from: e, reason: collision with root package name */
    public int f7995e;

    /* renamed from: f, reason: collision with root package name */
    public List f7996f;

    /* renamed from: g, reason: collision with root package name */
    public int f7997g;

    /* renamed from: h, reason: collision with root package name */
    public byte f7998h;

    /* renamed from: i, reason: collision with root package name */
    public int f7999i;

    static {
        Z z8 = new Z();
        j = z8;
        z8.f7996f = Collections.EMPTY_LIST;
        z8.f7997g = -1;
    }

    public Z() {
        this.f7998h = (byte) -1;
        this.f7999i = -1;
        this.f7994d = AbstractC0796e.f11223d;
    }

    public static C0446g i(Z z8) {
        C0446g h8 = C0446g.h();
        h8.j(z8);
        return h8;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f7998h;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        for (int i4 = 0; i4 < this.f7996f.size(); i4++) {
            if (!((T) this.f7996f.get(i4)).b()) {
                this.f7998h = (byte) 0;
                return false;
            }
        }
        this.f7998h = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4 = this.f7999i;
        if (i4 != -1) {
            return i4;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f7996f.size(); i9++) {
            i8 += L5.m.d(1, (AbstractC0793b) this.f7996f.get(i9));
        }
        if ((this.f7995e & 1) == 1) {
            i8 += L5.m.b(2, this.f7997g);
        }
        int size = this.f7994d.size() + i8;
        this.f7999i = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return C0446g.h();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        return i(this);
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        for (int i4 = 0; i4 < this.f7996f.size(); i4++) {
            mVar.o(1, (AbstractC0793b) this.f7996f.get(i4));
        }
        if ((this.f7995e & 1) == 1) {
            mVar.m(2, this.f7997g);
        }
        mVar.r(this.f7994d);
    }

    public Z(C0446g c0446g) {
        this.f7998h = (byte) -1;
        this.f7999i = -1;
        this.f7994d = c0446g.f11240d;
    }

    public Z(C0797f c0797f, C0799h c0799h) {
        this.f7998h = (byte) -1;
        this.f7999i = -1;
        this.f7996f = Collections.EMPTY_LIST;
        this.f7997g = -1;
        C0795d c0795d = new C0795d();
        L5.m j5 = L5.m.j(c0795d, 1);
        boolean z8 = false;
        boolean z9 = false;
        while (!z8) {
            try {
                try {
                    try {
                        int n3 = c0797f.n();
                        if (n3 != 0) {
                            if (n3 == 10) {
                                if (!z9) {
                                    this.f7996f = new ArrayList();
                                    z9 = true;
                                }
                                this.f7996f.add(c0797f.g(T.f7933x, c0799h));
                            } else if (n3 != 16) {
                                if (!c0797f.q(n3, j5)) {
                                }
                            } else {
                                this.f7995e |= 1;
                                this.f7997g = c0797f.k();
                            }
                        }
                        z8 = true;
                    } catch (InvalidProtocolBufferException e9) {
                        e9.f12155d = this;
                        throw e9;
                    }
                } catch (IOException e10) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
                    invalidProtocolBufferException.f12155d = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if (z9) {
                    this.f7996f = Collections.unmodifiableList(this.f7996f);
                }
                try {
                    j5.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f7994d = c0795d.e();
                    throw th2;
                }
                this.f7994d = c0795d.e();
                throw th;
            }
        }
        if (z9) {
            this.f7996f = Collections.unmodifiableList(this.f7996f);
        }
        try {
            j5.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f7994d = c0795d.e();
            throw th3;
        }
        this.f7994d = c0795d.e();
    }
}
